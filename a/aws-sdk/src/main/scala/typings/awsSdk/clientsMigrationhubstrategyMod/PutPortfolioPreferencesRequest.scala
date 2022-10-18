package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPortfolioPreferencesRequest extends StObject {
  
  /**
    *  The transformation preferences for non-database applications. 
    */
  var applicationPreferences: js.UndefOr[ApplicationPreferences] = js.undefined
  
  /**
    *  The transformation preferences for database applications. 
    */
  var databasePreferences: js.UndefOr[DatabasePreferences] = js.undefined
  
  /**
    *  The rank of the business goals based on priority. 
    */
  var prioritizeBusinessGoals: js.UndefOr[PrioritizeBusinessGoals] = js.undefined
}
object PutPortfolioPreferencesRequest {
  
  inline def apply(): PutPortfolioPreferencesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPortfolioPreferencesRequest]
  }
  
  extension [Self <: PutPortfolioPreferencesRequest](x: Self) {
    
    inline def setApplicationPreferences(value: ApplicationPreferences): Self = StObject.set(x, "applicationPreferences", value.asInstanceOf[js.Any])
    
    inline def setApplicationPreferencesUndefined: Self = StObject.set(x, "applicationPreferences", js.undefined)
    
    inline def setDatabasePreferences(value: DatabasePreferences): Self = StObject.set(x, "databasePreferences", value.asInstanceOf[js.Any])
    
    inline def setDatabasePreferencesUndefined: Self = StObject.set(x, "databasePreferences", js.undefined)
    
    inline def setPrioritizeBusinessGoals(value: PrioritizeBusinessGoals): Self = StObject.set(x, "prioritizeBusinessGoals", value.asInstanceOf[js.Any])
    
    inline def setPrioritizeBusinessGoalsUndefined: Self = StObject.set(x, "prioritizeBusinessGoals", js.undefined)
  }
}
