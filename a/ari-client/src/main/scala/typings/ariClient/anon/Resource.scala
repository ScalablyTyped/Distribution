package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var resource: String
  var tech: String
}

object Resource {
  @scala.inline
  def apply(resource: String, tech: String): Resource = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], tech = tech.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

