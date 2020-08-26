package typings.apolloServer.exportsMod

import typings.graphqlToolsWrap.typesMod.DataTransformer
import typings.graphqlToolsWrap.typesMod.ErrorsTransformer
import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.FieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "TransformCompositeFields")
@js.native
class TransformCompositeFields protected ()
  extends typings.graphqlTools.mod.TransformCompositeFields {
  def this(fieldTransformer: FieldTransformer) = this()
  def this(fieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
  def this(
    fieldTransformer: FieldTransformer,
    fieldNodeTransformer: js.UndefOr[scala.Nothing],
    dataTransformer: DataTransformer
  ) = this()
  def this(
    fieldTransformer: FieldTransformer,
    fieldNodeTransformer: FieldNodeTransformer,
    dataTransformer: DataTransformer
  ) = this()
  def this(
    fieldTransformer: FieldTransformer,
    fieldNodeTransformer: js.UndefOr[scala.Nothing],
    dataTransformer: js.UndefOr[scala.Nothing],
    errorsTransformer: ErrorsTransformer
  ) = this()
  def this(
    fieldTransformer: FieldTransformer,
    fieldNodeTransformer: js.UndefOr[scala.Nothing],
    dataTransformer: DataTransformer,
    errorsTransformer: ErrorsTransformer
  ) = this()
  def this(
    fieldTransformer: FieldTransformer,
    fieldNodeTransformer: FieldNodeTransformer,
    dataTransformer: js.UndefOr[scala.Nothing],
    errorsTransformer: ErrorsTransformer
  ) = this()
  def this(
    fieldTransformer: FieldTransformer,
    fieldNodeTransformer: FieldNodeTransformer,
    dataTransformer: DataTransformer,
    errorsTransformer: ErrorsTransformer
  ) = this()
}

