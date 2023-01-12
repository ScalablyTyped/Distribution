package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMigrationRequest extends StObject {
  
  /**
    * The strategy used to conduct the migration.    CREATE_NEW - Creates a new Amazon Lex V2 bot and migrates the Amazon Lex V1 bot to the new bot.    UPDATE_EXISTING - Overwrites the existing Amazon Lex V2 bot metadata and the locale being migrated. It doesn't change any other locales in the Amazon Lex V2 bot. If the locale doesn't exist, a new locale is created in the Amazon Lex V2 bot.  
    */
  var migrationStrategy: MigrationStrategy
  
  /**
    * The name of the Amazon Lex V1 bot that you are migrating to Amazon Lex V2.
    */
  var v1BotName: BotName
  
  /**
    * The version of the bot to migrate to Amazon Lex V2. You can migrate the $LATEST version as well as any numbered version.
    */
  var v1BotVersion: Version
  
  /**
    * The name of the Amazon Lex V2 bot that you are migrating the Amazon Lex V1 bot to.    If the Amazon Lex V2 bot doesn't exist, you must use the CREATE_NEW migration strategy.   If the Amazon Lex V2 bot exists, you must use the UPDATE_EXISTING migration strategy to change the contents of the Amazon Lex V2 bot.  
    */
  var v2BotName: V2BotName
  
  /**
    * The IAM role that Amazon Lex uses to run the Amazon Lex V2 bot.
    */
  var v2BotRole: IamRoleArn
}
object StartMigrationRequest {
  
  inline def apply(
    migrationStrategy: MigrationStrategy,
    v1BotName: BotName,
    v1BotVersion: Version,
    v2BotName: V2BotName,
    v2BotRole: IamRoleArn
  ): StartMigrationRequest = {
    val __obj = js.Dynamic.literal(migrationStrategy = migrationStrategy.asInstanceOf[js.Any], v1BotName = v1BotName.asInstanceOf[js.Any], v1BotVersion = v1BotVersion.asInstanceOf[js.Any], v2BotName = v2BotName.asInstanceOf[js.Any], v2BotRole = v2BotRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMigrationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartMigrationRequest] (val x: Self) extends AnyVal {
    
    inline def setMigrationStrategy(value: MigrationStrategy): Self = StObject.set(x, "migrationStrategy", value.asInstanceOf[js.Any])
    
    inline def setV1BotName(value: BotName): Self = StObject.set(x, "v1BotName", value.asInstanceOf[js.Any])
    
    inline def setV1BotVersion(value: Version): Self = StObject.set(x, "v1BotVersion", value.asInstanceOf[js.Any])
    
    inline def setV2BotName(value: V2BotName): Self = StObject.set(x, "v2BotName", value.asInstanceOf[js.Any])
    
    inline def setV2BotRole(value: IamRoleArn): Self = StObject.set(x, "v2BotRole", value.asInstanceOf[js.Any])
  }
}
