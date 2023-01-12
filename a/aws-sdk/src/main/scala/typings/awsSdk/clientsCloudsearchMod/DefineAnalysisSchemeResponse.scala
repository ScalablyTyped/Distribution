package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineAnalysisSchemeResponse extends StObject {
  
  var AnalysisScheme: AnalysisSchemeStatus
}
object DefineAnalysisSchemeResponse {
  
  inline def apply(AnalysisScheme: AnalysisSchemeStatus): DefineAnalysisSchemeResponse = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAnalysisSchemeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefineAnalysisSchemeResponse] (val x: Self) extends AnyVal {
    
    inline def setAnalysisScheme(value: AnalysisSchemeStatus): Self = StObject.set(x, "AnalysisScheme", value.asInstanceOf[js.Any])
  }
}
