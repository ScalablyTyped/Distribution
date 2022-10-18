package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceTreeRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the parent resource to delete. All child resources of the parent resource will also be deleted.
    */
  var ResourceArn: Arn
}
object DeleteResourceTreeRequest {
  
  inline def apply(ResourceArn: Arn): DeleteResourceTreeRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceTreeRequest]
  }
  
  extension [Self <: DeleteResourceTreeRequest](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
