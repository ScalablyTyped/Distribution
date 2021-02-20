package typings.agGrid

import typings.agGrid.anon.InstantiableIComponent
import typings.agGrid.componentProviderMod.AgGridComponentFunctionInput
import typings.agGrid.componentProviderMod.AgGridRegisteredComponentInput
import typings.agGrid.componentResolverMod.ComponentSource
import typings.agGrid.componentResolverMod.ComponentType
import typings.agGrid.componentResolverMod.ResolvedComponent
import typings.agGrid.iComponentMod.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agComponentUtilsMod {
  
  @JSImport("ag-grid/dist/lib/components/framework/agComponentUtils", "AgComponentUtils")
  @js.native
  class AgComponentUtils () extends StObject {
    
    def adaptCellRendererFunction(callback: AgGridComponentFunctionInput): InstantiableIComponent = js.native
    
    def adaptFunction[A /* <: IComponent[_] with B */, B](
      propertyName: String,
      hardcodedJsFunction: AgGridComponentFunctionInput,
      `type`: ComponentType,
      source: ComponentSource
    ): ResolvedComponent[A, B] = js.native
    
    var componentMetadataProvider: js.Any = js.native
    
    def doesImplementIComponent(candidate: AgGridRegisteredComponentInput[IComponent[_]]): Boolean = js.native
  }
}
