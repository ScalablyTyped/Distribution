package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentDemographics extends StObject {
  
  /**
    * The app version criteria for the segment.
    */
  var AppVersion: js.UndefOr[SetDimension] = js.undefined
  
  /**
    * The channel criteria for the segment.
    */
  var Channel: js.UndefOr[SetDimension] = js.undefined
  
  /**
    * The device type criteria for the segment.
    */
  var DeviceType: js.UndefOr[SetDimension] = js.undefined
  
  /**
    * The device make criteria for the segment.
    */
  var Make: js.UndefOr[SetDimension] = js.undefined
  
  /**
    * The device model criteria for the segment.
    */
  var Model: js.UndefOr[SetDimension] = js.undefined
  
  /**
    * The device platform criteria for the segment.
    */
  var Platform: js.UndefOr[SetDimension] = js.undefined
}
object SegmentDemographics {
  
  inline def apply(): SegmentDemographics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDemographics]
  }
  
  extension [Self <: SegmentDemographics](x: Self) {
    
    inline def setAppVersion(value: SetDimension): Self = StObject.set(x, "AppVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersionUndefined: Self = StObject.set(x, "AppVersion", js.undefined)
    
    inline def setChannel(value: SetDimension): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "Channel", js.undefined)
    
    inline def setDeviceType(value: SetDimension): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "DeviceType", js.undefined)
    
    inline def setMake(value: SetDimension): Self = StObject.set(x, "Make", value.asInstanceOf[js.Any])
    
    inline def setMakeUndefined: Self = StObject.set(x, "Make", js.undefined)
    
    inline def setModel(value: SetDimension): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
    
    inline def setPlatform(value: SetDimension): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
  }
}
