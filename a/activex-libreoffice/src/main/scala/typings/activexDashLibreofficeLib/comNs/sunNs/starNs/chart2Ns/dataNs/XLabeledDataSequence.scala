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

object XLabeledDataSequence {
  @scala.inline
  def apply(
    Label: XDataSequence,
    Values: XDataSequence,
    acquire: js.Function0[scala.Unit],
    getLabel: js.Function0[XDataSequence],
    getValues: js.Function0[XDataSequence],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setLabel: js.Function1[XDataSequence, scala.Unit],
    setValues: js.Function1[XDataSequence, scala.Unit]
  ): XLabeledDataSequence = {
    val __obj = js.Dynamic.literal(Label = Label, Values = Values, acquire = acquire, getLabel = getLabel, getValues = getValues, queryInterface = queryInterface, release = release, setLabel = setLabel, setValues = setValues)
  
    __obj.asInstanceOf[XLabeledDataSequence]
  }
}

