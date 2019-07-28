package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LeadingContextLines extends js.Object {
  var leadingContextLines: js.Array[String]
  var lineText: String
  var lineTextOffset: Double
  var matchText: String
  var range: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  var trailingContextLines: js.Array[String]
}

object Anon_LeadingContextLines {
  @scala.inline
  def apply(
    leadingContextLines: js.Array[String],
    lineText: String,
    lineTextOffset: Double,
    matchText: String,
    range: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    trailingContextLines: js.Array[String]
  ): Anon_LeadingContextLines = {
    val __obj = js.Dynamic.literal(leadingContextLines = leadingContextLines, lineText = lineText, lineTextOffset = lineTextOffset, matchText = matchText, range = range, trailingContextLines = trailingContextLines)
  
    __obj.asInstanceOf[Anon_LeadingContextLines]
  }
}

