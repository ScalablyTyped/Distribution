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
    val __obj = js.Dynamic.literal(align = align, children = children, className = className, gutter = gutter, justify = justify, prefixCls = prefixCls)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Align]
  }
}

