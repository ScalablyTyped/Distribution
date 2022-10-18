package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildSuggestersRequest extends StObject {
  
  var DomainName: typings.awsSdk.clientsCloudsearchMod.DomainName
}
object BuildSuggestersRequest {
  
  inline def apply(DomainName: DomainName): BuildSuggestersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildSuggestersRequest]
  }
  
  extension [Self <: BuildSuggestersRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
