package typings.akuminaCore.mod.Digispace

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.ScriptManager")
@js.native
open class ScriptManager () extends StObject {
  
  // removed in 5.0 - JA - GetWidgetLegacyScript(callback: () => void): JQueryDeferred<any>;
  def GetLanguageMappingsScript(callback: js.Function0[Unit]): JQueryDeferred[Any] = js.native
  
  def GetManagerScript(callback: js.Function0[Unit]): JQueryDeferred[Any] = js.native
  
  def GetScript(key: String, callback: js.Function0[Unit]): JQueryDeferred[Any] = js.native
  
  // removed in 5.0 - JA - GetBabelGetBabelScript(callback: () => void): JQueryDeferred<any>;
  // removed in 5.0 - JA - GetBxSliderScript(callback: () => void): JQueryDeferred<any>;
  def LoadPageBuilderCSS(): JQueryDeferred[Any] = js.native
}
