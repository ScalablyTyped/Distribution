package typings
package antdDashMobileDashRnLib.libAccordionIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion
  extends reactLib.reactMod.Component[AccordionNativeProps, js.Any, js.Any] {
  def onChange(idx: scala.Double): scala.Unit = js.native
  def renderContent(section: AccordionHeader): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderHeader(section: AccordionHeader, `_`: scala.Double, isActive: scala.Boolean): reactLib.reactMod.Global.JSXNs.Element = js.native
}

