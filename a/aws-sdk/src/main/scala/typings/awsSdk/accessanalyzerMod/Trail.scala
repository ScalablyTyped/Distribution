package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trail extends StObject {
  
  /**
    * Possible values are true or false. If set to true, IAM Access Analyzer retrieves CloudTrail data from all regions to analyze and generate a policy.
    */
  var allRegions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the ARN of the trail. The format of a trail ARN is arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail.
    */
  var cloudTrailArn: CloudTrailArn
  
  /**
    * A list of regions to get CloudTrail data from and analyze to generate a policy.
    */
  var regions: js.UndefOr[RegionList] = js.undefined
}
object Trail {
  
  inline def apply(cloudTrailArn: CloudTrailArn): Trail = {
    val __obj = js.Dynamic.literal(cloudTrailArn = cloudTrailArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trail]
  }
  
  extension [Self <: Trail](x: Self) {
    
    inline def setAllRegions(value: Boolean): Self = StObject.set(x, "allRegions", value.asInstanceOf[js.Any])
    
    inline def setAllRegionsUndefined: Self = StObject.set(x, "allRegions", js.undefined)
    
    inline def setCloudTrailArn(value: CloudTrailArn): Self = StObject.set(x, "cloudTrailArn", value.asInstanceOf[js.Any])
    
    inline def setRegions(value: RegionList): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
  }
}
