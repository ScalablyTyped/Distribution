package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConformancePackResponse extends StObject {
  
  /**
    * ARN of the conformance pack.
    */
  var ConformancePackArn: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConformancePackArn] = js.undefined
}
object PutConformancePackResponse {
  
  inline def apply(): PutConformancePackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutConformancePackResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutConformancePackResponse] (val x: Self) extends AnyVal {
    
    inline def setConformancePackArn(value: ConformancePackArn): Self = StObject.set(x, "ConformancePackArn", value.asInstanceOf[js.Any])
    
    inline def setConformancePackArnUndefined: Self = StObject.set(x, "ConformancePackArn", js.undefined)
  }
}
