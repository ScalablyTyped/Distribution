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
  val SupportedNumberingTypes: activexDashInteropLib.SafeArray[scala.Double]
  /** returns the corresponding identifier to a numbering type. */
  def getNumberingIdentifier(NumberingType: scala.Double): java.lang.String
  /** returns the corresponding numbering type to an identifier. */
  def getNumberingType(NumberingIdentifier: java.lang.String): scala.Double
  /**
    * returns the numbering type values that are supported by the component.
    * @see
    */
  def getSupportedNumberingTypes(): activexDashInteropLib.SafeArray[scala.Double]
  /** determines whether an identifier is supported. */
  def hasNumberingType(NumberingIdentifier: java.lang.String): scala.Boolean
}

object XNumberingTypeInfo {
  @scala.inline
  def apply(
    SupportedNumberingTypes: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    getNumberingIdentifier: js.Function1[scala.Double, java.lang.String],
    getNumberingType: js.Function1[java.lang.String, scala.Double],
    getSupportedNumberingTypes: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    hasNumberingType: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XNumberingTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SupportedNumberingTypes")(SupportedNumberingTypes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getNumberingIdentifier")(getNumberingIdentifier)
    __obj.updateDynamic("getNumberingType")(getNumberingType)
    __obj.updateDynamic("getSupportedNumberingTypes")(getSupportedNumberingTypes)
    __obj.updateDynamic("hasNumberingType")(hasNumberingType)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XNumberingTypeInfo]
  }
}

