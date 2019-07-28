package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resouce for which a tag list is requested. Must be the ARN of an Elastic Beanstalk environment.
    */
  var ResourceArn: typings.awsDashSdk.clientsElasticbeanstalkMod.ResourceArn
}

object ListTagsForResourceMessage {
  @scala.inline
  def apply(ResourceArn: ResourceArn): ListTagsForResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[ListTagsForResourceMessage]
  }
}

