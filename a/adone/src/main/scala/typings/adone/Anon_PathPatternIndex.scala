package typings.adone

import typings.adone.adoneNs.fsNs.INs.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathPatternIndex extends js.Object {
  /**
    * File path
    */
  var path: String
  /**
    * Pattern index
    */
  var patternIndex: Double
  /**
    * File stats
    */
  var stat: Stats
}

object Anon_PathPatternIndex {
  @scala.inline
  def apply(path: String, patternIndex: Double, stat: Stats): Anon_PathPatternIndex = {
    val __obj = js.Dynamic.literal(path = path, patternIndex = patternIndex, stat = stat)
  
    __obj.asInstanceOf[Anon_PathPatternIndex]
  }
}

