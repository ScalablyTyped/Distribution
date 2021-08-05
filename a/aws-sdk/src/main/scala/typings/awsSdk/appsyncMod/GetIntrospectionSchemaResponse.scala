package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntrospectionSchemaResponse extends StObject {
  
  /**
    * The schema, in GraphQL Schema Definition Language (SDL) format. For more information, see the GraphQL SDL documentation.
    */
  var schema: js.UndefOr[_Blob] = js.undefined
}
object GetIntrospectionSchemaResponse {
  
  inline def apply(): GetIntrospectionSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntrospectionSchemaResponse]
  }
  
  extension [Self <: GetIntrospectionSchemaResponse](x: Self) {
    
    inline def setSchema(value: _Blob): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
