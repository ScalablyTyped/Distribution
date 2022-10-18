package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterVersionResponse extends StObject {
  
  /**
    * The full description of the specified update
    */
  var update: js.UndefOr[Update] = js.undefined
}
object UpdateClusterVersionResponse {
  
  inline def apply(): UpdateClusterVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterVersionResponse]
  }
  
  extension [Self <: UpdateClusterVersionResponse](x: Self) {
    
    inline def setUpdate(value: Update): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
