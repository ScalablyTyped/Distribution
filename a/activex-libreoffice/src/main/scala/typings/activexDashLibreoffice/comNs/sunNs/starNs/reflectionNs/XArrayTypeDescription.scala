package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import typings.std.SafeArray
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
  val Dimensions: SafeArray[Double]
  /**
    * Returns the number of dimensions of the array.
    * @returns dimension of the array
    */
  val NumberOfDimensions: Double
  /**
    * Returns the element type of the array.
    * @returns element type of the array
    */
  val Type: XTypeDescription
  /**
    * Returns dimensions of array (same length as {@link getNumberOfDimensions()} ).
    * @returns dimensions of array
    */
  def getDimensions(): SafeArray[Double]
  /**
    * Returns the number of dimensions of the array.
    * @returns dimension of the array
    */
  def getNumberOfDimensions(): Double
  /**
    * Returns the element type of the array.
    * @returns element type of the array
    */
  def getType(): XTypeDescription
}

object XArrayTypeDescription {
  @scala.inline
  def apply(
    Dimensions: SafeArray[Double],
    Name: String,
    NumberOfDimensions: Double,
    Type: XTypeDescription,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getDimensions: () => SafeArray[Double],
    getName: () => String,
    getNumberOfDimensions: () => Double,
    getType: () => XTypeDescription,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XArrayTypeDescription = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions, Name = Name, NumberOfDimensions = NumberOfDimensions, Type = Type, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getDimensions = js.Any.fromFunction0(getDimensions), getName = js.Any.fromFunction0(getName), getNumberOfDimensions = js.Any.fromFunction0(getNumberOfDimensions), getType = js.Any.fromFunction0(getType), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XArrayTypeDescription]
  }
}

