package typings
package agDashGridLib.distLibExportParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvExportParams
  extends ExportParams[java.lang.String] {
  var columnSeparator: js.UndefOr[java.lang.String] = js.undefined
}

object CsvExportParams {
  @scala.inline
  def apply(
    allColumns: js.UndefOr[scala.Boolean] = js.undefined,
    columnGroups: js.UndefOr[scala.Boolean] = js.undefined,
    columnKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column] = null,
    columnSeparator: java.lang.String = null,
    customFooter: java.lang.String = null,
    customHeader: java.lang.String = null,
    fileName: java.lang.String = null,
    onlySelected: js.UndefOr[scala.Boolean] = js.undefined,
    onlySelectedAllPages: js.UndefOr[scala.Boolean] = js.undefined,
    processCellCallback: /* params */ ProcessCellForExportParams => java.lang.String = null,
    processHeaderCallback: /* params */ ProcessHeaderForExportParams => java.lang.String = null,
    shouldRowBeSkipped: /* params */ ShouldRowBeSkippedParams => scala.Boolean = null,
    skipFooters: js.UndefOr[scala.Boolean] = js.undefined,
    skipGroups: js.UndefOr[scala.Boolean] = js.undefined,
    skipHeader: js.UndefOr[scala.Boolean] = js.undefined,
    skipPinnedBottom: js.UndefOr[scala.Boolean] = js.undefined,
    skipPinnedTop: js.UndefOr[scala.Boolean] = js.undefined,
    suppressQuotes: js.UndefOr[scala.Boolean] = js.undefined
  ): CsvExportParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allColumns)) __obj.updateDynamic("allColumns")(allColumns)
    if (!js.isUndefined(columnGroups)) __obj.updateDynamic("columnGroups")(columnGroups)
    if (columnKeys != null) __obj.updateDynamic("columnKeys")(columnKeys)
    if (columnSeparator != null) __obj.updateDynamic("columnSeparator")(columnSeparator)
    if (customFooter != null) __obj.updateDynamic("customFooter")(customFooter)
    if (customHeader != null) __obj.updateDynamic("customHeader")(customHeader)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (!js.isUndefined(onlySelected)) __obj.updateDynamic("onlySelected")(onlySelected)
    if (!js.isUndefined(onlySelectedAllPages)) __obj.updateDynamic("onlySelectedAllPages")(onlySelectedAllPages)
    if (processCellCallback != null) __obj.updateDynamic("processCellCallback")(js.Any.fromFunction1(processCellCallback))
    if (processHeaderCallback != null) __obj.updateDynamic("processHeaderCallback")(js.Any.fromFunction1(processHeaderCallback))
    if (shouldRowBeSkipped != null) __obj.updateDynamic("shouldRowBeSkipped")(js.Any.fromFunction1(shouldRowBeSkipped))
    if (!js.isUndefined(skipFooters)) __obj.updateDynamic("skipFooters")(skipFooters)
    if (!js.isUndefined(skipGroups)) __obj.updateDynamic("skipGroups")(skipGroups)
    if (!js.isUndefined(skipHeader)) __obj.updateDynamic("skipHeader")(skipHeader)
    if (!js.isUndefined(skipPinnedBottom)) __obj.updateDynamic("skipPinnedBottom")(skipPinnedBottom)
    if (!js.isUndefined(skipPinnedTop)) __obj.updateDynamic("skipPinnedTop")(skipPinnedTop)
    if (!js.isUndefined(suppressQuotes)) __obj.updateDynamic("suppressQuotes")(suppressQuotes)
    __obj.asInstanceOf[CsvExportParams]
  }
}

