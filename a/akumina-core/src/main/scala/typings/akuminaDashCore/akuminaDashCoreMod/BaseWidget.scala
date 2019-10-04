package typings.akuminaDashCore.akuminaDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("akumina-core", "BaseWidget")
@js.native
class BaseWidget () extends js.Object {
  var Properties: js.Any = js.native
  def BindTemplate(templateUri: String, data: js.Any, targetDiv: String): Unit = js.native
  def GetPropertyValue(requestIn: js.Any, key: String, defaultValue: js.Any): js.Any = js.native
  def RefreshWidget(newProps: js.Any): Unit = js.native
}

