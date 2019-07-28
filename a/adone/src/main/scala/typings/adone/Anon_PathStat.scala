package typings.adone

import typings.adone.adoneNs.fsNs.INs.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathStat extends js.Object {
  /**
    * File path
    */
  var path: String
  /**
    * File stats
    */
  var stat: Stats
}

object Anon_PathStat {
  @scala.inline
  def apply(path: String, stat: Stats): Anon_PathStat = {
    val __obj = js.Dynamic.literal(path = path, stat = stat)
  
    __obj.asInstanceOf[Anon_PathStat]
  }
}

