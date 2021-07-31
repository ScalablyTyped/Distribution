package typings.astTypes.buildersMod

import typings.astTypes.anon.Directives
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.BlockStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockStatementBuilder extends StObject {
  
  def apply(body: js.Array[StatementKind]): BlockStatement = js.native
  
  def from(params: Directives): BlockStatement = js.native
}
