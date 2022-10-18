package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceInputConfiguration extends StObject {
  
  /**
    * Specifies configuration information for the input data for the inference, including timestamp format and delimiter. 
    */
  var InferenceInputNameConfiguration: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.InferenceInputNameConfiguration] = js.undefined
  
  /**
    * Indicates the difference between your time zone and Coordinated Universal Time (UTC).
    */
  var InputTimeZoneOffset: js.UndefOr[TimeZoneOffset] = js.undefined
  
  /**
    *  Specifies configuration information for the input data for the inference, including Amazon S3 location of input data.
    */
  var S3InputConfiguration: js.UndefOr[InferenceS3InputConfiguration] = js.undefined
}
object InferenceInputConfiguration {
  
  inline def apply(): InferenceInputConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceInputConfiguration]
  }
  
  extension [Self <: InferenceInputConfiguration](x: Self) {
    
    inline def setInferenceInputNameConfiguration(value: InferenceInputNameConfiguration): Self = StObject.set(x, "InferenceInputNameConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInferenceInputNameConfigurationUndefined: Self = StObject.set(x, "InferenceInputNameConfiguration", js.undefined)
    
    inline def setInputTimeZoneOffset(value: TimeZoneOffset): Self = StObject.set(x, "InputTimeZoneOffset", value.asInstanceOf[js.Any])
    
    inline def setInputTimeZoneOffsetUndefined: Self = StObject.set(x, "InputTimeZoneOffset", js.undefined)
    
    inline def setS3InputConfiguration(value: InferenceS3InputConfiguration): Self = StObject.set(x, "S3InputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3InputConfigurationUndefined: Self = StObject.set(x, "S3InputConfiguration", js.undefined)
  }
}
