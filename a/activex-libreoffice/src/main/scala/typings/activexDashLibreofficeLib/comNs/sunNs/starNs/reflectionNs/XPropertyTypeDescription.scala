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

