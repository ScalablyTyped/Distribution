package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataSourceRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The name of the data source.
    */
  var name: ResourceName
}
object GetDataSourceRequest {
  
  inline def apply(apiId: String, name: ResourceName): GetDataSourceRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
