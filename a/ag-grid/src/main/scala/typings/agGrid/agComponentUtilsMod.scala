package typings.agGrid

import typings.agGrid.anon.InstantiableIComponent
import typings.agGrid.componentProviderMod.AgGridComponentFunctionInput
import typings.agGrid.componentProviderMod.AgGridRegisteredComponentInput
import typings.agGrid.componentResolverMod.ComponentSource
import typings.agGrid.componentResolverMod.ComponentType
import typings.agGrid.componentResolverMod.ResolvedComponent
import typings.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/components/framework/agComponentUtils", JSImport.Namespace)
@js.native
object agComponentUtilsMod extends js.Object {
  @js.native
  class AgComponentUtils () extends js.Object {
    var componentMetadataProvider: js.Any = js.native
    def adaptCellRendererFunction(callback: AgGridComponentFunctionInput): InstantiableIComponent = js.native
    def adaptFunction[A /* <: IComponent[_] with B */, B](
      propertyName: String,
      hardcodedJsFunction: AgGridComponentFunctionInput,
      `type`: ComponentType,
      source: ComponentSource
    ): ResolvedComponent[A, B] = js.native
    def doesImplementIComponent(candidate: AgGridRegisteredComponentInput[IComponent[_]]): Boolean = js.native
  }
  
}

