package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubscriberRequest extends StObject {
  
  /**
    * The Amazon S3 or Lake Formation access type.
    */
  var accessTypes: js.UndefOr[AccessTypeList] = js.undefined
  
  /**
    * The Amazon Web Services account ID used to access your data.
    */
  var accountId: AwsAccountId
  
  /**
    * The external ID of the subscriber. This lets the user that is assuming the role assert the circumstances in which they are operating. It also provides a way for the account owner to permit the role to be assumed only under specific circumstances.
    */
  var externalId: SafeString
  
  /**
    * The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and event collection for natively supported Amazon Web Services.
    */
  var sourceTypes: SourceTypeList
  
  /**
    * The description for your subscriber account in Security Lake. 
    */
  var subscriberDescription: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The name of your Security Lake subscriber account.
    */
  var subscriberName: CreateSubscriberRequestSubscriberNameString
}
object CreateSubscriberRequest {
  
  inline def apply(
    accountId: AwsAccountId,
    externalId: SafeString,
    sourceTypes: SourceTypeList,
    subscriberName: CreateSubscriberRequestSubscriberNameString
  ): CreateSubscriberRequest = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], sourceTypes = sourceTypes.asInstanceOf[js.Any], subscriberName = subscriberName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubscriberRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSubscriberRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessTypes(value: AccessTypeList): Self = StObject.set(x, "accessTypes", value.asInstanceOf[js.Any])
    
    inline def setAccessTypesUndefined: Self = StObject.set(x, "accessTypes", js.undefined)
    
    inline def setAccessTypesVarargs(value: AccessType*): Self = StObject.set(x, "accessTypes", js.Array(value*))
    
    inline def setAccountId(value: AwsAccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setExternalId(value: SafeString): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setSourceTypes(value: SourceTypeList): Self = StObject.set(x, "sourceTypes", value.asInstanceOf[js.Any])
    
    inline def setSourceTypesVarargs(value: SourceType*): Self = StObject.set(x, "sourceTypes", js.Array(value*))
    
    inline def setSubscriberDescription(value: DescriptionString): Self = StObject.set(x, "subscriberDescription", value.asInstanceOf[js.Any])
    
    inline def setSubscriberDescriptionUndefined: Self = StObject.set(x, "subscriberDescription", js.undefined)
    
    inline def setSubscriberName(value: CreateSubscriberRequestSubscriberNameString): Self = StObject.set(x, "subscriberName", value.asInstanceOf[js.Any])
  }
}
