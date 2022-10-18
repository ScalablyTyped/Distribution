package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recommendation extends StObject {
  
  /**
    * The recommended course of action to remediate the finding.
    */
  var text: js.UndefOr[RecommendationText] = js.undefined
  
  /**
    * The URL address to the CVE remediation recommendations.
    */
  var url: js.UndefOr[Url] = js.undefined
}
object Recommendation {
  
  inline def apply(): Recommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recommendation]
  }
  
  extension [Self <: Recommendation](x: Self) {
    
    inline def setText(value: RecommendationText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
