package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverCondition extends StObject {
  
  /**
    * Failover condition type-specific settings.
    */
  var FailoverConditionSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.FailoverConditionSettings] = js.undefined
}
object FailoverCondition {
  
  inline def apply(): FailoverCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailoverCondition] (val x: Self) extends AnyVal {
    
    inline def setFailoverConditionSettings(value: FailoverConditionSettings): Self = StObject.set(x, "FailoverConditionSettings", value.asInstanceOf[js.Any])
    
    inline def setFailoverConditionSettingsUndefined: Self = StObject.set(x, "FailoverConditionSettings", js.undefined)
  }
}
