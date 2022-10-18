package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLS3DataSource extends StObject {
  
  /**
    * The data type. A ManifestFile should have the format shown below:  [ {"prefix": "s3://DOC-EXAMPLE-BUCKET/DOC-EXAMPLE-FOLDER/DOC-EXAMPLE-PREFIX/"},    "DOC-EXAMPLE-RELATIVE-PATH/DOC-EXAMPLE-FOLDER/DATA-1",   "DOC-EXAMPLE-RELATIVE-PATH/DOC-EXAMPLE-FOLDER/DATA-2",   ... "DOC-EXAMPLE-RELATIVE-PATH/DOC-EXAMPLE-FOLDER/DATA-N" ]  An S3Prefix should have the following format:   s3://DOC-EXAMPLE-BUCKET/DOC-EXAMPLE-FOLDER-OR-FILE 
    */
  var S3DataType: AutoMLS3DataType
  
  /**
    * The URL to the Amazon S3 data source.
    */
  var S3Uri: typings.awsSdk.clientsSagemakerMod.S3Uri
}
object AutoMLS3DataSource {
  
  inline def apply(S3DataType: AutoMLS3DataType, S3Uri: S3Uri): AutoMLS3DataSource = {
    val __obj = js.Dynamic.literal(S3DataType = S3DataType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLS3DataSource]
  }
  
  extension [Self <: AutoMLS3DataSource](x: Self) {
    
    inline def setS3DataType(value: AutoMLS3DataType): Self = StObject.set(x, "S3DataType", value.asInstanceOf[js.Any])
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
