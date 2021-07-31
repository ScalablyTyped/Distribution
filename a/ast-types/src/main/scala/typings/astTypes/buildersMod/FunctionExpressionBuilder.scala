package typings.astTypes.buildersMod

import typings.astTypes.anon.Defaults
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.FunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionExpressionBuilder extends StObject {
  
  def apply(id: Null, params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def apply(id: Null, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionExpression = js.native
  def apply(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  def apply(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Unit,
    expression: Boolean
  ): FunctionExpression = js.native
  def apply(id: Unit, params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def apply(id: Unit, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionExpression = js.native
  def apply(
    id: Unit,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  def apply(
    id: Unit,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Unit,
    expression: Boolean
  ): FunctionExpression = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionExpression = js.native
  def apply(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  def apply(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Unit,
    expression: Boolean
  ): FunctionExpression = js.native
  
  def from(params: Defaults): FunctionExpression = js.native
}
