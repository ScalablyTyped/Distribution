package typings.astTypes.buildersMod

import typings.astTypes.anon.Parameter
import typings.astTypes.kindsMod.AssignmentPatternKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSParameterPropertyBuilder extends StObject {
  
  def apply(parameter: AssignmentPatternKind): TSParameterProperty = js.native
  def apply(parameter: IdentifierKind): TSParameterProperty = js.native
  
  def from(params: Parameter): TSParameterProperty = js.native
}
