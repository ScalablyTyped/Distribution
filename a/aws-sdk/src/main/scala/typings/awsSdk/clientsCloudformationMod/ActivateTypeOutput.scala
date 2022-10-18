package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateTypeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the activated extension, in this account and region.
    */
  var Arn: js.UndefOr[PrivateTypeArn] = js.undefined
}
object ActivateTypeOutput {
  
  inline def apply(): ActivateTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivateTypeOutput]
  }
  
  extension [Self <: ActivateTypeOutput](x: Self) {
    
    inline def setArn(value: PrivateTypeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
