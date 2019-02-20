package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides access to the controls of a {@link FilePicker} .
  *
  * A {@link FilePicker} may contain additional elements according to the needs of the different applications. These additional elements can be addressed
  * by this interface.
  * @see com.sun.star.ui.dialogs.FilePicker
  */
trait XFilePickerControlAccess extends XFilePicker {
  /**
    * Enables or disables a control.
    * @param ControlId Identifies the control.
    * @param bEnable  If `TRUE` the specified control will be enabled.  If `FALSE` the specified control will be disabled.
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  def enableControl(ControlId: scala.Double, bEnable: scala.Boolean): scala.Unit
  /**
    * Returns the label of the specified element.
    * @param aControlId Identifies the element for which the label should be returned.
    * @returns The label of the specified element or an empty string if the specified element has no or supports no label or the specified element doesn't exist.
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  def getLabel(aControlId: scala.Double): java.lang.String
  /**
    * Get the value of an additional element within a {@link FilePicker}
    * @param aControlId Identifies the element for which value is requested.
    * @param aControlAction Specifies which value to retrieve. aControlAction has to be one of the values defined in {@link ControlActions} . Not all of the v
    * @returns The value of the specified element. If the specified control is a checkbox the returned value is a boolean that is `TRUE` if the checkbox is chec
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ControlActions
    */
  def getValue(aControlId: scala.Double, aControlAction: scala.Double): js.Any
  /**
    * Set the label of the specified element. If the specified element doesn't support setting a label, this method has no effect.
    * @param aControlId Identifies the element for which the label should be set.
    * @param aLabel The label to be set.
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  def setLabel(aControlId: scala.Double, aLabel: java.lang.String): scala.Unit
  /**
    * Set the value of an additional element within a {@link FilePicker} .
    * @param ControlId Identifies the element which value is to be set.
    * @param aControlAction Specifies an action to perform with the given value. aControlAction has to be one of the values defined in {@link ControlActions}
    * @param aValue The value to set. For checkboxes aValue should be a boolean value that should be `TRUE` if the checkbox should be checked and `FALSE` othe
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ControlActions
    */
  def setValue(ControlId: scala.Double, aControlAction: scala.Double, aValue: js.Any): scala.Unit
}

