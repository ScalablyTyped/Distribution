package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineSuggesterRequest extends StObject {
  
  var DomainName: typings.awsSdk.clientsCloudsearchMod.DomainName
  
  var Suggester: typings.awsSdk.clientsCloudsearchMod.Suggester
}
object DefineSuggesterRequest {
  
  inline def apply(DomainName: DomainName, Suggester: Suggester): DefineSuggesterRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Suggester = Suggester.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineSuggesterRequest]
  }
  
  extension [Self <: DefineSuggesterRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setSuggester(value: Suggester): Self = StObject.set(x, "Suggester", value.asInstanceOf[js.Any])
  }
}
