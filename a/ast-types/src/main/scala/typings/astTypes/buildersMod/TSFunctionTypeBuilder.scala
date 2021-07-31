package typings.astTypes.buildersMod

import typings.astTypes.anon.Parameters
import typings.astTypes.kindsMod.ArrayPatternKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.ObjectPatternKind
import typings.astTypes.kindsMod.RestElementKind
import typings.astTypes.namedTypesMod.namedTypes.TSFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSFunctionTypeBuilder extends StObject {
  
  def apply(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSFunctionType = js.native
  
  def from(params: Parameters): TSFunctionType = js.native
}
