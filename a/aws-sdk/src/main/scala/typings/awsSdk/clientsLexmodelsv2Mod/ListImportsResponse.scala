package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsResponse extends StObject {
  
  /**
    * The unique identifier assigned by Amazon Lex to the bot.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot that was imported. It will always be DRAFT.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * Summary information for the imports that meet the filter criteria specified in the request. The length of the list is specified in the maxResults parameter. If there are more imports available, the nextToken field contains a token to get the next page of results.
    */
  var importSummaries: js.UndefOr[ImportSummaryList] = js.undefined
  
  /**
    * The locale specified in the request.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListImports operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListImports operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListImportsResponse {
  
  inline def apply(): ListImportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsResponse]
  }
  
  extension [Self <: ListImportsResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setImportSummaries(value: ImportSummaryList): Self = StObject.set(x, "importSummaries", value.asInstanceOf[js.Any])
    
    inline def setImportSummariesUndefined: Self = StObject.set(x, "importSummaries", js.undefined)
    
    inline def setImportSummariesVarargs(value: ImportSummary*): Self = StObject.set(x, "importSummaries", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
