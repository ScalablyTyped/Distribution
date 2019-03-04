package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsBlock extends js.Object {
  var block: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var className: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var htmlType: propDashTypesLib.propDashTypesMod.Requireable[
    antdLib.antdLibStrings.button | antdLib.antdLibStrings.reset | antdLib.antdLibStrings.submit
  ]
  var icon: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var loading: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean | js.Object]
  var onClick: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var shape: propDashTypesLib.propDashTypesMod.Requireable[
    antdLib.antdLibStrings.round | antdLib.antdLibStrings.circle | antdLib.antdLibStrings.`circle-outline`
  ]
  var size: propDashTypesLib.propDashTypesMod.Requireable[
    antdLib.antdLibStrings.small | antdLib.antdLibStrings.default | antdLib.antdLibStrings.large
  ]
  var `type`: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
}

object Anon_ArgsBlock {
  @scala.inline
  def apply(
    block: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    className: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    htmlType: propDashTypesLib.propDashTypesMod.Requireable[
      antdLib.antdLibStrings.button | antdLib.antdLibStrings.reset | antdLib.antdLibStrings.submit
    ],
    icon: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    loading: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean | js.Object],
    onClick: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    shape: propDashTypesLib.propDashTypesMod.Requireable[
      antdLib.antdLibStrings.round | antdLib.antdLibStrings.circle | antdLib.antdLibStrings.`circle-outline`
    ],
    size: propDashTypesLib.propDashTypesMod.Requireable[
      antdLib.antdLibStrings.small | antdLib.antdLibStrings.default | antdLib.antdLibStrings.large
    ],
    `type`: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  ): Anon_ArgsBlock = {
    val __obj = js.Dynamic.literal(block = block, className = className, htmlType = htmlType, icon = icon, loading = loading, onClick = onClick, shape = shape, size = size)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ArgsBlock]
  }
}

