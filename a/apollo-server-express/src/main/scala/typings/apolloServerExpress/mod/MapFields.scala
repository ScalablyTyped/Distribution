package typings.apolloServerExpress.mod

import typings.graphqlToolsUtils.interfacesMod.FieldNodeMappers
import typings.graphqlToolsWrap.typesMod.ErrorsTransformer
import typings.graphqlToolsWrap.typesMod.ObjectValueTransformerMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "MapFields")
@js.native
class MapFields protected ()
  extends typings.graphqlTools.mod.MapFields {
  def this(fieldNodeTransformerMap: FieldNodeMappers) = this()
  def this(fieldNodeTransformerMap: FieldNodeMappers, objectValueTransformerMap: ObjectValueTransformerMap) = this()
  def this(
    fieldNodeTransformerMap: FieldNodeMappers,
    objectValueTransformerMap: js.UndefOr[scala.Nothing],
    errorsTransformer: ErrorsTransformer
  ) = this()
  def this(
    fieldNodeTransformerMap: FieldNodeMappers,
    objectValueTransformerMap: ObjectValueTransformerMap,
    errorsTransformer: ErrorsTransformer
  ) = this()
}

