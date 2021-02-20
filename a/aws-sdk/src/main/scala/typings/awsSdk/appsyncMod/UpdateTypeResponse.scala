package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTypeResponse extends StObject {
  
  /**
    * The updated Type object.
    */
  var `type`: js.UndefOr[Type] = js.native
}
object UpdateTypeResponse {
  
  @scala.inline
  def apply(): UpdateTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTypeResponse]
  }
  
  @scala.inline
  implicit class UpdateTypeResponseMutableBuilder[Self <: UpdateTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
