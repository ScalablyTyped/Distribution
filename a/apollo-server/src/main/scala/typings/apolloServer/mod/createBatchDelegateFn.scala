package typings.apolloServer.mod

import typings.dataloader.mod.Options
import typings.graphqlToolsBatchDelegate.typesMod.BatchDelegateFn
import typings.graphqlToolsBatchDelegate.typesMod.BatchDelegateOptionsFn
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "createBatchDelegateFn")
@js.native
object createBatchDelegateFn extends js.Object {
  def apply[K, V, C](
    argFn: js.Function1[/* args */ js.Array[K], Record[String, _]],
    batchDelegateOptionsFn: BatchDelegateOptionsFn[Record[String, _], _]
  ): BatchDelegateFn[K, _] = js.native
  def apply[K, V, C](
    argFn: js.Function1[/* args */ js.Array[K], Record[String, _]],
    batchDelegateOptionsFn: BatchDelegateOptionsFn[Record[String, _], _],
    dataLoaderOptions: Options[K, V, C]
  ): BatchDelegateFn[K, _] = js.native
}

