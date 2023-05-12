package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadSetUploadPartListItem extends StObject {
  
  /**
    *  A unique identifier used to confirm that parts are being added to the correct upload. 
    */
  var checksum: String
  
  /**
    *  The time stamp for when a direct upload was created. 
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The time stamp for the most recent update to an uploaded part. 
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The number identifying the part in an upload. 
    */
  var partNumber: ReadSetUploadPartListItemPartNumberInteger
  
  /**
    *  The size of the the part in an upload. 
    */
  var partSize: ReadSetUploadPartListItemPartSizeLong
  
  /**
    *  The origin of the part being direct uploaded. 
    */
  var partSource: ReadSetPartSource
}
object ReadSetUploadPartListItem {
  
  inline def apply(
    checksum: String,
    partNumber: ReadSetUploadPartListItemPartNumberInteger,
    partSize: ReadSetUploadPartListItemPartSizeLong,
    partSource: ReadSetPartSource
  ): ReadSetUploadPartListItem = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], partSize = partSize.asInstanceOf[js.Any], partSource = partSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadSetUploadPartListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadSetUploadPartListItem] (val x: Self) extends AnyVal {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setPartNumber(value: ReadSetUploadPartListItemPartNumberInteger): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    inline def setPartSize(value: ReadSetUploadPartListItemPartSizeLong): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
    
    inline def setPartSource(value: ReadSetPartSource): Self = StObject.set(x, "partSource", value.asInstanceOf[js.Any])
  }
}
