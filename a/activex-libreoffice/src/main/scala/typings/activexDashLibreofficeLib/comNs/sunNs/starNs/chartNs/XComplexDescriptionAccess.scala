package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Offers access to complex column and row descriptions.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  * @since OOo 3.3
  */
trait XComplexDescriptionAccess extends XChartDataArray {
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of sequences of strings representing the descriptions of all columns. The outer index represents different columns. The inner index re
    */
  var ComplexColumnDescriptions: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inner index represen
    */
  var ComplexRowDescriptions: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of sequences of strings representing the descriptions of all columns. The outer index represents different columns. The inner index re
    */
  def getComplexColumnDescriptions(): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inner index represen
    */
  def getComplexRowDescriptions(): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
  /**
    * sets the description texts for all columns.
    * @param rColumnDescriptions a sequence of sequences of strings which represent the descriptions of all columns. The outer index represents different colu
    */
  def setComplexColumnDescriptions(
    rColumnDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]]
  ): scala.Unit
  /**
    * sets the description texts for all rows.
    * @param rRowDescriptions a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inn
    */
  def setComplexRowDescriptions(
    rRowDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]]
  ): scala.Unit
}

