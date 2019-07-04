package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the Amazon SWF domain.
    */
  var resourceArn: Arn
  /**
    * The list of tags to add to a domain.  Tags may only contain unicode letters, digits, whitespace, or these symbols: _ . : / = + - @.
    */
  var tags: ResourceTagList
}

object TagResourceInput {
  @scala.inline
  def apply(resourceArn: Arn, tags: ResourceTagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tags = tags)
  
    __obj.asInstanceOf[TagResourceInput]
  }
}

