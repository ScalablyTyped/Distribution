package typings.apolloServer.exportsMod

import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.FieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "TransformInterfaceFields")
@js.native
class TransformInterfaceFields protected ()
  extends typings.graphqlTools.mod.TransformInterfaceFields {
  def this(interfaceFieldTransformer: FieldTransformer) = this()
  def this(interfaceFieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}

