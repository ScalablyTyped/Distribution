package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterInstanceTagAttributeRequest extends StObject {
  
  /**
    * Indicates whether to register all tag keys in the current Region. Specify true to register all tag keys.
    */
  var IncludeAllTagsOfInstance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tag keys to register.
    */
  var InstanceTagKeys: js.UndefOr[InstanceTagKeySet] = js.undefined
}
object RegisterInstanceTagAttributeRequest {
  
  inline def apply(): RegisterInstanceTagAttributeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterInstanceTagAttributeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterInstanceTagAttributeRequest] (val x: Self) extends AnyVal {
    
    inline def setIncludeAllTagsOfInstance(value: Boolean): Self = StObject.set(x, "IncludeAllTagsOfInstance", value.asInstanceOf[js.Any])
    
    inline def setIncludeAllTagsOfInstanceUndefined: Self = StObject.set(x, "IncludeAllTagsOfInstance", js.undefined)
    
    inline def setInstanceTagKeys(value: InstanceTagKeySet): Self = StObject.set(x, "InstanceTagKeys", value.asInstanceOf[js.Any])
    
    inline def setInstanceTagKeysUndefined: Self = StObject.set(x, "InstanceTagKeys", js.undefined)
    
    inline def setInstanceTagKeysVarargs(value: String*): Self = StObject.set(x, "InstanceTagKeys", js.Array(value*))
  }
}
