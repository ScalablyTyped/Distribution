package typings.atlassianConnectJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jql extends StObject {
  
  var jql: String
}
object Jql {
  
  inline def apply(jql: String): Jql = {
    val __obj = js.Dynamic.literal(jql = jql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jql]
  }
  
  extension [Self <: Jql](x: Self) {
    
    inline def setJql(value: String): Self = StObject.set(x, "jql", value.asInstanceOf[js.Any])
  }
}
