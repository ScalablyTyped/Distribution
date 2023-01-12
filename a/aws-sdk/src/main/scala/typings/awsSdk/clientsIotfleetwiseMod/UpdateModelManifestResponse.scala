package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateModelManifestResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the updated vehicle model. 
    */
  var arn: typings.awsSdk.clientsIotfleetwiseMod.arn
  
  /**
    *  The name of the updated vehicle model. 
    */
  var name: resourceName
}
object UpdateModelManifestResponse {
  
  inline def apply(arn: arn, name: resourceName): UpdateModelManifestResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelManifestResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateModelManifestResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
