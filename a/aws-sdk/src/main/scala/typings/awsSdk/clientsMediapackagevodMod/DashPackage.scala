package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashPackage extends StObject {
  
  /**
    * A list of DASH manifest configurations.
    */
  var DashManifests: listOfDashManifest
  
  var Encryption: js.UndefOr[DashEncryption] = js.undefined
  
  /**
    * When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets during content playback.
    */
  var IncludeEncoderConfigurationInSegments: js.UndefOr[boolean] = js.undefined
  
  /**
    * When enabled, an I-Frame only stream will be included in the output.
    */
  var IncludeIframeOnlyStream: js.UndefOr[boolean] = js.undefined
  
  /**
    * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
  Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
  be partitioned into more than one period. If the list contains "ADS", new periods will be created where
  the Asset contains SCTE-35 ad markers.
    */
  var PeriodTriggers: js.UndefOr[listOfPeriodTriggersElement] = js.undefined
  
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
    */
  var SegmentTemplateFormat: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.SegmentTemplateFormat] = js.undefined
}
object DashPackage {
  
  inline def apply(DashManifests: listOfDashManifest): DashPackage = {
    val __obj = js.Dynamic.literal(DashManifests = DashManifests.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashPackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DashPackage] (val x: Self) extends AnyVal {
    
    inline def setDashManifests(value: listOfDashManifest): Self = StObject.set(x, "DashManifests", value.asInstanceOf[js.Any])
    
    inline def setDashManifestsVarargs(value: DashManifest*): Self = StObject.set(x, "DashManifests", js.Array(value*))
    
    inline def setEncryption(value: DashEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setIncludeEncoderConfigurationInSegments(value: boolean): Self = StObject.set(x, "IncludeEncoderConfigurationInSegments", value.asInstanceOf[js.Any])
    
    inline def setIncludeEncoderConfigurationInSegmentsUndefined: Self = StObject.set(x, "IncludeEncoderConfigurationInSegments", js.undefined)
    
    inline def setIncludeIframeOnlyStream(value: boolean): Self = StObject.set(x, "IncludeIframeOnlyStream", value.asInstanceOf[js.Any])
    
    inline def setIncludeIframeOnlyStreamUndefined: Self = StObject.set(x, "IncludeIframeOnlyStream", js.undefined)
    
    inline def setPeriodTriggers(value: listOfPeriodTriggersElement): Self = StObject.set(x, "PeriodTriggers", value.asInstanceOf[js.Any])
    
    inline def setPeriodTriggersUndefined: Self = StObject.set(x, "PeriodTriggers", js.undefined)
    
    inline def setPeriodTriggersVarargs(value: PeriodTriggersElement*): Self = StObject.set(x, "PeriodTriggers", js.Array(value*))
    
    inline def setSegmentDurationSeconds(value: integer): Self = StObject.set(x, "SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setSegmentDurationSecondsUndefined: Self = StObject.set(x, "SegmentDurationSeconds", js.undefined)
    
    inline def setSegmentTemplateFormat(value: SegmentTemplateFormat): Self = StObject.set(x, "SegmentTemplateFormat", value.asInstanceOf[js.Any])
    
    inline def setSegmentTemplateFormatUndefined: Self = StObject.set(x, "SegmentTemplateFormat", js.undefined)
  }
}
