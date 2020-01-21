package typings.antdMobileRn.indexNativeMod

import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion
  extends Component[AccordionNativeProps, js.Any, js.Any] {
  def onChange(idx: Double): Unit = js.native
  def renderContent(section: AccordionHeader): Element = js.native
  def renderHeader(section: AccordionHeader, _underscore: Double, isActive: Boolean): Element = js.native
}

