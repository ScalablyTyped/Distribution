package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A registry (storage medium) for persistent property sets.
  * @author Kai Sommerfeld
  * @see XPersistentPropertySet
  * @version 1.0
  */
@js.native
trait XPropertySetRegistry extends XInterface {
  
  /**
    * creates a new or opens an existing property set in the registry.
    * @param key The key to use for addressing the property set.
    * @param create Indicates whether a new set shall be created in case there does not already exist one for the given key.
    * @returns The property set.
    */
  def openPropertySet(key: String, create: Boolean): XPersistentPropertySet = js.native
  
  /**
    * removes a property set from the registry.
    * @param key The key to use for addressing the property set.
    */
  def removePropertySet(key: String): Unit = js.native
}
object XPropertySetRegistry {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    openPropertySet: (String, Boolean) => XPersistentPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertySet: String => Unit
  ): XPropertySetRegistry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), openPropertySet = js.Any.fromFunction2(openPropertySet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertySet = js.Any.fromFunction1(removePropertySet))
    __obj.asInstanceOf[XPropertySetRegistry]
  }
  
  @scala.inline
  implicit class XPropertySetRegistryOps[Self <: XPropertySetRegistry] (val x: Self) extends AnyVal {
    
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
    def setOpenPropertySet(value: (String, Boolean) => XPersistentPropertySet): Self = this.set("openPropertySet", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemovePropertySet(value: String => Unit): Self = this.set("removePropertySet", js.Any.fromFunction1(value))
  }
}
