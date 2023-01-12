package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationRetentionSettings extends StObject {
  
  /**
    * The number of days for which to retain conversation messages.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.clientsChimeMod.RetentionDays] = js.undefined
}
object ConversationRetentionSettings {
  
  inline def apply(): ConversationRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationRetentionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConversationRetentionSettings] (val x: Self) extends AnyVal {
    
    inline def setRetentionDays(value: RetentionDays): Self = StObject.set(x, "RetentionDays", value.asInstanceOf[js.Any])
    
    inline def setRetentionDaysUndefined: Self = StObject.set(x, "RetentionDays", js.undefined)
  }
}
