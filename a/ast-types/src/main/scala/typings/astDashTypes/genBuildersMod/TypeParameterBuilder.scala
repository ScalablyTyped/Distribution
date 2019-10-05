package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Bound
import typings.astDashTypes.astDashTypesStrings.minus
import typings.astDashTypes.astDashTypesStrings.plus
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import typings.astDashTypes.genKindsMod.VarianceKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameterBuilder extends js.Object {
  def apply(name: String): TypeParameter = js.native
  def apply(name: String, variance: Null, bound: TypeAnnotationKind): TypeParameter = js.native
  def apply(name: String, variance: minus): TypeParameter = js.native
  def apply(name: String, variance: minus, bound: TypeAnnotationKind): TypeParameter = js.native
  def apply(name: String, variance: plus): TypeParameter = js.native
  def apply(name: String, variance: plus, bound: TypeAnnotationKind): TypeParameter = js.native
  def apply(name: String, variance: VarianceKind): TypeParameter = js.native
  def apply(name: String, variance: VarianceKind, bound: TypeAnnotationKind): TypeParameter = js.native
  def from(params: Anon_Bound): TypeParameter = js.native
}

