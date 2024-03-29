package typings.astTypes.buildersMod

import typings.astTypes.anon.ElementTypes
import typings.astTypes.kindsMod.TSNamedTupleMemberKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSTupleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTupleTypeBuilder extends StObject {
  
  def apply(elementTypes: js.Array[TSTypeKind | TSNamedTupleMemberKind]): TSTupleType = js.native
  
  def from(params: ElementTypes): TSTupleType = js.native
}
