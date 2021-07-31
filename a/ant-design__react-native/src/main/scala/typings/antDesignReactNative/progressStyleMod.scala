package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressStyleMod {
  
  @JSImport("@ant-design/react-native/lib/progress/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(theme: Theme): ProgressStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[ProgressStyle]
  
  trait ProgressStyle extends StObject {
    
    var progressBar: ViewStyle
    
    var progressOuter: ViewStyle
  }
  object ProgressStyle {
    
    @scala.inline
    def apply(progressBar: ViewStyle, progressOuter: ViewStyle): ProgressStyle = {
      val __obj = js.Dynamic.literal(progressBar = progressBar.asInstanceOf[js.Any], progressOuter = progressOuter.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressStyle]
    }
    
    @scala.inline
    implicit class ProgressStyleMutableBuilder[Self <: ProgressStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProgressBar(value: ViewStyle): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressOuter(value: ViewStyle): Self = StObject.set(x, "progressOuter", value.asInstanceOf[js.Any])
    }
  }
}
