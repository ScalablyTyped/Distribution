package typings.agDashGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agDashGrid.distLibEntitiesGridOptionsMod.GridOptions
import typings.agDashGrid.distLibGridMod.GridParams
import typings.agDashGrid.distLibInterfacesIFrameworkFactoryMod.IFrameworkFactory
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/grid", JSImport.Namespace)
@js.native
object distLibGridMod extends js.Object {
  @js.native
  class Grid protected () extends js.Object {
    def this(eGridDiv: HTMLElement, gridOptions: GridOptions) = this()
    def this(eGridDiv: HTMLElement, gridOptions: GridOptions, params: GridParams) = this()
    var context: js.Any = js.native
    def destroy(): Unit = js.native
    /* private */ def dispatchGridReadyEvent(gridOptions: js.Any): js.Any = js.native
    /* private */ def getRowModelClass(gridOptions: js.Any): js.Any = js.native
    /* private */ def setColumnsAndData(): js.Any = js.native
  }
  
  @js.native
  trait GridParams extends js.Object {
    @JSName("$compile")
    var $compile: js.UndefOr[js.Any] = js.native
    @JSName("$scope")
    var $scope: js.UndefOr[js.Any] = js.native
    var frameworkFactory: js.UndefOr[IFrameworkFactory] = js.native
    var globalEventListener: js.UndefOr[js.Function] = js.native
    var quickFilterOnScope: js.UndefOr[js.Any] = js.native
    var seedBeanInstances: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  
  /* static members */
  @js.native
  object Grid extends js.Object {
    var RowModelClasses: js.Any = js.native
    var enterpriseBeans: js.Any = js.native
    var enterpriseComponents: js.Any = js.native
    var frameworkBeans: js.Any = js.native
    def setEnterpriseBeans(enterpriseBeans: js.Array[_], rowModelClasses: js.Any): Unit = js.native
    def setEnterpriseComponents(components: js.Array[_]): Unit = js.native
    def setFrameworkBeans(frameworkBeans: js.Array[_]): Unit = js.native
  }
  
}

