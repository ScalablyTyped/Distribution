package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a style sheet numberings within a {@link com.sun.star.text.Text} . */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NumberingRules because var conflicts: Name. Inlined DefaultListId, IsAbsoluteMargins, IsAutomatic, IsContinuousNumbering, NumberingIsOutline, NumberingType */ trait NumberingStyle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.Style {
  /** id of default list for the numbering rules instance */
  var DefaultListId: java.lang.String
  /** determines if the margins are absolute or relative to the preceding numbering level. */
  var IsAbsoluteMargins: scala.Boolean
  /** determines if the numbering rules are automatically created as opposed to numbering rules that are part of a numbering style. */
  var IsAutomatic: scala.Boolean
  /** determines if the numbering levels are counted continuously or if each numbering level is counted separately. */
  var IsContinuousNumbering: scala.Boolean
  /** This numbering is used in the outline of the document (e.g. headings). */
  var NumberingIsOutline: scala.Boolean
  /** the type of numbering (Arabic, characters, roman numbers, etc.). */
  var NumberingType: scala.Double
}

