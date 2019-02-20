package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated, UNOIDL does not have an array concept.
  * @deprecated Deprecated
  */
trait XArrayTypeDescription extends XTypeDescription {
  /**
    * Returns dimensions of array (same length as {@link getNumberOfDimensions()} ).
    * @returns dimensions of array
    */
  val Dimensions: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Returns the number of dimensions of the array.
    * @returns dimension of the array
    */
  val NumberOfDimensions: scala.Double
  /**
    * Returns the element type of the array.
    * @returns element type of the array
    */
  val Type: XTypeDescription
  /**
    * Returns dimensions of array (same length as {@link getNumberOfDimensions()} ).
    * @returns dimensions of array
    */
  def getDimensions(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Returns the number of dimensions of the array.
    * @returns dimension of the array
    */
  def getNumberOfDimensions(): scala.Double
  /**
    * Returns the element type of the array.
    * @returns element type of the array
    */
  def getType(): XTypeDescription
}

