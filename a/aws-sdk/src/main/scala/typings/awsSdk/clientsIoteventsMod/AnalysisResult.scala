package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisResult extends StObject {
  
  /**
    * The severity level of the analysis result. Based on the severity level, analysis results fall into three general categories:    INFO - An information result tells you about a significant field in your detector model. This type of result usually doesn't require immediate action.    WARNING - A warning result draws special attention to fields that might cause issues for your detector model. We recommend that you review warnings and take necessary actions before you use your detector model in production environments. Otherwise, the detector model might not work as expected.    ERROR - An error result notifies you about a problem found in your detector model. You must fix all errors before you can publish your detector model.  
    */
  var level: js.UndefOr[AnalysisResultLevel] = js.undefined
  
  /**
    * Contains one or more locations that you can use to locate the fields in your detector model that the analysis result references.
    */
  var locations: js.UndefOr[AnalysisResultLocations] = js.undefined
  
  /**
    * Contains additional information about the analysis result.
    */
  var message: js.UndefOr[AnalysisMessage] = js.undefined
  
  /**
    * The type of the analysis result. Analyses fall into the following types based on the validators used to generate the analysis result:    supported-actions - You must specify AWS IoT Events supported actions that work with other AWS services in a supported AWS Region.    service-limits - Resources or API operations can't exceed service quotas (also known as limits). Update your detector model or request a quota increase.    structure - The detector model must follow a structure that AWS IoT Events supports.     expression-syntax - Your expression must follow the required syntax.    data-type - Data types referenced in the detector model must be compatible.    referenced-data - You must define the data referenced in your detector model before you can use the data.    referenced-resource - Resources that the detector model uses must be available.   For more information, see Running detector model analyses in the AWS IoT Events Developer Guide.
    */
  var `type`: js.UndefOr[AnalysisType] = js.undefined
}
object AnalysisResult {
  
  inline def apply(): AnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisResult] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: AnalysisResultLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLocations(value: AnalysisResultLocations): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: AnalysisResultLocation*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setMessage(value: AnalysisMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setType(value: AnalysisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
