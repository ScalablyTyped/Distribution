package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a reference to a single cell. */
trait SingleReference extends js.Object {
  /** is the absolute column number. */
  var Column: Double
  /**
    * contains flags.
    * @see ReferenceFlags
    */
  var Flags: Double
  /** is the relative column number. */
  var RelativeColumn: Double
  /** is the relative row number. */
  var RelativeRow: Double
  /** is the relative sheet number. */
  var RelativeSheet: Double
  /** is the absolute row number. */
  var Row: Double
  /** is the absolute sheet number. */
  var Sheet: Double
}

object SingleReference {
  @scala.inline
  def apply(
    Column: Double,
    Flags: Double,
    RelativeColumn: Double,
    RelativeRow: Double,
    RelativeSheet: Double,
    Row: Double,
    Sheet: Double
  ): SingleReference = {
    val __obj = js.Dynamic.literal(Column = Column, Flags = Flags, RelativeColumn = RelativeColumn, RelativeRow = RelativeRow, RelativeSheet = RelativeSheet, Row = Row, Sheet = Sheet)
  
    __obj.asInstanceOf[SingleReference]
  }
}

