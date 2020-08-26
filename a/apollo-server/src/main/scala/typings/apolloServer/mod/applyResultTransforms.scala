package typings.apolloServer.mod

import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "applyResultTransforms")
@js.native
object applyResultTransforms extends js.Object {
  def apply(originalResult: js.Any, transforms: js.Array[Transform[Record[String, _]]]): js.Any = js.native
}

