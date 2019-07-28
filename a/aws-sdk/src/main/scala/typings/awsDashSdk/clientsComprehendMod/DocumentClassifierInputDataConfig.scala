package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentClassifierInputDataConfig extends js.Object {
  /**
    * The Amazon S3 URI for the input data. The S3 bucket must be in the same region as the API endpoint that you are calling. The URI can point to a single input file or it can provide the prefix for a collection of input files. For example, if you use the URI S3://bucketName/prefix, if the prefix is a single file, Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend uses all of them as input.
    */
  var S3Uri: typings.awsDashSdk.clientsComprehendMod.S3Uri
}

object DocumentClassifierInputDataConfig {
  @scala.inline
  def apply(S3Uri: S3Uri): DocumentClassifierInputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri)
  
    __obj.asInstanceOf[DocumentClassifierInputDataConfig]
  }
}

