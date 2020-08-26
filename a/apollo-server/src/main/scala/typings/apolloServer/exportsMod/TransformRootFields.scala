package typings.apolloServer.exportsMod

import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.RootFieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "TransformRootFields")
@js.native
class TransformRootFields protected ()
  extends typings.graphqlTools.mod.TransformRootFields {
  def this(rootFieldTransformer: RootFieldTransformer) = this()
  def this(rootFieldTransformer: RootFieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}

