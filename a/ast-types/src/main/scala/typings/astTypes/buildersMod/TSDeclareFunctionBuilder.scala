package typings.astTypes.buildersMod

import typings.astTypes.AnonAsyncComments
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NoopKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSDeclareFunctionBuilder extends js.Object {
  def apply(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def apply(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def apply(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def apply(id: Null, params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def apply(id: Null, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def apply(id: Null, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def from(params: AnonAsyncComments): TSDeclareFunction = js.native
}

