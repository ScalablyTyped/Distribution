package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePermissionOutput extends StObject {
  
  /**
    * 
    */
  var Policy: js.UndefOr[String] = js.undefined
}
object PutResourcePermissionOutput {
  
  inline def apply(): PutResourcePermissionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePermissionOutput]
  }
  
  extension [Self <: PutResourcePermissionOutput](x: Self) {
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
