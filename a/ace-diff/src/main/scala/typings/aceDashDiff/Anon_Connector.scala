package typings.aceDashDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connector extends js.Object {
  var connector: String
  var deletedCodeConnectorLinkContent: String
  var diff: String
  var newCodeConnectorLinkContent: String
}

object Anon_Connector {
  @scala.inline
  def apply(
    connector: String,
    deletedCodeConnectorLinkContent: String,
    diff: String,
    newCodeConnectorLinkContent: String
  ): Anon_Connector = {
    val __obj = js.Dynamic.literal(connector = connector, deletedCodeConnectorLinkContent = deletedCodeConnectorLinkContent, diff = diff, newCodeConnectorLinkContent = newCodeConnectorLinkContent)
  
    __obj.asInstanceOf[Anon_Connector]
  }
}

