package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDecoderManifestResponse extends StObject {
  
  /**
    *  The ARN of the created decoder manifest. 
    */
  var arn: typings.awsSdk.clientsIotfleetwiseMod.arn
  
  /**
    *  The name of the created decoder manifest. 
    */
  var name: resourceName
}
object CreateDecoderManifestResponse {
  
  inline def apply(arn: arn, name: resourceName): CreateDecoderManifestResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDecoderManifestResponse]
  }
  
  extension [Self <: CreateDecoderManifestResponse](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
