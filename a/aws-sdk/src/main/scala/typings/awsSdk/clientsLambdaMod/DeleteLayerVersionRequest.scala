package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLayerVersionRequest extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.clientsLambdaMod.LayerName
  
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber
}
object DeleteLayerVersionRequest {
  
  inline def apply(LayerName: LayerName, VersionNumber: LayerVersionNumber): DeleteLayerVersionRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLayerVersionRequest]
  }
  
  extension [Self <: DeleteLayerVersionRequest](x: Self) {
    
    inline def setLayerName(value: LayerName): Self = StObject.set(x, "LayerName", value.asInstanceOf[js.Any])
    
    inline def setVersionNumber(value: LayerVersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
  }
}
