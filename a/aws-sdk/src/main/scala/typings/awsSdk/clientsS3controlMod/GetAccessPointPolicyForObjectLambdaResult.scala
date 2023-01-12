package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointPolicyForObjectLambdaResult extends StObject {
  
  /**
    * Object Lambda Access Point resource policy document.
    */
  var Policy: js.UndefOr[ObjectLambdaPolicy] = js.undefined
}
object GetAccessPointPolicyForObjectLambdaResult {
  
  inline def apply(): GetAccessPointPolicyForObjectLambdaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointPolicyForObjectLambdaResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccessPointPolicyForObjectLambdaResult] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: ObjectLambdaPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
