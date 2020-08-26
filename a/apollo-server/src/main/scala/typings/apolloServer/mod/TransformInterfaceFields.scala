package typings.apolloServer.mod

import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.FieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "TransformInterfaceFields")
@js.native
class TransformInterfaceFields protected ()
  extends typings.apolloServer.exportsMod.TransformInterfaceFields {
  def this(interfaceFieldTransformer: FieldTransformer) = this()
  def this(interfaceFieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}

