package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOperation extends js.Object {
  /**
    * Operation id
    */
  var id: java.lang.String
  /**
    * Operation name
    */
  var name: java.lang.String
  /**
    * Parent operation id
    */
  var parentId: java.lang.String
  /**
    * Root operation id
    */
  var rootId: java.lang.String
  /**
    * Synthetic source of the operation
    */
  var syntheticSource: java.lang.String
}

object IOperation {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    parentId: java.lang.String,
    rootId: java.lang.String,
    syntheticSource: java.lang.String
  ): IOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parentId")(parentId)
    __obj.updateDynamic("rootId")(rootId)
    __obj.updateDynamic("syntheticSource")(syntheticSource)
    __obj.asInstanceOf[IOperation]
  }
}

