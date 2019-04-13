package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The name of the resource to which you are adding tags.
    */
  var resourceName: ResourceName
  /**
    * The tag key and optional value.
    */
  var tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceName: ResourceName, tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName, tags = tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

