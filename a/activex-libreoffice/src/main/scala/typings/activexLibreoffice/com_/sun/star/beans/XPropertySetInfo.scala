package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a set of properties.
  *
  * There are three kinds of properties: bound propertiesconstrained propertiesfree properties
  *
  * The specification only describes the properties, it does not contain any values.
  */
trait XPropertySetInfo
  extends StObject
     with XInterface {
  
  /** @returns a sequence with all property descriptors which are specified within this {@link XPropertySetInfo} . */
  val Properties: SafeArray[Property]
  
  /** @returns a sequence with all property descriptors which are specified within this {@link XPropertySetInfo} . */
  def getProperties(): SafeArray[Property]
  
  /**
    * @param aName specifies the name of the property.
    * @returns the property with the specified name from the object.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def getPropertyByName(aName: String): Property
  
  /**
    * @param Name specifies the name of the property.
    * @returns `TRUE` if a property with the specified name exist; otherwise `FALSE` is returned.
    */
  def hasPropertyByName(Name: String): Boolean
}
object XPropertySetInfo {
  
  inline def apply(
    Properties: SafeArray[Property],
    acquire: () => Unit,
    getProperties: () => SafeArray[Property],
    getPropertyByName: String => Property,
    hasPropertyByName: String => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XPropertySetInfo = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getProperties = js.Any.fromFunction0(getProperties), getPropertyByName = js.Any.fromFunction1(getPropertyByName), hasPropertyByName = js.Any.fromFunction1(hasPropertyByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertySetInfo]
  }
  
  extension [Self <: XPropertySetInfo](x: Self) {
    
    inline def setGetProperties(value: () => SafeArray[Property]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
    
    inline def setGetPropertyByName(value: String => Property): Self = StObject.set(x, "getPropertyByName", js.Any.fromFunction1(value))
    
    inline def setHasPropertyByName(value: String => Boolean): Self = StObject.set(x, "hasPropertyByName", js.Any.fromFunction1(value))
    
    inline def setProperties(value: SafeArray[Property]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
  }
}
