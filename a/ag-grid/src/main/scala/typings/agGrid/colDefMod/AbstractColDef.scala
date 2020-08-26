package typings.agGrid.colDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractColDef extends js.Object {
  /** Whether to show the column when the group is open / closed. */
  var columnGroupShow: js.UndefOr[String] = js.native
  /** CSS class for the header */
  var headerClass: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])
  ] = js.native
  /** The name to render in the column header */
  var headerName: js.UndefOr[String] = js.native
  /** Tooltip for the column header */
  var headerTooltip: js.UndefOr[String] = js.native
  /** Expression or function to get the cells value. */
  var headerValueGetter: js.UndefOr[String | js.Function] = js.native
  /** Never set this, it is used internally by grid when doing in-grid pivoting */
  var pivotKeys: js.UndefOr[js.Array[String]] = js.native
  /** Set to true to not include this column in the toolpanel */
  var suppressToolPanel: js.UndefOr[Boolean] = js.native
  /** CSS class for the header */
  var toolPanelClass: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])
  ] = js.native
}

object AbstractColDef {
  @scala.inline
  def apply(): AbstractColDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractColDef]
  }
  @scala.inline
  implicit class AbstractColDefOps[Self <: AbstractColDef] (val x: Self) extends AnyVal {
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
    def setColumnGroupShow(value: String): Self = this.set("columnGroupShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnGroupShow: Self = this.set("columnGroupShow", js.undefined)
    @scala.inline
    def setHeaderClassVarargs(value: String*): Self = this.set("headerClass", js.Array(value :_*))
    @scala.inline
    def setHeaderClassFunction1(value: /* params */ js.Any => String | js.Array[String]): Self = this.set("headerClass", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderClass(value: String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])): Self = this.set("headerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderClass: Self = this.set("headerClass", js.undefined)
    @scala.inline
    def setHeaderName(value: String): Self = this.set("headerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderName: Self = this.set("headerName", js.undefined)
    @scala.inline
    def setHeaderTooltip(value: String): Self = this.set("headerTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTooltip: Self = this.set("headerTooltip", js.undefined)
    @scala.inline
    def setHeaderValueGetter(value: String | js.Function): Self = this.set("headerValueGetter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderValueGetter: Self = this.set("headerValueGetter", js.undefined)
    @scala.inline
    def setPivotKeysVarargs(value: String*): Self = this.set("pivotKeys", js.Array(value :_*))
    @scala.inline
    def setPivotKeys(value: js.Array[String]): Self = this.set("pivotKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotKeys: Self = this.set("pivotKeys", js.undefined)
    @scala.inline
    def setSuppressToolPanel(value: Boolean): Self = this.set("suppressToolPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressToolPanel: Self = this.set("suppressToolPanel", js.undefined)
    @scala.inline
    def setToolPanelClassVarargs(value: String*): Self = this.set("toolPanelClass", js.Array(value :_*))
    @scala.inline
    def setToolPanelClassFunction1(value: /* params */ js.Any => String | js.Array[String]): Self = this.set("toolPanelClass", js.Any.fromFunction1(value))
    @scala.inline
    def setToolPanelClass(value: String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])): Self = this.set("toolPanelClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolPanelClass: Self = this.set("toolPanelClass", js.undefined)
  }
  
}

