package typings.apolloServer.mod

import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.FieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "TransformObjectFields")
@js.native
class TransformObjectFields protected ()
  extends typings.apolloServer.exportsMod.TransformObjectFields {
  def this(objectFieldTransformer: FieldTransformer) = this()
  def this(objectFieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}

