package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateKeyGroupRequest extends StObject {
  
  /**
    * The identifier of the key group that you are updating.
    */
  var Id: String
  
  /**
    * The version of the key group that you are updating. The version is the key group’s ETag value.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
  
  /**
    * The key group configuration.
    */
  var KeyGroupConfig: typings.awsSdk.clientsCloudfrontMod.KeyGroupConfig
}
object UpdateKeyGroupRequest {
  
  inline def apply(Id: String, KeyGroupConfig: KeyGroupConfig): UpdateKeyGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], KeyGroupConfig = KeyGroupConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateKeyGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateKeyGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
    
    inline def setKeyGroupConfig(value: KeyGroupConfig): Self = StObject.set(x, "KeyGroupConfig", value.asInstanceOf[js.Any])
  }
}
