package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsagePlanKey extends StObject {
  
  /**
    * The Id of a usage plan key.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The name of a usage plan key.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of a usage plan key. Currently, the valid key type is API_KEY.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The value of a usage plan key.
    */
  var value: js.UndefOr[String] = js.native
}
object UsagePlanKey {
  
  @scala.inline
  def apply(): UsagePlanKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlanKey]
  }
  
  @scala.inline
  implicit class UsagePlanKeyMutableBuilder[Self <: UsagePlanKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
