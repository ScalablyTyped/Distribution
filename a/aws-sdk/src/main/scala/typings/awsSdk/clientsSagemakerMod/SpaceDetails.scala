package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpaceDetails extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the associated Domain.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DomainId] = js.undefined
  
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the space.
    */
  var SpaceName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SpaceName] = js.undefined
  
  /**
    * The status.
    */
  var Status: js.UndefOr[SpaceStatus] = js.undefined
}
object SpaceDetails {
  
  inline def apply(): SpaceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpaceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpaceDetails] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSpaceName(value: SpaceName): Self = StObject.set(x, "SpaceName", value.asInstanceOf[js.Any])
    
    inline def setSpaceNameUndefined: Self = StObject.set(x, "SpaceName", js.undefined)
    
    inline def setStatus(value: SpaceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
