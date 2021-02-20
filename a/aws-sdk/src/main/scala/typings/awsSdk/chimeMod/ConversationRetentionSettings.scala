package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversationRetentionSettings extends StObject {
  
  /**
    * The number of days for which to retain chat conversation messages.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.chimeMod.RetentionDays] = js.native
}
object ConversationRetentionSettings {
  
  @scala.inline
  def apply(): ConversationRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationRetentionSettings]
  }
  
  @scala.inline
  implicit class ConversationRetentionSettingsMutableBuilder[Self <: ConversationRetentionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetentionDays(value: RetentionDays): Self = StObject.set(x, "RetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionDaysUndefined: Self = StObject.set(x, "RetentionDays", js.undefined)
  }
}
