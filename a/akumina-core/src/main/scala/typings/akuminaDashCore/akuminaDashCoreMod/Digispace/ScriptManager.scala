package typings.akuminaDashCore.akuminaDashCoreMod.Digispace

import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("akumina-core", "Digispace.ScriptManager")
@js.native
class ScriptManager () extends js.Object {
  def GetBabelScript(callback: js.Function0[Unit]): JQueryDeferred[_] = js.native
  def GetLanguageMappingsScript(callback: js.Function0[Unit]): JQueryDeferred[_] = js.native
  def GetManagerScript(callback: js.Function0[Unit]): JQueryDeferred[_] = js.native
  def GetWidgetLegacyScript(callback: js.Function0[Unit]): JQueryDeferred[_] = js.native
  def LoadPageBuilderCSS(): JQueryDeferred[_] = js.native
}

