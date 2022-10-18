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
  
  extension [Self <: DeleteAppBlockRequest](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
