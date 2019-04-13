package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTagsMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) to which you want to add the tag or tags. For example, arn:aws:redshift:us-east-1:123456789:cluster:t1. 
    */
  var ResourceName: String
  /**
    * One or more name/value pairs to add as tags to the specified resource. Each tag name is passed in with the parameter Key and the corresponding value is passed in with the parameter Value. The Key and Value parameters are separated by a comma (,). Separate multiple tags with a space. For example, --tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0". 
    */
  var Tags: TagList
}

object CreateTagsMessage {
  @scala.inline
  def apply(ResourceName: String, Tags: TagList): CreateTagsMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName, Tags = Tags)
  
    __obj.asInstanceOf[CreateTagsMessage]
  }
}

