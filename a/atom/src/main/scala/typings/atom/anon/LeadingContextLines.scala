package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeadingContextLines extends js.Object {
  var leadingContextLines: js.Array[String] = js.native
  var lineText: String = js.native
  var lineTextOffset: Double = js.native
  var matchText: String = js.native
  var range: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  var trailingContextLines: js.Array[String] = js.native
}

object LeadingContextLines {
  @scala.inline
  def apply(
    leadingContextLines: js.Array[String],
    lineText: String,
    lineTextOffset: Double,
    matchText: String,
    range: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    trailingContextLines: js.Array[String]
  ): LeadingContextLines = {
    val __obj = js.Dynamic.literal(leadingContextLines = leadingContextLines.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], lineTextOffset = lineTextOffset.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], trailingContextLines = trailingContextLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeadingContextLines]
  }
  @scala.inline
  implicit class LeadingContextLinesOps[Self <: LeadingContextLines] (val x: Self) extends AnyVal {
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
    def setLeadingContextLinesVarargs(value: String*): Self = this.set("leadingContextLines", js.Array(value :_*))
    @scala.inline
    def setLeadingContextLines(value: js.Array[String]): Self = this.set("leadingContextLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineText(value: String): Self = this.set("lineText", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineTextOffset(value: Double): Self = this.set("lineTextOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchText(value: String): Self = this.set("matchText", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrailingContextLinesVarargs(value: String*): Self = this.set("trailingContextLines", js.Array(value :_*))
    @scala.inline
    def setTrailingContextLines(value: js.Array[String]): Self = this.set("trailingContextLines", value.asInstanceOf[js.Any])
  }
  
}

