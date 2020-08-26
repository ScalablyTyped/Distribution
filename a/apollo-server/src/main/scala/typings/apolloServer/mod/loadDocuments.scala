package typings.apolloServer.mod

import typings.graphqlToolsLoad.anon.LoadTypedefsOptionskeystr
import typings.graphqlToolsLoad.loadTypedefsMod.UnnormalizedTypeDefPointer
import typings.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "loadDocuments")
@js.native
object loadDocuments extends js.Object {
  def apply(pointerOrPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadTypedefsOptionskeystr): js.Promise[js.Array[Source]] = js.native
  def apply(pointerOrPointers: UnnormalizedTypeDefPointer, options: LoadTypedefsOptionskeystr): js.Promise[js.Array[Source]] = js.native
}

