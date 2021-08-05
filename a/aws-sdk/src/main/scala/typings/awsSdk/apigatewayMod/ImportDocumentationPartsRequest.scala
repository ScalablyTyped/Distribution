package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDocumentationPartsRequest extends StObject {
  
  /**
    * [Required] Raw byte array representing the to-be-imported documentation parts. To import from an OpenAPI file, this is a JSON object.
    */
  var body: _Blob
  
  /**
    * A query parameter to specify whether to rollback the documentation importation (true) or not (false) when a warning is encountered. The default value is false.
    */
  var failOnWarnings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A query parameter to indicate whether to overwrite (OVERWRITE) any existing DocumentationParts definition or to merge (MERGE) the new definition into the existing one. The default value is MERGE.
    */
  var mode: js.UndefOr[PutMode] = js.undefined
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object ImportDocumentationPartsRequest {
  
  inline def apply(body: _Blob, restApiId: String): ImportDocumentationPartsRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDocumentationPartsRequest]
  }
  
  extension [Self <: ImportDocumentationPartsRequest](x: Self) {
    
    inline def setBody(value: _Blob): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setFailOnWarnings(value: Boolean): Self = StObject.set(x, "failOnWarnings", value.asInstanceOf[js.Any])
    
    inline def setFailOnWarningsUndefined: Self = StObject.set(x, "failOnWarnings", js.undefined)
    
    inline def setMode(value: PutMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
