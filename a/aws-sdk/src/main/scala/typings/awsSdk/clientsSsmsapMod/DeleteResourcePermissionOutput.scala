package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePermissionOutput extends StObject {
  
  /**
    * 
    */
  var Policy: js.UndefOr[String] = js.undefined
}
object DeleteResourcePermissionOutput {
  
  inline def apply(): DeleteResourcePermissionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcePermissionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResourcePermissionOutput] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
