package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessPreviewResponse extends StObject {
  
  /**
    * The unique ID for the access preview.
    */
  var id: AccessPreviewId
}
object CreateAccessPreviewResponse {
  
  inline def apply(id: AccessPreviewId): CreateAccessPreviewResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPreviewResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccessPreviewResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: AccessPreviewId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
