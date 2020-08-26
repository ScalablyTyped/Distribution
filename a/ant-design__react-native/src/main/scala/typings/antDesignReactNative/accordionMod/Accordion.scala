package typings.antDesignReactNative.accordionMod

import typings.antDesignReactNative.styleMod.AccordionStyle
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion[T /* <: AccordionHeader */]
  extends Component[AccordionNativeProps[T], js.Any, js.Any] {
  def renderContent(styles: AccordionStyle): js.Function1[/* section */ T, Element] = js.native
  def renderHeader(styles: AccordionStyle): js.Function3[/* section */ T, /* _ */ Double, /* isActive */ Boolean, Element] = js.native
}

