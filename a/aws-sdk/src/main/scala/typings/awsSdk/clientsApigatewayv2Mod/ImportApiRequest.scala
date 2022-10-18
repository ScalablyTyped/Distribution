package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportApiRequest extends StObject {
  
  /**
    * Specifies how to interpret the base path of the API during import. Valid values are ignore, prepend, and split. The default value is ignore. To learn more, see Set the OpenAPI basePath Property. Supported only for HTTP APIs.
    */
  var Basepath: js.UndefOr[string] = js.undefined
  
  /**
    * The OpenAPI definition. Supported only for HTTP APIs.
    */
  var Body: string
  
  /**
    * Specifies whether to rollback the API creation when a warning is encountered. By default, API creation continues if a warning is encountered.
    */
  var FailOnWarnings: js.UndefOr[boolean] = js.undefined
}
object ImportApiRequest {
  
  inline def apply(Body: string): ImportApiRequest = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportApiRequest]
  }
  
  extension [Self <: ImportApiRequest](x: Self) {
    
    inline def setBasepath(value: string): Self = StObject.set(x, "Basepath", value.asInstanceOf[js.Any])
    
    inline def setBasepathUndefined: Self = StObject.set(x, "Basepath", js.undefined)
    
    inline def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setFailOnWarnings(value: boolean): Self = StObject.set(x, "FailOnWarnings", value.asInstanceOf[js.Any])
    
    inline def setFailOnWarningsUndefined: Self = StObject.set(x, "FailOnWarnings", js.undefined)
  }
}
