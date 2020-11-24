package typings.agGrid.colDefMod

import typings.agGrid.anon.InstantiableAny
import typings.agGrid.anon.InstantiableIHeaderGroupComp
import typings.agGrid.componentResolverMod.ComponentHolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColGroupDef
  extends AbstractColDef
     with ComponentHolder {
  
  /** Columns in this group */
  var children: js.Array[ColDef | ColGroupDef] = js.native
  
  /** Group ID */
  var groupId: js.UndefOr[String] = js.native
  
  /** The custom header group component to be used for rendering the component header. If none specified the default ag-Grid is used**/
  var headerGroupComponent: js.UndefOr[String | InstantiableIHeaderGroupComp] = js.native
  
  /** The custom header group component to be used for rendering the component header in the hosting framework (ie: React/Angular). If none specified the default ag-Grid is used**/
  var headerGroupComponentFramework: js.UndefOr[InstantiableAny] = js.native
  
  /** The custom header group component to be used for rendering the component header. If none specified the default ag-Grid is used**/
  var headerGroupComponentParams: js.UndefOr[js.Any] = js.native
  
  /** If true, group cannot be broken up by column moving, child columns will always appear side by side, however you can rearrange child columns within the group */
  var marryChildren: js.UndefOr[Boolean] = js.native
  
  /** Open by Default */
  var openByDefault: js.UndefOr[Boolean] = js.native
}
object ColGroupDef {
  
  @scala.inline
  def apply(children: js.Array[ColDef | ColGroupDef]): ColGroupDef = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColGroupDef]
  }
  
  @scala.inline
  implicit class ColGroupDefOps[Self <: ColGroupDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenVarargs(value: (ColDef | ColGroupDef)*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ColDef | ColGroupDef]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setHeaderGroupComponent(value: String | InstantiableIHeaderGroupComp): Self = this.set("headerGroupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderGroupComponent: Self = this.set("headerGroupComponent", js.undefined)
    
    @scala.inline
    def setHeaderGroupComponentFramework(value: InstantiableAny): Self = this.set("headerGroupComponentFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderGroupComponentFramework: Self = this.set("headerGroupComponentFramework", js.undefined)
    
    @scala.inline
    def setHeaderGroupComponentParams(value: js.Any): Self = this.set("headerGroupComponentParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderGroupComponentParams: Self = this.set("headerGroupComponentParams", js.undefined)
    
    @scala.inline
    def setMarryChildren(value: Boolean): Self = this.set("marryChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarryChildren: Self = this.set("marryChildren", js.undefined)
    
    @scala.inline
    def setOpenByDefault(value: Boolean): Self = this.set("openByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenByDefault: Self = this.set("openByDefault", js.undefined)
  }
}
