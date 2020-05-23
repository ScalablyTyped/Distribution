package typings.ariClient.anon

import typings.ariClient.mod.Containers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var from: String
  var to: String
  var variables: js.UndefOr[Containers] = js.undefined
}

object Body {
  @scala.inline
  def apply(from: String, to: String, body: String = null, variables: Containers = null): Body = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

