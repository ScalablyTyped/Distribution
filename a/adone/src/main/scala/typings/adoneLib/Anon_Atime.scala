package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Atime extends js.Object {
  var atime: stdLib.Date
  var mode: scala.Double
  var mtime: stdLib.Date
  var name: java.lang.String
  var stats: adoneLib.adoneNs.fsNs.INs.Stats
}

object Anon_Atime {
  @scala.inline
  def apply(
    atime: stdLib.Date,
    mode: scala.Double,
    mtime: stdLib.Date,
    name: java.lang.String,
    stats: adoneLib.adoneNs.fsNs.INs.Stats
  ): Anon_Atime = {
    val __obj = js.Dynamic.literal(atime = atime, mode = mode, mtime = mtime, name = name, stats = stats)
  
    __obj.asInstanceOf[Anon_Atime]
  }
}

