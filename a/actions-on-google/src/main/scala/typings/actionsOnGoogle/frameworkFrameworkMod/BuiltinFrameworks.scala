package typings.actionsOnGoogle.frameworkFrameworkMod

import typings.actionsOnGoogle.expressMod.Express_
import typings.actionsOnGoogle.lambdaMod.Lambda_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltinFrameworks extends Frameworks {
  /**
    * Plug and play web framework support for express using body-parser
    * @public
    */
  var express: Express_ = js.native
  /**
    * Plug and play web framework support for lambda API gateway
    * @public
    */
  var lambda: Lambda_ = js.native
}

object BuiltinFrameworks {
  @scala.inline
  def apply(express: Express_, lambda: Lambda_): BuiltinFrameworks = {
    val __obj = js.Dynamic.literal(express = express.asInstanceOf[js.Any], lambda = lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltinFrameworks]
  }
  @scala.inline
  implicit class BuiltinFrameworksOps[Self <: BuiltinFrameworks] (val x: Self) extends AnyVal {
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
    def setExpress(value: Express_): Self = this.set("express", value.asInstanceOf[js.Any])
    @scala.inline
    def setLambda(value: Lambda_): Self = this.set("lambda", value.asInstanceOf[js.Any])
  }
  
}

