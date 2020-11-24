package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a hierarchy of properties.
  *
  * The specification only describes the properties, it does not contain any values.
  */
@js.native
trait XHierarchicalPropertySetInfo extends XInterface {
  
  /**
    * @param aHierarchicalName specifies the nested name of the property.
    * @returns the property with the specified name from the hierarchy.
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::lang::IllegalArgumentException if **aHierarchicalName** is not a well-formed nested name for this hierarchy. An implementation is
    */
  def getPropertyByHierarchicalName(aHierarchicalName: String): Property = js.native
  
  /**
    * @param aHierarchicalName specifies the name of the property.
    * @returns `TRUE` if a property with the specified name exists; otherwise `FALSE` is returned.
    * @throws com::sun::star::lang::IllegalArgumentException if **aHierarchicalName** is not a well-formed nested name for this hierarchy. An implementation is
    */
  def hasPropertyByHierarchicalName(aHierarchicalName: String): Boolean = js.native
}
object XHierarchicalPropertySetInfo {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getPropertyByHierarchicalName: String => Property,
    hasPropertyByHierarchicalName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHierarchicalPropertySetInfo = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getPropertyByHierarchicalName = js.Any.fromFunction1(getPropertyByHierarchicalName), hasPropertyByHierarchicalName = js.Any.fromFunction1(hasPropertyByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XHierarchicalPropertySetInfo]
  }
  
  @scala.inline
  implicit class XHierarchicalPropertySetInfoOps[Self <: XHierarchicalPropertySetInfo] (val x: Self) extends AnyVal {
    
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
    def setGetPropertyByHierarchicalName(value: String => Property): Self = this.set("getPropertyByHierarchicalName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasPropertyByHierarchicalName(value: String => Boolean): Self = this.set("hasPropertyByHierarchicalName", js.Any.fromFunction1(value))
  }
}
