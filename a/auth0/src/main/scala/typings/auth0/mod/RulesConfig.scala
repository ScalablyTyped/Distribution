package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesConfig extends StObject {
  
  /**
    * Key for a rules config variable.
    */
  var key: String
}
object RulesConfig {
  
  @scala.inline
  def apply(key: String): RulesConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesConfig]
  }
  
  @scala.inline
  implicit class RulesConfigMutableBuilder[Self <: RulesConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
