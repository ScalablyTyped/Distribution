package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to add and remove properties to or from an object.
  *
  * Some scripting engines cannot access properties directly when the property set is changed. Please use {@link XPropertySet.getPropertyValue()} etc. in
  * this case.
  */
trait XPropertyContainer
  extends StObject
     with XInterface {
  
  /**
    * adds a property to the object.
    * @param Name specifies the name of the new property.
    * @param Attributes specifies the property attributes, see {@link PropertyAttribute} .
    * @param DefaultValue specifies the type of the new property and a potential default value.
    * @throws PropertyExistException if a property with the same name already exists.
    * @throws IllegalTypeException if the specified type is not allowed.
    */
  def addProperty(Name: String, Attributes: Double, DefaultValue: Any): Unit
  
  /**
    * removes a property from the object.
    * @param Name specified the name of the property.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def removeProperty(Name: String): Unit
}
object XPropertyContainer {
  
  inline def apply(
    acquire: () => Unit,
    addProperty: (String, Double, Any) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeProperty: String => Unit
  ): XPropertyContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addProperty = js.Any.fromFunction3(addProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeProperty = js.Any.fromFunction1(removeProperty))
    __obj.asInstanceOf[XPropertyContainer]
  }
  
  extension [Self <: XPropertyContainer](x: Self) {
    
    inline def setAddProperty(value: (String, Double, Any) => Unit): Self = StObject.set(x, "addProperty", js.Any.fromFunction3(value))
    
    inline def setRemoveProperty(value: String => Unit): Self = StObject.set(x, "removeProperty", js.Any.fromFunction1(value))
  }
}
