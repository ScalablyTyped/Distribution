package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherMetadataValueListItem extends StObject {
  
  /**
    * The time at which the entry was created.
    */
  var CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined
  
  /**
    * The metadata key’s corresponding value for the other metadata belonging to the same metadata key.
    */
  var MetadataValue: js.UndefOr[MetadataValueString] = js.undefined
}
object OtherMetadataValueListItem {
  
  inline def apply(): OtherMetadataValueListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherMetadataValueListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OtherMetadataValueListItem] (val x: Self) extends AnyVal {
    
    inline def setCreatedTime(value: CreatedTimestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setMetadataValue(value: MetadataValueString): Self = StObject.set(x, "MetadataValue", value.asInstanceOf[js.Any])
    
    inline def setMetadataValueUndefined: Self = StObject.set(x, "MetadataValue", js.undefined)
  }
}
