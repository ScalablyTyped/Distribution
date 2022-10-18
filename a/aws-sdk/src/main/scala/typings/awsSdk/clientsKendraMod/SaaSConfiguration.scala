package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaaSConfiguration extends StObject {
  
  /**
    * The GitHub host URL or API endpoint URL. For example, https://api.github.com.
    */
  var HostUrl: Url
  
  /**
    * The name of the organization of the GitHub Enterprise Cloud (SaaS) account you want to connect to. You can find your organization name by logging into GitHub desktop and selecting Your organizations under your profile picture dropdown.
    */
  var OrganizationName: typings.awsSdk.clientsKendraMod.OrganizationName
}
object SaaSConfiguration {
  
  inline def apply(HostUrl: Url, OrganizationName: OrganizationName): SaaSConfiguration = {
    val __obj = js.Dynamic.literal(HostUrl = HostUrl.asInstanceOf[js.Any], OrganizationName = OrganizationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaaSConfiguration]
  }
  
  extension [Self <: SaaSConfiguration](x: Self) {
    
    inline def setHostUrl(value: Url): Self = StObject.set(x, "HostUrl", value.asInstanceOf[js.Any])
    
    inline def setOrganizationName(value: OrganizationName): Self = StObject.set(x, "OrganizationName", value.asInstanceOf[js.Any])
  }
}
