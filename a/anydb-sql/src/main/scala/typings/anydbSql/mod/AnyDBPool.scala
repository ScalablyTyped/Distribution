package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyDBPool
  extends StObject
     with DatabaseConnection {
  
  def begin(): Transaction = js.native
  
  def close(err: js.Error): Unit = js.native
  
  def query(
    text: String,
    values: js.Array[Any],
    callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
  ): Unit = js.native
}
