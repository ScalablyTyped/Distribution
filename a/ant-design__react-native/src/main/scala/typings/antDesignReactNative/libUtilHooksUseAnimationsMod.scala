package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Delay
import typings.reactNative.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilHooksUseAnimationsMod {
  
  @JSImport("@ant-design/react-native/lib/_util/hooks/useAnimations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnimate(configure: ConfigureInterface): js.Array[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimate")(configure.asInstanceOf[js.Any]).asInstanceOf[js.Array[Value]]
  
  inline def useAnimatedTiming(): js.Tuple2[Value, animateType] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedTiming")().asInstanceOf[js.Tuple2[Value, animateType]]
  
  trait ConfigureInterface extends StObject {
    
    var animate: animateType
    
    var initialValue: Double
  }
  object ConfigureInterface {
    
    inline def apply(animate: /* _TimingAnimationConfig */ Delay => Unit, initialValue: Double): ConfigureInterface = {
      val __obj = js.Dynamic.literal(animate = js.Any.fromFunction1(animate), initialValue = initialValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigureInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigureInterface] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: /* _TimingAnimationConfig */ Delay => Unit): Self = StObject.set(x, "animate", js.Any.fromFunction1(value))
      
      inline def setInitialValue(value: Double): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    }
  }
  
  type animateType = js.Function1[/* _TimingAnimationConfig */ Delay, Unit]
}
