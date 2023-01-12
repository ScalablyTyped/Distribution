package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSignalCatalogRequest extends StObject {
  
  /**
    *  The name of the signal catalog to retrieve information about. 
    */
  var name: resourceName
}
object GetSignalCatalogRequest {
  
  inline def apply(name: resourceName): GetSignalCatalogRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignalCatalogRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSignalCatalogRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
