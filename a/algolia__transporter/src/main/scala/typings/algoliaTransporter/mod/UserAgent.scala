package typings.algoliaTransporter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgent extends StObject {
  
  /**
    * Mutates the current user agent ading the given user agent options.
    */
  def add(options: UserAgentOptions): UserAgent
  
  /**
    * The raw value of the user agent.
    *
    * @readonly
    */
  var value: String
}
object UserAgent {
  
  inline def apply(add: UserAgentOptions => UserAgent, value: String): UserAgent = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserAgent] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: UserAgentOptions => UserAgent): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
