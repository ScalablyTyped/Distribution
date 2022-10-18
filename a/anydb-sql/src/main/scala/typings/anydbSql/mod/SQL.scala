package typings.anydbSql.mod

import typings.anydbSql.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SQL extends StObject {
  
  var functions: `0`
}
object SQL {
  
  inline def apply(functions: `0`): SQL = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQL]
  }
  
  extension [Self <: SQL](x: Self) {
    
    inline def setFunctions(value: `0`): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
  }
}
