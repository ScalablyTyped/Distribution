package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhancedImageScanFinding extends StObject {
  
  /**
    * The Amazon Web Services account ID associated with the image.
    */
  var awsAccountId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[FindingDescription] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the finding.
    */
  var findingArn: js.UndefOr[FindingArn] = js.undefined
  
  /**
    * The date and time that the finding was first observed.
    */
  var firstObservedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the finding was last observed.
    */
  var lastObservedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An object that contains the details of a package vulnerability finding.
    */
  var packageVulnerabilityDetails: js.UndefOr[PackageVulnerabilityDetails] = js.undefined
  
  /**
    * An object that contains the details about how to remediate a finding.
    */
  var remediation: js.UndefOr[Remediation] = js.undefined
  
  /**
    * Contains information on the resources involved in a finding.
    */
  var resources: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The Amazon Inspector score given to the finding.
    */
  var score: js.UndefOr[Score] = js.undefined
  
  /**
    * An object that contains details of the Amazon Inspector score.
    */
  var scoreDetails: js.UndefOr[ScoreDetails] = js.undefined
  
  /**
    * The severity of the finding.
    */
  var severity: js.UndefOr[Severity] = js.undefined
  
  /**
    * The status of the finding.
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The title of the finding.
    */
  var title: js.UndefOr[Title] = js.undefined
  
  /**
    * The type of the finding.
    */
  var `type`: js.UndefOr[Type] = js.undefined
  
  /**
    * The date and time the finding was last updated at.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object EnhancedImageScanFinding {
  
  inline def apply(): EnhancedImageScanFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedImageScanFinding]
  }
  
  extension [Self <: EnhancedImageScanFinding](x: Self) {
    
    inline def setAwsAccountId(value: RegistryId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setDescription(value: FindingDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFindingArn(value: FindingArn): Self = StObject.set(x, "findingArn", value.asInstanceOf[js.Any])
    
    inline def setFindingArnUndefined: Self = StObject.set(x, "findingArn", js.undefined)
    
    inline def setFirstObservedAt(value: js.Date): Self = StObject.set(x, "firstObservedAt", value.asInstanceOf[js.Any])
    
    inline def setFirstObservedAtUndefined: Self = StObject.set(x, "firstObservedAt", js.undefined)
    
    inline def setLastObservedAt(value: js.Date): Self = StObject.set(x, "lastObservedAt", value.asInstanceOf[js.Any])
    
    inline def setLastObservedAtUndefined: Self = StObject.set(x, "lastObservedAt", js.undefined)
    
    inline def setPackageVulnerabilityDetails(value: PackageVulnerabilityDetails): Self = StObject.set(x, "packageVulnerabilityDetails", value.asInstanceOf[js.Any])
    
    inline def setPackageVulnerabilityDetailsUndefined: Self = StObject.set(x, "packageVulnerabilityDetails", js.undefined)
    
    inline def setRemediation(value: Remediation): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    inline def setResources(value: ResourceList): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setScore(value: Score): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreDetails(value: ScoreDetails): Self = StObject.set(x, "scoreDetails", value.asInstanceOf[js.Any])
    
    inline def setScoreDetailsUndefined: Self = StObject.set(x, "scoreDetails", js.undefined)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
