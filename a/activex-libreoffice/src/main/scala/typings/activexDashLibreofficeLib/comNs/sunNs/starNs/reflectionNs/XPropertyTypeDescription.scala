package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

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
  val PropertyFlags: scala.Double
  /** @returns the type description for this property. */
  val PropertyTypeDescription: XTypeDescription
  /** @returns the flags defined for this property.  The possible values are defined in {@link com.sun.star.beans.PropertyAttribute} */
  def getPropertyFlags(): scala.Double
  /** @returns the type description for this property. */
  def getPropertyTypeDescription(): XTypeDescription
}

object XPropertyTypeDescription {
  @scala.inline
  def apply(
    Name: java.lang.String,
    PropertyFlags: scala.Double,
    PropertyTypeDescription: XTypeDescription,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getName: js.Function0[java.lang.String],
    getPropertyFlags: js.Function0[scala.Double],
    getPropertyTypeDescription: js.Function0[XTypeDescription],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPropertyTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("PropertyFlags")(PropertyFlags)
    __obj.updateDynamic("PropertyTypeDescription")(PropertyTypeDescription)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getPropertyFlags")(getPropertyFlags)
    __obj.updateDynamic("getPropertyTypeDescription")(getPropertyTypeDescription)
    __obj.updateDynamic("getTypeClass")(getTypeClass)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XPropertyTypeDescription]
  }
}

