package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConfigInput extends StObject {
  
  /**
    * An object containing information about the job configuration for BandMath.
    */
  var BandMathConfig: js.UndefOr[BandMathConfigInput] = js.undefined
  
  /**
    * An object containing information about the job configuration for cloud masking.
    */
  var CloudMaskingConfig: js.UndefOr[CloudMaskingConfigInput] = js.undefined
  
  /**
    * An object containing information about the job configuration for cloud removal.
    */
  var CloudRemovalConfig: js.UndefOr[CloudRemovalConfigInput] = js.undefined
  
  /**
    * An object containing information about the job configuration for geomosaic.
    */
  var GeoMosaicConfig: js.UndefOr[GeoMosaicConfigInput] = js.undefined
  
  /**
    * An object containing information about the job configuration for land cover segmentation.
    */
  var LandCoverSegmentationConfig: js.UndefOr[LandCoverSegmentationConfigInput] = js.undefined
  
  /**
    * An object containing information about the job configuration for resampling.
    */
  var ResamplingConfig: js.UndefOr[ResamplingConfigInput] = js.undefined
  
  /**
    * An object containing information about the job configuration for a Stacking Earth Observation job.
    */
  var StackConfig: js.UndefOr[StackConfigInput] = js.undefined
  
  /**
    * An object containing information about the job configuration for temporal statistics.
    */
  var TemporalStatisticsConfig: js.UndefOr[TemporalStatisticsConfigInput] = js.undefined
  
  /**
    * An object containing information about the job configuration for zonal statistics.
    */
  var ZonalStatisticsConfig: js.UndefOr[ZonalStatisticsConfigInput] = js.undefined
}
object JobConfigInput {
  
  inline def apply(): JobConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobConfigInput] (val x: Self) extends AnyVal {
    
    inline def setBandMathConfig(value: BandMathConfigInput): Self = StObject.set(x, "BandMathConfig", value.asInstanceOf[js.Any])
    
    inline def setBandMathConfigUndefined: Self = StObject.set(x, "BandMathConfig", js.undefined)
    
    inline def setCloudMaskingConfig(value: CloudMaskingConfigInput): Self = StObject.set(x, "CloudMaskingConfig", value.asInstanceOf[js.Any])
    
    inline def setCloudMaskingConfigUndefined: Self = StObject.set(x, "CloudMaskingConfig", js.undefined)
    
    inline def setCloudRemovalConfig(value: CloudRemovalConfigInput): Self = StObject.set(x, "CloudRemovalConfig", value.asInstanceOf[js.Any])
    
    inline def setCloudRemovalConfigUndefined: Self = StObject.set(x, "CloudRemovalConfig", js.undefined)
    
    inline def setGeoMosaicConfig(value: GeoMosaicConfigInput): Self = StObject.set(x, "GeoMosaicConfig", value.asInstanceOf[js.Any])
    
    inline def setGeoMosaicConfigUndefined: Self = StObject.set(x, "GeoMosaicConfig", js.undefined)
    
    inline def setLandCoverSegmentationConfig(value: LandCoverSegmentationConfigInput): Self = StObject.set(x, "LandCoverSegmentationConfig", value.asInstanceOf[js.Any])
    
    inline def setLandCoverSegmentationConfigUndefined: Self = StObject.set(x, "LandCoverSegmentationConfig", js.undefined)
    
    inline def setResamplingConfig(value: ResamplingConfigInput): Self = StObject.set(x, "ResamplingConfig", value.asInstanceOf[js.Any])
    
    inline def setResamplingConfigUndefined: Self = StObject.set(x, "ResamplingConfig", js.undefined)
    
    inline def setStackConfig(value: StackConfigInput): Self = StObject.set(x, "StackConfig", value.asInstanceOf[js.Any])
    
    inline def setStackConfigUndefined: Self = StObject.set(x, "StackConfig", js.undefined)
    
    inline def setTemporalStatisticsConfig(value: TemporalStatisticsConfigInput): Self = StObject.set(x, "TemporalStatisticsConfig", value.asInstanceOf[js.Any])
    
    inline def setTemporalStatisticsConfigUndefined: Self = StObject.set(x, "TemporalStatisticsConfig", js.undefined)
    
    inline def setZonalStatisticsConfig(value: ZonalStatisticsConfigInput): Self = StObject.set(x, "ZonalStatisticsConfig", value.asInstanceOf[js.Any])
    
    inline def setZonalStatisticsConfigUndefined: Self = StObject.set(x, "ZonalStatisticsConfig", js.undefined)
  }
}
