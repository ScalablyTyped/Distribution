package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataConnector extends StObject {
  
  /**
    * A Boolean value that specifies whether the data connector is native to IoT TwinMaker.
    */
  var isNative: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Lambda function associated with this data connector.
    */
  var lambda: js.UndefOr[LambdaFunction] = js.undefined
}
object DataConnector {
  
  inline def apply(): DataConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataConnector]
  }
  
  extension [Self <: DataConnector](x: Self) {
    
    inline def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
    
    inline def setIsNativeUndefined: Self = StObject.set(x, "isNative", js.undefined)
    
    inline def setLambda(value: LambdaFunction): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
  }
}
