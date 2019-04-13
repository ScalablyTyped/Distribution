package typings
package antdDashMobileDashRnLib.libCarouselIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Carousel
  extends reactLib.reactMod.Component[CarouselProps, CarouselState, js.Any] {
  var androidScrollEndTimer: js.Any = js.native
  var autoplayTimer: js.Any = js.native
  var scrollEndTimter: js.Any = js.native
  var scrollviewRef: js.Any = js.native
  def autoplay(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): scala.Unit = js.native
  def getChildrenCount(children: reactLib.reactMod.ReactNode): scala.Double = js.native
  def loopJump(): scala.Unit = js.native
  def onChildLayout(e: reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent): scala.Unit = js.native
  def onLayout(e: reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent): scala.Unit = js.native
  def onScrollBegin(
    e: reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent]
  ): scala.Unit = js.native
  def onScrollEnd(
    e: reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent]
  ): scala.Unit = js.native
  def onScrollEndDrag(
    e: reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent]
  ): scala.Unit = js.native
  def paging(offsetY: scala.Double): scala.Unit = js.native
  def renderContent(pages: reactLib.reactMod.ReactNode): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderDots(index: scala.Double): js.UndefOr[js.Object | scala.Null] = js.native
  def scrollNextPage(): scala.Unit = js.native
  def updateIndex(offset: CarouselOffset): scala.Unit = js.native
}

