package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMigrationsResponse extends StObject {
  
  /**
    * An array of summaries for migrations from Amazon Lex V1 to Amazon Lex V2. To see details of the migration, use the migrationId from the summary in a call to the operation.
    */
  var migrationSummaries: js.UndefOr[MigrationSummaryList] = js.undefined
  
  /**
    * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch the next page of migrations.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetMigrationsResponse {
  
  inline def apply(): GetMigrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMigrationsResponse]
  }
  
  extension [Self <: GetMigrationsResponse](x: Self) {
    
    inline def setMigrationSummaries(value: MigrationSummaryList): Self = StObject.set(x, "migrationSummaries", value.asInstanceOf[js.Any])
    
    inline def setMigrationSummariesUndefined: Self = StObject.set(x, "migrationSummaries", js.undefined)
    
    inline def setMigrationSummariesVarargs(value: MigrationSummary*): Self = StObject.set(x, "migrationSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
