package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemediationRecommendation extends StObject {
  
  /**
    * The recommended course of action to remediate the finding.
    */
  var text: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A link to more information about the recommended remediation for this vulnerability.
    */
  var url: js.UndefOr[NonEmptyString] = js.undefined
}
object RemediationRecommendation {
  
  inline def apply(): RemediationRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationRecommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemediationRecommendation] (val x: Self) extends AnyVal {
    
    inline def setText(value: NonEmptyString): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUrl(value: NonEmptyString): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
