package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlterQuery[T]
  extends StObject
     with Executable[Unit] {
  
  def addColumn(column: Column[Any]): AlterQuery[T] = js.native
  def addColumn(name: String, options: String): AlterQuery[T] = js.native
  
  def dropColumn(column: String): AlterQuery[T] = js.native
  def dropColumn(column: Column[Any]): AlterQuery[T] = js.native
  
  def rename(newName: String): AlterQuery[T] = js.native
  
  def renameColumn(column: Column[Any], newColumn: Column[Any]): AlterQuery[T] = js.native
  def renameColumn(column: Column[Any], newName: String): AlterQuery[T] = js.native
  def renameColumn(name: String, newName: String): AlterQuery[T] = js.native
}
