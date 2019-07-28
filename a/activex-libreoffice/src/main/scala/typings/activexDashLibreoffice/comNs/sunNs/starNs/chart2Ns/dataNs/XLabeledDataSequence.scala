package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows access to a one-dimensional sequence of data.
  *
  * The data that is stored in this container may contain different types.
  */
trait XLabeledDataSequence extends XInterface {
  /** returns an {@link XDataSequence} containing the label for the labeled sequence. */
  var Label: XDataSequence
  /** returns an {@link XDataSequence} containing the actual data. */
  var Values: XDataSequence
  /** returns an {@link XDataSequence} containing the label for the labeled sequence. */
  def getLabel(): XDataSequence
  /** returns an {@link XDataSequence} containing the actual data. */
  def getValues(): XDataSequence
  /** sets a new {@link XDataSequence} containing the label for the labeled sequence. */
  def setLabel(xSequence: XDataSequence): Unit
  /** sets a new {@link XDataSequence} containing the actual data. */
  def setValues(xSequence: XDataSequence): Unit
}

object XLabeledDataSequence {
  @scala.inline
  def apply(
    Label: XDataSequence,
    Values: XDataSequence,
    acquire: () => Unit,
    getLabel: () => XDataSequence,
    getValues: () => XDataSequence,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLabel: XDataSequence => Unit,
    setValues: XDataSequence => Unit
  ): XLabeledDataSequence = {
    val __obj = js.Dynamic.literal(Label = Label, Values = Values, acquire = js.Any.fromFunction0(acquire), getLabel = js.Any.fromFunction0(getLabel), getValues = js.Any.fromFunction0(getValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLabel = js.Any.fromFunction1(setLabel), setValues = js.Any.fromFunction1(setValues))
  
    __obj.asInstanceOf[XLabeledDataSequence]
  }
}

