package typings
package angularDashMocksLib.angularDashMocksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////////
// functions attached to global object (window)
///////////////////////////////////////////////////////////////////////////////
// Use `angular.mock.module` instead of `module`, as `module` conflicts with commonjs.
// declare var module: (...modules: any[]) => any;
@JSGlobalScope
@js.native
object Global extends js.Object {
  val inject: angularDashMocksLib.angularDashMocksMod.angularMod.IInjectStatic = js.native
  /**
    * This is a global (window) function that is only available when the `ngMock` module is included.
    * It can be used to trigger a native browser event on an element, which is useful for unit testing.
    *
    * @param element Either a wrapped jQuery/jqLite node or a DOM element.
    * @param eventType Optional event type. If none is specified, the function tries to determine the
    *     right event type for the element, e.g. `change` for `input[text]`.
    * @param eventData An optional object which contains additional event data used when creating the
    *     event.
    */
  def browserTrigger(element: angularLib.JQuery): scala.Unit = js.native
  def browserTrigger(element: angularLib.JQuery, eventType: java.lang.String): scala.Unit = js.native
  def browserTrigger(
    element: angularLib.JQuery,
    eventType: java.lang.String,
    eventData: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IBrowserTriggerEventData
  ): scala.Unit = js.native
  def browserTrigger(element: stdLib.Element): scala.Unit = js.native
  def browserTrigger(element: stdLib.Element, eventType: java.lang.String): scala.Unit = js.native
  def browserTrigger(
    element: stdLib.Element,
    eventType: java.lang.String,
    eventData: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IBrowserTriggerEventData
  ): scala.Unit = js.native
}

