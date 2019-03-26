package typings
package agDashGridLib.distLibEntitiesColDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColGroupDef
  extends AbstractColDef
     with agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentHolder {
  /** Columns in this group */
  var children: js.Array[ColDef | ColGroupDef]
  /** Group ID */
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  /** The custom header group component to be used for rendering the component header. If none specified the default ag-Grid is used**/
  var headerGroupComponent: js.UndefOr[java.lang.String | agDashGridLib.Anon_IHeaderGroupComp] = js.undefined
  /** The custom header group component to be used for rendering the component header in the hosting framework (ie: React/Angular). If none specified the default ag-Grid is used**/
  var headerGroupComponentFramework: js.UndefOr[agDashGridLib.Anon_Any] = js.undefined
  /** The custom header group component to be used for rendering the component header. If none specified the default ag-Grid is used**/
  var headerGroupComponentParams: js.UndefOr[js.Any] = js.undefined
  /** If true, group cannot be broken up by column moving, child columns will always appear side by side, however you can rearrange child columns within the group */
  var marryChildren: js.UndefOr[scala.Boolean] = js.undefined
  /** Open by Default */
  var openByDefault: js.UndefOr[scala.Boolean] = js.undefined
}

object ColGroupDef {
  @scala.inline
  def apply(
    children: js.Array[ColDef | ColGroupDef],
    columnGroupShow: java.lang.String = null,
    groupId: java.lang.String = null,
    headerClass: java.lang.String | js.Array[java.lang.String] | (js.Function1[/* params */ js.Any, java.lang.String | js.Array[java.lang.String]]) = null,
    headerGroupComponent: java.lang.String | agDashGridLib.Anon_IHeaderGroupComp = null,
    headerGroupComponentFramework: agDashGridLib.Anon_Any = null,
    headerGroupComponentParams: js.Any = null,
    headerName: java.lang.String = null,
    headerTooltip: java.lang.String = null,
    headerValueGetter: java.lang.String | js.Function = null,
    marryChildren: js.UndefOr[scala.Boolean] = js.undefined,
    openByDefault: js.UndefOr[scala.Boolean] = js.undefined,
    pivotKeys: js.Array[java.lang.String] = null,
    suppressToolPanel: js.UndefOr[scala.Boolean] = js.undefined,
    toolPanelClass: java.lang.String | js.Array[java.lang.String] | (js.Function1[/* params */ js.Any, java.lang.String | js.Array[java.lang.String]]) = null
  ): ColGroupDef = {
    val __obj = js.Dynamic.literal(children = children)
    if (columnGroupShow != null) __obj.updateDynamic("columnGroupShow")(columnGroupShow)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (headerClass != null) __obj.updateDynamic("headerClass")(headerClass.asInstanceOf[js.Any])
    if (headerGroupComponent != null) __obj.updateDynamic("headerGroupComponent")(headerGroupComponent.asInstanceOf[js.Any])
    if (headerGroupComponentFramework != null) __obj.updateDynamic("headerGroupComponentFramework")(headerGroupComponentFramework)
    if (headerGroupComponentParams != null) __obj.updateDynamic("headerGroupComponentParams")(headerGroupComponentParams)
    if (headerName != null) __obj.updateDynamic("headerName")(headerName)
    if (headerTooltip != null) __obj.updateDynamic("headerTooltip")(headerTooltip)
    if (headerValueGetter != null) __obj.updateDynamic("headerValueGetter")(headerValueGetter.asInstanceOf[js.Any])
    if (!js.isUndefined(marryChildren)) __obj.updateDynamic("marryChildren")(marryChildren)
    if (!js.isUndefined(openByDefault)) __obj.updateDynamic("openByDefault")(openByDefault)
    if (pivotKeys != null) __obj.updateDynamic("pivotKeys")(pivotKeys)
    if (!js.isUndefined(suppressToolPanel)) __obj.updateDynamic("suppressToolPanel")(suppressToolPanel)
    if (toolPanelClass != null) __obj.updateDynamic("toolPanelClass")(toolPanelClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColGroupDef]
  }
}

