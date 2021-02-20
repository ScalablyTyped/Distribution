package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesConfigData extends StObject {
  
  /**
    * Value for a rules config variable.
    */
  var value: String = js.native
}
object RulesConfigData {
  
  @scala.inline
  def apply(value: String): RulesConfigData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesConfigData]
  }
  
  @scala.inline
  implicit class RulesConfigDataMutableBuilder[Self <: RulesConfigData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
