package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the controls of a {@link FilePicker} .
  *
  * A {@link FilePicker} may contain additional elements according to the needs of the different applications. These additional elements can be addressed
  * by this interface.
  * @see com.sun.star.ui.dialogs.FilePicker
  */
trait XFilePickerControlAccess
  extends StObject
     with XFilePicker {
  
  /**
    * Enables or disables a control.
    * @param ControlId Identifies the control.
    * @param bEnable  If `TRUE` the specified control will be enabled.  If `FALSE` the specified control will be disabled.
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  def enableControl(ControlId: Double, bEnable: Boolean): Unit
  
  /**
    * Returns the label of the specified element.
    * @param aControlId Identifies the element for which the label should be returned.
    * @returns The label of the specified element or an empty string if the specified element has no or supports no label or the specified element doesn't exist.
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  def getLabel(aControlId: Double): String
  
  /**
    * Get the value of an additional element within a {@link FilePicker}
    * @param aControlId Identifies the element for which value is requested.
    * @param aControlAction Specifies which value to retrieve. aControlAction has to be one of the values defined in {@link ControlActions} . Not all of the v
    * @returns The value of the specified element. If the specified control is a checkbox the returned value is a boolean that is `TRUE` if the checkbox is chec
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ControlActions
    */
  def getValue(aControlId: Double, aControlAction: Double): Any
  
  /**
    * Set the label of the specified element. If the specified element doesn't support setting a label, this method has no effect.
    * @param aControlId Identifies the element for which the label should be set.
    * @param aLabel The label to be set.
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  def setLabel(aControlId: Double, aLabel: String): Unit
  
  /**
    * Set the value of an additional element within a {@link FilePicker} .
    * @param ControlId Identifies the element which value is to be set.
    * @param aControlAction Specifies an action to perform with the given value. aControlAction has to be one of the values defined in {@link ControlActions}
    * @param aValue The value to set. For checkboxes aValue should be a boolean value that should be `TRUE` if the checkbox should be checked and `FALSE` othe
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ControlActions
    */
  def setValue(ControlId: Double, aControlAction: Double, aValue: Any): Unit
}
object XFilePickerControlAccess {
  
  inline def apply(
    DisplayDirectory: String,
    Files: SafeArray[String],
    acquire: () => Unit,
    enableControl: (Double, Boolean) => Unit,
    execute: () => Double,
    getDisplayDirectory: () => String,
    getFiles: () => SafeArray[String],
    getLabel: Double => String,
    getValue: (Double, Double) => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    setDefaultName: String => Unit,
    setDisplayDirectory: String => Unit,
    setLabel: (Double, String) => Unit,
    setMultiSelectionMode: Boolean => Unit,
    setTitle: String => Unit,
    setValue: (Double, Double, Any) => Unit
  ): XFilePickerControlAccess = {
    val __obj = js.Dynamic.literal(DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), enableControl = js.Any.fromFunction2(enableControl), execute = js.Any.fromFunction0(execute), getDisplayDirectory = js.Any.fromFunction0(getDisplayDirectory), getFiles = js.Any.fromFunction0(getFiles), getLabel = js.Any.fromFunction1(getLabel), getValue = js.Any.fromFunction2(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultName = js.Any.fromFunction1(setDefaultName), setDisplayDirectory = js.Any.fromFunction1(setDisplayDirectory), setLabel = js.Any.fromFunction2(setLabel), setMultiSelectionMode = js.Any.fromFunction1(setMultiSelectionMode), setTitle = js.Any.fromFunction1(setTitle), setValue = js.Any.fromFunction3(setValue))
    __obj.asInstanceOf[XFilePickerControlAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XFilePickerControlAccess] (val x: Self) extends AnyVal {
    
    inline def setEnableControl(value: (Double, Boolean) => Unit): Self = StObject.set(x, "enableControl", js.Any.fromFunction2(value))
    
    inline def setGetLabel(value: Double => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
    
    inline def setGetValue(value: (Double, Double) => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction2(value))
    
    inline def setSetLabel(value: (Double, String) => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction2(value))
    
    inline def setSetValue(value: (Double, Double, Any) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction3(value))
  }
}
