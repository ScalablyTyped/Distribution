package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsItemIdentity extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem event.
    */
  var Arn: js.UndefOr[String] = js.undefined
}
object OpsItemIdentity {
  
  inline def apply(): OpsItemIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsItemIdentity]
  }
  
  extension [Self <: OpsItemIdentity](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
