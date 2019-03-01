package typings
package actionsDashOnDashGoogleLib.dialogflowDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /** Remaining number of intents */
  var lifespan: scala.Double
  /** Full name of the context. */
  var name: java.lang.String
  /**
    * Parameters carried within this context.
    * See {@link https://dialogflow.com/docs/concept-actions#section-extracting-values-from-contexts|here}.
    */
  var parameters: js.Object
}

object Context {
  @scala.inline
  def apply(lifespan: scala.Double, name: java.lang.String, parameters: js.Object): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lifespan")(lifespan)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[Context]
  }
}

