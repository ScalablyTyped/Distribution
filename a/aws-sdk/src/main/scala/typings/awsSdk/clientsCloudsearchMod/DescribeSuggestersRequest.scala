package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSuggestersRequest extends StObject {
  
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsSdk.clientsCloudsearchMod.DomainName
  
  /**
    * The suggesters you want to describe.
    */
  var SuggesterNames: js.UndefOr[StandardNameList] = js.undefined
}
object DescribeSuggestersRequest {
  
  inline def apply(DomainName: DomainName): DescribeSuggestersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSuggestersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSuggestersRequest] (val x: Self) extends AnyVal {
    
    inline def setDeployed(value: Boolean): Self = StObject.set(x, "Deployed", value.asInstanceOf[js.Any])
    
    inline def setDeployedUndefined: Self = StObject.set(x, "Deployed", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setSuggesterNames(value: StandardNameList): Self = StObject.set(x, "SuggesterNames", value.asInstanceOf[js.Any])
    
    inline def setSuggesterNamesUndefined: Self = StObject.set(x, "SuggesterNames", js.undefined)
    
    inline def setSuggesterNamesVarargs(value: StandardName*): Self = StObject.set(x, "SuggesterNames", js.Array(value*))
  }
}
