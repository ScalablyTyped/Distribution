package typings.astTypes.buildersMod

import typings.astTypes.anon.Predicate
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.DeclareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareFunctionBuilder extends StObject {
  
  def apply(id: IdentifierKind): DeclareFunction = js.native
  
  def from(params: Predicate): DeclareFunction = js.native
}
