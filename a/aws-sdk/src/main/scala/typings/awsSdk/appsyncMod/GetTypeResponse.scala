package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTypeResponse extends StObject {
  
  /**
    * The Type object.
    */
  var `type`: js.UndefOr[Type] = js.undefined
}
object GetTypeResponse {
  
  @scala.inline
  def apply(): GetTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTypeResponse]
  }
  
  @scala.inline
  implicit class GetTypeResponseMutableBuilder[Self <: GetTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
