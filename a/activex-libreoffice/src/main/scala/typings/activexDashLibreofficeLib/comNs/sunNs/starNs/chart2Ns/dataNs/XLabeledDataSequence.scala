package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows access to a one-dimensional sequence of data.
  *
  * The data that is stored in this container may contain different types.
  */
trait XLabeledDataSequence
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns an {@link XDataSequence} containing the label for the labeled sequence. */
  var Label: XDataSequence
  /** returns an {@link XDataSequence} containing the actual data. */
  var Values: XDataSequence
  /** returns an {@link XDataSequence} containing the label for the labeled sequence. */
  def getLabel(): XDataSequence
  /** returns an {@link XDataSequence} containing the actual data. */
  def getValues(): XDataSequence
  /** sets a new {@link XDataSequence} containing the label for the labeled sequence. */
  def setLabel(xSequence: XDataSequence): scala.Unit
  /** sets a new {@link XDataSequence} containing the actual data. */
  def setValues(xSequence: XDataSequence): scala.Unit
}

