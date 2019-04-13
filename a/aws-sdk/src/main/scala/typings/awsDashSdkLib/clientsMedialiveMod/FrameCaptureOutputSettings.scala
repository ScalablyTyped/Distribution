package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameCaptureOutputSettings extends js.Object {
  /**
    * Required if the output group contains more than one output. This modifier forms part of the output file name.
    */
  var NameModifier: js.UndefOr[__string] = js.undefined
}

object FrameCaptureOutputSettings {
  @scala.inline
  def apply(NameModifier: __string = null): FrameCaptureOutputSettings = {
    val __obj = js.Dynamic.literal()
    if (NameModifier != null) __obj.updateDynamic("NameModifier")(NameModifier)
    __obj.asInstanceOf[FrameCaptureOutputSettings]
  }
}

