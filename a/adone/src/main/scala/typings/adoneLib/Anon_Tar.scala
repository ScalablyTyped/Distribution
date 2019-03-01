package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tar extends js.Object {
  /**
    * tar archiver
    */
  val tarNs: Anon_CwdI
  /**
    * zip archiver
    */
  val zipNs: Anon_Pack
}

object Anon_Tar {
  @scala.inline
  def apply(tarNs: Anon_CwdI, zipNs: Anon_Pack): Anon_Tar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tarNs")(tarNs)
    __obj.updateDynamic("zipNs")(zipNs)
    __obj.asInstanceOf[Anon_Tar]
  }
}

