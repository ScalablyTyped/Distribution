package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the common properties of a database column. */
trait ColumnSettings
  extends StObject
     with XPropertySet {
  
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
  
  inline def apply(
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
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit
  ): ColumnSettings = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], ControlDefault = ControlDefault.asInstanceOf[js.Any], ControlModel = ControlModel.asInstanceOf[js.Any], FormatKey = FormatKey.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ColumnSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnSettings] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: Double): Self = StObject.set(x, "Align", value.asInstanceOf[js.Any])
    
    inline def setControlDefault(value: String): Self = StObject.set(x, "ControlDefault", value.asInstanceOf[js.Any])
    
    inline def setControlModel(value: XPropertySet): Self = StObject.set(x, "ControlModel", value.asInstanceOf[js.Any])
    
    inline def setFormatKey(value: Double): Self = StObject.set(x, "FormatKey", value.asInstanceOf[js.Any])
    
    inline def setHelpText(value: String): Self = StObject.set(x, "HelpText", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "Hidden", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
