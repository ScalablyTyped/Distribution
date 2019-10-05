package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioNormalizationSettings extends js.Object {
  /**
    * Choose one of the following audio normalization algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement of ungated average loudness for an entire piece of content, suitable for measurement of short-form content under ATSC recommendation A/85. Supports up to 5.1 audio channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average loudness compliant with the requirements of EBU-R128. Supports up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The same loudness measurement algorithm as 1770-2, with an updated true peak measurement. ITU-R BS.1770-4: Higher channel count. Allows for more audio channels than the other algorithms, including configurations such as 7.1.
    */
  var Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.undefined
  /**
    * When enabled the output audio is corrected using the chosen algorithm. If disabled, the audio will be measured but not adjusted.
    */
  var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.undefined
  /**
    * Content measuring above this level will be corrected to the target level. Content measuring below this level will not be corrected. Gating only applies when not using real_time_correction.
    */
  var CorrectionGateLevel: js.UndefOr[__integerMinNegative70Max0] = js.undefined
  /**
    * If set to LOG, log each output's audio track loudness to a CSV file.
    */
  var LoudnessLogging: js.UndefOr[AudioNormalizationLoudnessLogging] = js.undefined
  /**
    * If set to TRUE_PEAK, calculate and log the TruePeak for each output's audio track loudness.
    */
  var PeakCalculation: js.UndefOr[AudioNormalizationPeakCalculation] = js.undefined
  /**
    * When you use Audio normalization (AudioNormalizationSettings), optionally use this setting to specify a target loudness. If you don't specify a value here, the encoder chooses a value for you, based on the algorithm that you choose for Algorithm (algorithm). If you choose algorithm 1770-1, the encoder will choose -24 LKFS; otherwise, the encoder will choose -23 LKFS.
    */
  var TargetLkfs: js.UndefOr[__doubleMinNegative59Max0] = js.undefined
}

object AudioNormalizationSettings {
  @scala.inline
  def apply(
    Algorithm: AudioNormalizationAlgorithm = null,
    AlgorithmControl: AudioNormalizationAlgorithmControl = null,
    CorrectionGateLevel: Int | Double = null,
    LoudnessLogging: AudioNormalizationLoudnessLogging = null,
    PeakCalculation: AudioNormalizationPeakCalculation = null,
    TargetLkfs: Int | Double = null
  ): AudioNormalizationSettings = {
    val __obj = js.Dynamic.literal()
    if (Algorithm != null) __obj.updateDynamic("Algorithm")(Algorithm.asInstanceOf[js.Any])
    if (AlgorithmControl != null) __obj.updateDynamic("AlgorithmControl")(AlgorithmControl.asInstanceOf[js.Any])
    if (CorrectionGateLevel != null) __obj.updateDynamic("CorrectionGateLevel")(CorrectionGateLevel.asInstanceOf[js.Any])
    if (LoudnessLogging != null) __obj.updateDynamic("LoudnessLogging")(LoudnessLogging.asInstanceOf[js.Any])
    if (PeakCalculation != null) __obj.updateDynamic("PeakCalculation")(PeakCalculation.asInstanceOf[js.Any])
    if (TargetLkfs != null) __obj.updateDynamic("TargetLkfs")(TargetLkfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioNormalizationSettings]
  }
}

