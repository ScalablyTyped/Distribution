package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Affix extends js.Object {
  var affix: Boolean
  var showInkInFixed: Boolean
}

object Affix {
  @scala.inline
  def apply(affix: Boolean, showInkInFixed: Boolean): Affix = {
    val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affix]
  }
}

