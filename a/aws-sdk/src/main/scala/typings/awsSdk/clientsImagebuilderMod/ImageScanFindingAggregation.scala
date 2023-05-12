package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageScanFindingAggregation extends StObject {
  
  /**
    * Returns an object that contains severity counts based on an account ID.
    */
  var accountAggregation: js.UndefOr[AccountAggregation] = js.undefined
  
  /**
    * Returns an object that contains severity counts based on the Amazon Resource Name (ARN) for a specific image.
    */
  var imageAggregation: js.UndefOr[ImageAggregation] = js.undefined
  
  /**
    * Returns an object that contains severity counts based on an image pipeline ARN.
    */
  var imagePipelineAggregation: js.UndefOr[ImagePipelineAggregation] = js.undefined
  
  /**
    * Returns an object that contains severity counts based on vulnerability ID.
    */
  var vulnerabilityIdAggregation: js.UndefOr[VulnerabilityIdAggregation] = js.undefined
}
object ImageScanFindingAggregation {
  
  inline def apply(): ImageScanFindingAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFindingAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageScanFindingAggregation] (val x: Self) extends AnyVal {
    
    inline def setAccountAggregation(value: AccountAggregation): Self = StObject.set(x, "accountAggregation", value.asInstanceOf[js.Any])
    
    inline def setAccountAggregationUndefined: Self = StObject.set(x, "accountAggregation", js.undefined)
    
    inline def setImageAggregation(value: ImageAggregation): Self = StObject.set(x, "imageAggregation", value.asInstanceOf[js.Any])
    
    inline def setImageAggregationUndefined: Self = StObject.set(x, "imageAggregation", js.undefined)
    
    inline def setImagePipelineAggregation(value: ImagePipelineAggregation): Self = StObject.set(x, "imagePipelineAggregation", value.asInstanceOf[js.Any])
    
    inline def setImagePipelineAggregationUndefined: Self = StObject.set(x, "imagePipelineAggregation", js.undefined)
    
    inline def setVulnerabilityIdAggregation(value: VulnerabilityIdAggregation): Self = StObject.set(x, "vulnerabilityIdAggregation", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityIdAggregationUndefined: Self = StObject.set(x, "vulnerabilityIdAggregation", js.undefined)
  }
}
