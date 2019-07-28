package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshSchemasMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: String
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: String
}

object RefreshSchemasMessage {
  @scala.inline
  def apply(EndpointArn: String, ReplicationInstanceArn: String): RefreshSchemasMessage = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn, ReplicationInstanceArn = ReplicationInstanceArn)
  
    __obj.asInstanceOf[RefreshSchemasMessage]
  }
}

