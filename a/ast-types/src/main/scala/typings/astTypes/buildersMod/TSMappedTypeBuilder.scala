package typings.astTypes.buildersMod

import typings.astTypes.anon.Readonly
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.kindsMod.TSTypeParameterKind
import typings.astTypes.namedTypesMod.namedTypes.TSMappedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSMappedTypeBuilder extends StObject {
  
  def apply(typeParameter: TSTypeParameterKind): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameterKind, typeAnnotation: TSTypeKind): TSMappedType = js.native
  
  def from(params: Readonly): TSMappedType = js.native
}
