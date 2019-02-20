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

