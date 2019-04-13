package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioNormalizationSettings extends js.Object {
  /**
    * Audio normalization algorithm to use. 1770-1 conforms to the CALM Act specification, 1770-2 conforms to the EBU R-128 specification.
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
    * Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according to the chosen algorithm. The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128 specification (1770-2) recommends a target of -23 LKFS.
    */
  var TargetLkfs: js.UndefOr[__doubleMinNegative59Max0] = js.undefined
}

object AudioNormalizationSettings {
  @scala.inline
  def apply(
    Algorithm: AudioNormalizationAlgorithm = null,
    AlgorithmControl: AudioNormalizationAlgorithmControl = null,
    CorrectionGateLevel: js.UndefOr[__integerMinNegative70Max0] = js.undefined,
    LoudnessLogging: AudioNormalizationLoudnessLogging = null,
    PeakCalculation: AudioNormalizationPeakCalculation = null,
    TargetLkfs: js.UndefOr[__doubleMinNegative59Max0] = js.undefined
  ): AudioNormalizationSettings = {
    val __obj = js.Dynamic.literal()
    if (Algorithm != null) __obj.updateDynamic("Algorithm")(Algorithm.asInstanceOf[js.Any])
    if (AlgorithmControl != null) __obj.updateDynamic("AlgorithmControl")(AlgorithmControl.asInstanceOf[js.Any])
    if (!js.isUndefined(CorrectionGateLevel)) __obj.updateDynamic("CorrectionGateLevel")(CorrectionGateLevel)
    if (LoudnessLogging != null) __obj.updateDynamic("LoudnessLogging")(LoudnessLogging.asInstanceOf[js.Any])
    if (PeakCalculation != null) __obj.updateDynamic("PeakCalculation")(PeakCalculation.asInstanceOf[js.Any])
    if (!js.isUndefined(TargetLkfs)) __obj.updateDynamic("TargetLkfs")(TargetLkfs)
    __obj.asInstanceOf[AudioNormalizationSettings]
  }
}

