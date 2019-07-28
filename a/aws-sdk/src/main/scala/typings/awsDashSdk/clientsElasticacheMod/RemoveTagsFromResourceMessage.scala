package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromResourceMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource from which you want the tags removed, for example arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster or arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var ResourceName: String
  /**
    * A list of TagKeys identifying the tags you want removed from the named resource.
    */
  var TagKeys: KeyList
}

object RemoveTagsFromResourceMessage {
  @scala.inline
  def apply(ResourceName: String, TagKeys: KeyList): RemoveTagsFromResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName, TagKeys = TagKeys)
  
    __obj.asInstanceOf[RemoveTagsFromResourceMessage]
  }
}

