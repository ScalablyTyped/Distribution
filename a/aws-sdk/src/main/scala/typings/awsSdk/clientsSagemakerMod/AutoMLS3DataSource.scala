package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLS3DataSource extends StObject {
  
  /**
    * The data type.    If you choose S3Prefix, S3Uri identifies a key name prefix. SageMaker uses all objects that match the specified key name prefix for model training. The S3Prefix should have the following format:  s3://DOC-EXAMPLE-BUCKET/DOC-EXAMPLE-FOLDER-OR-FILE    If you choose ManifestFile, S3Uri identifies an object that is a manifest file containing a list of object keys that you want SageMaker to use for model training. A ManifestFile should have the format shown below:  [ {"prefix": "s3://DOC-EXAMPLE-BUCKET/DOC-EXAMPLE-FOLDER/DOC-EXAMPLE-PREFIX/"},    "DOC-EXAMPLE-RELATIVE-PATH/DOC-EXAMPLE-FOLDER/DATA-1",   "DOC-EXAMPLE-RELATIVE-PATH/DOC-EXAMPLE-FOLDER/DATA-2",   ... "DOC-EXAMPLE-RELATIVE-PATH/DOC-EXAMPLE-FOLDER/DATA-N" ]    If you choose AugmentedManifestFile, S3Uri identifies an object that is an augmented manifest file in JSON lines format. This file contains the data you want to use for model training. AugmentedManifestFile is available for V2 API jobs only (for example, for jobs created by calling CreateAutoMLJobV2). Here is a minimal, single-record example of an AugmentedManifestFile:  {"source-ref": "s3://DOC-EXAMPLE-BUCKET/DOC-EXAMPLE-FOLDER/cats/cat.jpg",   "label-metadata": {"class-name": "cat" } For more information on AugmentedManifestFile, see Provide Dataset Metadata to Training Jobs with an Augmented Manifest File.  
    */
  var S3DataType: AutoMLS3DataType
  
  /**
    * The URL to the Amazon S3 data source. The Uri refers to the Amazon S3 prefix or ManifestFile depending on the data type.
    */
  var S3Uri: typings.awsSdk.clientsSagemakerMod.S3Uri
}
object AutoMLS3DataSource {
  
  inline def apply(S3DataType: AutoMLS3DataType, S3Uri: S3Uri): AutoMLS3DataSource = {
    val __obj = js.Dynamic.literal(S3DataType = S3DataType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLS3DataSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoMLS3DataSource] (val x: Self) extends AnyVal {
    
    inline def setS3DataType(value: AutoMLS3DataType): Self = StObject.set(x, "S3DataType", value.asInstanceOf[js.Any])
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
