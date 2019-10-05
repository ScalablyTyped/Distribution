package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvClassifier extends js.Object {
  /**
    * Enables the processing of files that contain only one column.
    */
  var AllowSingleColumn: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Indicates whether the CSV file contains a header.
    */
  var ContainsHeader: js.UndefOr[CsvHeaderOption] = js.undefined
  /**
    * The time that this classifier was registered.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
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
    * The time that this classifier was last updated.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the classifier.
    */
  var Name: NameString
  /**
    * A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
    */
  var QuoteSymbol: js.UndefOr[CsvQuoteSymbol] = js.undefined
  /**
    * The version of this classifier.
    */
  var Version: js.UndefOr[VersionId] = js.undefined
}

object CsvClassifier {
  @scala.inline
  def apply(
    Name: NameString,
    AllowSingleColumn: js.UndefOr[scala.Boolean] = js.undefined,
    ContainsHeader: CsvHeaderOption = null,
    CreationTime: Timestamp = null,
    Delimiter: CsvColumnDelimiter = null,
    DisableValueTrimming: js.UndefOr[scala.Boolean] = js.undefined,
    Header: CsvHeader = null,
    LastUpdated: Timestamp = null,
    QuoteSymbol: CsvQuoteSymbol = null,
    Version: Int | Double = null
  ): CsvClassifier = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (!js.isUndefined(AllowSingleColumn)) __obj.updateDynamic("AllowSingleColumn")(AllowSingleColumn)
    if (ContainsHeader != null) __obj.updateDynamic("ContainsHeader")(ContainsHeader.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter)
    if (!js.isUndefined(DisableValueTrimming)) __obj.updateDynamic("DisableValueTrimming")(DisableValueTrimming)
    if (Header != null) __obj.updateDynamic("Header")(Header)
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated)
    if (QuoteSymbol != null) __obj.updateDynamic("QuoteSymbol")(QuoteSymbol)
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsvClassifier]
  }
}

