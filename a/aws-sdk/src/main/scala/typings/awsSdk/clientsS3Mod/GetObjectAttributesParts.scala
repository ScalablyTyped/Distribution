package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectAttributesParts extends StObject {
  
  /**
    * Indicates whether the returned list of parts is truncated. A value of true indicates that the list was truncated. A list can be truncated if the number of parts exceeds the limit returned in the MaxParts element.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.clientsS3Mod.IsTruncated] = js.undefined
  
  /**
    * The maximum number of parts allowed in the response.
    */
  var MaxParts: js.UndefOr[typings.awsSdk.clientsS3Mod.MaxParts] = js.undefined
  
  /**
    * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the PartNumberMarker request parameter in a subsequent request.
    */
  var NextPartNumberMarker: js.UndefOr[typings.awsSdk.clientsS3Mod.NextPartNumberMarker] = js.undefined
  
  /**
    * The marker for the current part.
    */
  var PartNumberMarker: js.UndefOr[typings.awsSdk.clientsS3Mod.PartNumberMarker] = js.undefined
  
  /**
    * A container for elements related to a particular part. A response can contain zero or more Parts elements.
    */
  var Parts: js.UndefOr[PartsList] = js.undefined
  
  /**
    * The total number of parts.
    */
  var TotalPartsCount: js.UndefOr[PartsCount] = js.undefined
}
object GetObjectAttributesParts {
  
  inline def apply(): GetObjectAttributesParts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectAttributesParts]
  }
  
  extension [Self <: GetObjectAttributesParts](x: Self) {
    
    inline def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setMaxParts(value: MaxParts): Self = StObject.set(x, "MaxParts", value.asInstanceOf[js.Any])
    
    inline def setMaxPartsUndefined: Self = StObject.set(x, "MaxParts", js.undefined)
    
    inline def setNextPartNumberMarker(value: NextPartNumberMarker): Self = StObject.set(x, "NextPartNumberMarker", value.asInstanceOf[js.Any])
    
    inline def setNextPartNumberMarkerUndefined: Self = StObject.set(x, "NextPartNumberMarker", js.undefined)
    
    inline def setPartNumberMarker(value: PartNumberMarker): Self = StObject.set(x, "PartNumberMarker", value.asInstanceOf[js.Any])
    
    inline def setPartNumberMarkerUndefined: Self = StObject.set(x, "PartNumberMarker", js.undefined)
    
    inline def setParts(value: PartsList): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
    
    inline def setPartsVarargs(value: ObjectPart*): Self = StObject.set(x, "Parts", js.Array(value*))
    
    inline def setTotalPartsCount(value: PartsCount): Self = StObject.set(x, "TotalPartsCount", value.asInstanceOf[js.Any])
    
    inline def setTotalPartsCountUndefined: Self = StObject.set(x, "TotalPartsCount", js.undefined)
  }
}
