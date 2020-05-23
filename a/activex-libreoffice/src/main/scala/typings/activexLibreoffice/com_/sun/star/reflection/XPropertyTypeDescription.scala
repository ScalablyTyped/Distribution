package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a property.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::PROPERTY.
  * @since OOo 1.1.2
  */
trait XPropertyTypeDescription extends XTypeDescription {
  /** @returns the flags defined for this property.  The possible values are defined in {@link com.sun.star.beans.PropertyAttribute} */
  val PropertyFlags: Double
  /** @returns the type description for this property. */
  val PropertyTypeDescription: XTypeDescription
  /** @returns the flags defined for this property.  The possible values are defined in {@link com.sun.star.beans.PropertyAttribute} */
  def getPropertyFlags(): Double
  /** @returns the type description for this property. */
  def getPropertyTypeDescription(): XTypeDescription
}

object XPropertyTypeDescription {
  @scala.inline
  def apply(
    Name: String,
    PropertyFlags: Double,
    PropertyTypeDescription: XTypeDescription,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getName: () => String,
    getPropertyFlags: () => Double,
    getPropertyTypeDescription: () => XTypeDescription,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertyTypeDescription = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PropertyFlags = PropertyFlags.asInstanceOf[js.Any], PropertyTypeDescription = PropertyTypeDescription.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getPropertyFlags = js.Any.fromFunction0(getPropertyFlags), getPropertyTypeDescription = js.Any.fromFunction0(getPropertyTypeDescription), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertyTypeDescription]
  }
}

