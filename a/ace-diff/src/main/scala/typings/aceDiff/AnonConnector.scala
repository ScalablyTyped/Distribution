package typings.aceDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnector extends js.Object {
  var connector: String
  var deletedCodeConnectorLinkContent: String
  var diff: String
  var newCodeConnectorLinkContent: String
}

object AnonConnector {
  @scala.inline
  def apply(
    connector: String,
    deletedCodeConnectorLinkContent: String,
    diff: String,
    newCodeConnectorLinkContent: String
  ): AnonConnector = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], deletedCodeConnectorLinkContent = deletedCodeConnectorLinkContent.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], newCodeConnectorLinkContent = newCodeConnectorLinkContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConnector]
  }
}

