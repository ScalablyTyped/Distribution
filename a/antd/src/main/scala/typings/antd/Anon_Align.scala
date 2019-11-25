package typings.antd

import typings.antd.antdStrings.`space-around`
import typings.antd.antdStrings.`space-between`
import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.center
import typings.antd.antdStrings.end
import typings.antd.antdStrings.flex
import typings.antd.antdStrings.middle
import typings.antd.antdStrings.start
import typings.antd.antdStrings.stretch
import typings.antd.antdStrings.top
import typings.propDashTypes.propDashTypesMod.ReactNodeLike
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: Requireable[stretch | bottom | top | middle]
  var children: Requireable[ReactNodeLike]
  var className: Requireable[String]
  var gutter: Requireable[Double | js.Object]
  var justify: Requireable[`space-around` | `space-between` | center | end | start]
  var prefixCls: Requireable[String]
  var `type`: Requireable[flex]
}

object Anon_Align {
  @scala.inline
  def apply(
    align: Requireable[stretch | bottom | top | middle],
    children: Requireable[ReactNodeLike],
    className: Requireable[String],
    gutter: Requireable[Double | js.Object],
    justify: Requireable[`space-around` | `space-between` | center | end | start],
    prefixCls: Requireable[String],
    `type`: Requireable[flex]
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], gutter = gutter.asInstanceOf[js.Any], justify = justify.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Align]
  }
}

