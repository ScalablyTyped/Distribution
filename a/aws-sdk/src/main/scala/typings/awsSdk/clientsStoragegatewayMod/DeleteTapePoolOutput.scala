package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTapePoolOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom tape pool being deleted.
    */
  var PoolARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.PoolARN] = js.undefined
}
object DeleteTapePoolOutput {
  
  inline def apply(): DeleteTapePoolOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTapePoolOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTapePoolOutput] (val x: Self) extends AnyVal {
    
    inline def setPoolARN(value: PoolARN): Self = StObject.set(x, "PoolARN", value.asInstanceOf[js.Any])
    
    inline def setPoolARNUndefined: Self = StObject.set(x, "PoolARN", js.undefined)
  }
}
