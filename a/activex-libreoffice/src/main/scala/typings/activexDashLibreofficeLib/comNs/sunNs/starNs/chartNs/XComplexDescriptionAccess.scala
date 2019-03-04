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

object XComplexDescriptionAccess {
  @scala.inline
  def apply(
    ColumnDescriptions: activexDashInteropLib.SafeArray[java.lang.String],
    ComplexColumnDescriptions: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]],
    ComplexRowDescriptions: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]],
    Data: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[scala.Double]],
    NotANumber: scala.Double,
    RowDescriptions: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    addChartDataChangeEventListener: js.Function1[XChartDataChangeEventListener, scala.Unit],
    getColumnDescriptions: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getComplexColumnDescriptions: js.Function0[
      activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
    ],
    getComplexRowDescriptions: js.Function0[
      activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
    ],
    getData: js.Function0[activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[scala.Double]]],
    getNotANumber: js.Function0[scala.Double],
    getRowDescriptions: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    isNotANumber: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChartDataChangeEventListener: js.Function1[XChartDataChangeEventListener, scala.Unit],
    setColumnDescriptions: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setComplexColumnDescriptions: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]], 
      scala.Unit
    ],
    setComplexRowDescriptions: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]], 
      scala.Unit
    ],
    setData: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Unit
    ],
    setRowDescriptions: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit]
  ): XComplexDescriptionAccess = {
    val __obj = js.Dynamic.literal(ColumnDescriptions = ColumnDescriptions, ComplexColumnDescriptions = ComplexColumnDescriptions, ComplexRowDescriptions = ComplexRowDescriptions, Data = Data, NotANumber = NotANumber, RowDescriptions = RowDescriptions, acquire = acquire, addChartDataChangeEventListener = addChartDataChangeEventListener, getColumnDescriptions = getColumnDescriptions, getComplexColumnDescriptions = getComplexColumnDescriptions, getComplexRowDescriptions = getComplexRowDescriptions, getData = getData, getNotANumber = getNotANumber, getRowDescriptions = getRowDescriptions, isNotANumber = isNotANumber, queryInterface = queryInterface, release = release, removeChartDataChangeEventListener = removeChartDataChangeEventListener, setColumnDescriptions = setColumnDescriptions, setComplexColumnDescriptions = setComplexColumnDescriptions, setComplexRowDescriptions = setComplexRowDescriptions, setData = setData, setRowDescriptions = setRowDescriptions)
  
    __obj.asInstanceOf[XComplexDescriptionAccess]
  }
}

