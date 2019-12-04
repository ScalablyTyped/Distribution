package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/view", JSImport.Namespace)
@js.native
object libViewMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin */ @js.native
  class default () extends View
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    var forceTouchAvailable: Boolean = js.native
  }
  
}

