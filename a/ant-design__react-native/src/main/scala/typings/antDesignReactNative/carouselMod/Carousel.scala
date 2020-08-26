package typings.antDesignReactNative.carouselMod

import typings.react.mod.Component
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Carousel
  extends Component[CarouselProps, CarouselState, js.Any] {
  var autoplay: js.Any = js.native
  var autoplayTimer: js.Any = js.native
  var getChildrenCount: js.Any = js.native
  var renderDots: js.Any = js.native
  var viewPager: RefObject[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ViewPager */ _
  ] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCarousel(prevProps: CarouselProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): Unit = js.native
  /**
    * go to index
    * @param index
    */
  def goTo(index: Double): Unit = js.native
}

