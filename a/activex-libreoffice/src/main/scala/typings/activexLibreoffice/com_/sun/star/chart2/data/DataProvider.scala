package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.sheet.XRangeSelection
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProvider
  extends StObject
     with XDataProvider
     with XRangeXMLConversion {
  
  /** If set to false `FALSE` , values from hidden cells are not returned. */
  var IncludeHiddenCells: Boolean
}
object DataProvider {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(IncludeHiddenCells = IncludeHiddenCells.asInstanceOf[js.Any], RangeSelection = RangeSelection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), convertRangeFromXML = js.Any.fromFunction1(convertRangeFromXML), convertRangeToXML = js.Any.fromFunction1(convertRangeToXML), createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), detectArguments = js.Any.fromFunction1(detectArguments), getRangeSelection = js.Any.fromFunction0(getRangeSelection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[DataProvider]
  }
  
  extension [Self <: DataProvider](x: Self) {
    
    inline def setIncludeHiddenCells(value: Boolean): Self = StObject.set(x, "IncludeHiddenCells", value.asInstanceOf[js.Any])
  }
}
