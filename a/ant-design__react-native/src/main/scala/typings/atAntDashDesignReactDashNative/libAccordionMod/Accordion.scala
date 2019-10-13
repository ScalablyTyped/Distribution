package typings.atAntDashDesignReactDashNative.libAccordionMod

import typings.atAntDashDesignReactDashNative.Anon_Arrow
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion[T /* <: AccordionHeader */]
  extends Component[AccordionNativeProps[T], js.Any, js.Any] {
  def renderContent(styles: Anon_Arrow): js.Function1[/* section */ T, Element] = js.native
  def renderHeader(styles: Anon_Arrow): js.Function3[/* section */ T, /* _ */ Double, /* isActive */ Boolean, Element] = js.native
}

