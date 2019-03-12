package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An internal DataProvider that has more access to data than a plain DataProvider. */
trait XInternalDataProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataProvider {
  /** same as insertSequence with nAfterIndex being the largest current index of the data, i.e. (size - 1) */
  def appendSequence(): scala.Unit
  /**
    * deletes an additional sequence for categories at nLevel>=1; categories at level 0 are always present and cannot be deleted
    * @since OOo 3.3
    */
  def deleteComplexCategoryLevel(nLevel: scala.Double): scala.Unit
  def deleteDataPointForAllSequences(nAtIndex: scala.Double): scala.Unit
  def deleteSequence(nAtIndex: scala.Double): scala.Unit
  def getDataByRangeRepresentation(aRange: java.lang.String): stdLib.SafeArray[_]
  def hasDataByRangeRepresentation(aRange: java.lang.String): scala.Boolean
  /**
    * insert an additional sequence for categories nLevel>=1; categories at level 0 are always present and cannot be inserted or deleted
    * @since OOo 3.3
    */
  def insertComplexCategoryLevel(nLevel: scala.Double): scala.Unit
  def insertDataPointForAllSequences(nAfterIndex: scala.Double): scala.Unit
  def insertSequence(nAfterIndex: scala.Double): scala.Unit
  /**
    * If range representations of data sequences change due to internal structural changes, they must be registered at the data provider.
    *
    * Sequences that are directly retrieved via the methods of the XDataProvider interface are already registered. If a labeled data sequence was created by
    * cloning an existing one, it has to be explicitly registered via this method.
    */
  def registerDataSequenceForChanges(xSeq: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSequence): scala.Unit
  def setDataByRangeRepresentation(aRange: java.lang.String, aNewData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): scala.Unit
  def swapDataPointWithNextOneForAllSequences(nAtIndex: scala.Double): scala.Unit
}

object XInternalDataProvider {
  @scala.inline
  def apply(
    RangeSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection,
    acquire: () => scala.Unit,
    appendSequence: () => scala.Unit,
    createDataSequenceByRangeRepresentation: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSequence,
    createDataSequenceByRangeRepresentationPossible: java.lang.String => scala.Boolean,
    createDataSequenceByValueArray: (java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSequence,
    createDataSource: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource,
    createDataSourcePossible: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Boolean,
    deleteComplexCategoryLevel: scala.Double => scala.Unit,
    deleteDataPointForAllSequences: scala.Double => scala.Unit,
    deleteSequence: scala.Double => scala.Unit,
    detectArguments: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getDataByRangeRepresentation: java.lang.String => stdLib.SafeArray[_],
    getRangeSelection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection,
    hasDataByRangeRepresentation: java.lang.String => scala.Boolean,
    insertComplexCategoryLevel: scala.Double => scala.Unit,
    insertDataPointForAllSequences: scala.Double => scala.Unit,
    insertSequence: scala.Double => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerDataSequenceForChanges: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSequence => scala.Unit,
    release: () => scala.Unit,
    setDataByRangeRepresentation: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]) => scala.Unit,
    swapDataPointWithNextOneForAllSequences: scala.Double => scala.Unit
  ): XInternalDataProvider = {
    val __obj = js.Dynamic.literal(RangeSelection = RangeSelection, acquire = js.Any.fromFunction0(acquire), appendSequence = js.Any.fromFunction0(appendSequence), createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), deleteComplexCategoryLevel = js.Any.fromFunction1(deleteComplexCategoryLevel), deleteDataPointForAllSequences = js.Any.fromFunction1(deleteDataPointForAllSequences), deleteSequence = js.Any.fromFunction1(deleteSequence), detectArguments = js.Any.fromFunction1(detectArguments), getDataByRangeRepresentation = js.Any.fromFunction1(getDataByRangeRepresentation), getRangeSelection = js.Any.fromFunction0(getRangeSelection), hasDataByRangeRepresentation = js.Any.fromFunction1(hasDataByRangeRepresentation), insertComplexCategoryLevel = js.Any.fromFunction1(insertComplexCategoryLevel), insertDataPointForAllSequences = js.Any.fromFunction1(insertDataPointForAllSequences), insertSequence = js.Any.fromFunction1(insertSequence), queryInterface = js.Any.fromFunction1(queryInterface), registerDataSequenceForChanges = js.Any.fromFunction1(registerDataSequenceForChanges), release = js.Any.fromFunction0(release), setDataByRangeRepresentation = js.Any.fromFunction2(setDataByRangeRepresentation), swapDataPointWithNextOneForAllSequences = js.Any.fromFunction1(swapDataPointWithNextOneForAllSequences))
  
    __obj.asInstanceOf[XInternalDataProvider]
  }
}

