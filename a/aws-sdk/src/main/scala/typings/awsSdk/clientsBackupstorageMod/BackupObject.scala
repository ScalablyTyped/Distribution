package typings.awsSdk.clientsBackupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupObject extends StObject {
  
  /**
    * Number of chunks in object
    */
  var ChunksCount: js.UndefOr[OptionalLong] = js.undefined
  
  /**
    * Metadata string associated with the Object
    */
  var MetadataString: js.UndefOr[String] = js.undefined
  
  /**
    * Object name
    */
  var Name: String
  
  /**
    * Object checksum
    */
  var ObjectChecksum: String
  
  /**
    * Checksum algorithm
    */
  var ObjectChecksumAlgorithm: SummaryChecksumAlgorithm
  
  /**
    * Object token
    */
  var ObjectToken: String
}
object BackupObject {
  
  inline def apply(
    Name: String,
    ObjectChecksum: String,
    ObjectChecksumAlgorithm: SummaryChecksumAlgorithm,
    ObjectToken: String
  ): BackupObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ObjectChecksum = ObjectChecksum.asInstanceOf[js.Any], ObjectChecksumAlgorithm = ObjectChecksumAlgorithm.asInstanceOf[js.Any], ObjectToken = ObjectToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackupObject] (val x: Self) extends AnyVal {
    
    inline def setChunksCount(value: OptionalLong): Self = StObject.set(x, "ChunksCount", value.asInstanceOf[js.Any])
    
    inline def setChunksCountUndefined: Self = StObject.set(x, "ChunksCount", js.undefined)
    
    inline def setMetadataString(value: String): Self = StObject.set(x, "MetadataString", value.asInstanceOf[js.Any])
    
    inline def setMetadataStringUndefined: Self = StObject.set(x, "MetadataString", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setObjectChecksum(value: String): Self = StObject.set(x, "ObjectChecksum", value.asInstanceOf[js.Any])
    
    inline def setObjectChecksumAlgorithm(value: SummaryChecksumAlgorithm): Self = StObject.set(x, "ObjectChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setObjectToken(value: String): Self = StObject.set(x, "ObjectToken", value.asInstanceOf[js.Any])
  }
}
