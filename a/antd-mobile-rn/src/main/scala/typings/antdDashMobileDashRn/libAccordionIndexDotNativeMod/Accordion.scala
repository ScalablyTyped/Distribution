package typings.antdDashMobileDashRn.libAccordionIndexDotNativeMod

import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion
  extends Component[AccordionNativeProps, js.Any, js.Any] {
  def onChange(idx: Double): Unit = js.native
  def renderContent(section: AccordionHeader): Element = js.native
  def renderHeader(section: AccordionHeader, `_`: Double, isActive: Boolean): Element = js.native
}

