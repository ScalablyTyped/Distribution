package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePermissionOutput extends StObject {
  
  /**
    * 
    */
  var Policy: js.UndefOr[String] = js.undefined
}
object GetResourcePermissionOutput {
  
  inline def apply(): GetResourcePermissionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePermissionOutput]
  }
  
  extension [Self <: GetResourcePermissionOutput](x: Self) {
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
