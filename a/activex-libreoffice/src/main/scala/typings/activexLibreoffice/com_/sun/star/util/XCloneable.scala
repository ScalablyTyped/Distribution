package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to create a copy of the object which supports this interface. */
@js.native
trait XCloneable extends XInterface {
  
  /** creates a copy of the object. */
  def createClone(): XCloneable = js.native
}
object XCloneable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createClone: () => XCloneable,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCloneable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createClone = js.Any.fromFunction0(createClone), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCloneable]
  }
  
  @scala.inline
  implicit class XCloneableOps[Self <: XCloneable] (val x: Self) extends AnyVal {
    
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
    def setCreateClone(value: () => XCloneable): Self = this.set("createClone", js.Any.fromFunction0(value))
  }
}
