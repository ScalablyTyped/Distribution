package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows access to a one-dimensional sequence of data.
  *
  * The data that is stored in this container may contain different types.
  */
@js.native
trait XLabeledDataSequence extends XInterface {
  /** returns an {@link XDataSequence} containing the label for the labeled sequence. */
  var Label: XDataSequence = js.native
  /** returns an {@link XDataSequence} containing the actual data. */
  var Values: XDataSequence = js.native
  /** returns an {@link XDataSequence} containing the label for the labeled sequence. */
  def getLabel(): XDataSequence = js.native
  /** returns an {@link XDataSequence} containing the actual data. */
  def getValues(): XDataSequence = js.native
  /** sets a new {@link XDataSequence} containing the label for the labeled sequence. */
  def setLabel(xSequence: XDataSequence): Unit = js.native
  /** sets a new {@link XDataSequence} containing the actual data. */
  def setValues(xSequence: XDataSequence): Unit = js.native
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
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLabel = js.Any.fromFunction0(getLabel), getValues = js.Any.fromFunction0(getValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLabel = js.Any.fromFunction1(setLabel), setValues = js.Any.fromFunction1(setValues))
    __obj.asInstanceOf[XLabeledDataSequence]
  }
  @scala.inline
  implicit class XLabeledDataSequenceOps[Self <: XLabeledDataSequence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabel(value: XDataSequence): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: XDataSequence): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLabel(value: () => XDataSequence): Self = this.set("getLabel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValues(value: () => XDataSequence): Self = this.set("getValues", js.Any.fromFunction0(value))
    @scala.inline
    def setSetLabel(value: XDataSequence => Unit): Self = this.set("setLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValues(value: XDataSequence => Unit): Self = this.set("setValues", js.Any.fromFunction1(value))
  }
  
}

