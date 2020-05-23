package typings.ariClient.anon

import typings.ariClient.mod.Containers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var from: String
  var resource: String
  var tech: String
  var variables: js.UndefOr[Containers] = js.undefined
}

object From {
  @scala.inline
  def apply(from: String, resource: String, tech: String, body: String = null, variables: Containers = null): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], tech = tech.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
}

