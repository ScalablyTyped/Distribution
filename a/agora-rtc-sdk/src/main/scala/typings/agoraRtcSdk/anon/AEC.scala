package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var AEC: js.UndefOr[Boolean] = js.undefined
  /**
    * Marks whether to enable audio gain control.
    *
    * The default value is `true` (enable). If you wish not to enable the audio gain control, set `AGC` as `false`.
    *
    * **Note**
    *
    * Safari does not support this setting.
    */
  var AGC: js.UndefOr[Boolean] = js.undefined
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
  var ANS: js.UndefOr[Boolean] = js.undefined
}

object AEC {
  @scala.inline
  def apply(
    AEC: js.UndefOr[Boolean] = js.undefined,
    AGC: js.UndefOr[Boolean] = js.undefined,
    ANS: js.UndefOr[Boolean] = js.undefined
  ): AEC = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AEC)) __obj.updateDynamic("AEC")(AEC.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AGC)) __obj.updateDynamic("AGC")(AGC.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ANS)) __obj.updateDynamic("ANS")(ANS.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AEC]
  }
}

