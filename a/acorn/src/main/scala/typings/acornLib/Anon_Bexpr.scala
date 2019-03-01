package typings
package acornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bexpr extends js.Object {
  var b_expr: acornLib.acornMod.acornNs.TokContext
  var b_stat: acornLib.acornMod.acornNs.TokContext
  var b_tmpl: acornLib.acornMod.acornNs.TokContext
  var f_expr: acornLib.acornMod.acornNs.TokContext
  var p_expr: acornLib.acornMod.acornNs.TokContext
  var p_stat: acornLib.acornMod.acornNs.TokContext
  var q_tmpl: acornLib.acornMod.acornNs.TokContext
}

object Anon_Bexpr {
  @scala.inline
  def apply(
    b_expr: acornLib.acornMod.acornNs.TokContext,
    b_stat: acornLib.acornMod.acornNs.TokContext,
    b_tmpl: acornLib.acornMod.acornNs.TokContext,
    f_expr: acornLib.acornMod.acornNs.TokContext,
    p_expr: acornLib.acornMod.acornNs.TokContext,
    p_stat: acornLib.acornMod.acornNs.TokContext,
    q_tmpl: acornLib.acornMod.acornNs.TokContext
  ): Anon_Bexpr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b_expr")(b_expr)
    __obj.updateDynamic("b_stat")(b_stat)
    __obj.updateDynamic("b_tmpl")(b_tmpl)
    __obj.updateDynamic("f_expr")(f_expr)
    __obj.updateDynamic("p_expr")(p_expr)
    __obj.updateDynamic("p_stat")(p_stat)
    __obj.updateDynamic("q_tmpl")(q_tmpl)
    __obj.asInstanceOf[Anon_Bexpr]
  }
}

