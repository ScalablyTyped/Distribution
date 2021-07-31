package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.com_.sun.star.chart.ChartDataRowSource
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabularDataProviderArguments extends StObject {
  
  /**
    * the range address string spanning all data.
    *
    * The range address string must be interpretable by the component that implements {@link XDataProvider} and gets this property as argument to {@link
    * XDataProvider.detectArguments()} .
    *
    * The representation string is of a form that may be used in the user interface. Example for OOo Calc: "$Sheet1.$A$1:$D$7", example for OOo Writer:
    * "&lt;Table1.A1:D7&gt;".
    *
    * When used as input, this range will be split in columns or rows depending on the property {@link DataRowSource} .
    *
    * When used as output of {@link XDataProvider.detectArguments()} this is the range that spans the ranges of all given XDataSequences. If the result is
    * ambiguous, i.e., a splitting of this range would not yield the same result, this property should be empty. The latter is the case, when ranges are
    * overlapping, the lengths of sequences are not equal or even if the order of two sequences is swapped (e.g. data comes from column A, C, B).
    */
  var CellRangeRepresentation: String
  
  /**
    * determines, whether data sequences are created out of columns or rows in a table.
    *
    * If this property is not given as argument it is assumed to com::sun::star::chart::ChartDataRowSource::COLUMNS, i.e., the default is "take data from
    * columns".
    */
  var DataRowSource: ChartDataRowSource
  
  /**
    * If data comes from columns, the first row will provide the labels for all sequences, if data comes from rows, the first column will provide the labels
    * for all sequences.
    *
    * Even if this property is false, the {@link XLabeledDataSequence} may contain a label, but this will not be the first cell of the selection. It may be
    * a generic string like "Column C".
    *
    * If this property is not given as argument it is assumed to be `FALSE` , i.e., the default is "no labels".
    */
  var FirstCellAsLabel: Boolean
  
  /**
    * If `FALSE` the data provider may create a data sequence containing generated categories that fit the rest of the data, like e.g. "Row 12", "Row 13",
    * etc.
    *
    * This property is not relevant for the splitting up of the data. It just indicates, if the chart wants to use part of the data as categories, so that
    * generic categories can be returned if it doesn't.
    *
    * The generic category labeled sequence returned should be the first one in the returned {@link XDataSource} . It needs no label. The values should have
    * their role set to "categories". The generic strings returned should also be localized.
    */
  var HasCategories: Boolean
  
  /**
    * determines the order of the created labeled sequences
    *
    * For example a SequenceMapping of [3,0,2,1] indicates that the sequence from old position "3" should now be the first one. Then comes the sequence from
    * old position "0". Then that one from old position "2" and then the sequence from old position "1".
    *
    * If the SequenceMapping contains invalid indexes just ignore those single indexes. For example if you only have three labeled sequences and a
    * SequenceMapping [2,5,1,0], you should ignore the "5" and continue to place the sequence from old index "1" to the next new position and so on.
    *
    * If the given SequenceMapping does not cover all existing labeled sequences just put the remaining sequences in old order behind the others. For
    * example you have 4 sequences and a SequenceMapping [3,1]. The result should be a as if [3,1,0,2] was given.
    */
  var SequenceMapping: SafeArray[Double]
  
  /**
    * This property is for providing proprietary table indexes for each table appearing in a range given in CellRangeRepresentation.
    * @deprecated Deprecated  This argument is supported by Spreadsheets in order to be able to export a document into the StarOffice 5.0 binary format.  Example:
    */
  var TableNumberList: String
}
object TabularDataProviderArguments {
  
  @scala.inline
  def apply(
    CellRangeRepresentation: String,
    DataRowSource: ChartDataRowSource,
    FirstCellAsLabel: Boolean,
    HasCategories: Boolean,
    SequenceMapping: SafeArray[Double],
    TableNumberList: String
  ): TabularDataProviderArguments = {
    val __obj = js.Dynamic.literal(CellRangeRepresentation = CellRangeRepresentation.asInstanceOf[js.Any], DataRowSource = DataRowSource.asInstanceOf[js.Any], FirstCellAsLabel = FirstCellAsLabel.asInstanceOf[js.Any], HasCategories = HasCategories.asInstanceOf[js.Any], SequenceMapping = SequenceMapping.asInstanceOf[js.Any], TableNumberList = TableNumberList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabularDataProviderArguments]
  }
  
  @scala.inline
  implicit class TabularDataProviderArgumentsMutableBuilder[Self <: TabularDataProviderArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellRangeRepresentation(value: String): Self = StObject.set(x, "CellRangeRepresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRowSource(value: ChartDataRowSource): Self = StObject.set(x, "DataRowSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstCellAsLabel(value: Boolean): Self = StObject.set(x, "FirstCellAsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCategories(value: Boolean): Self = StObject.set(x, "HasCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceMapping(value: SafeArray[Double]): Self = StObject.set(x, "SequenceMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNumberList(value: String): Self = StObject.set(x, "TableNumberList", value.asInstanceOf[js.Any])
  }
}
