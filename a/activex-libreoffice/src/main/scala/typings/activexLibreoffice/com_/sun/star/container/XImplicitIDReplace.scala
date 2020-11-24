package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to replace contents in a collection by an implicit (unique) ID: */
@js.native
trait XImplicitIDReplace extends XInterface {
  
  /** replaces the content which is specified by its implicit (unique) ID with a new content. */
  def replaceByUniqueID(ID: String, aNewElement: js.Any): Unit = js.native
}
object XImplicitIDReplace {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    replaceByUniqueID: (String, js.Any) => Unit
  ): XImplicitIDReplace = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByUniqueID = js.Any.fromFunction2(replaceByUniqueID))
    __obj.asInstanceOf[XImplicitIDReplace]
  }
  
  @scala.inline
  implicit class XImplicitIDReplaceOps[Self <: XImplicitIDReplace] (val x: Self) extends AnyVal {
    
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
    def setReplaceByUniqueID(value: (String, js.Any) => Unit): Self = this.set("replaceByUniqueID", js.Any.fromFunction2(value))
  }
}
