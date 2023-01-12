package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvcIntraUhdSettings extends StObject {
  
  /**
    * Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert does with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your output bitrate is more accurate. That is, the actual bitrate of your output is closer to the target bitrate defined in the specification. When you choose Single-pass (SINGLE_PASS), your encoding time is faster. The default behavior is Single-pass (SINGLE_PASS).
    */
  var QualityTuningLevel: js.UndefOr[AvcIntraUhdQualityTuningLevel] = js.undefined
}
object AvcIntraUhdSettings {
  
  inline def apply(): AvcIntraUhdSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvcIntraUhdSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvcIntraUhdSettings] (val x: Self) extends AnyVal {
    
    inline def setQualityTuningLevel(value: AvcIntraUhdQualityTuningLevel): Self = StObject.set(x, "QualityTuningLevel", value.asInstanceOf[js.Any])
    
    inline def setQualityTuningLevelUndefined: Self = StObject.set(x, "QualityTuningLevel", js.undefined)
  }
}
