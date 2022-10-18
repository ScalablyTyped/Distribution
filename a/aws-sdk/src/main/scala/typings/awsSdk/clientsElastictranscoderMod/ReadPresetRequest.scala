package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadPresetRequest extends StObject {
  
  /**
    * The identifier of the preset for which you want to get detailed information.
    */
  var Id: typings.awsSdk.clientsElastictranscoderMod.Id
}
object ReadPresetRequest {
  
  inline def apply(Id: Id): ReadPresetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadPresetRequest]
  }
  
  extension [Self <: ReadPresetRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
