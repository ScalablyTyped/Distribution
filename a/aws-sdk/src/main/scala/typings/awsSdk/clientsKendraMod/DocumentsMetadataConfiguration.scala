package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentsMetadataConfiguration extends StObject {
  
  /**
    * A prefix used to filter metadata configuration files in the Amazon Web Services S3 bucket. The S3 bucket might contain multiple metadata files. Use S3Prefix to include only the desired metadata files.
    */
  var S3Prefix: js.UndefOr[S3ObjectKey] = js.undefined
}
object DocumentsMetadataConfiguration {
  
  inline def apply(): DocumentsMetadataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentsMetadataConfiguration]
  }
  
  extension [Self <: DocumentsMetadataConfiguration](x: Self) {
    
    inline def setS3Prefix(value: S3ObjectKey): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    inline def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
  }
}
