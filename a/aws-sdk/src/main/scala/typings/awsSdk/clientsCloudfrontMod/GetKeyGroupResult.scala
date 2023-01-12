package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyGroupResult extends StObject {
  
  /**
    * The identifier for this version of the key group.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The key group.
    */
  var KeyGroup: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.KeyGroup] = js.undefined
}
object GetKeyGroupResult {
  
  inline def apply(): GetKeyGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetKeyGroupResult] (val x: Self) extends AnyVal {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setKeyGroup(value: KeyGroup): Self = StObject.set(x, "KeyGroup", value.asInstanceOf[js.Any])
    
    inline def setKeyGroupUndefined: Self = StObject.set(x, "KeyGroup", js.undefined)
  }
}
