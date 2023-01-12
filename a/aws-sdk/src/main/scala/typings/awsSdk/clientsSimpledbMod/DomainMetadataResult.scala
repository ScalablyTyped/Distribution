package typings.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainMetadataResult extends StObject {
  
  /**
    * The number of unique attribute names in the domain.
    */
  var AttributeNameCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total size of all unique attribute names in the domain, in bytes.
    */
  var AttributeNamesSizeBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of all attribute name/value pairs in the domain.
    */
  var AttributeValueCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total size of all attribute values in the domain, in bytes.
    */
  var AttributeValuesSizeBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of all items in the domain.
    */
  var ItemCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total size of all item names in the domain, in bytes.
    */
  var ItemNamesSizeBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The data and time when metadata was calculated, in Epoch (UNIX) seconds.
    */
  var Timestamp: js.UndefOr[Integer] = js.undefined
}
object DomainMetadataResult {
  
  inline def apply(): DomainMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMetadataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainMetadataResult] (val x: Self) extends AnyVal {
    
    inline def setAttributeNameCount(value: Integer): Self = StObject.set(x, "AttributeNameCount", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameCountUndefined: Self = StObject.set(x, "AttributeNameCount", js.undefined)
    
    inline def setAttributeNamesSizeBytes(value: Long): Self = StObject.set(x, "AttributeNamesSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamesSizeBytesUndefined: Self = StObject.set(x, "AttributeNamesSizeBytes", js.undefined)
    
    inline def setAttributeValueCount(value: Integer): Self = StObject.set(x, "AttributeValueCount", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueCountUndefined: Self = StObject.set(x, "AttributeValueCount", js.undefined)
    
    inline def setAttributeValuesSizeBytes(value: Long): Self = StObject.set(x, "AttributeValuesSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setAttributeValuesSizeBytesUndefined: Self = StObject.set(x, "AttributeValuesSizeBytes", js.undefined)
    
    inline def setItemCount(value: Integer): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setItemNamesSizeBytes(value: Long): Self = StObject.set(x, "ItemNamesSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setItemNamesSizeBytesUndefined: Self = StObject.set(x, "ItemNamesSizeBytes", js.undefined)
    
    inline def setTimestamp(value: Integer): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
