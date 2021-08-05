package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.AfterClose
import typings.antDesignReactNative.tagMod.TagNativeProps
import typings.antDesignReactNative.tagMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Tag")
@js.native
class Tag protected () extends default {
  def this(props: TagNativeProps) = this()
}
/* static members */
object Tag {
  
  @JSImport("@ant-design/react-native", "Tag")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Tag.defaultProps")
  @js.native
  def defaultProps: AfterClose = js.native
  inline def defaultProps_=(x: AfterClose): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
