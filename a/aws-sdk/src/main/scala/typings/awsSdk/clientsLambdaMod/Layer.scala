package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var Arn: js.UndefOr[LayerVersionArn] = js.undefined
  
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a signing job.
    */
  var SigningJobArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for a signing profile version.
    */
  var SigningProfileVersionArn: js.UndefOr[Arn] = js.undefined
}
object Layer {
  
  inline def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
    
    inline def setArn(value: LayerVersionArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCodeSize(value: Long): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
    
    inline def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
    
    inline def setSigningJobArn(value: Arn): Self = StObject.set(x, "SigningJobArn", value.asInstanceOf[js.Any])
    
    inline def setSigningJobArnUndefined: Self = StObject.set(x, "SigningJobArn", js.undefined)
    
    inline def setSigningProfileVersionArn(value: Arn): Self = StObject.set(x, "SigningProfileVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSigningProfileVersionArnUndefined: Self = StObject.set(x, "SigningProfileVersionArn", js.undefined)
  }
}
