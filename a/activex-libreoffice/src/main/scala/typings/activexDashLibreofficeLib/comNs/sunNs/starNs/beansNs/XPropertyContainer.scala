package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to add and remove properties to or from an object.
  *
  * Some scripting engines cannot access properties directly when the property set is changed. Please use {@link XPropertySet.getPropertyValue()} etc. in
  * this case.
  */
trait XPropertyContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds a property to the object.
    * @param Name specifies the name of the new property.
    * @param Attributes specifies the property attributes, see {@link PropertyAttribute} .
    * @param DefaultValue specifies the type of the new property and a potential default value.
    * @throws PropertyExistException if a property with the same name already exists.
    * @throws IllegalTypeException if the specified type is not allowed.
    */
  def addProperty(Name: java.lang.String, Attributes: scala.Double, DefaultValue: js.Any): scala.Unit
  /**
    * removes a property from the object.
    * @param Name specified the name of the property.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def removeProperty(Name: java.lang.String): scala.Unit
}

object XPropertyContainer {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addProperty: (java.lang.String, scala.Double, js.Any) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeProperty: java.lang.String => scala.Unit
  ): XPropertyContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addProperty = js.Any.fromFunction3(addProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeProperty = js.Any.fromFunction1(removeProperty))
  
    __obj.asInstanceOf[XPropertyContainer]
  }
}

