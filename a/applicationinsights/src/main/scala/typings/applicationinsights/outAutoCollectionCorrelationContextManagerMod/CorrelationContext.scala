package typings.applicationinsights.outAutoCollectionCorrelationContextManagerMod

import typings.applicationinsights.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorrelationContext extends js.Object {
  /** Do not store sensitive information here.
    *  Properties here are exposed via outgoing HTTP headers for correlating data cross-component.
    */
  var customProperties: CustomProperties
  var operation: Anon_Id
}

object CorrelationContext {
  @scala.inline
  def apply(customProperties: CustomProperties, operation: Anon_Id): CorrelationContext = {
    val __obj = js.Dynamic.literal(customProperties = customProperties.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CorrelationContext]
  }
}

