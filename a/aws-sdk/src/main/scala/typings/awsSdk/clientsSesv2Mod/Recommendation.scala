package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recommendation extends StObject {
  
  /**
    * The first time this issue was encountered and the recommendation was generated.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The recommendation description / disambiguator - e.g. DKIM1 and DKIM2 are different recommendations about your DKIM setup.
    */
  var Description: js.UndefOr[RecommendationDescription] = js.undefined
  
  /**
    * The recommendation impact, with values like HIGH or LOW.
    */
  var Impact: js.UndefOr[RecommendationImpact] = js.undefined
  
  /**
    * The last time the recommendation was updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The resource affected by the recommendation, with values like arn:aws:ses:us-east-1:123456789012:identity/example.com.
    */
  var ResourceArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The recommendation status, with values like OPEN or FIXED.
    */
  var Status: js.UndefOr[RecommendationStatus] = js.undefined
  
  /**
    * The recommendation type, with values like DKIM, SPF, DMARC or BIMI.
    */
  var Type: js.UndefOr[RecommendationType] = js.undefined
}
object Recommendation {
  
  inline def apply(): Recommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recommendation] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setDescription(value: RecommendationDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setImpact(value: RecommendationImpact): Self = StObject.set(x, "Impact", value.asInstanceOf[js.Any])
    
    inline def setImpactUndefined: Self = StObject.set(x, "Impact", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setStatus(value: RecommendationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: RecommendationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
