package typings.antDesignReactNative.mod

import typings.antDesignReactNative.carouselMod.CarouselProps
import typings.antDesignReactNative.carouselMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Carousel")
@js.native
class Carousel protected () extends default {
  def this(props: CarouselProps) = this()
}
object Carousel {
  
  @JSImport("@ant-design/react-native", "Carousel")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("@ant-design/react-native", "Carousel.defaultProps")
  @js.native
  def defaultProps: CarouselProps = js.native
  @scala.inline
  def defaultProps_=(x: CarouselProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
