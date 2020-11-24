package typings.actionsOnGoogle.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context[TParameters /* <: Parameters */] extends OutputContext[TParameters] {
  
  /**
    * Full name of the context.
    * @public
    */
  var name: String = js.native
  
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
  var parameters_Context: TParameters = js.native
}
object Context {
  
  @scala.inline
  def apply[TParameters /* <: Parameters */](lifespan: Double, name: String, parameters: TParameters): Context[TParameters] = {
    val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TParameters]]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context[_], TParameters /* <: Parameters */] (val x: Self with Context[TParameters]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: TParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
  }
}
