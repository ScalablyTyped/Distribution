package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzurePartnerTopic extends StObject {
  
  var azurePartnerTopic: String
  
  var azureRegion: String
  
  var azureResourceGroup: String
  
  var azureSubscriptionId: String
}
object AzurePartnerTopic {
  
  inline def apply(
    azurePartnerTopic: String,
    azureRegion: String,
    azureResourceGroup: String,
    azureSubscriptionId: String
  ): AzurePartnerTopic = {
    val __obj = js.Dynamic.literal(azurePartnerTopic = azurePartnerTopic.asInstanceOf[js.Any], azureRegion = azureRegion.asInstanceOf[js.Any], azureResourceGroup = azureResourceGroup.asInstanceOf[js.Any], azureSubscriptionId = azureSubscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzurePartnerTopic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AzurePartnerTopic] (val x: Self) extends AnyVal {
    
    inline def setAzurePartnerTopic(value: String): Self = StObject.set(x, "azurePartnerTopic", value.asInstanceOf[js.Any])
    
    inline def setAzureRegion(value: String): Self = StObject.set(x, "azureRegion", value.asInstanceOf[js.Any])
    
    inline def setAzureResourceGroup(value: String): Self = StObject.set(x, "azureResourceGroup", value.asInstanceOf[js.Any])
    
    inline def setAzureSubscriptionId(value: String): Self = StObject.set(x, "azureSubscriptionId", value.asInstanceOf[js.Any])
  }
}
