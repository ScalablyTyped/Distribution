package typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOperation extends js.Object {
  /**
    * Operation id
    */
  var id: String
  /**
    * Operation name
    */
  var name: String
  /**
    * Parent operation id
    */
  var parentId: String
  /**
    * Root operation id
    */
  var rootId: String
  /**
    * Synthetic source of the operation
    */
  var syntheticSource: String
}

object IOperation {
  @scala.inline
  def apply(id: String, name: String, parentId: String, rootId: String, syntheticSource: String): IOperation = {
    val __obj = js.Dynamic.literal(id = id, name = name, parentId = parentId, rootId = rootId, syntheticSource = syntheticSource)
  
    __obj.asInstanceOf[IOperation]
  }
}

