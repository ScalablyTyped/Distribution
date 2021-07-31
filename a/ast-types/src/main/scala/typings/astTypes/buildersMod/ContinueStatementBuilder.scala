package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsLabel
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ContinueStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueStatementBuilder extends StObject {
  
  def apply(): ContinueStatement = js.native
  def apply(label: IdentifierKind): ContinueStatement = js.native
  
  def from(params: CommentsLabel): ContinueStatement = js.native
}
