package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotAliasLocaleSettings extends StObject {
  
  /**
    * Specifies the Lambda function that should be used in the locale.
    */
  var codeHookSpecification: js.UndefOr[CodeHookSpecification] = js.undefined
  
  /**
    * Determines whether the locale is enabled for the bot. If the value is false, the locale isn't available for use.
    */
  var enabled: Boolean
}
object BotAliasLocaleSettings {
  
  inline def apply(enabled: Boolean): BotAliasLocaleSettings = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotAliasLocaleSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BotAliasLocaleSettings] (val x: Self) extends AnyVal {
    
    inline def setCodeHookSpecification(value: CodeHookSpecification): Self = StObject.set(x, "codeHookSpecification", value.asInstanceOf[js.Any])
    
    inline def setCodeHookSpecificationUndefined: Self = StObject.set(x, "codeHookSpecification", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
