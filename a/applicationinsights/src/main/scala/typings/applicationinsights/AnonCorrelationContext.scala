package typings.applicationinsights

import typings.applicationinsights.correlationContextManagerMod.CorrelationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCorrelationContext extends js.Object {
  var correlationContext: CorrelationContext
}

object AnonCorrelationContext {
  @scala.inline
  def apply(correlationContext: CorrelationContext): AnonCorrelationContext = {
    val __obj = js.Dynamic.literal(correlationContext = correlationContext.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCorrelationContext]
  }
}

