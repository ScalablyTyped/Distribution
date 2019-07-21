package typings
package atAntDashDesignReactDashNativeLib.esAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion[T /* <: AccordionHeader */]
  extends reactLib.reactMod.Component[AccordionNativeProps[T], js.Any, js.Any] {
  def renderContent(styles: atAntDashDesignReactDashNativeLib.Anon_Arrow): js.Function1[/* section */ T, reactLib.reactMod.Global.JSXNs.Element] = js.native
  def renderHeader(styles: atAntDashDesignReactDashNativeLib.Anon_Arrow): js.Function3[
    /* section */ T, 
    /* _ */ scala.Double, 
    /* isActive */ scala.Boolean, 
    reactLib.reactMod.Global.JSXNs.Element
  ] = js.native
}

