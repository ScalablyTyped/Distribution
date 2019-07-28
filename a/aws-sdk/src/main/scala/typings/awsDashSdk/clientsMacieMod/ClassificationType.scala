package typings.awsDashSdk.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassificationType extends js.Object {
  /**
    * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins performing continuous classification after a bucket is successfully associated with Amazon Macie. 
    */
  var continuous: S3ContinuousClassificationType
  /**
    * A one-time classification of all of the existing objects in a specified S3 bucket. 
    */
  var oneTime: S3OneTimeClassificationType
}

object ClassificationType {
  @scala.inline
  def apply(continuous: S3ContinuousClassificationType, oneTime: S3OneTimeClassificationType): ClassificationType = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], oneTime = oneTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClassificationType]
  }
}

