package typings.agGrid.mainMod

import typings.agGrid.gridMod.GridParams
import typings.agGrid.gridOptionsMod.GridOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "Grid")
@js.native
class Grid protected ()
  extends typings.agGrid.gridMod.Grid {
  def this(eGridDiv: HTMLElement, gridOptions: GridOptions) = this()
  def this(eGridDiv: HTMLElement, gridOptions: GridOptions, params: GridParams) = this()
}
/* static members */
object Grid {
  
  @JSImport("ag-grid/dist/lib/main", "Grid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Grid.RowModelClasses")
  @js.native
  def RowModelClasses: js.Any = js.native
  @scala.inline
  def RowModelClasses_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RowModelClasses")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Grid.enterpriseBeans")
  @js.native
  def enterpriseBeans: js.Any = js.native
  @scala.inline
  def enterpriseBeans_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enterpriseBeans")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Grid.enterpriseComponents")
  @js.native
  def enterpriseComponents: js.Any = js.native
  @scala.inline
  def enterpriseComponents_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enterpriseComponents")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Grid.frameworkBeans")
  @js.native
  def frameworkBeans: js.Any = js.native
  @scala.inline
  def frameworkBeans_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameworkBeans")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Grid.setEnterpriseBeans")
  @js.native
  def setEnterpriseBeans(enterpriseBeans: js.Array[_], rowModelClasses: js.Any): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Grid.setEnterpriseComponents")
  @js.native
  def setEnterpriseComponents(components: js.Array[_]): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Grid.setFrameworkBeans")
  @js.native
  def setFrameworkBeans(frameworkBeans: js.Array[_]): Unit = js.native
}
