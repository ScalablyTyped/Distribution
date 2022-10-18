package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTapePoolInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom tape pool to delete.
    */
  var PoolARN: typings.awsSdk.clientsStoragegatewayMod.PoolARN
}
object DeleteTapePoolInput {
  
  inline def apply(PoolARN: PoolARN): DeleteTapePoolInput = {
    val __obj = js.Dynamic.literal(PoolARN = PoolARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTapePoolInput]
  }
  
  extension [Self <: DeleteTapePoolInput](x: Self) {
    
    inline def setPoolARN(value: PoolARN): Self = StObject.set(x, "PoolARN", value.asInstanceOf[js.Any])
  }
}
