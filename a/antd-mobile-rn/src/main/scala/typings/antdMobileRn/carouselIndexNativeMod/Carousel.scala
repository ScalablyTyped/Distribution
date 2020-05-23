package typings.antdMobileRn.carouselIndexNativeMod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Carousel
  extends Component[CarouselProps, CarouselState, js.Any] {
  var androidScrollEndTimer: js.Any = js.native
  var autoplayTimer: js.Any = js.native
  var scrollEndTimter: js.Any = js.native
  var scrollviewRef: js.Any = js.native
  def autoplay(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): Unit = js.native
  def getChildrenCount(children: ReactNode): Double = js.native
  def loopJump(): Unit = js.native
  def onChildLayout(e: LayoutChangeEvent): Unit = js.native
  def onLayout(e: LayoutChangeEvent): Unit = js.native
  def onScrollBegin(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
  def onScrollEnd(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
  def onScrollEndDrag(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
  def paging(offsetY: Double): Unit = js.native
  def renderContent(pages: ReactNode): Element = js.native
  def renderDots(index: Double): js.UndefOr[js.Object | Null] = js.native
  def scrollNextPage(): Unit = js.native
  def updateIndex(offset: CarouselOffset): Unit = js.native
}

