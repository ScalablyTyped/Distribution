package typings.angularCompiler.formattedErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  chain :@angular/compiler.@angular/compiler/src/aot/formatted_error.FormattedMessageChain,   position :@angular/compiler.@angular/compiler/src/aot/formatted_error.Position | undefined} */
@js.native
trait FormattedError_ extends js.Object {
  var chain: FormattedMessageChain = js.native
  var message: String = js.native
  var name: String = js.native
  var position: js.UndefOr[Position] = js.native
  var stack: js.UndefOr[String] = js.native
}

object FormattedError_ {
  @scala.inline
  def apply(chain: FormattedMessageChain, message: String, name: String): FormattedError_ = {
    val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedError_]
  }
  @scala.inline
  implicit class FormattedError_Ops[Self <: FormattedError_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChain(value: FormattedMessageChain): Self = this.set("chain", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

