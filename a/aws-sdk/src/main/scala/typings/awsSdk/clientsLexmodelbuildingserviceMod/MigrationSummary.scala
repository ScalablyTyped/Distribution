package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationSummary extends StObject {
  
  /**
    * The unique identifier that Amazon Lex assigned to the migration.
    */
  var migrationId: js.UndefOr[MigrationId] = js.undefined
  
  /**
    * The status of the operation. When the status is COMPLETE the bot is available in Amazon Lex V2. There may be alerts and warnings that need to be resolved to complete the migration.
    */
  var migrationStatus: js.UndefOr[MigrationStatus] = js.undefined
  
  /**
    * The strategy used to conduct the migration.
    */
  var migrationStrategy: js.UndefOr[MigrationStrategy] = js.undefined
  
  /**
    * The date and time that the migration started.
    */
  var migrationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The locale of the Amazon Lex V1 bot that is the source of the migration.
    */
  var v1BotLocale: js.UndefOr[Locale] = js.undefined
  
  /**
    * The name of the Amazon Lex V1 bot that is the source of the migration.
    */
  var v1BotName: js.UndefOr[BotName] = js.undefined
  
  /**
    * The version of the Amazon Lex V1 bot that is the source of the migration.
    */
  var v1BotVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The unique identifier of the Amazon Lex V2 that is the destination of the migration.
    */
  var v2BotId: js.UndefOr[V2BotId] = js.undefined
  
  /**
    * The IAM role that Amazon Lex uses to run the Amazon Lex V2 bot.
    */
  var v2BotRole: js.UndefOr[IamRoleArn] = js.undefined
}
object MigrationSummary {
  
  inline def apply(): MigrationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationSummary]
  }
  
  extension [Self <: MigrationSummary](x: Self) {
    
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
