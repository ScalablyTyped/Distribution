package typings.antDesignReactNative

import typings.reactNative.mod.View
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("@ant-design/react-native/lib/view", JSImport.Default)
  @js.native
  class default protected () extends View {
    def this(props: ViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ViewProps, context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    @JSImport("@ant-design/react-native/lib/view", "default.forceTouchAvailable")
    @js.native
    def forceTouchAvailable: Boolean = js.native
    @scala.inline
    def forceTouchAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceTouchAvailable")(x.asInstanceOf[js.Any])
  }
}
