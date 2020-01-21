package typings.antDesignReactNative.accordionMod

import typings.antDesignReactNative.AnonArrow
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion[T /* <: AccordionHeader */]
  extends Component[AccordionNativeProps[T], js.Any, js.Any] {
  def renderContent(styles: AnonArrow): js.Function1[/* section */ T, Element] = js.native
  def renderHeader(styles: AnonArrow): js.Function3[/* section */ T, /* _ */ Double, /* isActive */ Boolean, Element] = js.native
}

