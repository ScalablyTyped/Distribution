package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSlotTypeRequest extends StObject {
  
  /**
    * The identifier of the bot associated with the slot type.
    */
  var botId: Id
  
  /**
    * The version of the bot associated with the slot type.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The identifier of the language and locale that the slot type will be deleted from. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * By default, the DeleteSlotType operations throws a ResourceInUseException exception if you try to delete a slot type used by a slot. Set the skipResourceInUseCheck parameter to true to skip this check and remove the slot type even if a slot uses it.
    */
  var skipResourceInUseCheck: js.UndefOr[SkipResourceInUseCheck] = js.undefined
  
  /**
    * The identifier of the slot type to delete.
    */
  var slotTypeId: Id
}
object DeleteSlotTypeRequest {
  
  inline def apply(botId: Id, botVersion: DraftBotVersion, localeId: LocaleId, slotTypeId: Id): DeleteSlotTypeRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], slotTypeId = slotTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSlotTypeRequest]
  }
  
  extension [Self <: DeleteSlotTypeRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setSkipResourceInUseCheck(value: SkipResourceInUseCheck): Self = StObject.set(x, "skipResourceInUseCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipResourceInUseCheckUndefined: Self = StObject.set(x, "skipResourceInUseCheck", js.undefined)
    
    inline def setSlotTypeId(value: Id): Self = StObject.set(x, "slotTypeId", value.asInstanceOf[js.Any])
  }
}
