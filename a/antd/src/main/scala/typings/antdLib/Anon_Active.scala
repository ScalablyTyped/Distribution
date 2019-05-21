package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var default: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var format: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var gapDegree: propDashTypesLib.propDashTypesMod.Requireable[scala.Double]
  var percent: propDashTypesLib.propDashTypesMod.Requireable[scala.Double]
  var showInfo: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var status: propDashTypesLib.propDashTypesMod.Requireable[
    antdLib.antdLibStrings.normal | antdLib.antdLibStrings.active | antdLib.antdLibStrings.success | antdLib.antdLibStrings.exception
  ]
  var strokeColor: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | js.Object]
  var strokeLinecap: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var strokeWidth: propDashTypesLib.propDashTypesMod.Requireable[scala.Double]
  var trailColor: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var `type`: propDashTypesLib.propDashTypesMod.Requireable[
    antdLib.antdLibStrings.circle | antdLib.antdLibStrings.line | antdLib.antdLibStrings.dashboard
  ]
  var width: propDashTypesLib.propDashTypesMod.Requireable[scala.Double]
}

object Anon_Active {
  @scala.inline
  def apply(
    default: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    format: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    gapDegree: propDashTypesLib.propDashTypesMod.Requireable[scala.Double],
    percent: propDashTypesLib.propDashTypesMod.Requireable[scala.Double],
    showInfo: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    status: propDashTypesLib.propDashTypesMod.Requireable[
      antdLib.antdLibStrings.normal | antdLib.antdLibStrings.active | antdLib.antdLibStrings.success | antdLib.antdLibStrings.exception
    ],
    strokeColor: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | js.Object],
    strokeLinecap: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    strokeWidth: propDashTypesLib.propDashTypesMod.Requireable[scala.Double],
    trailColor: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    `type`: propDashTypesLib.propDashTypesMod.Requireable[
      antdLib.antdLibStrings.circle | antdLib.antdLibStrings.line | antdLib.antdLibStrings.dashboard
    ],
    width: propDashTypesLib.propDashTypesMod.Requireable[scala.Double]
  ): Anon_Active = {
    val __obj = js.Dynamic.literal(default = default, format = format, gapDegree = gapDegree, percent = percent, showInfo = showInfo, status = status, strokeColor = strokeColor, strokeLinecap = strokeLinecap, strokeWidth = strokeWidth, trailColor = trailColor, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Active]
  }
}

