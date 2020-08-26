package typings.activexLibreoffice.com_.sun.star.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specify the alignment of a numbering level. */
@js.native
trait NumberingAlignment extends js.Object {
  /** set the alignment from the numbering. Use the {@link com.sun.star.style.HorizontalAlignment} enum to change the alignment. */
  var Alignment: HorizontalAlignment = js.native
  /** the distance between the numbering symbol and text. */
  var Insertion: Double = js.native
  /** the minimum distance between the numbering symbol and the following text. */
  var TextMarginDistance: Double = js.native
  /** the distance between left margin and the numbering symbol. */
  var TextNumberingDistance: Double = js.native
}

object NumberingAlignment {
  @scala.inline
  def apply(
    Alignment: HorizontalAlignment,
    Insertion: Double,
    TextMarginDistance: Double,
    TextNumberingDistance: Double
  ): NumberingAlignment = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Insertion = Insertion.asInstanceOf[js.Any], TextMarginDistance = TextMarginDistance.asInstanceOf[js.Any], TextNumberingDistance = TextNumberingDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberingAlignment]
  }
  @scala.inline
  implicit class NumberingAlignmentOps[Self <: NumberingAlignment] (val x: Self) extends AnyVal {
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
    def setAlignment(value: HorizontalAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertion(value: Double): Self = this.set("Insertion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextMarginDistance(value: Double): Self = this.set("TextMarginDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextNumberingDistance(value: Double): Self = this.set("TextNumberingDistance", value.asInstanceOf[js.Any])
  }
  
}

