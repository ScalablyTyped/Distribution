package typings.awsCrt

import typings.awsCrt.distCommonMqtt5PacketMod.BinaryData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonAwsIotSharedMod {
  
  @JSImport("aws-crt/dist/common/aws_iot_shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addToUsernameParameter(current_username: String, parameter_value: String, parameter_pre_text: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("add_to_username_parameter")(current_username.asInstanceOf[js.Any], parameter_value.asInstanceOf[js.Any], parameter_pre_text.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildMqtt5FinalUsername(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildMqtt5FinalUsername")().asInstanceOf[String]
  inline def buildMqtt5FinalUsername(customAuthConfig: MqttConnectCustomAuthConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildMqtt5FinalUsername")(customAuthConfig.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extractRegionFromEndpoint(endpoint: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRegionFromEndpoint")(endpoint.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isStringAndNotEmpty(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_string_and_not_empty")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def populateUsernameStringWithCustomAuthorizer(
    current_username: js.UndefOr[String],
    input_username: js.UndefOr[String],
    input_authorizer: js.UndefOr[String],
    input_signature: js.UndefOr[String],
    input_builder_username: js.UndefOr[String],
    input_token_key_name: js.UndefOr[String],
    input_token_value: js.UndefOr[String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("populate_username_string_with_custom_authorizer")(current_username.asInstanceOf[js.Any], input_username.asInstanceOf[js.Any], input_authorizer.asInstanceOf[js.Any], input_signature.asInstanceOf[js.Any], input_builder_username.asInstanceOf[js.Any], input_token_key_name.asInstanceOf[js.Any], input_token_value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait MqttConnectCustomAuthConfig extends StObject {
    
    /**
      * Name of the custom authorizer to use.
      *
      * Required if the endpoint does not have a default custom authorizer associated with it.  It is strongly suggested
      * to URL-encode this value; the SDK will not do so for you.
      */
    var authorizerName: js.UndefOr[String] = js.undefined
    
    /**
      * The password to use with the custom authorizer.  Becomes the MQTT5 CONNECT packet's password property.
      * AWS IoT Core will base64 encode this binary data before passing it to the authorizer's lambda function.
      */
    var password: js.UndefOr[BinaryData] = js.undefined
    
    /**
      * Key used to extract the custom authorizer token from MQTT username query-string properties.
      *
      * Required if the custom authorizer has signing enabled.  It is strongly suggested to URL-encode this value; the
      * SDK will not do so for you.
      */
    var tokenKeyName: js.UndefOr[String] = js.undefined
    
    /**
      * The digital signature of the token value in the {@link tokenValue} property.  The signature must be based on
      * the private key associated with the custom authorizer.  The signature must be base64 encoded.
      *
      * Required if the custom authorizer has signing enabled.  It is strongly suggested to URL-encode this value; the
      * SDK will not do so for you.
      */
    var tokenSignature: js.UndefOr[String] = js.undefined
    
    /**
      * An opaque token value. This value must be signed by the private key associated with the custom authorizer and
      * the result placed in the {@link tokenSignature} property.
      *
      * Required if the custom authorizer has signing enabled.
      */
    var tokenValue: js.UndefOr[String] = js.undefined
    
    /**
      * The username to use with the custom authorizer.  Query-string elements of this property value will be unioned
      * with the query-string elements implied by other properties in this object.
      *
      * For example, if you set this to:
      *
      * 'MyUsername?someKey=someValue'
      *
      * and use {@link authorizerName} to specify the authorizer, the final username would look like:
      *
      * `MyUsername?someKey=someValue&x-amz-customauthorizer-name=<your authorizer's name>&...`
      */
    var username: js.UndefOr[String] = js.undefined
  }
  object MqttConnectCustomAuthConfig {
    
    inline def apply(): MqttConnectCustomAuthConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MqttConnectCustomAuthConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MqttConnectCustomAuthConfig] (val x: Self) extends AnyVal {
      
      inline def setAuthorizerName(value: String): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
      
      inline def setAuthorizerNameUndefined: Self = StObject.set(x, "authorizerName", js.undefined)
      
      inline def setPassword(value: BinaryData): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setTokenKeyName(value: String): Self = StObject.set(x, "tokenKeyName", value.asInstanceOf[js.Any])
      
      inline def setTokenKeyNameUndefined: Self = StObject.set(x, "tokenKeyName", js.undefined)
      
      inline def setTokenSignature(value: String): Self = StObject.set(x, "tokenSignature", value.asInstanceOf[js.Any])
      
      inline def setTokenSignatureUndefined: Self = StObject.set(x, "tokenSignature", js.undefined)
      
      inline def setTokenValue(value: String): Self = StObject.set(x, "tokenValue", value.asInstanceOf[js.Any])
      
      inline def setTokenValueUndefined: Self = StObject.set(x, "tokenValue", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
