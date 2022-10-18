package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMigrationResponse extends StObject {
  
  /**
    * A list of alerts and warnings that indicate issues with the migration for the Amazon Lex V1 bot to Amazon Lex V2. You receive a warning when an Amazon Lex V1 feature has a different implementation if Amazon Lex V2. For more information, see Migrating a bot in the Amazon Lex V2 developer guide.
    */
  var alerts: js.UndefOr[MigrationAlerts] = js.undefined
  
  /**
    * The unique identifier of the migration. This is the same as the identifier used when calling the GetMigration operation.
    */
  var migrationId: js.UndefOr[MigrationId] = js.undefined
  
  /**
    * Indicates the status of the migration. When the status is COMPLETE the migration is finished and the bot is available in Amazon Lex V2. There may be alerts and warnings that need to be resolved to complete the migration.
    */
  var migrationStatus: js.UndefOr[MigrationStatus] = js.undefined
  
  /**
    * The strategy used to conduct the migration.    CREATE_NEW - Creates a new Amazon Lex V2 bot and migrates the Amazon Lex V1 bot to the new bot.    UPDATE_EXISTING - Overwrites the existing Amazon Lex V2 bot metadata and the locale being migrated. It doesn't change any other locales in the Amazon Lex V2 bot. If the locale doesn't exist, a new locale is created in the Amazon Lex V2 bot.  
    */
  var migrationStrategy: js.UndefOr[MigrationStrategy] = js.undefined
  
  /**
    * The date and time that the migration started.
    */
  var migrationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The locale of the Amazon Lex V1 bot migrated to Amazon Lex V2.
    */
  var v1BotLocale: js.UndefOr[Locale] = js.undefined
  
  /**
    * The name of the Amazon Lex V1 bot migrated to Amazon Lex V2.
    */
  var v1BotName: js.UndefOr[BotName] = js.undefined
  
  /**
    * The version of the Amazon Lex V1 bot migrated to Amazon Lex V2.
    */
  var v1BotVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The unique identifier of the Amazon Lex V2 bot that the Amazon Lex V1 is being migrated to.
    */
  var v2BotId: js.UndefOr[V2BotId] = js.undefined
  
  /**
    * The IAM role that Amazon Lex uses to run the Amazon Lex V2 bot.
    */
  var v2BotRole: js.UndefOr[IamRoleArn] = js.undefined
}
object GetMigrationResponse {
  
  inline def apply(): GetMigrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMigrationResponse]
  }
  
  extension [Self <: GetMigrationResponse](x: Self) {
    
    inline def setAlerts(value: MigrationAlerts): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    inline def setAlertsUndefined: Self = StObject.set(x, "alerts", js.undefined)
    
    inline def setAlertsVarargs(value: MigrationAlert*): Self = StObject.set(x, "alerts", js.Array(value*))
    
    inline def setMigrationId(value: MigrationId): Self = StObject.set(x, "migrationId", value.asInstanceOf[js.Any])
    
    inline def setMigrationIdUndefined: Self = StObject.set(x, "migrationId", js.undefined)
    
    inline def setMigrationStatus(value: MigrationStatus): Self = StObject.set(x, "migrationStatus", value.asInstanceOf[js.Any])
    
    inline def setMigrationStatusUndefined: Self = StObject.set(x, "migrationStatus", js.undefined)
    
    inline def setMigrationStrategy(value: MigrationStrategy): Self = StObject.set(x, "migrationStrategy", value.asInstanceOf[js.Any])
    
    inline def setMigrationStrategyUndefined: Self = StObject.set(x, "migrationStrategy", js.undefined)
    
    inline def setMigrationTimestamp(value: js.Date): Self = StObject.set(x, "migrationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setMigrationTimestampUndefined: Self = StObject.set(x, "migrationTimestamp", js.undefined)
    
    inline def setV1BotLocale(value: Locale): Self = StObject.set(x, "v1BotLocale", value.asInstanceOf[js.Any])
    
    inline def setV1BotLocaleUndefined: Self = StObject.set(x, "v1BotLocale", js.undefined)
    
    inline def setV1BotName(value: BotName): Self = StObject.set(x, "v1BotName", value.asInstanceOf[js.Any])
    
    inline def setV1BotNameUndefined: Self = StObject.set(x, "v1BotName", js.undefined)
    
    inline def setV1BotVersion(value: Version): Self = StObject.set(x, "v1BotVersion", value.asInstanceOf[js.Any])
    
    inline def setV1BotVersionUndefined: Self = StObject.set(x, "v1BotVersion", js.undefined)
    
    inline def setV2BotId(value: V2BotId): Self = StObject.set(x, "v2BotId", value.asInstanceOf[js.Any])
    
    inline def setV2BotIdUndefined: Self = StObject.set(x, "v2BotId", js.undefined)
    
    inline def setV2BotRole(value: IamRoleArn): Self = StObject.set(x, "v2BotRole", value.asInstanceOf[js.Any])
    
    inline def setV2BotRoleUndefined: Self = StObject.set(x, "v2BotRole", js.undefined)
  }
}
