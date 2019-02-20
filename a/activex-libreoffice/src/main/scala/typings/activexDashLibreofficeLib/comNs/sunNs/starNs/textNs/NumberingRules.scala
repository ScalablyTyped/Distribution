package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the numbering rules.
  *
  * Numbering rules may be set at a {@link Paragraph} object. The numbering rules are levels of property values. Each level contains equal properties.
  */
trait NumberingRules
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** id of default list for the numbering rules instance */
  var DefaultListId: java.lang.String
  /** determines if the margins are absolute or relative to the preceding numbering level. */
  var IsAbsoluteMargins: scala.Boolean
  /** determines if the numbering rules are automatically created as opposed to numbering rules that are part of a numbering style. */
  var IsAutomatic: scala.Boolean
  /** determines if the numbering levels are counted continuously or if each numbering level is counted separately. */
  var IsContinuousNumbering: scala.Boolean
  /** contains the name of the numbering rules. It is used to identify a certain numbering rules property */
  var Name: java.lang.String
  /** This numbering is used in the outline of the document (e.g. headings). */
  var NumberingIsOutline: scala.Boolean
  /** the type of numbering (Arabic, characters, roman numbers, etc.). */
  var NumberingType: scala.Double
}

