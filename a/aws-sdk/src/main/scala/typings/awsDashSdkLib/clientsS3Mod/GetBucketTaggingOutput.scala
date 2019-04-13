package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketTaggingOutput extends js.Object {
  /**
    * 
    */
  var TagSet: awsDashSdkLib.clientsS3Mod.TagSet
}

object GetBucketTaggingOutput {
  @scala.inline
  def apply(TagSet: TagSet): GetBucketTaggingOutput = {
    val __obj = js.Dynamic.literal(TagSet = TagSet)
  
    __obj.asInstanceOf[GetBucketTaggingOutput]
  }
}

