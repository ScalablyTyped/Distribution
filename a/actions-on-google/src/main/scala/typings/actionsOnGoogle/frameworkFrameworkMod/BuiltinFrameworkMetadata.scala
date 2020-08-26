package typings.actionsOnGoogle.frameworkFrameworkMod

import typings.actionsOnGoogle.expressMod.ExpressMetadata
import typings.actionsOnGoogle.lambdaMod.LambdaMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltinFrameworkMetadata extends FrameworkMetadata {
  /** @public */
  var express: js.UndefOr[ExpressMetadata] = js.native
  /** @public */
  var lambda: js.UndefOr[LambdaMetadata] = js.native
}

object BuiltinFrameworkMetadata {
  @scala.inline
  def apply(): BuiltinFrameworkMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltinFrameworkMetadata]
  }
  @scala.inline
  implicit class BuiltinFrameworkMetadataOps[Self <: BuiltinFrameworkMetadata] (val x: Self) extends AnyVal {
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
    def setExpress(value: ExpressMetadata): Self = this.set("express", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpress: Self = this.set("express", js.undefined)
    @scala.inline
    def setLambda(value: LambdaMetadata): Self = this.set("lambda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambda: Self = this.set("lambda", js.undefined)
  }
  
}

