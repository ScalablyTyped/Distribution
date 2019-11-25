package typings.antd

import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsDefaultValue extends js.Object {
  var defaultValue: Requireable[js.Array[_]]
  var onChange: Requireable[js.Function1[/* repeated */ _, _]]
  var options: Validator[js.Array[_]]
  var value: Requireable[js.Array[_]]
}

object Anon_ArgsDefaultValue {
  @scala.inline
  def apply(
    defaultValue: Requireable[js.Array[_]],
    onChange: Requireable[js.Function1[/* repeated */ _, _]],
    options: Validator[js.Array[_]],
    value: Requireable[js.Array[_]]
  ): Anon_ArgsDefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArgsDefaultValue]
  }
}

