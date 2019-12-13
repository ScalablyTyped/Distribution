package typings.antd

import typings.antd.libSliderMod.HandleGeneratorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Info extends js.Object {
  var info: HandleGeneratorInfo
  var prefixCls: js.UndefOr[String] = js.undefined
  var tooltipPrefixCls: js.UndefOr[String] = js.undefined
}

object Anon_Info {
  @scala.inline
  def apply(info: HandleGeneratorInfo, prefixCls: String = null, tooltipPrefixCls: String = null): Anon_Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (tooltipPrefixCls != null) __obj.updateDynamic("tooltipPrefixCls")(tooltipPrefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Info]
  }
}

