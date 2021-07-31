package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModelRequest extends StObject {
  
  /**
    * A query parameter of a Boolean value to resolve (true) all external model references and returns a flattened model schema or not (false) The default is false.
    */
  var flatten: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Required] The name of the model as an identifier.
    */
  var modelName: String
  
  /**
    * [Required] The RestApi identifier under which the Model exists.
    */
  var restApiId: String
}
object GetModelRequest {
  
  @scala.inline
  def apply(modelName: String, restApiId: String): GetModelRequest = {
    val __obj = js.Dynamic.literal(modelName = modelName.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelRequest]
  }
  
  @scala.inline
  implicit class GetModelRequestMutableBuilder[Self <: GetModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
    
    @scala.inline
    def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
