package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows set and retrieve the property type of an entry in a conversion dictionary
  *
  * The property type must be one of {@link com.sun.star.linguistic2.ConversionPropertyType}
  * @see com.sun.star.linguistic2.XConversionDictionary
  * @see com.sun.star.linguistic2.ConversionPropertyType
  * @since OOo 2.0
  */
trait XConversionPropertyType extends XInterface {
  /**
    * returns the property type for the specified entry.
    *
    * The conversion entry is specified by the pair ( aLeftText, aRightText ).
    * @param aLeftText the left text of the dictionary entry.
    * @param aRightText the right text of the dictionary entry.
    * @returns returns the property type for the entry with the specified left text.
    */
  def getPropertyType(aLeftText: String, aRightText: String): Double
  /**
    * sets the property type for the specified entry.
    *
    * The conversion entry is specified by the pair ( aLeftText, aRightText ).
    * @param aLeftText the left text of the dictionary entry.
    * @param aRightText the right text of the dictionary entry.
    * @param nPropertyType the property type to be set for the entry
    */
  def setPropertyType(aLeftText: String, aRightText: String, nPropertyType: Double): Unit
}

object XConversionPropertyType {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getPropertyType: (String, String) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPropertyType: (String, String, Double) => Unit
  ): XConversionPropertyType = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getPropertyType = js.Any.fromFunction2(getPropertyType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPropertyType = js.Any.fromFunction3(setPropertyType))
  
    __obj.asInstanceOf[XConversionPropertyType]
  }
}

