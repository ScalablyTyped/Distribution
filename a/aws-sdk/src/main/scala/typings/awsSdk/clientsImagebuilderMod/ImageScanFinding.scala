package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageScanFinding extends StObject {
  
  /**
    * The Amazon Web Services account ID that's associated with the finding.
    */
  var awsAccountId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date and time when the finding was first observed.
    */
  var firstObservedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Details about whether a fix is available for any of the packages that are identified in the finding through a version update.
    */
  var fixAvailable: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the image build version that's associated with the finding.
    */
  var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that's associated with the finding.
    */
  var imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.undefined
  
  /**
    * The score that Amazon Inspector assigned for the finding.
    */
  var inspectorScore: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * An object that contains details of the Amazon Inspector score.
    */
  var inspectorScoreDetails: js.UndefOr[InspectorScoreDetails] = js.undefined
  
  /**
    * An object that contains the details of a package vulnerability finding.
    */
  var packageVulnerabilityDetails: js.UndefOr[PackageVulnerabilityDetails] = js.undefined
  
  /**
    * An object that contains the details about how to remediate the finding.
    */
  var remediation: js.UndefOr[Remediation] = js.undefined
  
  /**
    * The severity of the finding.
    */
  var severity: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The title of the finding.
    */
  var title: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of the finding. Image Builder looks for findings of the type PACKAGE_VULNERABILITY that apply to output images, and excludes other types.
    */
  var `type`: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The timestamp when the finding was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object ImageScanFinding {
  
  inline def apply(): ImageScanFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageScanFinding] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: NonEmptyString): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFirstObservedAt(value: js.Date): Self = StObject.set(x, "firstObservedAt", value.asInstanceOf[js.Any])
    
    inline def setFirstObservedAtUndefined: Self = StObject.set(x, "firstObservedAt", js.undefined)
    
    inline def setFixAvailable(value: NonEmptyString): Self = StObject.set(x, "fixAvailable", value.asInstanceOf[js.Any])
    
    inline def setFixAvailableUndefined: Self = StObject.set(x, "fixAvailable", js.undefined)
    
    inline def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageBuildVersionArnUndefined: Self = StObject.set(x, "imageBuildVersionArn", js.undefined)
    
    inline def setImagePipelineArn(value: ImagePipelineArn): Self = StObject.set(x, "imagePipelineArn", value.asInstanceOf[js.Any])
    
    inline def setImagePipelineArnUndefined: Self = StObject.set(x, "imagePipelineArn", js.undefined)
    
    inline def setInspectorScore(value: NonNegativeDouble): Self = StObject.set(x, "inspectorScore", value.asInstanceOf[js.Any])
    
    inline def setInspectorScoreDetails(value: InspectorScoreDetails): Self = StObject.set(x, "inspectorScoreDetails", value.asInstanceOf[js.Any])
    
    inline def setInspectorScoreDetailsUndefined: Self = StObject.set(x, "inspectorScoreDetails", js.undefined)
    
    inline def setInspectorScoreUndefined: Self = StObject.set(x, "inspectorScore", js.undefined)
    
    inline def setPackageVulnerabilityDetails(value: PackageVulnerabilityDetails): Self = StObject.set(x, "packageVulnerabilityDetails", value.asInstanceOf[js.Any])
    
    inline def setPackageVulnerabilityDetailsUndefined: Self = StObject.set(x, "packageVulnerabilityDetails", js.undefined)
    
    inline def setRemediation(value: Remediation): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    inline def setSeverity(value: NonEmptyString): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setTitle(value: NonEmptyString): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
