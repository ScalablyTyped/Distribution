package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows transacted access to an object. */
@js.native
trait XTransactedObject extends XInterface {
  
  /** commits the changes made for object. */
  def commit(): Unit = js.native
  
  /** removes all the changes made for the object after last commit or loading. */
  def revert(): Unit = js.native
}
object XTransactedObject {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    commit: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    revert: () => Unit
  ): XTransactedObject = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), commit = js.Any.fromFunction0(commit), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), revert = js.Any.fromFunction0(revert))
    __obj.asInstanceOf[XTransactedObject]
  }
  
  @scala.inline
  implicit class XTransactedObjectOps[Self <: XTransactedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommit(value: () => Unit): Self = this.set("commit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRevert(value: () => Unit): Self = this.set("revert", js.Any.fromFunction0(value))
  }
}
