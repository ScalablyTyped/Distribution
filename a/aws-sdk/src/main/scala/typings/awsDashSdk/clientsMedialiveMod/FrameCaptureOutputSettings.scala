package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameCaptureOutputSettings extends js.Object {
  /**
    * Required if the output group contains more than one output. This modifier forms part of the output file name.
    */
  var NameModifier: js.UndefOr[__string] = js.native
}

object FrameCaptureOutputSettings {
  @scala.inline
  def apply(NameModifier: __string = null): FrameCaptureOutputSettings = {
    val __obj = js.Dynamic.literal()
    if (NameModifier != null) __obj.updateDynamic("NameModifier")(NameModifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameCaptureOutputSettings]
  }
}

