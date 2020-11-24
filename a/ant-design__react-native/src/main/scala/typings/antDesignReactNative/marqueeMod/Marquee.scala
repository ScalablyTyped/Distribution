package typings.antDesignReactNative.marqueeMod

import typings.react.mod.Component
import typings.reactNative.mod.LayoutChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marquee
  extends Component[MarqueeProps, js.Any, js.Any] {
  
  var left: js.Any = js.native
  
  def moveToHeader(): Unit = js.native
  
  def onLayout(e: LayoutChangeEvent): Unit = js.native
  
  def onLayoutContainer(e: LayoutChangeEvent): Unit = js.native
  
  def startMove(): Unit = js.native
  
  var texts: js.Any = js.native
  
  def tryStart(): Unit = js.native
}
