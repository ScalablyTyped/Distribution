package typings.agGrid.colDefMod

import typings.agGrid.anon.InstantiableAny
import typings.agGrid.anon.InstantiableIHeaderGroupComp
import typings.agGrid.componentResolverMod.ComponentHolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColGroupDef
  extends AbstractColDef
     with ComponentHolder {
  /** Columns in this group */
  var children: js.Array[ColDef | ColGroupDef]
  /** Group ID */
  var groupId: js.UndefOr[String] = js.undefined
  /** The custom header group component to be used for rendering the component header. If none specified the default ag-Grid is used**/
  var headerGroupComponent: js.UndefOr[String | InstantiableIHeaderGroupComp] = js.undefined
  /** The custom header group component to be used for rendering the component header in the hosting framework (ie: React/Angular). If none specified the default ag-Grid is used**/
  var headerGroupComponentFramework: js.UndefOr[InstantiableAny] = js.undefined
  /** The custom header group component to be used for rendering the component header. If none specified the default ag-Grid is used**/
  var headerGroupComponentParams: js.UndefOr[js.Any] = js.undefined
  /** If true, group cannot be broken up by column moving, child columns will always appear side by side, however you can rearrange child columns within the group */
  var marryChildren: js.UndefOr[Boolean] = js.undefined
  /** Open by Default */
  var openByDefault: js.UndefOr[Boolean] = js.undefined
}

object ColGroupDef {
  @scala.inline
  def apply(
    children: js.Array[ColDef | ColGroupDef],
    columnGroupShow: String = null,
    groupId: String = null,
    headerClass: String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]]) = null,
    headerGroupComponent: String | InstantiableIHeaderGroupComp = null,
    headerGroupComponentFramework: InstantiableAny = null,
    headerGroupComponentParams: js.Any = null,
    headerName: String = null,
    headerTooltip: String = null,
    headerValueGetter: String | js.Function = null,
    marryChildren: js.UndefOr[Boolean] = js.undefined,
    openByDefault: js.UndefOr[Boolean] = js.undefined,
    pivotKeys: js.Array[String] = null,
    suppressToolPanel: js.UndefOr[Boolean] = js.undefined,
    toolPanelClass: String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]]) = null
  ): ColGroupDef = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (columnGroupShow != null) __obj.updateDynamic("columnGroupShow")(columnGroupShow.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (headerClass != null) __obj.updateDynamic("headerClass")(headerClass.asInstanceOf[js.Any])
    if (headerGroupComponent != null) __obj.updateDynamic("headerGroupComponent")(headerGroupComponent.asInstanceOf[js.Any])
    if (headerGroupComponentFramework != null) __obj.updateDynamic("headerGroupComponentFramework")(headerGroupComponentFramework.asInstanceOf[js.Any])
    if (headerGroupComponentParams != null) __obj.updateDynamic("headerGroupComponentParams")(headerGroupComponentParams.asInstanceOf[js.Any])
    if (headerName != null) __obj.updateDynamic("headerName")(headerName.asInstanceOf[js.Any])
    if (headerTooltip != null) __obj.updateDynamic("headerTooltip")(headerTooltip.asInstanceOf[js.Any])
    if (headerValueGetter != null) __obj.updateDynamic("headerValueGetter")(headerValueGetter.asInstanceOf[js.Any])
    if (!js.isUndefined(marryChildren)) __obj.updateDynamic("marryChildren")(marryChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openByDefault)) __obj.updateDynamic("openByDefault")(openByDefault.get.asInstanceOf[js.Any])
    if (pivotKeys != null) __obj.updateDynamic("pivotKeys")(pivotKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressToolPanel)) __obj.updateDynamic("suppressToolPanel")(suppressToolPanel.get.asInstanceOf[js.Any])
    if (toolPanelClass != null) __obj.updateDynamic("toolPanelClass")(toolPanelClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColGroupDef]
  }
}

