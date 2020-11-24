package typings.antDesignReactNative.tagMod

import typings.antDesignReactNative.tagStyleMod.TagStyle
import typings.react.mod.Component
import typings.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag
  extends Component[TagNativeProps, js.Any, js.Any] {
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MTag(nextProps: TagNativeProps): Unit = js.native
  
  var closeDom: View | Null = js.native
  
  def handleLongPress(): Unit = js.native
  
  def onPress(): Unit = js.native
  
  def onPressIn(styles: TagStyle): js.Function0[Unit] = js.native
  
  def onPressOut(styles: TagStyle): js.Function0[Unit] = js.native
  
  def onTagClose(): Unit = js.native
}
