package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDetail extends StObject {
  
  /**
    * The ARN of the resource.
    */
  var ARN: js.UndefOr[ResourceDetailARN] = js.undefined
  
  /**
    * The creation time of the resource.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the resource.
    */
  var Description: js.UndefOr[ResourceDetailDescription] = js.undefined
  
  /**
    * The identifier of the resource.
    */
  var Id: js.UndefOr[ResourceDetailId] = js.undefined
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ResourceDetailName] = js.undefined
}
object ResourceDetail {
  
  inline def apply(): ResourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceDetail] (val x: Self) extends AnyVal {
    
    inline def setARN(value: ResourceDetailARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: ResourceDetailDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: ResourceDetailId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ResourceDetailName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
