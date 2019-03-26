package typings
package agDashGridLib.distLibComponentsFrameworkComponentProviderMod

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
  def registerComponent[A /* <: agDashGridLib.distLibInterfacesIComponentMod.IComponent[_] */](rawName: java.lang.String, component: AgGridRegisteredComponentInput[A]): scala.Unit = js.native
  def registerDefaultComponent[A /* <: agDashGridLib.distLibInterfacesIComponentMod.IComponent[_] */](rawName: java.lang.String, component: AgGridRegisteredComponentInput[A]): scala.Unit = js.native
  def registerDefaultComponent[A /* <: agDashGridLib.distLibInterfacesIComponentMod.IComponent[_] */](
    rawName: java.lang.String,
    component: AgGridRegisteredComponentInput[A],
    overridable: scala.Boolean
  ): scala.Unit = js.native
  /**
    * B the business interface (ie IHeader)
    * A the agGridComponent interface (ie IHeaderComp). The final object acceptable by ag-grid
    */
  def registerFwComponent[A /* <: agDashGridLib.distLibInterfacesIComponentMod.IComponent[_] with B */, B](rawName: java.lang.String, component: agDashGridLib.Anon_BIComponent[B]): scala.Unit = js.native
  /**
    * B the business interface (ie IHeader)
    * A the agGridComponent interface (ie IHeaderComp). The final object acceptable by ag-grid
    */
  def retrieve[A /* <: agDashGridLib.distLibInterfacesIComponentMod.IComponent[_] with B */, B](rawName: java.lang.String): RegisteredComponent[A, B] = js.native
  /* private */ def translateIfDeprecated(raw: js.Any): js.Any = js.native
}

