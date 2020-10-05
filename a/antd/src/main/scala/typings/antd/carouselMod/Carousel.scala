package typings.antd.carouselMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Carousel
  extends Component[CarouselProps, js.Object, js.Any] {
  var innerSlider: js.Any = js.native
  var slick: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCarousel(prevProps: CarouselProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): Unit = js.native
  def getDotPosition(): DotPosition = js.native
  def goTo(slide: Double): Unit = js.native
  def goTo(slide: Double, dontAnimate: Boolean): Unit = js.native
  def next(): Unit = js.native
  def onWindowResized(): Unit = js.native
  def prev(): Unit = js.native
  def renderCarousel(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def saveSlick(node: js.Any): Unit = js.native
}

