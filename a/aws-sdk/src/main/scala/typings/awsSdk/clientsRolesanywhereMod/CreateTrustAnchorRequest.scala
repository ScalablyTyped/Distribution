package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrustAnchorRequest extends StObject {
  
  /**
    * Specifies whether the trust anchor is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the trust anchor.
    */
  var name: ResourceName
  
  /**
    * The trust anchor type and its related certificate data.
    */
  var source: Source
  
  /**
    * The tags to attach to the trust anchor.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateTrustAnchorRequest {
  
  inline def apply(name: ResourceName, source: Source): CreateTrustAnchorRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrustAnchorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTrustAnchorRequest] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
