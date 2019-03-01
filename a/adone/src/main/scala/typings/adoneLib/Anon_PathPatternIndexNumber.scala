package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathPatternIndexNumber extends js.Object {
  /**
    * File path
    */
  var path: java.lang.String
  /**
    * Pattern index
    */
  var patternIndex: scala.Double
}

object Anon_PathPatternIndexNumber {
  @scala.inline
  def apply(path: java.lang.String, patternIndex: scala.Double): Anon_PathPatternIndexNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("patternIndex")(patternIndex)
    __obj.asInstanceOf[Anon_PathPatternIndexNumber]
  }
}

