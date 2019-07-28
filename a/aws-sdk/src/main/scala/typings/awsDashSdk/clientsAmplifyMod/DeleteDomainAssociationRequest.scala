package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDomainAssociationRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Name of the domain. 
    */
  var domainName: DomainName
}

object DeleteDomainAssociationRequest {
  @scala.inline
  def apply(appId: AppId, domainName: DomainName): DeleteDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId, domainName = domainName)
  
    __obj.asInstanceOf[DeleteDomainAssociationRequest]
  }
}

