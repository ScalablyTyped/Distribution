package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NLBResource extends StObject {
  
  /**
    * The Network Load Balancer resource Amazon Resource Name (ARN).
    */
  var Arn: js.UndefOr[string] = js.undefined
}
object NLBResource {
  
  inline def apply(): NLBResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NLBResource]
  }
  
  extension [Self <: NLBResource](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
