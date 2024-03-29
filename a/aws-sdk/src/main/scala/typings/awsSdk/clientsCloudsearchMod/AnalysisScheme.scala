package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisScheme extends StObject {
  
  var AnalysisOptions: js.UndefOr[typings.awsSdk.clientsCloudsearchMod.AnalysisOptions] = js.undefined
  
  var AnalysisSchemeLanguage: typings.awsSdk.clientsCloudsearchMod.AnalysisSchemeLanguage
  
  var AnalysisSchemeName: StandardName
}
object AnalysisScheme {
  
  inline def apply(AnalysisSchemeLanguage: AnalysisSchemeLanguage, AnalysisSchemeName: StandardName): AnalysisScheme = {
    val __obj = js.Dynamic.literal(AnalysisSchemeLanguage = AnalysisSchemeLanguage.asInstanceOf[js.Any], AnalysisSchemeName = AnalysisSchemeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisScheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisScheme] (val x: Self) extends AnyVal {
    
    inline def setAnalysisOptions(value: AnalysisOptions): Self = StObject.set(x, "AnalysisOptions", value.asInstanceOf[js.Any])
    
    inline def setAnalysisOptionsUndefined: Self = StObject.set(x, "AnalysisOptions", js.undefined)
    
    inline def setAnalysisSchemeLanguage(value: AnalysisSchemeLanguage): Self = StObject.set(x, "AnalysisSchemeLanguage", value.asInstanceOf[js.Any])
    
    inline def setAnalysisSchemeName(value: StandardName): Self = StObject.set(x, "AnalysisSchemeName", value.asInstanceOf[js.Any])
  }
}
