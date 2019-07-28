package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.XRangeSelection
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProvider
  extends XDataProvider
     with XRangeXMLConversion {
  /** If set to false `FALSE` , values from hidden cells are not returned. */
  var IncludeHiddenCells: Boolean
}

object DataProvider {
  @scala.inline
  def apply(
    IncludeHiddenCells: Boolean,
    RangeSelection: XRangeSelection,
    acquire: () => Unit,
    convertRangeFromXML: String => String,
    convertRangeToXML: String => String,
    createDataSequenceByRangeRepresentation: String => XDataSequence,
    createDataSequenceByRangeRepresentationPossible: String => Boolean,
    createDataSequenceByValueArray: (String, String) => XDataSequence,
    createDataSource: SeqEquiv[PropertyValue] => XDataSource,
    createDataSourcePossible: SeqEquiv[PropertyValue] => Boolean,
    detectArguments: XDataSource => SafeArray[PropertyValue],
    getRangeSelection: () => XRangeSelection,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): DataProvider = {
    val __obj = js.Dynamic.literal(IncludeHiddenCells = IncludeHiddenCells, RangeSelection = RangeSelection, acquire = js.Any.fromFunction0(acquire), convertRangeFromXML = js.Any.fromFunction1(convertRangeFromXML), convertRangeToXML = js.Any.fromFunction1(convertRangeToXML), createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), detectArguments = js.Any.fromFunction1(detectArguments), getRangeSelection = js.Any.fromFunction0(getRangeSelection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[DataProvider]
  }
}

