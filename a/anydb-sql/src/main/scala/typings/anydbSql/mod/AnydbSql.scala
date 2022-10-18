package typings.anydbSql.mod

import typings.anydbSql.anon.LOWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnydbSql
  extends StObject
     with DatabaseConnection {
  
  def allOf(tables: Table[Any]*): Any = js.native
  
  def begin(): Transaction = js.native
  
  def close(): Unit = js.native
  
  def define[T](map: TableDefinition): Table[T] = js.native
  
  def dialect(): String = js.native
  
  var functions: LOWER = js.native
  
  def getPool(): AnyDBPool = js.native
  
  def makeFunction(name: String): js.Function = js.native
  
  var models: Dictionary[Table[Any]] = js.native
  
  def open(): Unit = js.native
  
  def transaction[T](fn: js.Function1[/* tx */ Transaction, typings.bluebird.mod.^[T]]): typings.bluebird.mod.^[T] = js.native
}
