package typings.apptimizeApptimizeWebSdk.mod

import typings.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_DEBUG
import typings.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_ERROR
import typings.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_INFO
import typings.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_NONE
import typings.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_VERBOSE
import typings.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_WARN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigAttributes extends js.Object {
  var log_level: js.UndefOr[
    LOG_LEVEL_VERBOSE | LOG_LEVEL_DEBUG | LOG_LEVEL_INFO | LOG_LEVEL_WARN | LOG_LEVEL_ERROR | LOG_LEVEL_NONE
  ] = js.native
  var result_post_delay_ms: js.UndefOr[Double] = js.native
}

object ConfigAttributes {
  @scala.inline
  def apply(): ConfigAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigAttributes]
  }
  @scala.inline
  implicit class ConfigAttributesOps[Self <: ConfigAttributes] (val x: Self) extends AnyVal {
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
    def setLog_level(
      value: LOG_LEVEL_VERBOSE | LOG_LEVEL_DEBUG | LOG_LEVEL_INFO | LOG_LEVEL_WARN | LOG_LEVEL_ERROR | LOG_LEVEL_NONE
    ): Self = this.set("log_level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog_level: Self = this.set("log_level", js.undefined)
    @scala.inline
    def setResult_post_delay_ms(value: Double): Self = this.set("result_post_delay_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult_post_delay_ms: Self = this.set("result_post_delay_ms", js.undefined)
  }
  
}

