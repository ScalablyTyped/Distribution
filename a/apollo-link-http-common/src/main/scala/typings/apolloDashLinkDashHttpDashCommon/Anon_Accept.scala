package typings.apolloDashLinkDashHttpDashCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: String
  var `content-type`: String
}

object Anon_Accept {
  @scala.inline
  def apply(accept: String, `content-type`: String): Anon_Accept = {
    val __obj = js.Dynamic.literal(accept = accept)
    __obj.updateDynamic("content-type")(`content-type`)
    __obj.asInstanceOf[Anon_Accept]
  }
}

