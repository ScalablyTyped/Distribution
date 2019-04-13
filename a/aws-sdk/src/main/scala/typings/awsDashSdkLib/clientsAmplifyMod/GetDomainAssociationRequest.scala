package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainAssociationRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Name of the domain. 
    */
  var domainName: DomainName
}

object GetDomainAssociationRequest {
  @scala.inline
  def apply(appId: AppId, domainName: DomainName): GetDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId, domainName = domainName)
  
    __obj.asInstanceOf[GetDomainAssociationRequest]
  }
}

