package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsDefaultValue extends js.Object {
  var defaultValue: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]]
  var onChange: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var options: propDashTypesLib.propDashTypesMod.Validator[js.Array[_]]
  var value: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]]
}

object Anon_ArgsDefaultValue {
  @scala.inline
  def apply(
    defaultValue: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]],
    onChange: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    options: propDashTypesLib.propDashTypesMod.Validator[js.Array[_]],
    value: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]]
  ): Anon_ArgsDefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, onChange = onChange, options = options, value = value)
  
    __obj.asInstanceOf[Anon_ArgsDefaultValue]
  }
}

