package typings
package apolloDashLinkDashHttpDashCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: java.lang.String
  var `content-type`: java.lang.String
}

object Anon_Accept {
  @scala.inline
  def apply(accept: java.lang.String, `content-type`: java.lang.String): Anon_Accept = {
    val __obj = js.Dynamic.literal(accept = accept)
    __obj.updateDynamic("content-type")(`content-type`)
    __obj.asInstanceOf[Anon_Accept]
  }
}

