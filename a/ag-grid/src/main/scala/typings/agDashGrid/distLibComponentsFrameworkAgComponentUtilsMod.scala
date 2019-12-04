package typings.agDashGrid

import typings.agDashGrid.distLibComponentsFrameworkComponentProviderMod.AgGridComponentFunctionInput
import typings.agDashGrid.distLibComponentsFrameworkComponentProviderMod.AgGridRegisteredComponentInput
import typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentSource
import typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentType
import typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ResolvedComponent
import typings.agDashGrid.distLibInterfacesIComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/components/framework/agComponentUtils", JSImport.Namespace)
@js.native
object distLibComponentsFrameworkAgComponentUtilsMod extends js.Object {
  @js.native
  class AgComponentUtils () extends js.Object {
    var componentMetadataProvider: js.Any = js.native
    def adaptCellRendererFunction(callback: AgGridComponentFunctionInput): Anon_Any = js.native
    def adaptFunction[A /* <: IComponent[_] with B */, B](
      propertyName: String,
      hardcodedJsFunction: AgGridComponentFunctionInput,
      `type`: ComponentType,
      source: ComponentSource
    ): ResolvedComponent[A, B] = js.native
    def doesImplementIComponent(candidate: AgGridRegisteredComponentInput[IComponent[_]]): Boolean = js.native
  }
  
}

