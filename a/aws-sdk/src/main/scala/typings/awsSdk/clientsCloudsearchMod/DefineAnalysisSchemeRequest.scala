package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineAnalysisSchemeRequest extends StObject {
  
  var AnalysisScheme: typings.awsSdk.clientsCloudsearchMod.AnalysisScheme
  
  var DomainName: typings.awsSdk.clientsCloudsearchMod.DomainName
}
object DefineAnalysisSchemeRequest {
  
  inline def apply(AnalysisScheme: AnalysisScheme, DomainName: DomainName): DefineAnalysisSchemeRequest = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAnalysisSchemeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefineAnalysisSchemeRequest] (val x: Self) extends AnyVal {
    
    inline def setAnalysisScheme(value: AnalysisScheme): Self = StObject.set(x, "AnalysisScheme", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
