package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLCandidateGenerationConfig extends StObject {
  
  /**
    * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot job. You can input FeatureAttributeNames (optional) in JSON format as shown below:   { "FeatureAttributeNames":["col1", "col2", ...] }. You can also specify the data type of the feature (optional) in the format shown below:  { "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }   These column keys may not include the target column.  In ensembling mode, Autopilot will only support the following data types: numeric, categorical, text and datetime. In HPO mode, Autopilot can support numeric, categorical, text, datetime and sequence. If only FeatureDataTypes is provided, the column keys (col1, col2,..) should be a subset of the column names in the input data.  If both FeatureDataTypes and FeatureAttributeNames are provided, then the column keys should be a subset of the column names provided in FeatureAttributeNames.  The key name FeatureAttributeNames is fixed. The values listed in ["col1", "col2", ...] is case sensitive and should be a list of strings containing unique values that are a subset of the column names in the input data. The list of columns provided must not include the target column.
    */
  var FeatureSpecificationS3Uri: js.UndefOr[S3Uri] = js.undefined
}
object AutoMLCandidateGenerationConfig {
  
  inline def apply(): AutoMLCandidateGenerationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLCandidateGenerationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoMLCandidateGenerationConfig] (val x: Self) extends AnyVal {
    
    inline def setFeatureSpecificationS3Uri(value: S3Uri): Self = StObject.set(x, "FeatureSpecificationS3Uri", value.asInstanceOf[js.Any])
    
    inline def setFeatureSpecificationS3UriUndefined: Self = StObject.set(x, "FeatureSpecificationS3Uri", js.undefined)
  }
}
