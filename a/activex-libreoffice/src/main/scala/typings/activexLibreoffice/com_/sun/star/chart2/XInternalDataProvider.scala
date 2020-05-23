package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.chart2.data.XDataProvider
import typings.activexLibreoffice.com_.sun.star.chart2.data.XDataSequence
import typings.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typings.activexLibreoffice.com_.sun.star.sheet.XRangeSelection
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An internal DataProvider that has more access to data than a plain DataProvider. */
trait XInternalDataProvider extends XDataProvider {
  /** same as insertSequence with nAfterIndex being the largest current index of the data, i.e. (size - 1) */
  def appendSequence(): Unit
  /**
    * deletes an additional sequence for categories at nLevel>=1; categories at level 0 are always present and cannot be deleted
    * @since OOo 3.3
    */
  def deleteComplexCategoryLevel(nLevel: Double): Unit
  def deleteDataPointForAllSequences(nAtIndex: Double): Unit
  def deleteSequence(nAtIndex: Double): Unit
  def getDataByRangeRepresentation(aRange: String): SafeArray[_]
  def hasDataByRangeRepresentation(aRange: String): Boolean
  /**
    * insert an additional sequence for categories nLevel>=1; categories at level 0 are always present and cannot be inserted or deleted
    * @since OOo 3.3
    */
  def insertComplexCategoryLevel(nLevel: Double): Unit
  def insertDataPointForAllSequences(nAfterIndex: Double): Unit
  def insertSequence(nAfterIndex: Double): Unit
  /**
    * If range representations of data sequences change due to internal structural changes, they must be registered at the data provider.
    *
    * Sequences that are directly retrieved via the methods of the XDataProvider interface are already registered. If a labeled data sequence was created by
    * cloning an existing one, it has to be explicitly registered via this method.
    */
  def registerDataSequenceForChanges(xSeq: XDataSequence): Unit
  def setDataByRangeRepresentation(aRange: String, aNewData: SeqEquiv[_]): Unit
  def swapDataPointWithNextOneForAllSequences(nAtIndex: Double): Unit
}

object XInternalDataProvider {
  @scala.inline
  def apply(
    RangeSelection: XRangeSelection,
    acquire: () => Unit,
    appendSequence: () => Unit,
    createDataSequenceByRangeRepresentation: String => XDataSequence,
    createDataSequenceByRangeRepresentationPossible: String => Boolean,
    createDataSequenceByValueArray: (String, String) => XDataSequence,
    createDataSource: SeqEquiv[PropertyValue] => XDataSource,
    createDataSourcePossible: SeqEquiv[PropertyValue] => Boolean,
    deleteComplexCategoryLevel: Double => Unit,
    deleteDataPointForAllSequences: Double => Unit,
    deleteSequence: Double => Unit,
    detectArguments: XDataSource => SafeArray[PropertyValue],
    getDataByRangeRepresentation: String => SafeArray[_],
    getRangeSelection: () => XRangeSelection,
    hasDataByRangeRepresentation: String => Boolean,
    insertComplexCategoryLevel: Double => Unit,
    insertDataPointForAllSequences: Double => Unit,
    insertSequence: Double => Unit,
    queryInterface: `type` => js.Any,
    registerDataSequenceForChanges: XDataSequence => Unit,
    release: () => Unit,
    setDataByRangeRepresentation: (String, SeqEquiv[_]) => Unit,
    swapDataPointWithNextOneForAllSequences: Double => Unit
  ): XInternalDataProvider = {
    val __obj = js.Dynamic.literal(RangeSelection = RangeSelection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendSequence = js.Any.fromFunction0(appendSequence), createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), deleteComplexCategoryLevel = js.Any.fromFunction1(deleteComplexCategoryLevel), deleteDataPointForAllSequences = js.Any.fromFunction1(deleteDataPointForAllSequences), deleteSequence = js.Any.fromFunction1(deleteSequence), detectArguments = js.Any.fromFunction1(detectArguments), getDataByRangeRepresentation = js.Any.fromFunction1(getDataByRangeRepresentation), getRangeSelection = js.Any.fromFunction0(getRangeSelection), hasDataByRangeRepresentation = js.Any.fromFunction1(hasDataByRangeRepresentation), insertComplexCategoryLevel = js.Any.fromFunction1(insertComplexCategoryLevel), insertDataPointForAllSequences = js.Any.fromFunction1(insertDataPointForAllSequences), insertSequence = js.Any.fromFunction1(insertSequence), queryInterface = js.Any.fromFunction1(queryInterface), registerDataSequenceForChanges = js.Any.fromFunction1(registerDataSequenceForChanges), release = js.Any.fromFunction0(release), setDataByRangeRepresentation = js.Any.fromFunction2(setDataByRangeRepresentation), swapDataPointWithNextOneForAllSequences = js.Any.fromFunction1(swapDataPointWithNextOneForAllSequences))
    __obj.asInstanceOf[XInternalDataProvider]
  }
}

