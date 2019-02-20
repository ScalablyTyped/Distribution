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

