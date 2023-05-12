package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetDocumentClassifierInputDataConfig extends StObject {
  
  /**
    * Indicates the delimiter used to separate each label for training a multi-label classifier. The default delimiter between labels is a pipe (|). You can use a different character as a delimiter (if it's an allowed character) by specifying it under Delimiter for labels. If the training documents use a delimiter other than the default or the delimiter you specify, the labels on that line will be combined to make a single unique label, such as LABELLABELLABEL.
    */
  var LabelDelimiter: js.UndefOr[typings.awsSdk.clientsComprehendMod.LabelDelimiter] = js.undefined
  
  /**
    * The Amazon S3 URI for the input data. The S3 bucket must be in the same Region as the API endpoint that you are calling. The URI can point to a single input file or it can provide the prefix for a collection of input files. For example, if you use the URI S3://bucketName/prefix, if the prefix is a single file, Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend uses all of them as input. This parameter is required if you set DataFormat to COMPREHEND_CSV.
    */
  var S3Uri: typings.awsSdk.clientsComprehendMod.S3Uri
}
object DatasetDocumentClassifierInputDataConfig {
  
  inline def apply(S3Uri: S3Uri): DatasetDocumentClassifierInputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetDocumentClassifierInputDataConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetDocumentClassifierInputDataConfig] (val x: Self) extends AnyVal {
    
    inline def setLabelDelimiter(value: LabelDelimiter): Self = StObject.set(x, "LabelDelimiter", value.asInstanceOf[js.Any])
    
    inline def setLabelDelimiterUndefined: Self = StObject.set(x, "LabelDelimiter", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
