package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the common properties of a database column. */
trait ColumnSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * specifies the alignment of columns text.
    *
    * `; 0: left; 1: center; 2: right; `
    *
    * If the value is `VOID` , a default alignment should be used according to the datatype of the column.
    */
  var Align: scala.Double
  /** describes the default value which should be displayed by a control when moving to a new row. The default is `NULL` . */
  var ControlDefault: java.lang.String
  /** indicates a control model which defines the settings for layouting. The default is `NULL` . */
  var ControlModel: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * contains the index of the number format that is used for the column.
    *
    * The proper value can be determined by using the {@link com.sun.star.util.XNumberFormatter} interface.
    *
    * If the value is `VOID` , a default number format should be used according to the datatype of the column.
    */
  var FormatKey: scala.Double
  /** describes an optional help text which can be used by UI components when representing this column. The default is `NULL` . */
  var HelpText: java.lang.String
  /** determines whether the column should be displayed or not. */
  var Hidden: scala.Boolean
  /**
    * Position of the column within a grid.
    *
    * If the value is `VOID` , the default position should be taken according.
    */
  var Position: scala.Double
  /**
    * specifies the width of the column displayed in a grid, the unit is 10THMM.
    *
    * If the value is `VOID` , a default width should be used according to the label of the column.
    */
  var Width: scala.Double
}

object ColumnSettings {
  @scala.inline
  def apply(
    Align: scala.Double,
    ControlDefault: java.lang.String,
    ControlModel: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    FormatKey: scala.Double,
    HelpText: java.lang.String,
    Hidden: scala.Boolean,
    Position: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Width: scala.Double,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): ColumnSettings = {
    val __obj = js.Dynamic.literal(Align = Align, ControlDefault = ControlDefault, ControlModel = ControlModel, FormatKey = FormatKey, HelpText = HelpText, Hidden = Hidden, Position = Position, PropertySetInfo = PropertySetInfo, Width = Width, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ColumnSettings]
  }
}

