package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobS3DataSource extends StObject {
  
  /**
    * The Amazon S3 location of the manifest file that describes the input data objects.  The input manifest file referenced in ManifestS3Uri must contain one of the following keys: source-ref or source. The value of the keys are interpreted as follows:    source-ref: The source of the object is the Amazon S3 object specified in the value. Use this value when the object is a binary object, such as an image.    source: The source of the object is the value. Use this value when the object is a text value.   If you are a new user of Ground Truth, it is recommended you review Use an Input Manifest File  in the Amazon SageMaker Developer Guide to learn how to create an input manifest file.
    */
  var ManifestS3Uri: S3Uri
}
object LabelingJobS3DataSource {
  
  inline def apply(ManifestS3Uri: S3Uri): LabelingJobS3DataSource = {
    val __obj = js.Dynamic.literal(ManifestS3Uri = ManifestS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobS3DataSource]
  }
  
  extension [Self <: LabelingJobS3DataSource](x: Self) {
    
    inline def setManifestS3Uri(value: S3Uri): Self = StObject.set(x, "ManifestS3Uri", value.asInstanceOf[js.Any])
  }
}
