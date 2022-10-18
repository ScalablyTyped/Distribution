package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageRequest extends StObject {
  
  /**
    * The name of the image.
    */
  var Name: typings.awsSdk.clientsAppstreamMod.Name
}
object DeleteImageRequest {
  
  inline def apply(Name: Name): DeleteImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageRequest]
  }
  
  extension [Self <: DeleteImageRequest](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
