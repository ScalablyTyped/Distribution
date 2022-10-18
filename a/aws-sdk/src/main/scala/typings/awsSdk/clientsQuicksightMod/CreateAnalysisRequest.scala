package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnalysisRequest extends StObject {
  
  /**
    * The ID for the analysis that you're creating. This ID displays in the URL of the analysis.
    */
  var AnalysisId: RestrictiveResourceId
  
  /**
    * The ID of the Amazon Web Services account where you are creating an analysis.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * A descriptive name for the analysis that you're creating. This name displays for the analysis in the Amazon QuickSight console. 
    */
  var Name: AnalysisName
  
  /**
    * The parameter names and override values that you want to use. An analysis can have any parameter type, and some parameters might accept multiple values. 
    */
  var Parameters: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Parameters] = js.undefined
  
  /**
    * A structure that describes the principals and the resource-level permissions on an analysis. You can use the Permissions structure to grant permissions by providing a list of Identity and Access Management (IAM) action information for each principal listed by Amazon Resource Name (ARN).  To specify no permissions, omit Permissions.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.undefined
  
  /**
    * A source entity to use for the analysis that you're creating. This metadata structure contains details that describe a source template and one or more datasets.
    */
  var SourceEntity: AnalysisSourceEntity
  
  /**
    * Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ARN for the theme to apply to the analysis that you're creating. To see the theme in the Amazon QuickSight console, make sure that you have access to it.
    */
  var ThemeArn: js.UndefOr[Arn] = js.undefined
}
object CreateAnalysisRequest {
  
  inline def apply(
    AnalysisId: RestrictiveResourceId,
    AwsAccountId: AwsAccountId,
    Name: AnalysisName,
    SourceEntity: AnalysisSourceEntity
  ): CreateAnalysisRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceEntity = SourceEntity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnalysisRequest]
  }
  
  extension [Self <: CreateAnalysisRequest](x: Self) {
    
    inline def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setName(value: AnalysisName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setPermissions(value: ResourcePermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setSourceEntity(value: AnalysisSourceEntity): Self = StObject.set(x, "SourceEntity", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setThemeArn(value: Arn): Self = StObject.set(x, "ThemeArn", value.asInstanceOf[js.Any])
    
    inline def setThemeArnUndefined: Self = StObject.set(x, "ThemeArn", js.undefined)
  }
}
