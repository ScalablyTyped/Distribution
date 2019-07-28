package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the common properties of a database column. */
trait ColumnSettings extends XPropertySet {
  /**
    * specifies the alignment of columns text.
    *
    * `; 0: left; 1: center; 2: right; `
    *
    * If the value is `VOID` , a default alignment should be used according to the datatype of the column.
    */
  var Align: Double
  /** describes the default value which should be displayed by a control when moving to a new row. The default is `NULL` . */
  var ControlDefault: String
  /** indicates a control model which defines the settings for layouting. The default is `NULL` . */
  var ControlModel: XPropertySet
  /**
    * contains the index of the number format that is used for the column.
    *
    * The proper value can be determined by using the {@link com.sun.star.util.XNumberFormatter} interface.
    *
    * If the value is `VOID` , a default number format should be used according to the datatype of the column.
    */
  var FormatKey: Double
  /** describes an optional help text which can be used by UI components when representing this column. The default is `NULL` . */
  var HelpText: String
  /** determines whether the column should be displayed or not. */
  var Hidden: Boolean
  /**
    * Position of the column within a grid.
    *
    * If the value is `VOID` , the default position should be taken according.
    */
  var Position: Double
  /**
    * specifies the width of the column displayed in a grid, the unit is 10THMM.
    *
    * If the value is `VOID` , a default width should be used according to the label of the column.
    */
  var Width: Double
}

object ColumnSettings {
  @scala.inline
  def apply(
    Align: Double,
    ControlDefault: String,
    ControlModel: XPropertySet,
    FormatKey: Double,
    HelpText: String,
    Hidden: Boolean,
    Position: Double,
    PropertySetInfo: XPropertySetInfo,
    Width: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ColumnSettings = {
    val __obj = js.Dynamic.literal(Align = Align, ControlDefault = ControlDefault, ControlModel = ControlModel, FormatKey = FormatKey, HelpText = HelpText, Hidden = Hidden, Position = Position, PropertySetInfo = PropertySetInfo, Width = Width, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ColumnSettings]
  }
}

