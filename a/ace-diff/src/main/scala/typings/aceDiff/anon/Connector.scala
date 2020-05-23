package typings.aceDiff.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connector extends js.Object {
  var connector: String
  var deletedCodeConnectorLinkContent: String
  var diff: String
  var newCodeConnectorLinkContent: String
}

object Connector {
  @scala.inline
  def apply(
    connector: String,
    deletedCodeConnectorLinkContent: String,
    diff: String,
    newCodeConnectorLinkContent: String
  ): Connector = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], deletedCodeConnectorLinkContent = deletedCodeConnectorLinkContent.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], newCodeConnectorLinkContent = newCodeConnectorLinkContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connector]
  }
}

