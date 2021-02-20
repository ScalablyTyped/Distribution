package typings.atlassianConnectJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jql extends StObject {
  
  var jql: String = js.native
}
object Jql {
  
  @scala.inline
  def apply(jql: String): Jql = {
    val __obj = js.Dynamic.literal(jql = jql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jql]
  }
  
  @scala.inline
  implicit class JqlMutableBuilder[Self <: Jql] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJql(value: String): Self = StObject.set(x, "jql", value.asInstanceOf[js.Any])
  }
}
