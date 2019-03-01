package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProvider
  extends XDataProvider
     with XRangeXMLConversion {
  /** If set to false `FALSE` , values from hidden cells are not returned. */
  var IncludeHiddenCells: scala.Boolean
}

object DataProvider {
  @scala.inline
  def apply(
    IncludeHiddenCells: scala.Boolean,
    RangeSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection,
    acquire: js.Function0[scala.Unit],
    convertRangeFromXML: js.Function1[java.lang.String, java.lang.String],
    convertRangeToXML: js.Function1[java.lang.String, java.lang.String],
    createDataSequenceByRangeRepresentation: js.Function1[java.lang.String, XDataSequence],
    createDataSequenceByRangeRepresentationPossible: js.Function1[java.lang.String, scala.Boolean],
    createDataSequenceByValueArray: js.Function2[java.lang.String, java.lang.String, XDataSequence],
    createDataSource: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      XDataSource
    ],
    createDataSourcePossible: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    detectArguments: js.Function1[
      XDataSource, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getRangeSelection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): DataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IncludeHiddenCells")(IncludeHiddenCells)
    __obj.updateDynamic("RangeSelection")(RangeSelection)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("convertRangeFromXML")(convertRangeFromXML)
    __obj.updateDynamic("convertRangeToXML")(convertRangeToXML)
    __obj.updateDynamic("createDataSequenceByRangeRepresentation")(createDataSequenceByRangeRepresentation)
    __obj.updateDynamic("createDataSequenceByRangeRepresentationPossible")(createDataSequenceByRangeRepresentationPossible)
    __obj.updateDynamic("createDataSequenceByValueArray")(createDataSequenceByValueArray)
    __obj.updateDynamic("createDataSource")(createDataSource)
    __obj.updateDynamic("createDataSourcePossible")(createDataSourcePossible)
    __obj.updateDynamic("detectArguments")(detectArguments)
    __obj.updateDynamic("getRangeSelection")(getRangeSelection)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[DataProvider]
  }
}

