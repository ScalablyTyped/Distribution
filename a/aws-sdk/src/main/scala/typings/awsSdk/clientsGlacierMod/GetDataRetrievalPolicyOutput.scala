package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataRetrievalPolicyOutput extends StObject {
  
  /**
    * Contains the returned data retrieval policy in JSON format.
    */
  var Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined
}
object GetDataRetrievalPolicyOutput {
  
  inline def apply(): GetDataRetrievalPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataRetrievalPolicyOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataRetrievalPolicyOutput] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: DataRetrievalPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
