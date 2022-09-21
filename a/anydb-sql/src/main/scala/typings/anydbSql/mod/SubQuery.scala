package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubQuery[T] extends StObject {
  
  def exists(): BinaryNode = js.native
  
  def from(statement: String): SubQuery[T] = js.native
  def from(table: TableNode): SubQuery[T] = js.native
  
  def group(nodes: Any*): GroupSubQuery[T] = js.native
  @JSName("group")
  def group_Group(nodes: Any*): Group[SubQuery[T]] = js.native
  
  def notExists(): BinaryNode = js.native
  def notExists(subQuery: SubQuery[Any]): BinaryNode = js.native
  
  def order(criteria: OrderByValueNode): SubQuery[T] = js.native
  
  def select(nodes: Any*): SubQuery[T] = js.native
  def select(node: Column[T]): SubQuery[T] = js.native
  
  def where(nodes: Any*): SubQuery[T] = js.native
}
