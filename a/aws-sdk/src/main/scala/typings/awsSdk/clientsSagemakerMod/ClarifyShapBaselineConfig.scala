package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClarifyShapBaselineConfig extends StObject {
  
  /**
    * The MIME type of the baseline data. Choose from 'text/csv' or 'application/jsonlines'. Defaults to 'text/csv'.
    */
  var MimeType: js.UndefOr[ClarifyMimeType] = js.undefined
  
  /**
    * The inline SHAP baseline data in string format. ShapBaseline can have one or multiple records to be used as the baseline dataset. The format of the SHAP baseline file should be the same format as the training dataset. For example, if the training dataset is in CSV format and each record contains four features, and all features are numerical, then the format of the baseline data should also share these characteristics. For natural language processing (NLP) of text columns, the baseline value should be the value used to replace the unit of text specified by the Granularity of the TextConfig parameter. The size limit for ShapBasline is 4 KB. Use the ShapBaselineUri parameter if you want to provide more than 4 KB of baseline data.
    */
  var ShapBaseline: js.UndefOr[ClarifyShapBaseline] = js.undefined
  
  /**
    * The uniform resource identifier (URI) of the S3 bucket where the SHAP baseline file is stored. The format of the SHAP baseline file should be the same format as the format of the training dataset. For example, if the training dataset is in CSV format, and each record in the training dataset has four features, and all features are numerical, then the baseline file should also have this same format. Each record should contain only the features. If you are using a virtual private cloud (VPC), the ShapBaselineUri should be accessible to the VPC. For more information about setting up endpoints with Amazon Virtual Private Cloud, see Give SageMaker access to Resources in your Amazon Virtual Private Cloud.
    */
  var ShapBaselineUri: js.UndefOr[Url] = js.undefined
}
object ClarifyShapBaselineConfig {
  
  inline def apply(): ClarifyShapBaselineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClarifyShapBaselineConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClarifyShapBaselineConfig] (val x: Self) extends AnyVal {
    
    inline def setMimeType(value: ClarifyMimeType): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "MimeType", js.undefined)
    
    inline def setShapBaseline(value: ClarifyShapBaseline): Self = StObject.set(x, "ShapBaseline", value.asInstanceOf[js.Any])
    
    inline def setShapBaselineUndefined: Self = StObject.set(x, "ShapBaseline", js.undefined)
    
    inline def setShapBaselineUri(value: Url): Self = StObject.set(x, "ShapBaselineUri", value.asInstanceOf[js.Any])
    
    inline def setShapBaselineUriUndefined: Self = StObject.set(x, "ShapBaselineUri", js.undefined)
  }
}
