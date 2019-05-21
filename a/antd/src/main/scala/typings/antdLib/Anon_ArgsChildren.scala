package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsChildren extends js.Object {
  var children: propDashTypesLib.propDashTypesMod.Requireable[_]
  var colon: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var hideRequiredMark: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var layout: propDashTypesLib.propDashTypesMod.Requireable[
    antdLib.antdLibStrings.`inline` | antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical
  ]
  var onSubmit: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
}

object Anon_ArgsChildren {
  @scala.inline
  def apply(
    children: propDashTypesLib.propDashTypesMod.Requireable[_],
    colon: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    hideRequiredMark: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    layout: propDashTypesLib.propDashTypesMod.Requireable[
      antdLib.antdLibStrings.`inline` | antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical
    ],
    onSubmit: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  ): Anon_ArgsChildren = {
    val __obj = js.Dynamic.literal(children = children, colon = colon, hideRequiredMark = hideRequiredMark, layout = layout, onSubmit = onSubmit, prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_ArgsChildren]
  }
}

