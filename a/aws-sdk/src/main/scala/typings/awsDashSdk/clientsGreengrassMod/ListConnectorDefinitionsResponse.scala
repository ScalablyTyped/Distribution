package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConnectorDefinitionsResponse extends js.Object {
  /**
    * Information about a definition.
    */
  var Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListConnectorDefinitionsResponse {
  @scala.inline
  def apply(Definitions: __listOfDefinitionInformation = null, NextToken: __string = null): ListConnectorDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Definitions != null) __obj.updateDynamic("Definitions")(Definitions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListConnectorDefinitionsResponse]
  }
}

