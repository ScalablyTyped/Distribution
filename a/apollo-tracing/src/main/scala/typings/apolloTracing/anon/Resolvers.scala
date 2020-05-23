package typings.apolloTracing.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolvers extends js.Object {
  var resolvers: js.Array[Duration]
}

object Resolvers {
  @scala.inline
  def apply(resolvers: js.Array[Duration]): Resolvers = {
    val __obj = js.Dynamic.literal(resolvers = resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolvers]
  }
}

