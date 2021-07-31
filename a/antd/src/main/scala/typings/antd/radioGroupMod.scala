package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.radioInterfaceMod.RadioGroupProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupMod extends Shortcut {
  
  @JSImport("antd/lib/radio/group", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLDivElement]]] = js.native
  
  type _To = MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLDivElement]]]
  
  /* This means you don't have to write `default`, but can instead just say `radioGroupMod.foo` */
  override def _to: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLDivElement]]] = default
}
