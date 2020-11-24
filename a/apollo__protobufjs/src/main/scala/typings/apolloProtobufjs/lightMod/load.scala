package typings.apolloProtobufjs.lightMod

import typings.apolloProtobufjs.mod.LoadCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/light", "load")
@js.native
object load extends js.Object {
  
  def apply(filename: String): js.Promise[typings.apolloProtobufjs.mod.Root] = js.native
  def apply(filename: String, callback: LoadCallback): Unit = js.native
  def apply(filename: String, root: typings.apolloProtobufjs.mod.Root): js.Promise[typings.apolloProtobufjs.mod.Root] = js.native
  def apply(filename: String, root: typings.apolloProtobufjs.mod.Root, callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String]): js.Promise[typings.apolloProtobufjs.mod.Root] = js.native
  def apply(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String], root: typings.apolloProtobufjs.mod.Root): js.Promise[typings.apolloProtobufjs.mod.Root] = js.native
  def apply(filename: js.Array[String], root: typings.apolloProtobufjs.mod.Root, callback: LoadCallback): Unit = js.native
}
