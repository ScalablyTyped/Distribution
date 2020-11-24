package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access contents through an implicit (unique) ID. */
@js.native
trait XImplicitIDAccess extends XElementAccess {
  
  /** @returns a sequence with all existing implicit IDs. */
  val ImplicitIDs: SafeArray[String] = js.native
  
  /** @returns the element with the specified implicit ID. */
  def getByImplicitID(ID: String): js.Any = js.native
  
  /** @returns a sequence with all existing implicit IDs. */
  def getImplicitIDs(): SafeArray[String] = js.native
}
object XImplicitIDAccess {
  
  @scala.inline
  def apply(
    ElementType: `type`,
    ImplicitIDs: SafeArray[String],
    acquire: () => Unit,
    getByImplicitID: String => js.Any,
    getElementType: () => `type`,
    getImplicitIDs: () => SafeArray[String],
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XImplicitIDAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], ImplicitIDs = ImplicitIDs.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByImplicitID = js.Any.fromFunction1(getByImplicitID), getElementType = js.Any.fromFunction0(getElementType), getImplicitIDs = js.Any.fromFunction0(getImplicitIDs), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XImplicitIDAccess]
  }
  
  @scala.inline
  implicit class XImplicitIDAccessOps[Self <: XImplicitIDAccess] (val x: Self) extends AnyVal {
    
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
    def setImplicitIDs(value: SafeArray[String]): Self = this.set("ImplicitIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetByImplicitID(value: String => js.Any): Self = this.set("getByImplicitID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetImplicitIDs(value: () => SafeArray[String]): Self = this.set("getImplicitIDs", js.Any.fromFunction0(value))
  }
}
