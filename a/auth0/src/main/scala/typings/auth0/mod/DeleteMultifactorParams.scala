package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMultifactorParams extends StObject {
  
  var id: String
  
  var provider: DeleteDeleteMultifactorParamsProvider
}
object DeleteMultifactorParams {
  
  inline def apply(id: String, provider: DeleteDeleteMultifactorParamsProvider): DeleteMultifactorParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultifactorParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMultifactorParams] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: DeleteDeleteMultifactorParamsProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
