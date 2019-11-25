package typings.agDashGrid.distLibExportParamsMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvExportParams extends ExportParams[String] {
  var columnSeparator: js.UndefOr[String] = js.undefined
}

object CsvExportParams {
  @scala.inline
  def apply(
    allColumns: js.UndefOr[Boolean] = js.undefined,
    columnGroups: js.UndefOr[Boolean] = js.undefined,
    columnKeys: js.Array[String | Column] = null,
    columnSeparator: String = null,
    customFooter: String = null,
    customHeader: String = null,
    fileName: String = null,
    onlySelected: js.UndefOr[Boolean] = js.undefined,
    onlySelectedAllPages: js.UndefOr[Boolean] = js.undefined,
    processCellCallback: /* params */ ProcessCellForExportParams => String = null,
    processHeaderCallback: /* params */ ProcessHeaderForExportParams => String = null,
    shouldRowBeSkipped: /* params */ ShouldRowBeSkippedParams => Boolean = null,
    skipFooters: js.UndefOr[Boolean] = js.undefined,
    skipGroups: js.UndefOr[Boolean] = js.undefined,
    skipHeader: js.UndefOr[Boolean] = js.undefined,
    skipPinnedBottom: js.UndefOr[Boolean] = js.undefined,
    skipPinnedTop: js.UndefOr[Boolean] = js.undefined,
    suppressQuotes: js.UndefOr[Boolean] = js.undefined
  ): CsvExportParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allColumns)) __obj.updateDynamic("allColumns")(allColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(columnGroups)) __obj.updateDynamic("columnGroups")(columnGroups.asInstanceOf[js.Any])
    if (columnKeys != null) __obj.updateDynamic("columnKeys")(columnKeys.asInstanceOf[js.Any])
    if (columnSeparator != null) __obj.updateDynamic("columnSeparator")(columnSeparator.asInstanceOf[js.Any])
    if (customFooter != null) __obj.updateDynamic("customFooter")(customFooter.asInstanceOf[js.Any])
    if (customHeader != null) __obj.updateDynamic("customHeader")(customHeader.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(onlySelected)) __obj.updateDynamic("onlySelected")(onlySelected.asInstanceOf[js.Any])
    if (!js.isUndefined(onlySelectedAllPages)) __obj.updateDynamic("onlySelectedAllPages")(onlySelectedAllPages.asInstanceOf[js.Any])
    if (processCellCallback != null) __obj.updateDynamic("processCellCallback")(js.Any.fromFunction1(processCellCallback))
    if (processHeaderCallback != null) __obj.updateDynamic("processHeaderCallback")(js.Any.fromFunction1(processHeaderCallback))
    if (shouldRowBeSkipped != null) __obj.updateDynamic("shouldRowBeSkipped")(js.Any.fromFunction1(shouldRowBeSkipped))
    if (!js.isUndefined(skipFooters)) __obj.updateDynamic("skipFooters")(skipFooters.asInstanceOf[js.Any])
    if (!js.isUndefined(skipGroups)) __obj.updateDynamic("skipGroups")(skipGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHeader)) __obj.updateDynamic("skipHeader")(skipHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(skipPinnedBottom)) __obj.updateDynamic("skipPinnedBottom")(skipPinnedBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(skipPinnedTop)) __obj.updateDynamic("skipPinnedTop")(skipPinnedTop.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressQuotes)) __obj.updateDynamic("suppressQuotes")(suppressQuotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsvExportParams]
  }
}

