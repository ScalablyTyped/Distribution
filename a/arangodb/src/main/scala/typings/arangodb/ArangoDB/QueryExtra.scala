package typings.arangodb.ArangoDB

import typings.arangodb.anon.ExecutionTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryExtra extends StObject {
  
  var stats: ExecutionTime = js.native
  
  var warnings: js.Array[String] = js.native
}
object QueryExtra {
  
  @scala.inline
  def apply(stats: ExecutionTime, warnings: js.Array[String]): QueryExtra = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExtra]
  }
  
  @scala.inline
  implicit class QueryExtraMutableBuilder[Self <: QueryExtra] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: ExecutionTime): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
