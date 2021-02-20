package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsId
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.DeclareVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareVariableBuilder extends StObject {
  
  def apply(id: IdentifierKind): DeclareVariable = js.native
  
  def from(params: CommentsId): DeclareVariable = js.native
}
