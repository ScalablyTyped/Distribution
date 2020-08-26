package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IErrorHandlingConfig extends js.Object {
  /**
    * The max depth for stringifying objects.
    * Setting to a non-positive or non-numeric value, removes the max depth limit
    * @default 5
    */
  var objectMaxDepth: js.UndefOr[Double] = js.native
  /**
    * Specifies whether the generated error url will contain the parameters of the thrown error.
    * Disabling the parameters can be useful if the generated error url is very long.
    * @default true;
    */
  var urlErrorParamsEnabled: js.UndefOr[Boolean] = js.native
}

object IErrorHandlingConfig {
  @scala.inline
  def apply(): IErrorHandlingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IErrorHandlingConfig]
  }
  @scala.inline
  implicit class IErrorHandlingConfigOps[Self <: IErrorHandlingConfig] (val x: Self) extends AnyVal {
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
    def setObjectMaxDepth(value: Double): Self = this.set("objectMaxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectMaxDepth: Self = this.set("objectMaxDepth", js.undefined)
    @scala.inline
    def setUrlErrorParamsEnabled(value: Boolean): Self = this.set("urlErrorParamsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlErrorParamsEnabled: Self = this.set("urlErrorParamsEnabled", js.undefined)
  }
  
}

