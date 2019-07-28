package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTag extends js.Object {
  /**
    * The name of the tag. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.  
    */
  var Name: MessageTagName
  /**
    * The value of the tag. The value must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.  
    */
  var Value: MessageTagValue
}

object MessageTag {
  @scala.inline
  def apply(Name: MessageTagName, Value: MessageTagValue): MessageTag = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
  
    __obj.asInstanceOf[MessageTag]
  }
}

