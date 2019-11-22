package typings.atApolloProtobufjs.minimalMod

import typings.atApolloProtobufjs.atApolloProtobufjsMod.LoadCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/minimal", "load")
@js.native
object load extends js.Object {
  def apply(filename: String): js.Promise[typings.atApolloProtobufjs.atApolloProtobufjsMod.Root] = js.native
  def apply(filename: String, callback: LoadCallback): Unit = js.native
  def apply(filename: String, root: typings.atApolloProtobufjs.atApolloProtobufjsMod.Root): js.Promise[typings.atApolloProtobufjs.atApolloProtobufjsMod.Root] = js.native
  def apply(
    filename: String,
    root: typings.atApolloProtobufjs.atApolloProtobufjsMod.Root,
    callback: LoadCallback
  ): Unit = js.native
  def apply(filename: js.Array[String]): js.Promise[typings.atApolloProtobufjs.atApolloProtobufjsMod.Root] = js.native
  def apply(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String], root: typings.atApolloProtobufjs.atApolloProtobufjsMod.Root): js.Promise[typings.atApolloProtobufjs.atApolloProtobufjsMod.Root] = js.native
  def apply(
    filename: js.Array[String],
    root: typings.atApolloProtobufjs.atApolloProtobufjsMod.Root,
    callback: LoadCallback
  ): Unit = js.native
}

