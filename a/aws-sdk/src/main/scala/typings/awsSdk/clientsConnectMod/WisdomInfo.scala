package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WisdomInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Wisdom session.
    */
  var SessionArn: js.UndefOr[ARN] = js.undefined
}
object WisdomInfo {
  
  inline def apply(): WisdomInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WisdomInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WisdomInfo] (val x: Self) extends AnyVal {
    
    inline def setSessionArn(value: ARN): Self = StObject.set(x, "SessionArn", value.asInstanceOf[js.Any])
    
    inline def setSessionArnUndefined: Self = StObject.set(x, "SessionArn", js.undefined)
  }
}
