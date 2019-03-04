package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathStat extends js.Object {
  /**
    * File path
    */
  var path: java.lang.String
  /**
    * File stats
    */
  var stat: adoneLib.adoneNs.fsNs.INs.Stats
}

object Anon_PathStat {
  @scala.inline
  def apply(path: java.lang.String, stat: adoneLib.adoneNs.fsNs.INs.Stats): Anon_PathStat = {
    val __obj = js.Dynamic.literal(path = path, stat = stat)
  
    __obj.asInstanceOf[Anon_PathStat]
  }
}

