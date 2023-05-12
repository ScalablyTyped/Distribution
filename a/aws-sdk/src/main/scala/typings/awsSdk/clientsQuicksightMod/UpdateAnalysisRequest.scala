package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAnalysisRequest extends StObject {
  
  /**
    * The ID for the analysis that you're updating. This ID displays in the URL of the analysis.
    */
  var AnalysisId: ShortRestrictiveResourceId
  
  /**
    * The ID of the Amazon Web Services account that contains the analysis that you're updating.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The definition of an analysis. A definition is the data model of all features in a Dashboard, Template, or Analysis.
    */
  var Definition: js.UndefOr[AnalysisDefinition] = js.undefined
  
  /**
    * A descriptive name for the analysis that you're updating. This name displays for the analysis in the Amazon QuickSight console.
    */
  var Name: AnalysisName
  
  /**
    * The parameter names and override values that you want to use. An analysis can have any parameter type, and some parameters might accept multiple values. 
    */
  var Parameters: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Parameters] = js.undefined
  
  /**
    * A source entity to use for the analysis that you're updating. This metadata structure contains details that describe a source template and one or more datasets.
    */
  var SourceEntity: js.UndefOr[AnalysisSourceEntity] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the theme to apply to the analysis that you're creating. To see the theme in the Amazon QuickSight console, make sure that you have access to it.
    */
  var ThemeArn: js.UndefOr[Arn] = js.undefined
}
object UpdateAnalysisRequest {
  
  inline def apply(AnalysisId: ShortRestrictiveResourceId, AwsAccountId: AwsAccountId, Name: AnalysisName): UpdateAnalysisRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnalysisRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAnalysisRequest] (val x: Self) extends AnyVal {
    
    inline def setAnalysisId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: AnalysisDefinition): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setName(value: AnalysisName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setSourceEntity(value: AnalysisSourceEntity): Self = StObject.set(x, "SourceEntity", value.asInstanceOf[js.Any])
    
    inline def setSourceEntityUndefined: Self = StObject.set(x, "SourceEntity", js.undefined)
    
    inline def setThemeArn(value: Arn): Self = StObject.set(x, "ThemeArn", value.asInstanceOf[js.Any])
    
    inline def setThemeArnUndefined: Self = StObject.set(x, "ThemeArn", js.undefined)
  }
}
