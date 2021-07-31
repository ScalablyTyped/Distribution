package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.radioInterfaceMod.RadioGroupContextProps
import typings.react.mod.Context
import typings.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioContextMod extends Shortcut {
  
  @JSImport("antd/lib/radio/context", JSImport.Default)
  @js.native
  val default: Context[RadioGroupContextProps | Null] = js.native
  
  @JSImport("antd/lib/radio/context", "RadioGroupContextProvider")
  @js.native
  val RadioGroupContextProvider: Provider[RadioGroupContextProps | Null] = js.native
  
  type _To = Context[RadioGroupContextProps | Null]
  
  /* This means you don't have to write `default`, but can instead just say `radioContextMod.foo` */
  override def _to: Context[RadioGroupContextProps | Null] = default
}
