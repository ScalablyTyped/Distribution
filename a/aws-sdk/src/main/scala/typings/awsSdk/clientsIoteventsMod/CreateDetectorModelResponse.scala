package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDetectorModelResponse extends StObject {
  
  /**
    * Information about how the detector model is configured.
    */
  var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.undefined
}
object CreateDetectorModelResponse {
  
  inline def apply(): CreateDetectorModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDetectorModelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDetectorModelResponse] (val x: Self) extends AnyVal {
    
    inline def setDetectorModelConfiguration(value: DetectorModelConfiguration): Self = StObject.set(x, "detectorModelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelConfigurationUndefined: Self = StObject.set(x, "detectorModelConfiguration", js.undefined)
  }
}
