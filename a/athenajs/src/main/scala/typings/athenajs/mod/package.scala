package typings.athenajs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Animations = org.scalablytyped.runtime.StringDictionary[typings.athenajs.mod.AnimationObject]
  
  @scala.inline
  def AudioManager: typings.athenajs.mod._AudioManager = typings.athenajs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AudioManager").asInstanceOf[typings.athenajs.mod._AudioManager]
  
  type Callback = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  @scala.inline
  def Dom(): typings.athenajs.mod._Dom[typings.std.HTMLElement] = typings.athenajs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Dom")().asInstanceOf[typings.athenajs.mod._Dom[typings.std.HTMLElement]]
  @scala.inline
  def Dom(sel: java.lang.String): typings.athenajs.mod._Dom[typings.std.HTMLElement] = typings.athenajs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Dom")(sel.asInstanceOf[js.Any]).asInstanceOf[typings.athenajs.mod._Dom[typings.std.HTMLElement]]
  @scala.inline
  def Dom(sel: typings.std.HTMLElement): typings.athenajs.mod._Dom[typings.std.HTMLElement] = typings.athenajs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Dom")(sel.asInstanceOf[js.Any]).asInstanceOf[typings.athenajs.mod._Dom[typings.std.HTMLElement]]
  
  @scala.inline
  def FX: typings.athenajs.mod.FXInstance = typings.athenajs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FX").asInstanceOf[typings.athenajs.mod.FXInstance]
  
  @scala.inline
  def InputManager: typings.athenajs.mod._InputManager = typings.athenajs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("InputManager").asInstanceOf[typings.athenajs.mod._InputManager]
  
  type JSObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @scala.inline
  def NotificationManager: typings.athenajs.mod._NotificationManager = typings.athenajs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NotificationManager").asInstanceOf[typings.athenajs.mod._NotificationManager]
  
  type RenderingContext = typings.std.CanvasRenderingContext2D
  
  @scala.inline
  def ResourceManager: typings.athenajs.mod._ResourceManager = typings.athenajs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ResourceManager").asInstanceOf[typings.athenajs.mod._ResourceManager]
}
