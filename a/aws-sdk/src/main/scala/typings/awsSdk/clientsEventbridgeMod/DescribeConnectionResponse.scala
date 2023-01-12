package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectionResponse extends StObject {
  
  /**
    * The parameters to use for authorization for the connection.
    */
  var AuthParameters: js.UndefOr[ConnectionAuthResponseParameters] = js.undefined
  
  /**
    * The type of authorization specified for the connection.
    */
  var AuthorizationType: js.UndefOr[ConnectionAuthorizationType] = js.undefined
  
  /**
    * The ARN of the connection retrieved.
    */
  var ConnectionArn: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ConnectionArn] = js.undefined
  
  /**
    * The state of the connection retrieved.
    */
  var ConnectionState: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ConnectionState] = js.undefined
  
  /**
    * A time stamp for the time that the connection was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description for the connection retrieved.
    */
  var Description: js.UndefOr[ConnectionDescription] = js.undefined
  
  /**
    * A time stamp for the time that the connection was last authorized.
    */
  var LastAuthorizedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A time stamp for the time that the connection was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the connection retrieved.
    */
  var Name: js.UndefOr[ConnectionName] = js.undefined
  
  /**
    * The ARN of the secret created from the authorization parameters specified for the connection.
    */
  var SecretArn: js.UndefOr[SecretsManagerSecretArn] = js.undefined
  
  /**
    * The reason that the connection is in the current connection state.
    */
  var StateReason: js.UndefOr[ConnectionStateReason] = js.undefined
}
object DescribeConnectionResponse {
  
  inline def apply(): DescribeConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthParameters(value: ConnectionAuthResponseParameters): Self = StObject.set(x, "AuthParameters", value.asInstanceOf[js.Any])
    
    inline def setAuthParametersUndefined: Self = StObject.set(x, "AuthParameters", js.undefined)
    
    inline def setAuthorizationType(value: ConnectionAuthorizationType): Self = StObject.set(x, "AuthorizationType", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationTypeUndefined: Self = StObject.set(x, "AuthorizationType", js.undefined)
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
    
    inline def setConnectionState(value: ConnectionState): Self = StObject.set(x, "ConnectionState", value.asInstanceOf[js.Any])
    
    inline def setConnectionStateUndefined: Self = StObject.set(x, "ConnectionState", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: ConnectionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastAuthorizedTime(value: js.Date): Self = StObject.set(x, "LastAuthorizedTime", value.asInstanceOf[js.Any])
    
    inline def setLastAuthorizedTimeUndefined: Self = StObject.set(x, "LastAuthorizedTime", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: ConnectionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSecretArn(value: SecretsManagerSecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
    
    inline def setStateReason(value: ConnectionStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
  }
}
