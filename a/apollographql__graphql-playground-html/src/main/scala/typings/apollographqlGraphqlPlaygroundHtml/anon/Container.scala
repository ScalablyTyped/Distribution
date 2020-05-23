package typings.apollographqlGraphqlPlaygroundHtml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var container: String
  var script: String
}

object Container {
  @scala.inline
  def apply(container: String, script: String): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

