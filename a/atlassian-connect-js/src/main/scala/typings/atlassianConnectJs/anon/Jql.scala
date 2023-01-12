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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Jql] (val x: Self) extends AnyVal {
    
    inline def setJql(value: String): Self = StObject.set(x, "jql", value.asInstanceOf[js.Any])
  }
}
