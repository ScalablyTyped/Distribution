package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeadingContextLines extends js.Object {
  var leadingContextLines: js.Array[String]
  var lineText: String
  var lineTextOffset: Double
  var matchText: String
  var range: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  var trailingContextLines: js.Array[String]
}

object AnonLeadingContextLines {
  @scala.inline
  def apply(
    leadingContextLines: js.Array[String],
    lineText: String,
    lineTextOffset: Double,
    matchText: String,
    range: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    trailingContextLines: js.Array[String]
  ): AnonLeadingContextLines = {
    val __obj = js.Dynamic.literal(leadingContextLines = leadingContextLines.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], lineTextOffset = lineTextOffset.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], trailingContextLines = trailingContextLines.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLeadingContextLines]
  }
}

