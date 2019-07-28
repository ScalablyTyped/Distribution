package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One number format code and its attributes, returned in a sequence by {@link XLocaleData.getAllFormats()} .
  *
  * Contains raw data defined in the XML locale data files.
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait FormatElement extends js.Object {
  /** The format code, for example, "YYYY-MM-DD". */
  var formatCode: String
  /** The index used by the number formatter, predefined values corresponding with {@link NumberFormatIndex} values. */
  var formatIndex: Double
  /** A unique (within one locale) identifier. */
  var formatKey: String
  /** A name or description that is displayed in the number formatter dialog. */
  var formatName: String
  /** Type may be one of "short", "medium", "long". */
  var formatType: String
  /** Usage category, for example, "DATE" or "FIXED_NUMBER", corresponding with {@link KNumberFormatUsage} values. */
  var formatUsage: String
  /** If a format code is the default code of a **formatType** group. */
  var isDefault: Boolean
}

object FormatElement {
  @scala.inline
  def apply(
    formatCode: String,
    formatIndex: Double,
    formatKey: String,
    formatName: String,
    formatType: String,
    formatUsage: String,
    isDefault: Boolean
  ): FormatElement = {
    val __obj = js.Dynamic.literal(formatCode = formatCode, formatIndex = formatIndex, formatKey = formatKey, formatName = formatName, formatType = formatType, formatUsage = formatUsage, isDefault = isDefault)
  
    __obj.asInstanceOf[FormatElement]
  }
}

