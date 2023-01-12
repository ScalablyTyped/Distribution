package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hdr10Metadata extends StObject {
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var BluePrimaryX: js.UndefOr[integerMin0Max50000] = js.undefined
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var BluePrimaryY: js.UndefOr[integerMin0Max50000] = js.undefined
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var GreenPrimaryX: js.UndefOr[integerMin0Max50000] = js.undefined
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var GreenPrimaryY: js.UndefOr[integerMin0Max50000] = js.undefined
  
  /**
    * Maximum light level among all samples in the coded video sequence, in units of candelas per square meter.  This setting doesn't have a default value; you must specify a value that is suitable for the content.
    */
  var MaxContentLightLevel: js.UndefOr[integerMin0Max65535] = js.undefined
  
  /**
    * Maximum average light level of any frame in the coded video sequence, in units of candelas per square meter. This setting doesn't have a default value; you must specify a value that is suitable for the content.
    */
  var MaxFrameAverageLightLevel: js.UndefOr[integerMin0Max65535] = js.undefined
  
  /**
    * Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter.
    */
  var MaxLuminance: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter
    */
  var MinLuminance: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var RedPrimaryX: js.UndefOr[integerMin0Max50000] = js.undefined
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var RedPrimaryY: js.UndefOr[integerMin0Max50000] = js.undefined
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var WhitePointX: js.UndefOr[integerMin0Max50000] = js.undefined
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var WhitePointY: js.UndefOr[integerMin0Max50000] = js.undefined
}
object Hdr10Metadata {
  
  inline def apply(): Hdr10Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hdr10Metadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hdr10Metadata] (val x: Self) extends AnyVal {
    
    inline def setBluePrimaryX(value: integerMin0Max50000): Self = StObject.set(x, "BluePrimaryX", value.asInstanceOf[js.Any])
    
    inline def setBluePrimaryXUndefined: Self = StObject.set(x, "BluePrimaryX", js.undefined)
    
    inline def setBluePrimaryY(value: integerMin0Max50000): Self = StObject.set(x, "BluePrimaryY", value.asInstanceOf[js.Any])
    
    inline def setBluePrimaryYUndefined: Self = StObject.set(x, "BluePrimaryY", js.undefined)
    
    inline def setGreenPrimaryX(value: integerMin0Max50000): Self = StObject.set(x, "GreenPrimaryX", value.asInstanceOf[js.Any])
    
    inline def setGreenPrimaryXUndefined: Self = StObject.set(x, "GreenPrimaryX", js.undefined)
    
    inline def setGreenPrimaryY(value: integerMin0Max50000): Self = StObject.set(x, "GreenPrimaryY", value.asInstanceOf[js.Any])
    
    inline def setGreenPrimaryYUndefined: Self = StObject.set(x, "GreenPrimaryY", js.undefined)
    
    inline def setMaxContentLightLevel(value: integerMin0Max65535): Self = StObject.set(x, "MaxContentLightLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxContentLightLevelUndefined: Self = StObject.set(x, "MaxContentLightLevel", js.undefined)
    
    inline def setMaxFrameAverageLightLevel(value: integerMin0Max65535): Self = StObject.set(x, "MaxFrameAverageLightLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxFrameAverageLightLevelUndefined: Self = StObject.set(x, "MaxFrameAverageLightLevel", js.undefined)
    
    inline def setMaxLuminance(value: integerMin0Max2147483647): Self = StObject.set(x, "MaxLuminance", value.asInstanceOf[js.Any])
    
    inline def setMaxLuminanceUndefined: Self = StObject.set(x, "MaxLuminance", js.undefined)
    
    inline def setMinLuminance(value: integerMin0Max2147483647): Self = StObject.set(x, "MinLuminance", value.asInstanceOf[js.Any])
    
    inline def setMinLuminanceUndefined: Self = StObject.set(x, "MinLuminance", js.undefined)
    
    inline def setRedPrimaryX(value: integerMin0Max50000): Self = StObject.set(x, "RedPrimaryX", value.asInstanceOf[js.Any])
    
    inline def setRedPrimaryXUndefined: Self = StObject.set(x, "RedPrimaryX", js.undefined)
    
    inline def setRedPrimaryY(value: integerMin0Max50000): Self = StObject.set(x, "RedPrimaryY", value.asInstanceOf[js.Any])
    
    inline def setRedPrimaryYUndefined: Self = StObject.set(x, "RedPrimaryY", js.undefined)
    
    inline def setWhitePointX(value: integerMin0Max50000): Self = StObject.set(x, "WhitePointX", value.asInstanceOf[js.Any])
    
    inline def setWhitePointXUndefined: Self = StObject.set(x, "WhitePointX", js.undefined)
    
    inline def setWhitePointY(value: integerMin0Max50000): Self = StObject.set(x, "WhitePointY", value.asInstanceOf[js.Any])
    
    inline def setWhitePointYUndefined: Self = StObject.set(x, "WhitePointY", js.undefined)
  }
}
