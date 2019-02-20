package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to provide standard type conversions.
  * @see Converter
  */
trait XTypeConverter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Converts the value `aFrom` to the specified type `xDestinationType` . Throws an {@link CannotConvertException} if the conversion failed.
    * @param aFrom source value
    * @param xDestinationType destination type
    * @returns converted value (any carrying value of type `xDestinationType`
    */
  def convertTo(aFrom: js.Any, xDestinationType: activexDashLibreofficeLib.`type`): js.Any
  /**
    * Converts the value `aFrom` to the specified simple type `aDestinationType` . Throws an {@link CannotConvertException} if the conversion failed and an
    * {@link com.sun.star.lang.IllegalArgumentException} if the destination {@link com.sun.star.uno.TypeClass} is not simple, e.g. not long or byte.
    * @param aFrom source value
    * @param aDestinationType destination type class
    * @returns converted value (any carrying value of type `aDestinationType`
    */
  def convertToSimpleType(aFrom: js.Any, aDestinationType: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass): js.Any
}

