package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteReadSetUploadPartListItem extends StObject {
  
  /**
    *  A unique identifier used to confirm that parts are being added to the correct upload. 
    */
  var checksum: String
  
  /**
    *  A number identifying the part in a read set upload. 
    */
  var partNumber: CompleteReadSetUploadPartListItemPartNumberInteger
  
  /**
    *  The source file of the part being uploaded. 
    */
  var partSource: ReadSetPartSource
}
object CompleteReadSetUploadPartListItem {
  
  inline def apply(
    checksum: String,
    partNumber: CompleteReadSetUploadPartListItemPartNumberInteger,
    partSource: ReadSetPartSource
  ): CompleteReadSetUploadPartListItem = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], partSource = partSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteReadSetUploadPartListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompleteReadSetUploadPartListItem] (val x: Self) extends AnyVal {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setPartNumber(value: CompleteReadSetUploadPartListItemPartNumberInteger): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    inline def setPartSource(value: ReadSetPartSource): Self = StObject.set(x, "partSource", value.asInstanceOf[js.Any])
  }
}
