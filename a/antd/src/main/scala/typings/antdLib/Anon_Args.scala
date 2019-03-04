package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var offsetBottom: propDashTypesLib.propDashTypesMod.Requireable[scala.Double]
  var offsetTop: propDashTypesLib.propDashTypesMod.Requireable[scala.Double]
  var target: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
}

object Anon_Args {
  @scala.inline
  def apply(
    offsetBottom: propDashTypesLib.propDashTypesMod.Requireable[scala.Double],
    offsetTop: propDashTypesLib.propDashTypesMod.Requireable[scala.Double],
    target: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(offsetBottom = offsetBottom, offsetTop = offsetTop, target = target)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

