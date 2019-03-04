package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathPatternIndex extends js.Object {
  /**
    * File path
    */
  var path: java.lang.String
  /**
    * Pattern index
    */
  var patternIndex: scala.Double
  /**
    * File stats
    */
  var stat: adoneLib.adoneNs.fsNs.INs.Stats
}

object Anon_PathPatternIndex {
  @scala.inline
  def apply(path: java.lang.String, patternIndex: scala.Double, stat: adoneLib.adoneNs.fsNs.INs.Stats): Anon_PathPatternIndex = {
    val __obj = js.Dynamic.literal(path = path, patternIndex = patternIndex, stat = stat)
  
    __obj.asInstanceOf[Anon_PathPatternIndex]
  }
}

