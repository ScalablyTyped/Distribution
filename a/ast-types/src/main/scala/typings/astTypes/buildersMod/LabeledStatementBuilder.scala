package typings.astTypes.buildersMod

import typings.astTypes.anon.Label
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.LabeledStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabeledStatementBuilder extends StObject {
  
  def apply(label: IdentifierKind, body: StatementKind): LabeledStatement = js.native
  
  def from(params: Label): LabeledStatement = js.native
}
