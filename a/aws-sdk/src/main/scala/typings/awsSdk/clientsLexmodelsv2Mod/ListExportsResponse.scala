package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsResponse extends StObject {
  
  /**
    * The unique identifier assigned to the bot by Amazon Lex.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot that was exported.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * Summary information for the exports that meet the filter criteria specified in the request. The length of the list is specified in the maxResults parameter. If there are more exports available, the nextToken field contains a token to get the next page of results.
    */
  var exportSummaries: js.UndefOr[ExportSummaryList] = js.undefined
  
  /**
    * The locale specified in the request.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListExports operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListExports operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListExportsResponse {
  
  inline def apply(): ListExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExportsResponse] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setExportSummaries(value: ExportSummaryList): Self = StObject.set(x, "exportSummaries", value.asInstanceOf[js.Any])
    
    inline def setExportSummariesUndefined: Self = StObject.set(x, "exportSummaries", js.undefined)
    
    inline def setExportSummariesVarargs(value: ExportSummary*): Self = StObject.set(x, "exportSummaries", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
