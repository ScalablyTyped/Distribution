package typings.adone

import typings.adone.adoneStrings.symblink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Linkname extends js.Object {
  var linkname: String
  var `type`: symblink
}

object Anon_Linkname {
  @scala.inline
  def apply(linkname: String, `type`: symblink): Anon_Linkname = {
    val __obj = js.Dynamic.literal(linkname = linkname)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Linkname]
  }
}

