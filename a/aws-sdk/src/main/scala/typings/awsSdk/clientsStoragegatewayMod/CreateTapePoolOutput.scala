package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTapePoolOutput extends StObject {
  
  /**
    * The unique Amazon Resource Name (ARN) that represents the custom tape pool. Use the ListTapePools operation to return a list of tape pools for your account and Amazon Web Services Region.
    */
  var PoolARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.PoolARN] = js.undefined
}
object CreateTapePoolOutput {
  
  inline def apply(): CreateTapePoolOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTapePoolOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTapePoolOutput] (val x: Self) extends AnyVal {
    
    inline def setPoolARN(value: PoolARN): Self = StObject.set(x, "PoolARN", value.asInstanceOf[js.Any])
    
    inline def setPoolARNUndefined: Self = StObject.set(x, "PoolARN", js.undefined)
  }
}
