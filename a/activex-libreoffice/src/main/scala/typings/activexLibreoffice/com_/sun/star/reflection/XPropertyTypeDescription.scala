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
@js.native
trait XPropertyTypeDescription extends XTypeDescription {
  /** @returns the flags defined for this property.  The possible values are defined in {@link com.sun.star.beans.PropertyAttribute} */
  val PropertyFlags: Double = js.native
  /** @returns the type description for this property. */
  val PropertyTypeDescription: XTypeDescription = js.native
  /** @returns the flags defined for this property.  The possible values are defined in {@link com.sun.star.beans.PropertyAttribute} */
  def getPropertyFlags(): Double = js.native
  /** @returns the type description for this property. */
  def getPropertyTypeDescription(): XTypeDescription = js.native
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
  @scala.inline
  implicit class XPropertyTypeDescriptionOps[Self <: XPropertyTypeDescription] (val x: Self) extends AnyVal {
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
    def setPropertyFlags(value: Double): Self = this.set("PropertyFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyTypeDescription(value: XTypeDescription): Self = this.set("PropertyTypeDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPropertyFlags(value: () => Double): Self = this.set("getPropertyFlags", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPropertyTypeDescription(value: () => XTypeDescription): Self = this.set("getPropertyTypeDescription", js.Any.fromFunction0(value))
  }
  
}

