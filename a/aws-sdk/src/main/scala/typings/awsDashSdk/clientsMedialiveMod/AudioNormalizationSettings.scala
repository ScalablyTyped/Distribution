package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioNormalizationSettings extends js.Object {
  /**
    * Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms to the EBU R-128 specification.
    */
  var Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.undefined
  /**
    * When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly, the audio will be measured but not adjusted.
    */
  var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.undefined
  /**
    * Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according to the chosen algorithm.  The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128 specification (1770-2) recommends a target of -23 LKFS.
    */
  var TargetLkfs: js.UndefOr[__doubleMinNegative59Max0] = js.undefined
}

object AudioNormalizationSettings {
  @scala.inline
  def apply(
    Algorithm: AudioNormalizationAlgorithm = null,
    AlgorithmControl: AudioNormalizationAlgorithmControl = null,
    TargetLkfs: Int | Double = null
  ): AudioNormalizationSettings = {
    val __obj = js.Dynamic.literal()
    if (Algorithm != null) __obj.updateDynamic("Algorithm")(Algorithm.asInstanceOf[js.Any])
    if (AlgorithmControl != null) __obj.updateDynamic("AlgorithmControl")(AlgorithmControl.asInstanceOf[js.Any])
    if (TargetLkfs != null) __obj.updateDynamic("TargetLkfs")(TargetLkfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioNormalizationSettings]
  }
}

