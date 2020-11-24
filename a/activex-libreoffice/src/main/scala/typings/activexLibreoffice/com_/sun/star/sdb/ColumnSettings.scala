package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the common properties of a database column. */
@js.native
trait ColumnSettings extends XPropertySet {
  
  /**
    * specifies the alignment of columns text.
    *
    * `; 0: left; 1: center; 2: right; `
    *
    * If the value is `VOID` , a default alignment should be used according to the datatype of the column.
    */
  var Align: Double = js.native
  
  /** describes the default value which should be displayed by a control when moving to a new row. The default is `NULL` . */
  var ControlDefault: String = js.native
  
  /** indicates a control model which defines the settings for layouting. The default is `NULL` . */
  var ControlModel: XPropertySet = js.native
  
  /**
    * contains the index of the number format that is used for the column.
    *
    * The proper value can be determined by using the {@link com.sun.star.util.XNumberFormatter} interface.
    *
    * If the value is `VOID` , a default number format should be used according to the datatype of the column.
    */
  var FormatKey: Double = js.native
  
  /** describes an optional help text which can be used by UI components when representing this column. The default is `NULL` . */
  var HelpText: String = js.native
  
  /** determines whether the column should be displayed or not. */
  var Hidden: Boolean = js.native
  
  /**
    * Position of the column within a grid.
    *
    * If the value is `VOID` , the default position should be taken according.
    */
  var Position: Double = js.native
  
  /**
    * specifies the width of the column displayed in a grid, the unit is 10THMM.
    *
    * If the value is `VOID` , a default width should be used according to the label of the column.
    */
  var Width: Double = js.native
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
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], ControlDefault = ControlDefault.asInstanceOf[js.Any], ControlModel = ControlModel.asInstanceOf[js.Any], FormatKey = FormatKey.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ColumnSettings]
  }
  
  @scala.inline
  implicit class ColumnSettingsOps[Self <: ColumnSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlign(value: Double): Self = this.set("Align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlDefault(value: String): Self = this.set("ControlDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlModel(value: XPropertySet): Self = this.set("ControlModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatKey(value: Double): Self = this.set("FormatKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpText(value: String): Self = this.set("HelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("Hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
}
