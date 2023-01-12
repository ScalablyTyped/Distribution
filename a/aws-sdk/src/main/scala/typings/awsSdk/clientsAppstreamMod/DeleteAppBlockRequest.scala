package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppBlockRequest extends StObject {
  
  /**
    * The name of the app block.
    */
  var Name: typings.awsSdk.clientsAppstreamMod.Name
}
object DeleteAppBlockRequest {
  
  inline def apply(Name: Name): DeleteAppBlockRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppBlockRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAppBlockRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
