package typings
package applicationinsightsLib.outAutoCollectionCorrelationContextManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorrelationContext extends js.Object {
  /** Do not store sensitive information here.
    *  Properties here are exposed via outgoing HTTP headers for correlating data cross-component.
    */
  var customProperties: CustomProperties
  var operation: applicationinsightsLib.Anon_Id
}

object CorrelationContext {
  @scala.inline
  def apply(customProperties: CustomProperties, operation: applicationinsightsLib.Anon_Id): CorrelationContext = {
    val __obj = js.Dynamic.literal(customProperties = customProperties, operation = operation)
  
    __obj.asInstanceOf[CorrelationContext]
  }
}

