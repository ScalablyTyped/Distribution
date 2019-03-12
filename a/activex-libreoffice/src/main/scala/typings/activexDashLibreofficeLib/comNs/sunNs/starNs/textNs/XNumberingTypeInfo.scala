package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the numbering types that are supported by a component.
  *
  * To be able to store unknown numbering types in a file format the numbering types correspond to an identifier.
  * @author Oliver Specht
  * @see com.sun.star.text.NumberingRules
  * @see com.sun.star.style.NumberingType
  * @version 1.0
  */
trait XNumberingTypeInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the numbering type values that are supported by the component.
    * @see
    */
  val SupportedNumberingTypes: stdLib.SafeArray[scala.Double]
  /** returns the corresponding identifier to a numbering type. */
  def getNumberingIdentifier(NumberingType: scala.Double): java.lang.String
  /** returns the corresponding numbering type to an identifier. */
  def getNumberingType(NumberingIdentifier: java.lang.String): scala.Double
  /**
    * returns the numbering type values that are supported by the component.
    * @see
    */
  def getSupportedNumberingTypes(): stdLib.SafeArray[scala.Double]
  /** determines whether an identifier is supported. */
  def hasNumberingType(NumberingIdentifier: java.lang.String): scala.Boolean
}

object XNumberingTypeInfo {
  @scala.inline
  def apply(
    SupportedNumberingTypes: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    getNumberingIdentifier: scala.Double => java.lang.String,
    getNumberingType: java.lang.String => scala.Double,
    getSupportedNumberingTypes: () => stdLib.SafeArray[scala.Double],
    hasNumberingType: java.lang.String => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XNumberingTypeInfo = {
    val __obj = js.Dynamic.literal(SupportedNumberingTypes = SupportedNumberingTypes, acquire = js.Any.fromFunction0(acquire), getNumberingIdentifier = js.Any.fromFunction1(getNumberingIdentifier), getNumberingType = js.Any.fromFunction1(getNumberingType), getSupportedNumberingTypes = js.Any.fromFunction0(getSupportedNumberingTypes), hasNumberingType = js.Any.fromFunction1(hasNumberingType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNumberingTypeInfo]
  }
}

