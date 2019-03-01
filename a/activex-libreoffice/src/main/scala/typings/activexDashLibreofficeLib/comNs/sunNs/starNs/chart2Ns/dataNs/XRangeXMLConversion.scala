package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An application that provides data for a chart must implement this interface. */
trait XRangeXMLConversion
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** converts an XML-style range into the internal {@link DataProvider} 's format. */
  def convertRangeFromXML(aXMLRange: java.lang.String): java.lang.String
  /**
    * converts the range to a valid XML syntax.
    *
    * For example spreadsheet ranges consisting of more than one consecutive region are usually separated by a semicolon whereas in XML you separate
    * multiple regions by a space.
    */
  def convertRangeToXML(aRangeRepresentation: java.lang.String): java.lang.String
}

object XRangeXMLConversion {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    convertRangeFromXML: js.Function1[java.lang.String, java.lang.String],
    convertRangeToXML: js.Function1[java.lang.String, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XRangeXMLConversion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("convertRangeFromXML")(convertRangeFromXML)
    __obj.updateDynamic("convertRangeToXML")(convertRangeToXML)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XRangeXMLConversion]
  }
}

