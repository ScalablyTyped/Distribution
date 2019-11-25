package typings.actionsDashOnDashGoogle.distServiceDialogflowContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[TParameters /* <: Parameters */] extends OutputContext[TParameters] {
  /**
    * Full name of the context.
    * @public
    */
  var name: String
  /**
    * The context parameters from the current intent.
    * Context parameters include parameters collected in previous intents
    * during the lifespan of the given context.
    *
    * See {@link https://dialogflow.com/docs/concept-actions#section-extracting-values-from-contexts|
    *     here}.
    *
    * @example
    * ```javascript
    *
    * app.intent('Tell Greeting', conv => {
    *   const context1 = conv.contexts.get('context1')
    *   const parameters = context1.parameters
    *   const color = parameters.color
    *   const num = parameters.num
    * })
    *
    * // Using destructuring
    * app.intent('Tell Greeting', conv => {
    *   const context1 = conv.contexts.get('context1')
    *   const { color, num } = context1.parameters
    * })
    * ```
    *
    * @public
    */
  @JSName("parameters")
  var parameters_Context: TParameters
}

object Context {
  @scala.inline
  def apply[TParameters /* <: Parameters */](lifespan: Double, name: String, parameters: TParameters): Context[TParameters] = {
    val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context[TParameters]]
  }
}

