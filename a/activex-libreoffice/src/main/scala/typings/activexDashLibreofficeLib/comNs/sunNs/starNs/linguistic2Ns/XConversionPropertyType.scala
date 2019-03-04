package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

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
trait XConversionPropertyType
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the property type for the specified entry.
    *
    * The conversion entry is specified by the pair ( aLeftText, aRightText ).
    * @param aLeftText the left text of the dictionary entry.
    * @param aRightText the right text of the dictionary entry.
    * @returns returns the property type for the entry with the specified left text.
    */
  def getPropertyType(aLeftText: java.lang.String, aRightText: java.lang.String): scala.Double
  /**
    * sets the property type for the specified entry.
    *
    * The conversion entry is specified by the pair ( aLeftText, aRightText ).
    * @param aLeftText the left text of the dictionary entry.
    * @param aRightText the right text of the dictionary entry.
    * @param nPropertyType the property type to be set for the entry
    */
  def setPropertyType(aLeftText: java.lang.String, aRightText: java.lang.String, nPropertyType: scala.Double): scala.Unit
}

object XConversionPropertyType {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getPropertyType: js.Function2[java.lang.String, java.lang.String, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setPropertyType: js.Function3[java.lang.String, java.lang.String, scala.Double, scala.Unit]
  ): XConversionPropertyType = {
    val __obj = js.Dynamic.literal(acquire = acquire, getPropertyType = getPropertyType, queryInterface = queryInterface, release = release, setPropertyType = setPropertyType)
  
    __obj.asInstanceOf[XConversionPropertyType]
  }
}

