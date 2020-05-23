package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsInline extends js.Object {
  var isInline: Boolean
  var templateUrl: String | Null
}

object IsInline {
  @scala.inline
  def apply(isInline: Boolean, templateUrl: String = null): IsInline = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInline]
  }
}

