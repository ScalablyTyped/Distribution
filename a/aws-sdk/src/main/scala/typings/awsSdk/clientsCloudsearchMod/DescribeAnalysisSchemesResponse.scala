package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnalysisSchemesResponse extends StObject {
  
  /**
    * The analysis scheme descriptions.
    */
  var AnalysisSchemes: AnalysisSchemeStatusList
}
object DescribeAnalysisSchemesResponse {
  
  inline def apply(AnalysisSchemes: AnalysisSchemeStatusList): DescribeAnalysisSchemesResponse = {
    val __obj = js.Dynamic.literal(AnalysisSchemes = AnalysisSchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnalysisSchemesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAnalysisSchemesResponse] (val x: Self) extends AnyVal {
    
    inline def setAnalysisSchemes(value: AnalysisSchemeStatusList): Self = StObject.set(x, "AnalysisSchemes", value.asInstanceOf[js.Any])
    
    inline def setAnalysisSchemesVarargs(value: AnalysisSchemeStatus*): Self = StObject.set(x, "AnalysisSchemes", js.Array(value*))
  }
}
