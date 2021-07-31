package typings.akuminaCore.mod.Digispace

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.ScriptManager")
@js.native
class ScriptManager () extends StObject {
  
  def GetBabelScript(callback: js.Function0[Unit]): JQueryDeferred[js.Any] = js.native
  
  def GetLanguageMappingsScript(callback: js.Function0[Unit]): JQueryDeferred[js.Any] = js.native
  
  def GetManagerScript(callback: js.Function0[Unit]): JQueryDeferred[js.Any] = js.native
  
  def GetWidgetLegacyScript(callback: js.Function0[Unit]): JQueryDeferred[js.Any] = js.native
  
  def LoadPageBuilderCSS(): JQueryDeferred[js.Any] = js.native
}
