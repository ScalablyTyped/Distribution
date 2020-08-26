package typings.apolloServer.mod

import typings.graphqlToolsLoad.loadTypedefsMod.LoadTypedefsOptions
import typings.graphqlToolsLoad.loadTypedefsMod.UnnormalizedTypeDefPointer
import typings.graphqlToolsUtils.loadersMod.Source
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "loadTypedefs")
@js.native
object loadTypedefs extends js.Object {
  def apply[AdditionalConfig](
    pointerOrPointers: js.Array[UnnormalizedTypeDefPointer],
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Promise[js.Array[Source]] = js.native
  def apply[AdditionalConfig](
    pointerOrPointers: UnnormalizedTypeDefPointer,
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Promise[js.Array[Source]] = js.native
}

