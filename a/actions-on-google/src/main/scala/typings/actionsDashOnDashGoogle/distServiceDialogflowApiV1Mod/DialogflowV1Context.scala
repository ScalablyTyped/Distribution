package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1Context extends js.Object {
  var lifespan: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[DialogflowV1Parameters] = js.undefined
}

object DialogflowV1Context {
  @scala.inline
  def apply(lifespan: Int | Double = null, name: String = null, parameters: DialogflowV1Parameters = null): DialogflowV1Context = {
    val __obj = js.Dynamic.literal()
    if (lifespan != null) __obj.updateDynamic("lifespan")(lifespan.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Context]
  }
}

