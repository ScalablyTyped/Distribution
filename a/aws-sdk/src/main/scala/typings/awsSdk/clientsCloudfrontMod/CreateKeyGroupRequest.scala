package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyGroupRequest extends StObject {
  
  /**
    * A key group configuration.
    */
  var KeyGroupConfig: typings.awsSdk.clientsCloudfrontMod.KeyGroupConfig
}
object CreateKeyGroupRequest {
  
  inline def apply(KeyGroupConfig: KeyGroupConfig): CreateKeyGroupRequest = {
    val __obj = js.Dynamic.literal(KeyGroupConfig = KeyGroupConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateKeyGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setKeyGroupConfig(value: KeyGroupConfig): Self = StObject.set(x, "KeyGroupConfig", value.asInstanceOf[js.Any])
  }
}
