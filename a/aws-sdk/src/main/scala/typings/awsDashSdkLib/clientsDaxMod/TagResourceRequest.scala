package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The name of the DAX resource to which tags should be added.
    */
  var ResourceName: String
  /**
    * The tags to be assigned to the DAX resource. 
    */
  var Tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceName: String, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

