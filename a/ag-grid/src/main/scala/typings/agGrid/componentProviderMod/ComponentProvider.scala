package typings.agGrid.componentProviderMod

import typings.agGrid.anon.`0`
import typings.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/components/framework/componentProvider", "ComponentProvider")
@js.native
class ComponentProvider () extends js.Object {
  var agDeprecatedNames: js.Any = js.native
  var agGridDefaults: js.Any = js.native
  var frameworkComponents: js.Any = js.native
  var gridOptions: js.Any = js.native
  var jsComponents: js.Any = js.native
  /* private */ def init(): js.Any = js.native
  def registerComponent[A /* <: IComponent[_] */](rawName: String, component: AgGridRegisteredComponentInput[A]): Unit = js.native
  def registerDefaultComponent[A /* <: IComponent[_] */](rawName: String, component: AgGridRegisteredComponentInput[A]): Unit = js.native
  def registerDefaultComponent[A /* <: IComponent[_] */](rawName: String, component: AgGridRegisteredComponentInput[A], overridable: Boolean): Unit = js.native
  /**
    * B the business interface (ie IHeader)
    * A the agGridComponent interface (ie IHeaderComp). The final object acceptable by ag-grid
    */
  def registerFwComponent[A /* <: IComponent[_] with B */, B](rawName: String, component: `0`[B]): Unit = js.native
  /**
    * B the business interface (ie IHeader)
    * A the agGridComponent interface (ie IHeaderComp). The final object acceptable by ag-grid
    */
  def retrieve[A /* <: IComponent[_] with B */, B](rawName: String): RegisteredComponent[A, B] = js.native
  /* private */ def translateIfDeprecated(raw: js.Any): js.Any = js.native
}

