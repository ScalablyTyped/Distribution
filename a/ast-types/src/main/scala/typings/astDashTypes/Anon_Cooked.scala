package typings.astDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cooked extends js.Object {
  var cooked: String
  var raw: String
}

object Anon_Cooked {
  @scala.inline
  def apply(cooked: String, raw: String): Anon_Cooked = {
    val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cooked]
  }
}

