package typings.athenajs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.athenajs.mod.^
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def AudioManager: _AudioManager = ^.asInstanceOf[js.Dynamic].selectDynamic("AudioManager").asInstanceOf[_AudioManager]

inline def Dom(): _Dom[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("Dom")().asInstanceOf[_Dom[HTMLElement]]
inline def Dom(sel: String): _Dom[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("Dom")(sel.asInstanceOf[js.Any]).asInstanceOf[_Dom[HTMLElement]]
inline def Dom(sel: HTMLElement): _Dom[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("Dom")(sel.asInstanceOf[js.Any]).asInstanceOf[_Dom[HTMLElement]]

inline def FX: FXInstance = ^.asInstanceOf[js.Dynamic].selectDynamic("FX").asInstanceOf[FXInstance]

inline def InputManager: _InputManager = ^.asInstanceOf[js.Dynamic].selectDynamic("InputManager").asInstanceOf[_InputManager]

inline def NotificationManager: _NotificationManager = ^.asInstanceOf[js.Dynamic].selectDynamic("NotificationManager").asInstanceOf[_NotificationManager]

inline def ResourceManager: _ResourceManager = ^.asInstanceOf[js.Dynamic].selectDynamic("ResourceManager").asInstanceOf[_ResourceManager]

type Animations = StringDictionary[AnimationObject]

type JSObject = StringDictionary[Any]

type RenderingContext = CanvasRenderingContext2D
