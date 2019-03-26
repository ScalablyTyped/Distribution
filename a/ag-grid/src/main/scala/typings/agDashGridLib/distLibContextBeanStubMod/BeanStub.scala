package typings
package agDashGridLib.distLibContextBeanStubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/context/beanStub", "BeanStub")
@js.native
class BeanStub ()
  extends agDashGridLib.distLibInterfacesIEventEmitterMod.IEventEmitter {
  var destroyFunctions: js.Any = js.native
  var destroyed: js.Any = js.native
  var localEventService: js.Any = js.native
  def addDestroyFunc(func: js.Function0[scala.Unit]): scala.Unit = js.native
  def addDestroyableEventListener(
    eElement: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    event: java.lang.String,
    listener: js.Function1[/* event */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def addDestroyableEventListener(
    eElement: agDashGridLib.distLibInterfacesIEventEmitterMod.IEventEmitter,
    event: java.lang.String,
    listener: js.Function1[/* event */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def addDestroyableEventListener(
    eElement: stdLib.HTMLElement,
    event: java.lang.String,
    listener: js.Function1[/* event */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def addDestroyableEventListener(
    eElement: stdLib.Window,
    event: java.lang.String,
    listener: js.Function1[/* event */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def dispatchEvent[T /* <: agDashGridLib.distLibEventsMod.AgEvent */](event: T): scala.Unit = js.native
  def dispatchEventAsync(event: agDashGridLib.distLibEventsMod.AgEvent): scala.Unit = js.native
  def isAlive(): scala.Boolean = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/context/beanStub", "BeanStub")
@js.native
object BeanStub extends js.Object {
  var EVENT_DESTROYED: java.lang.String = js.native
}

