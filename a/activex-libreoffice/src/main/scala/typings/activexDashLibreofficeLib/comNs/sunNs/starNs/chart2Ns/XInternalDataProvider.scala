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
  def getDataByRangeRepresentation(aRange: java.lang.String): activexDashInteropLib.SafeArray[_]
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
    acquire: js.Function0[scala.Unit],
    appendSequence: js.Function0[scala.Unit],
    createDataSequenceByRangeRepresentation: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSequence
    ],
    createDataSequenceByRangeRepresentationPossible: js.Function1[java.lang.String, scala.Boolean],
    createDataSequenceByValueArray: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSequence
    ],
    createDataSource: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource
    ],
    createDataSourcePossible: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    deleteComplexCategoryLevel: js.Function1[scala.Double, scala.Unit],
    deleteDataPointForAllSequences: js.Function1[scala.Double, scala.Unit],
    deleteSequence: js.Function1[scala.Double, scala.Unit],
    detectArguments: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getDataByRangeRepresentation: js.Function1[java.lang.String, activexDashInteropLib.SafeArray[_]],
    getRangeSelection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection],
    hasDataByRangeRepresentation: js.Function1[java.lang.String, scala.Boolean],
    insertComplexCategoryLevel: js.Function1[scala.Double, scala.Unit],
    insertDataPointForAllSequences: js.Function1[scala.Double, scala.Unit],
    insertSequence: js.Function1[scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerDataSequenceForChanges: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSequence, 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    setDataByRangeRepresentation: js.Function2[java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    swapDataPointWithNextOneForAllSequences: js.Function1[scala.Double, scala.Unit]
  ): XInternalDataProvider = {
    val __obj = js.Dynamic.literal(RangeSelection = RangeSelection, acquire = acquire, appendSequence = appendSequence, createDataSequenceByRangeRepresentation = createDataSequenceByRangeRepresentation, createDataSequenceByRangeRepresentationPossible = createDataSequenceByRangeRepresentationPossible, createDataSequenceByValueArray = createDataSequenceByValueArray, createDataSource = createDataSource, createDataSourcePossible = createDataSourcePossible, deleteComplexCategoryLevel = deleteComplexCategoryLevel, deleteDataPointForAllSequences = deleteDataPointForAllSequences, deleteSequence = deleteSequence, detectArguments = detectArguments, getDataByRangeRepresentation = getDataByRangeRepresentation, getRangeSelection = getRangeSelection, hasDataByRangeRepresentation = hasDataByRangeRepresentation, insertComplexCategoryLevel = insertComplexCategoryLevel, insertDataPointForAllSequences = insertDataPointForAllSequences, insertSequence = insertSequence, queryInterface = queryInterface, registerDataSequenceForChanges = registerDataSequenceForChanges, release = release, setDataByRangeRepresentation = setDataByRangeRepresentation, swapDataPointWithNextOneForAllSequences = swapDataPointWithNextOneForAllSequences)
  
    __obj.asInstanceOf[XInternalDataProvider]
  }
}

