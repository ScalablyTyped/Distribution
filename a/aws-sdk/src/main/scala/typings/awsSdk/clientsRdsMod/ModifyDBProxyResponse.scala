package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBProxyResponse extends StObject {
  
  /**
    * The DBProxy object representing the new settings for the proxy.
    */
  var DBProxy: js.UndefOr[typings.awsSdk.clientsRdsMod.DBProxy] = js.undefined
}
object ModifyDBProxyResponse {
  
  inline def apply(): ModifyDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBProxyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyDBProxyResponse] (val x: Self) extends AnyVal {
    
    inline def setDBProxy(value: DBProxy): Self = StObject.set(x, "DBProxy", value.asInstanceOf[js.Any])
    
    inline def setDBProxyUndefined: Self = StObject.set(x, "DBProxy", js.undefined)
  }
}
