package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBProxyResponse extends StObject {
  
  /**
    * The DBProxy structure corresponding to the new proxy.
    */
  var DBProxy: js.UndefOr[typings.awsSdk.clientsRdsMod.DBProxy] = js.undefined
}
object CreateDBProxyResponse {
  
  inline def apply(): CreateDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBProxyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDBProxyResponse] (val x: Self) extends AnyVal {
    
    inline def setDBProxy(value: DBProxy): Self = StObject.set(x, "DBProxy", value.asInstanceOf[js.Any])
    
    inline def setDBProxyUndefined: Self = StObject.set(x, "DBProxy", js.undefined)
  }
}
