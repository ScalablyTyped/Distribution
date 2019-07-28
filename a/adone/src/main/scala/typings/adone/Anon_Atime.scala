package typings.adone

import typings.adone.adoneNs.fsNs.INs.Stats
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Atime extends js.Object {
  var atime: Date
  var mode: Double
  var mtime: Date
  var name: String
  var stats: Stats
}

object Anon_Atime {
  @scala.inline
  def apply(atime: Date, mode: Double, mtime: Date, name: String, stats: Stats): Anon_Atime = {
    val __obj = js.Dynamic.literal(atime = atime, mode = mode, mtime = mtime, name = name, stats = stats)
  
    __obj.asInstanceOf[Anon_Atime]
  }
}

