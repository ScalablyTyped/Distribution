package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotRecommendationResults extends StObject {
  
  /**
    * The presigned url link of the associated transcript.
    */
  var associatedTranscriptsUrl: js.UndefOr[PresignedS3Url] = js.undefined
  
  /**
    * The presigned URL link of the recommended bot definition.
    */
  var botLocaleExportUrl: js.UndefOr[PresignedS3Url] = js.undefined
  
  /**
    * The statistical summary of the bot recommendation results.
    */
  var statistics: js.UndefOr[BotRecommendationResultStatistics] = js.undefined
}
object BotRecommendationResults {
  
  inline def apply(): BotRecommendationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BotRecommendationResults]
  }
  
  extension [Self <: BotRecommendationResults](x: Self) {
    
    inline def setAssociatedTranscriptsUrl(value: PresignedS3Url): Self = StObject.set(x, "associatedTranscriptsUrl", value.asInstanceOf[js.Any])
    
    inline def setAssociatedTranscriptsUrlUndefined: Self = StObject.set(x, "associatedTranscriptsUrl", js.undefined)
    
    inline def setBotLocaleExportUrl(value: PresignedS3Url): Self = StObject.set(x, "botLocaleExportUrl", value.asInstanceOf[js.Any])
    
    inline def setBotLocaleExportUrlUndefined: Self = StObject.set(x, "botLocaleExportUrl", js.undefined)
    
    inline def setStatistics(value: BotRecommendationResultStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
  }
}
