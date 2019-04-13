package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var id: ResourceId
}

object Resource {
  @scala.inline
  def apply(id: ResourceId): Resource = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[Resource]
  }
}

