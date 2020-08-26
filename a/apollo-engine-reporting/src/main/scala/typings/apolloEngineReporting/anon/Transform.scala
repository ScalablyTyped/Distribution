package typings.apolloEngineReporting.anon

import typings.apolloEngineReporting.agentMod.VariableValueOptions
import typings.apolloEngineReporting.agentMod.VariableValueTransformOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends VariableValueOptions {
  def transform(options: VariableValueTransformOptions): Record[String, _] = js.native
}

object Transform {
  @scala.inline
  def apply(transform: VariableValueTransformOptions => Record[String, _]): Transform = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Transform]
  }
  @scala.inline
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
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
    def setTransform(value: VariableValueTransformOptions => Record[String, _]): Self = this.set("transform", js.Any.fromFunction1(value))
  }
  
}

