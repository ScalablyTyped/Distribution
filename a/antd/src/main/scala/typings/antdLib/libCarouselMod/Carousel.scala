package typings
package antdLib.libCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Carousel
  extends reactLib.reactMod.Component[CarouselProps, js.Object, js.Any] {
  var innerSlider: js.Any = js.native
  var slick: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): scala.Unit = js.native
  def goTo(slide: scala.Double): scala.Unit = js.native
  def goTo(slide: scala.Double, dontAnimate: scala.Boolean): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def onWindowResized(): scala.Unit = js.native
  def prev(): scala.Unit = js.native
  def renderCarousel(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveSlick(node: js.Any): scala.Unit = js.native
}

