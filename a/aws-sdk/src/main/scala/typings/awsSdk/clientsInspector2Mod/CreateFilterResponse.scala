package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFilterResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the successfully created filter.
    */
  var arn: FilterArn
}
object CreateFilterResponse {
  
  inline def apply(arn: FilterArn): CreateFilterResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFilterResponse]
  }
  
  extension [Self <: CreateFilterResponse](x: Self) {
    
    inline def setArn(value: FilterArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
