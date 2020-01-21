package typings.applicationinsights.correlationContextManagerMod

import typings.applicationinsights.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorrelationContext extends js.Object {
  /** Do not store sensitive information here.
    *  Properties here are exposed via outgoing HTTP headers for correlating data cross-component.
    */
  var customProperties: CustomProperties
  var operation: AnonId
}

object CorrelationContext {
  @scala.inline
  def apply(customProperties: CustomProperties, operation: AnonId): CorrelationContext = {
    val __obj = js.Dynamic.literal(customProperties = customProperties.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CorrelationContext]
  }
}

