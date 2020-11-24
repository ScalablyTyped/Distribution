package typings.astTypes.buildersMod

import typings.astTypes.anon.TypeParameter
import typings.astTypes.kindsMod.TSTypeParameterKind
import typings.astTypes.namedTypesMod.namedTypes.TSInferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSInferTypeBuilder extends js.Object {
  
  def apply(typeParameter: TSTypeParameterKind): TSInferType = js.native
  
  def from(params: TypeParameter): TSInferType = js.native
}
