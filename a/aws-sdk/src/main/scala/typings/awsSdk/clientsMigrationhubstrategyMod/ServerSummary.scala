package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSummary extends StObject {
  
  /**
    *  Type of operating system for the servers. 
    */
  var ServerOsType: js.UndefOr[typings.awsSdk.clientsMigrationhubstrategyMod.ServerOsType] = js.undefined
  
  /**
    *  Number of servers. 
    */
  var count: js.UndefOr[Integer] = js.undefined
}
object ServerSummary {
  
  inline def apply(): ServerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerSummary] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setServerOsType(value: ServerOsType): Self = StObject.set(x, "ServerOsType", value.asInstanceOf[js.Any])
    
    inline def setServerOsTypeUndefined: Self = StObject.set(x, "ServerOsType", js.undefined)
  }
}
