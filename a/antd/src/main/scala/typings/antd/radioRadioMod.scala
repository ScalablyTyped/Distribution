package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.radioInterfaceMod.RadioProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioRadioMod extends Shortcut {
  
  @JSImport("antd/lib/radio/radio", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RadioProps & RefAttributes[Any]] = js.native
  
  type _To = ForwardRefExoticComponent[RadioProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `radioRadioMod.foo` */
  override def _to: ForwardRefExoticComponent[RadioProps & RefAttributes[Any]] = default
}
