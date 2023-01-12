package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStudioSessionMappingsInput extends StObject {
  
  /**
    * Specifies whether to return session mappings for users or groups. If not specified, the results include session mapping details for both users and groups.
    */
  var IdentityType: js.UndefOr[typings.awsSdk.clientsEmrMod.IdentityType] = js.undefined
  
  /**
    * The pagination token that indicates the set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEmrMod.Marker] = js.undefined
  
  /**
    * The ID of the Amazon EMR Studio.
    */
  var StudioId: js.UndefOr[XmlStringMaxLen256] = js.undefined
}
object ListStudioSessionMappingsInput {
  
  inline def apply(): ListStudioSessionMappingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudioSessionMappingsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStudioSessionMappingsInput] (val x: Self) extends AnyVal {
    
    inline def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    inline def setIdentityTypeUndefined: Self = StObject.set(x, "IdentityType", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setStudioId(value: XmlStringMaxLen256): Self = StObject.set(x, "StudioId", value.asInstanceOf[js.Any])
    
    inline def setStudioIdUndefined: Self = StObject.set(x, "StudioId", js.undefined)
  }
}
