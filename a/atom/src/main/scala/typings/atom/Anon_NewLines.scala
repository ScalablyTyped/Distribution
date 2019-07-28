package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewLines extends js.Object {
  var newLines: Double
  var newStart: Double
  var oldLines: Double
  var oldStart: Double
}

object Anon_NewLines {
  @scala.inline
  def apply(newLines: Double, newStart: Double, oldLines: Double, oldStart: Double): Anon_NewLines = {
    val __obj = js.Dynamic.literal(newLines = newLines, newStart = newStart, oldLines = oldLines, oldStart = oldStart)
  
    __obj.asInstanceOf[Anon_NewLines]
  }
}

