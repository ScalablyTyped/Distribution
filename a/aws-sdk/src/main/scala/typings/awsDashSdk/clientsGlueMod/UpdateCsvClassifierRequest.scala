package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCsvClassifierRequest extends js.Object {
  /**
    * Enables the processing of files that contain only one column.
    */
  var AllowSingleColumn: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Indicates whether the CSV file contains a header.
    */
  var ContainsHeader: js.UndefOr[CsvHeaderOption] = js.undefined
  /**
    * A custom symbol to denote what separates each column entry in the row.
    */
  var Delimiter: js.UndefOr[CsvColumnDelimiter] = js.undefined
  /**
    * Specifies not to trim values before identifying the type of column values. The default value is true.
    */
  var DisableValueTrimming: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * A list of strings representing column names.
    */
  var Header: js.UndefOr[CsvHeader] = js.undefined
  /**
    * The name of the classifier.
    */
  var Name: NameString
  /**
    * A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
    */
  var QuoteSymbol: js.UndefOr[CsvQuoteSymbol] = js.undefined
}

object UpdateCsvClassifierRequest {
  @scala.inline
  def apply(
    Name: NameString,
    AllowSingleColumn: js.UndefOr[NullableBoolean] = js.undefined,
    ContainsHeader: CsvHeaderOption = null,
    Delimiter: CsvColumnDelimiter = null,
    DisableValueTrimming: js.UndefOr[NullableBoolean] = js.undefined,
    Header: CsvHeader = null,
    QuoteSymbol: CsvQuoteSymbol = null
  ): UpdateCsvClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (!js.isUndefined(AllowSingleColumn)) __obj.updateDynamic("AllowSingleColumn")(AllowSingleColumn)
    if (ContainsHeader != null) __obj.updateDynamic("ContainsHeader")(ContainsHeader.asInstanceOf[js.Any])
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter)
    if (!js.isUndefined(DisableValueTrimming)) __obj.updateDynamic("DisableValueTrimming")(DisableValueTrimming)
    if (Header != null) __obj.updateDynamic("Header")(Header)
    if (QuoteSymbol != null) __obj.updateDynamic("QuoteSymbol")(QuoteSymbol)
    __obj.asInstanceOf[UpdateCsvClassifierRequest]
  }
}

