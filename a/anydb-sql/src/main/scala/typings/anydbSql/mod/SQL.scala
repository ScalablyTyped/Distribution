package typings.anydbSql.mod

import typings.anydbSql.anon.LOWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SQL extends StObject {
  
  var functions: LOWER
}
object SQL {
  
  inline def apply(functions: LOWER): SQL = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SQL] (val x: Self) extends AnyVal {
    
    inline def setFunctions(value: LOWER): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
  }
}
