package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterConstraints extends js.Object {
  /**
    * Whether or not the parameter is required.
    */
  var Required: js.UndefOr[boolean] = js.native
}

object ParameterConstraints {
  @scala.inline
  def apply(): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterConstraints]
  }
  @scala.inline
  implicit class ParameterConstraintsOps[Self <: ParameterConstraints] (val x: Self) extends AnyVal {
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
    def setRequired(value: boolean): Self = this.set("Required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("Required", js.undefined)
  }
  
}

