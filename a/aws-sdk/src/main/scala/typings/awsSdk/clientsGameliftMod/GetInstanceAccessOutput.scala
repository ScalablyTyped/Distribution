package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceAccessOutput extends StObject {
  
  /**
    * The connection information for a fleet instance, including IP address and access credentials.
    */
  var InstanceAccess: js.UndefOr[typings.awsSdk.clientsGameliftMod.InstanceAccess] = js.undefined
}
object GetInstanceAccessOutput {
  
  inline def apply(): GetInstanceAccessOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceAccessOutput]
  }
  
  extension [Self <: GetInstanceAccessOutput](x: Self) {
    
    inline def setInstanceAccess(value: InstanceAccess): Self = StObject.set(x, "InstanceAccess", value.asInstanceOf[js.Any])
    
    inline def setInstanceAccessUndefined: Self = StObject.set(x, "InstanceAccess", js.undefined)
  }
}
