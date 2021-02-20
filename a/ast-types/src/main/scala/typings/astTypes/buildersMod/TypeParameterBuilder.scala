package typings.astTypes.buildersMod

import typings.astTypes.anon.Bound
import typings.astTypes.astTypesStrings.minus
import typings.astTypes.astTypesStrings.plus
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.kindsMod.VarianceKind
import typings.astTypes.namedTypesMod.namedTypes.TypeParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeParameterBuilder extends StObject {
  
  def apply(name: String): TypeParameter = js.native
  def apply(
    name: String,
    variance: js.UndefOr[scala.Nothing],
    bound: js.UndefOr[scala.Nothing],
    defaultParam: FlowTypeKind
  ): TypeParameter = js.native
  def apply(name: String, variance: js.UndefOr[scala.Nothing], bound: Null, defaultParam: FlowTypeKind): TypeParameter = js.native
  def apply(name: String, variance: js.UndefOr[scala.Nothing], bound: TypeAnnotationKind): TypeParameter = js.native
  def apply(
    name: String,
    variance: js.UndefOr[scala.Nothing],
    bound: TypeAnnotationKind,
    defaultParam: FlowTypeKind
  ): TypeParameter = js.native
  def apply(name: String, variance: Null, bound: js.UndefOr[scala.Nothing], defaultParam: FlowTypeKind): TypeParameter = js.native
  def apply(name: String, variance: Null, bound: Null, defaultParam: FlowTypeKind): TypeParameter = js.native
  def apply(name: String, variance: Null, bound: TypeAnnotationKind): TypeParameter = js.native
  def apply(name: String, variance: Null, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter = js.native
  def apply(name: String, variance: minus): TypeParameter = js.native
  def apply(name: String, variance: minus, bound: js.UndefOr[scala.Nothing], defaultParam: FlowTypeKind): TypeParameter = js.native
  def apply(name: String, variance: minus, bound: Null, defaultParam: FlowTypeKind): TypeParameter = js.native
  def apply(name: String, variance: minus, bound: TypeAnnotationKind): TypeParameter = js.native
  def apply(name: String, variance: minus, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter = js.native
  def apply(name: String, variance: plus): TypeParameter = js.native
  def apply(name: String, variance: plus, bound: js.UndefOr[scala.Nothing], defaultParam: FlowTypeKind): TypeParameter = js.native
  def apply(name: String, variance: plus, bound: Null, defaultParam: FlowTypeKind): TypeParameter = js.native
  def apply(name: String, variance: plus, bound: TypeAnnotationKind): TypeParameter = js.native
  def apply(name: String, variance: plus, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter = js.native
  def apply(name: String, variance: VarianceKind): TypeParameter = js.native
  def apply(name: String, variance: VarianceKind, bound: js.UndefOr[scala.Nothing], defaultParam: FlowTypeKind): TypeParameter = js.native
  def apply(name: String, variance: VarianceKind, bound: Null, defaultParam: FlowTypeKind): TypeParameter = js.native
  def apply(name: String, variance: VarianceKind, bound: TypeAnnotationKind): TypeParameter = js.native
  def apply(name: String, variance: VarianceKind, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter = js.native
  
  def from(params: Bound): TypeParameter = js.native
}
