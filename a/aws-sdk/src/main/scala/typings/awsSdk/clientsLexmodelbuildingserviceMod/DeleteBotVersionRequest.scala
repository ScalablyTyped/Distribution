package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBotVersionRequest extends StObject {
  
  /**
    * The name of the bot.
    */
  var name: BotName
  
  /**
    * The version of the bot to delete. You cannot delete the $LATEST version of the bot. To delete the $LATEST version, use the DeleteBot operation.
    */
  var version: NumericalVersion
}
object DeleteBotVersionRequest {
  
  inline def apply(name: BotName, version: NumericalVersion): DeleteBotVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBotVersionRequest]
  }
  
  extension [Self <: DeleteBotVersionRequest](x: Self) {
    
    inline def setName(value: BotName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: NumericalVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
