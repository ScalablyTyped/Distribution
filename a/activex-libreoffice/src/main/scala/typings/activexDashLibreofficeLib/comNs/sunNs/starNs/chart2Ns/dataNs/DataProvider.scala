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
    acquire: () => scala.Unit,
    convertRangeFromXML: java.lang.String => java.lang.String,
    convertRangeToXML: java.lang.String => java.lang.String,
    createDataSequenceByRangeRepresentation: java.lang.String => XDataSequence,
    createDataSequenceByRangeRepresentationPossible: java.lang.String => scala.Boolean,
    createDataSequenceByValueArray: (java.lang.String, java.lang.String) => XDataSequence,
    createDataSource: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => XDataSource,
    createDataSourcePossible: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Boolean,
    detectArguments: XDataSource => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getRangeSelection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): DataProvider = {
    val __obj = js.Dynamic.literal(IncludeHiddenCells = IncludeHiddenCells, RangeSelection = RangeSelection, acquire = js.Any.fromFunction0(acquire), convertRangeFromXML = js.Any.fromFunction1(convertRangeFromXML), convertRangeToXML = js.Any.fromFunction1(convertRangeToXML), createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), detectArguments = js.Any.fromFunction1(detectArguments), getRangeSelection = js.Any.fromFunction0(getRangeSelection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[DataProvider]
  }
}

