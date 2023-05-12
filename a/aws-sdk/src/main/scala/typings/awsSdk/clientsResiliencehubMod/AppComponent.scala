package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppComponent extends StObject {
  
  /**
    * Additional configuration parameters for an Resilience Hub application. If you want to implement additionalInfo through the Resilience Hub console rather than using an API call, see Configure the application configuration parameters.  Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one associated account. Key: "failover-regions"  Value: "[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"  
    */
  var additionalInfo: js.UndefOr[AdditionalInfoMap] = js.undefined
  
  /**
    * Unique identifier of the Application Component.
    */
  var id: js.UndefOr[String255] = js.undefined
  
  /**
    * The name of the Application Component.
    */
  var name: String255
  
  /**
    * The type of Application Component.
    */
  var `type`: String255
}
object AppComponent {
  
  inline def apply(name: String255, `type`: String255): AppComponent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppComponent] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: AdditionalInfoMap): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setId(value: String255): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String255): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String255): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
