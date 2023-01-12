package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyGroupConfigResult extends StObject {
  
  /**
    * The identifier for this version of the key group.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The key group configuration.
    */
  var KeyGroupConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.KeyGroupConfig] = js.undefined
}
object GetKeyGroupConfigResult {
  
  inline def apply(): GetKeyGroupConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyGroupConfigResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetKeyGroupConfigResult] (val x: Self) extends AnyVal {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setKeyGroupConfig(value: KeyGroupConfig): Self = StObject.set(x, "KeyGroupConfig", value.asInstanceOf[js.Any])
    
    inline def setKeyGroupConfigUndefined: Self = StObject.set(x, "KeyGroupConfig", js.undefined)
  }
}
