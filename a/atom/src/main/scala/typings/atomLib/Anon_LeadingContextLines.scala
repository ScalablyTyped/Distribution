package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LeadingContextLines extends js.Object {
  var leadingContextLines: js.Array[java.lang.String]
  var lineText: java.lang.String
  var lineTextOffset: scala.Double
  var matchText: java.lang.String
  var range: js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]
  var trailingContextLines: js.Array[java.lang.String]
}

object Anon_LeadingContextLines {
  @scala.inline
  def apply(
    leadingContextLines: js.Array[java.lang.String],
    lineText: java.lang.String,
    lineTextOffset: scala.Double,
    matchText: java.lang.String,
    range: js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]],
    trailingContextLines: js.Array[java.lang.String]
  ): Anon_LeadingContextLines = {
    val __obj = js.Dynamic.literal(leadingContextLines = leadingContextLines, lineText = lineText, lineTextOffset = lineTextOffset, matchText = matchText, range = range, trailingContextLines = trailingContextLines)
  
    __obj.asInstanceOf[Anon_LeadingContextLines]
  }
}

