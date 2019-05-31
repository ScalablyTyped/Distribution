package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfigurationRequest extends js.Object {
  /**
    * 
    The description of the configuration.
    
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * 
    The versions of Apache Kafka with which you can use this MSK configuration.
    
    */
  var KafkaVersions: __listOf__string
  /**
    * 
    The name of the configuration.
    
    */
  var Name: __string
  /**
    * 
    Contents of the server.properties file. When using the API, you must ensure that the contents of the file are base64 encoded. 
    When using the AWS Management Console, the SDK, or the AWS CLI, the contents of server.properties can be in plaintext.
    
    */
  var ServerProperties: __blob
}

object CreateConfigurationRequest {
  @scala.inline
  def apply(
    KafkaVersions: __listOf__string,
    Name: __string,
    ServerProperties: __blob,
    Description: __string = null
  ): CreateConfigurationRequest = {
    val __obj = js.Dynamic.literal(KafkaVersions = KafkaVersions, Name = Name, ServerProperties = ServerProperties.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateConfigurationRequest]
  }
}

