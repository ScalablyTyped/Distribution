package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioNormalizationSettings extends StObject {
  
  /**
    * Choose one of the following audio normalization algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement of ungated average loudness for an entire piece of content, suitable for measurement of short-form content under ATSC recommendation A/85. Supports up to 5.1 audio channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average loudness compliant with the requirements of EBU-R128. Supports up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The same loudness measurement algorithm as 1770-2, with an updated true peak measurement. ITU-R BS.1770-4: Higher channel count. Allows for more audio channels than the other algorithms, including configurations such as 7.1.
    */
  var Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.undefined
  
  /**
    * When enabled the output audio is corrected using the chosen algorithm. If disabled, the audio will be measured but not adjusted.
    */
  var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.undefined
  
  /**
    * Content measuring above this level will be corrected to the target level. Content measuring below this level will not be corrected.
    */
  var CorrectionGateLevel: js.UndefOr[integerMinNegative70Max0] = js.undefined
  
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
  var TargetLkfs: js.UndefOr[doubleMinNegative59Max0] = js.undefined
}
object AudioNormalizationSettings {
  
  inline def apply(): AudioNormalizationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioNormalizationSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioNormalizationSettings] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: AudioNormalizationAlgorithm): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmControl(value: AudioNormalizationAlgorithmControl): Self = StObject.set(x, "AlgorithmControl", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmControlUndefined: Self = StObject.set(x, "AlgorithmControl", js.undefined)
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "Algorithm", js.undefined)
    
    inline def setCorrectionGateLevel(value: integerMinNegative70Max0): Self = StObject.set(x, "CorrectionGateLevel", value.asInstanceOf[js.Any])
    
    inline def setCorrectionGateLevelUndefined: Self = StObject.set(x, "CorrectionGateLevel", js.undefined)
    
    inline def setLoudnessLogging(value: AudioNormalizationLoudnessLogging): Self = StObject.set(x, "LoudnessLogging", value.asInstanceOf[js.Any])
    
    inline def setLoudnessLoggingUndefined: Self = StObject.set(x, "LoudnessLogging", js.undefined)
    
    inline def setPeakCalculation(value: AudioNormalizationPeakCalculation): Self = StObject.set(x, "PeakCalculation", value.asInstanceOf[js.Any])
    
    inline def setPeakCalculationUndefined: Self = StObject.set(x, "PeakCalculation", js.undefined)
    
    inline def setTargetLkfs(value: doubleMinNegative59Max0): Self = StObject.set(x, "TargetLkfs", value.asInstanceOf[js.Any])
    
    inline def setTargetLkfsUndefined: Self = StObject.set(x, "TargetLkfs", js.undefined)
  }
}
