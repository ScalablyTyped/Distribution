package typings.awsSdk.clientsBackupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectMetadataOutput extends StObject {
  
  /**
    * Metadata blob.
    */
  var MetadataBlob: js.UndefOr[PayloadBlob] = js.undefined
  
  /**
    * MetadataBlob checksum.
    */
  var MetadataBlobChecksum: js.UndefOr[String] = js.undefined
  
  /**
    * Checksum algorithm.
    */
  var MetadataBlobChecksumAlgorithm: js.UndefOr[DataChecksumAlgorithm] = js.undefined
  
  /**
    * The size of MetadataBlob.
    */
  var MetadataBlobLength: js.UndefOr[long] = js.undefined
  
  /**
    * Metadata string.
    */
  var MetadataString: js.UndefOr[String] = js.undefined
}
object GetObjectMetadataOutput {
  
  inline def apply(): GetObjectMetadataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectMetadataOutput]
  }
  
  extension [Self <: GetObjectMetadataOutput](x: Self) {
    
    inline def setMetadataBlob(value: PayloadBlob): Self = StObject.set(x, "MetadataBlob", value.asInstanceOf[js.Any])
    
    inline def setMetadataBlobChecksum(value: String): Self = StObject.set(x, "MetadataBlobChecksum", value.asInstanceOf[js.Any])
    
    inline def setMetadataBlobChecksumAlgorithm(value: DataChecksumAlgorithm): Self = StObject.set(x, "MetadataBlobChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMetadataBlobChecksumAlgorithmUndefined: Self = StObject.set(x, "MetadataBlobChecksumAlgorithm", js.undefined)
    
    inline def setMetadataBlobChecksumUndefined: Self = StObject.set(x, "MetadataBlobChecksum", js.undefined)
    
    inline def setMetadataBlobLength(value: long): Self = StObject.set(x, "MetadataBlobLength", value.asInstanceOf[js.Any])
    
    inline def setMetadataBlobLengthUndefined: Self = StObject.set(x, "MetadataBlobLength", js.undefined)
    
    inline def setMetadataBlobUndefined: Self = StObject.set(x, "MetadataBlob", js.undefined)
    
    inline def setMetadataString(value: String): Self = StObject.set(x, "MetadataString", value.asInstanceOf[js.Any])
    
    inline def setMetadataStringUndefined: Self = StObject.set(x, "MetadataString", js.undefined)
  }
}
