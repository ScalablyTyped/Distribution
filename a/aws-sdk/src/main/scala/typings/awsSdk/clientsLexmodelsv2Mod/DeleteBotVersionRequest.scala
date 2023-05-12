package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBotVersionRequest extends StObject {
  
  /**
    * The identifier of the bot that contains the version.
    */
  var botId: Id
  
  /**
    * The version of the bot to delete.
    */
  var botVersion: NumericalBotVersion
  
  /**
    * By default, Amazon Lex checks if any other resource, such as an alias or bot network, is using the bot version before it is deleted and throws a ResourceInUseException exception if the version is being used by another resource. Set this parameter to true to skip this check and remove the version even if it is being used by another resource.
    */
  var skipResourceInUseCheck: js.UndefOr[SkipResourceInUseCheck] = js.undefined
}
object DeleteBotVersionRequest {
  
  inline def apply(botId: Id, botVersion: NumericalBotVersion): DeleteBotVersionRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBotVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBotVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: NumericalBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setSkipResourceInUseCheck(value: SkipResourceInUseCheck): Self = StObject.set(x, "skipResourceInUseCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipResourceInUseCheckUndefined: Self = StObject.set(x, "skipResourceInUseCheck", js.undefined)
  }
}
