package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePresetRequest extends StObject {
  
  /**
    * The identifier of the preset for which you want to get detailed information.
    */
  var Id: typings.awsSdk.clientsElastictranscoderMod.Id
}
object DeletePresetRequest {
  
  inline def apply(Id: Id): DeletePresetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePresetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePresetRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
