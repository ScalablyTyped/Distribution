package typings.algoliasearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardToReplicas extends js.Object {
  var forwardToReplicas: Boolean
}

object ForwardToReplicas {
  @scala.inline
  def apply(forwardToReplicas: Boolean): ForwardToReplicas = {
    val __obj = js.Dynamic.literal(forwardToReplicas = forwardToReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardToReplicas]
  }
}

