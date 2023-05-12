package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SseConfig extends StObject {
  
  /**
    * An encryption key ARN.
    */
  var keyArn: js.UndefOr[SseConfigKeyArnString] = js.undefined
  
  /**
    * The encryption type.
    */
  var `type`: EncryptionType
}
object SseConfig {
  
  inline def apply(`type`: EncryptionType): SseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SseConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SseConfig] (val x: Self) extends AnyVal {
    
    inline def setKeyArn(value: SseConfigKeyArnString): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
    
    inline def setKeyArnUndefined: Self = StObject.set(x, "keyArn", js.undefined)
    
    inline def setType(value: EncryptionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
