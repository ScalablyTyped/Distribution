package typings.angularCompiler.formattedErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  chain  :@angular/compiler.@angular/compiler/src/aot/formatted_error.FormattedMessageChain,   position ? :@angular/compiler.@angular/compiler/src/aot/formatted_error.Position} */
trait FormattedError_ extends js.Object {
  var chain: FormattedMessageChain
  var message: String
  var name: String
  var position: js.UndefOr[Position] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
}

object FormattedError_ {
  @scala.inline
  def apply(
    chain: FormattedMessageChain,
    message: String,
    name: String,
    position: Position = null,
    stack: String = null
  ): FormattedError_ = {
    val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedError_]
  }
}

