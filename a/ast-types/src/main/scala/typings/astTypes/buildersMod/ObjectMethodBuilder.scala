package typings.astTypes.buildersMod

import typings.astTypes.anon.ReturnType
import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.method
import typings.astTypes.astTypesStrings.set
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.ObjectMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectMethodBuilder extends StObject {
  
  def apply(kind: get, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: get,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: get, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: get,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: get, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: get,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: method, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: method,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: method, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: method,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: method, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: method,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: set, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: set,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: set, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: set,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: set, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: set,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  
  def from(params: ReturnType): ObjectMethod = js.native
}
