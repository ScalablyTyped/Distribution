package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMultifactorParams extends StObject {
  
  var id: String = js.native
  
  var provider: DeleteDeleteMultifactorParamsProvider = js.native
}
object DeleteMultifactorParams {
  
  @scala.inline
  def apply(id: String, provider: DeleteDeleteMultifactorParamsProvider): DeleteMultifactorParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultifactorParams]
  }
  
  @scala.inline
  implicit class DeleteMultifactorParamsMutableBuilder[Self <: DeleteMultifactorParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: DeleteDeleteMultifactorParamsProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
