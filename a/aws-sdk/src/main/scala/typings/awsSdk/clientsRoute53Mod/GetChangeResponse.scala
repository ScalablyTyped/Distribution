package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChangeResponse extends StObject {
  
  /**
    * A complex type that contains information about the specified change batch.
    */
  var ChangeInfo: typings.awsSdk.clientsRoute53Mod.ChangeInfo
}
object GetChangeResponse {
  
  inline def apply(ChangeInfo: ChangeInfo): GetChangeResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetChangeResponse] (val x: Self) extends AnyVal {
    
    inline def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
