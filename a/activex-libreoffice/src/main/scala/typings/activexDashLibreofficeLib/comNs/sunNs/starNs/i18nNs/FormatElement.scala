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

