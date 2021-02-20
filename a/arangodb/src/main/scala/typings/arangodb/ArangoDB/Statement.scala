package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Statement[T] extends StObject {
  
  def bind(name: String, value: js.Any): Unit = js.native
  
  def execute(): Cursor[T] = js.native
  
  def getBatchSize(): Double = js.native
  
  def setBatchSize(size: Double): Unit = js.native
}
object Statement {
  
  @scala.inline
  def apply[T](
    bind: (String, js.Any) => Unit,
    execute: () => Cursor[T],
    getBatchSize: () => Double,
    setBatchSize: Double => Unit
  ): Statement[T] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), execute = js.Any.fromFunction0(execute), getBatchSize = js.Any.fromFunction0(getBatchSize), setBatchSize = js.Any.fromFunction1(setBatchSize))
    __obj.asInstanceOf[Statement[T]]
  }
  
  @scala.inline
  implicit class StatementMutableBuilder[Self <: Statement[_], T] (val x: Self with Statement[T]) extends AnyVal {
    
    @scala.inline
    def setBind(value: (String, js.Any) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExecute(value: () => Cursor[T]): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBatchSize(value: () => Double): Self = StObject.set(x, "getBatchSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBatchSize(value: Double => Unit): Self = StObject.set(x, "setBatchSize", js.Any.fromFunction1(value))
  }
}
