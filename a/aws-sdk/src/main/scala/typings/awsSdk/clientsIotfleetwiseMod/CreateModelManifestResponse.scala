package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelManifestResponse extends StObject {
  
  /**
    *  The ARN of the created vehicle model.
    */
  var arn: typings.awsSdk.clientsIotfleetwiseMod.arn
  
  /**
    *  The name of the created vehicle model.
    */
  var name: resourceName
}
object CreateModelManifestResponse {
  
  inline def apply(arn: arn, name: resourceName): CreateModelManifestResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelManifestResponse]
  }
  
  extension [Self <: CreateModelManifestResponse](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
