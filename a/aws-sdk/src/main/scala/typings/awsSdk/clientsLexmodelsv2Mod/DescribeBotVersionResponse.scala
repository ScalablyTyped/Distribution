package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBotVersionResponse extends StObject {
  
  /**
    * The identifier of the bot that contains the version.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the bot that contains the version.
    */
  var botName: js.UndefOr[Name] = js.undefined
  
  /**
    * The current status of the bot. When the status is Available, the bot version is ready for use.
    */
  var botStatus: js.UndefOr[BotStatus] = js.undefined
  
  /**
    * The version of the bot to describe.
    */
  var botVersion: js.UndefOr[NumericalBotVersion] = js.undefined
  
  /**
    * A timestamp of the date and time that the bot version was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Data privacy settings for the bot version.
    */
  var dataPrivacy: js.UndefOr[DataPrivacy] = js.undefined
  
  /**
    * The description specified for the bot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * If the botStatus is Failed, this contains a list of reasons that the version couldn't be built.
    */
  var failureReasons: js.UndefOr[FailureReasons] = js.undefined
  
  /**
    * The number of seconds that a session with the bot remains active before it is discarded by Amazon Lex.
    */
  var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot version.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object DescribeBotVersionResponse {
  
  inline def apply(): DescribeBotVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBotVersionResponse]
  }
  
  extension [Self <: DescribeBotVersionResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotName(value: Name): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    inline def setBotStatus(value: BotStatus): Self = StObject.set(x, "botStatus", value.asInstanceOf[js.Any])
    
    inline def setBotStatusUndefined: Self = StObject.set(x, "botStatus", js.undefined)
    
    inline def setBotVersion(value: NumericalBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDataPrivacy(value: DataPrivacy): Self = StObject.set(x, "dataPrivacy", value.asInstanceOf[js.Any])
    
    inline def setDataPrivacyUndefined: Self = StObject.set(x, "dataPrivacy", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFailureReasons(value: FailureReasons): Self = StObject.set(x, "failureReasons", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonsUndefined: Self = StObject.set(x, "failureReasons", js.undefined)
    
    inline def setFailureReasonsVarargs(value: FailureReason*): Self = StObject.set(x, "failureReasons", js.Array(value*))
    
    inline def setIdleSessionTTLInSeconds(value: SessionTTL): Self = StObject.set(x, "idleSessionTTLInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIdleSessionTTLInSecondsUndefined: Self = StObject.set(x, "idleSessionTTLInSeconds", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
