package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Linkname extends js.Object {
  var linkname: java.lang.String
  var `type`: adoneLib.adoneLibStrings.symblink
}

object Anon_Linkname {
  @scala.inline
  def apply(linkname: java.lang.String, `type`: adoneLib.adoneLibStrings.symblink): Anon_Linkname = {
    val __obj = js.Dynamic.literal(linkname = linkname)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Linkname]
  }
}

