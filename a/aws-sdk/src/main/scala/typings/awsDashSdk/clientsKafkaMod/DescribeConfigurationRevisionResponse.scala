package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationRevisionResponse extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration.
    
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * 
    The time when the configuration was created.
    
    */
  var CreationTime: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * 
    The description of the configuration.
    
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * 
    The revision number.
    
    */
  var Revision: js.UndefOr[__long] = js.undefined
  /**
    * 
    Contents of the server.properties file. When using the API, you must ensure that the contents of the file are base64 encoded. 
    When using the AWS Management Console, the SDK, or the AWS CLI, the contents of server.properties can be in plaintext.
    
    */
  var ServerProperties: js.UndefOr[__blob] = js.undefined
}

object DescribeConfigurationRevisionResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreationTime: __timestampIso8601 = null,
    Description: __string = null,
    Revision: js.UndefOr[__long] = js.undefined,
    ServerProperties: __blob = null
  ): DescribeConfigurationRevisionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(Revision)) __obj.updateDynamic("Revision")(Revision)
    if (ServerProperties != null) __obj.updateDynamic("ServerProperties")(ServerProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRevisionResponse]
  }
}

