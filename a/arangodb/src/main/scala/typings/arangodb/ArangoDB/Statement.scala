package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statement[T] extends StObject {
  
  def bind(name: String, value: Any): Unit
  
  def execute(): Cursor[T]
  
  def getBatchSize(): Double
  
  def setBatchSize(size: Double): Unit
}
object Statement {
  
  inline def apply[T](
    bind: (String, Any) => Unit,
    execute: () => Cursor[T],
    getBatchSize: () => Double,
    setBatchSize: Double => Unit
  ): Statement[T] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), execute = js.Any.fromFunction0(execute), getBatchSize = js.Any.fromFunction0(getBatchSize), setBatchSize = js.Any.fromFunction1(setBatchSize))
    __obj.asInstanceOf[Statement[T]]
  }
  
  extension [Self <: Statement[?], T](x: Self & Statement[T]) {
    
    inline def setBind(value: (String, Any) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
    
    inline def setExecute(value: () => Cursor[T]): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    
    inline def setGetBatchSize(value: () => Double): Self = StObject.set(x, "getBatchSize", js.Any.fromFunction0(value))
    
    inline def setSetBatchSize(value: Double => Unit): Self = StObject.set(x, "setBatchSize", js.Any.fromFunction1(value))
  }
}
