package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: propDashTypesLib.propDashTypesMod.Requireable[
    antdLib.antdLibStrings.top | antdLib.antdLibStrings.middle | antdLib.antdLibStrings.bottom
  ]
  var children: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
  var className: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var gutter: propDashTypesLib.propDashTypesMod.Requireable[scala.Double | js.Object]
  var justify: propDashTypesLib.propDashTypesMod.Requireable[
    antdLib.antdLibStrings.start | antdLib.antdLibStrings.center | antdLib.antdLibStrings.end | antdLib.antdLibStrings.`space-around` | antdLib.antdLibStrings.`space-between`
  ]
  var prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var `type`: propDashTypesLib.propDashTypesMod.Requireable[antdLib.antdLibStrings.flex]
}

object Anon_Align {
  @scala.inline
  def apply(
    align: propDashTypesLib.propDashTypesMod.Requireable[
      antdLib.antdLibStrings.top | antdLib.antdLibStrings.middle | antdLib.antdLibStrings.bottom
    ],
    children: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike],
    className: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    gutter: propDashTypesLib.propDashTypesMod.Requireable[scala.Double | js.Object],
    justify: propDashTypesLib.propDashTypesMod.Requireable[
      antdLib.antdLibStrings.start | antdLib.antdLibStrings.center | antdLib.antdLibStrings.end | antdLib.antdLibStrings.`space-around` | antdLib.antdLibStrings.`space-between`
    ],
    prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    `type`: propDashTypesLib.propDashTypesMod.Requireable[antdLib.antdLibStrings.flex]
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("align")(align)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("gutter")(gutter)
    __obj.updateDynamic("justify")(justify)
    __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[Anon_Align]
  }
}

