package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

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
  var formatCode: java.lang.String
  /** The index used by the number formatter, predefined values corresponding with {@link NumberFormatIndex} values. */
  var formatIndex: scala.Double
  /** A unique (within one locale) identifier. */
  var formatKey: java.lang.String
  /** A name or description that is displayed in the number formatter dialog. */
  var formatName: java.lang.String
  /** Type may be one of "short", "medium", "long". */
  var formatType: java.lang.String
  /** Usage category, for example, "DATE" or "FIXED_NUMBER", corresponding with {@link KNumberFormatUsage} values. */
  var formatUsage: java.lang.String
  /** If a format code is the default code of a **formatType** group. */
  var isDefault: scala.Boolean
}

object FormatElement {
  @scala.inline
  def apply(
    formatCode: java.lang.String,
    formatIndex: scala.Double,
    formatKey: java.lang.String,
    formatName: java.lang.String,
    formatType: java.lang.String,
    formatUsage: java.lang.String,
    isDefault: scala.Boolean
  ): FormatElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formatCode")(formatCode)
    __obj.updateDynamic("formatIndex")(formatIndex)
    __obj.updateDynamic("formatKey")(formatKey)
    __obj.updateDynamic("formatName")(formatName)
    __obj.updateDynamic("formatType")(formatType)
    __obj.updateDynamic("formatUsage")(formatUsage)
    __obj.updateDynamic("isDefault")(isDefault)
    __obj.asInstanceOf[FormatElement]
  }
}

