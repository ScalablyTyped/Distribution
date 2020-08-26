package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AEC extends js.Object {
  /**
    * Marks whether to enable acoustic echo cancellation.
    *
    * The default value is `true` (enable). If you wish not to enable the  acoustic echo cancellation, set `AEC` as `false`.
    *
    * **Note**
    *
    * Safari does not support this setting.
    */
  var AEC: js.UndefOr[Boolean] = js.native
  /**
    * Marks whether to enable audio gain control.
    *
    * The default value is `true` (enable). If you wish not to enable the audio gain control, set `AGC` as `false`.
    *
    * **Note**
    *
    * Safari does not support this setting.
    */
  var AGC: js.UndefOr[Boolean] = js.native
  /**
    * Marks whether to enable automatic noise suppression.
    *
    * The default value is `true` (enable). If you wish not to enable automatic noise suppression, set `ANS` as `false`.
    *
    * **Note**
    *
    * - Safari does not support this setting.
    * - Noise suppression is always enabled on Firefox. Setting `ANS` as `false` does not take effect on Firefox.
    */
  var ANS: js.UndefOr[Boolean] = js.native
}

object AEC {
  @scala.inline
  def apply(): AEC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AEC]
  }
  @scala.inline
  implicit class AECOps[Self <: AEC] (val x: Self) extends AnyVal {
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
    def setAEC(value: Boolean): Self = this.set("AEC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAEC: Self = this.set("AEC", js.undefined)
    @scala.inline
    def setAGC(value: Boolean): Self = this.set("AGC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAGC: Self = this.set("AGC", js.undefined)
    @scala.inline
    def setANS(value: Boolean): Self = this.set("ANS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteANS: Self = this.set("ANS", js.undefined)
  }
  
}

