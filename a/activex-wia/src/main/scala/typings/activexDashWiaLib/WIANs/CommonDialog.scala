package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The CommonDialog control is an invisible-at-runtime control that contains all the methods that display a User Interface. A CommonDialog control can be
     * created using "WIA.CommonDialog" in a call to CreateObject or by dropping a CommonDialog on a form.
     */
@JSGlobal("WIA.CommonDialog")
@js.native
class CommonDialog protected () extends js.Object {
  var `WIA.CommonDialog_typekey`: CommonDialog = js.native
  /**
           * Displays one or more dialog boxes that enable the user to acquire an image from a hardware device for image acquisition and returns an ImageFile
           * object on success, otherwise Nothing
           * @param WIA.WiaDeviceType [DeviceType=0]
           * @param WIA.WiaImageIntent [Intent=0]
           * @param WIA.WiaImageBias [Bias=131072]
           * @param string [FormatID='{00000000-0000-0000-0000-000000000000}']
           * @param boolean [AlwaysSelectDevice=false]
           * @param boolean [UseCommonUI=true]
           * @param boolean [CancelError=false]
           */
  def ShowAcquireImage(
    DeviceType: js.UndefOr[WiaDeviceType],
    Intent: js.UndefOr[WiaImageIntent],
    Bias: js.UndefOr[WiaImageBias],
    FormatID: js.UndefOr[java.lang.String],
    AlwaysSelectDevice: js.UndefOr[scala.Boolean],
    UseCommonUI: js.UndefOr[scala.Boolean],
    CancelError: js.UndefOr[scala.Boolean]
  ): ImageFile | scala.Null = js.native
  /** Launches the Windows Scanner and Camera Wizard and returns Nothing. Future versions may return a collection of ImageFile objects. */
  def ShowAcquisitionWizard(Device: Device): scala.Null = js.native
  /**
           * Displays the properties dialog box for the specified Device
           * @param boolean [CancelError=false]
           */
  def ShowDeviceProperties(Device: Device): scala.Unit = js.native
  /**
           * Displays the properties dialog box for the specified Device
           * @param boolean [CancelError=false]
           */
  def ShowDeviceProperties(Device: Device, CancelError: scala.Boolean): scala.Unit = js.native
  /**
           * Displays the properties dialog box for the specified Item
           * @param boolean [CancelError=false]
           */
  def ShowItemProperties(Item: Item): scala.Unit = js.native
  /**
           * Displays the properties dialog box for the specified Item
           * @param boolean [CancelError=false]
           */
  def ShowItemProperties(Item: Item, CancelError: scala.Boolean): scala.Unit = js.native
  /** Launches the Photo Printing Wizard with the absolute path of a specific file or Vector of absolute paths to files */
  def ShowPhotoPrintingWizard(Files: Vector[java.lang.String]): scala.Unit = js.native
  /** Launches the Photo Printing Wizard with the absolute path of a specific file or Vector of absolute paths to files */
  def ShowPhotoPrintingWizard(Files: java.lang.String): scala.Unit = js.native
  /**
           * Displays a dialog box that enables the user to select a hardware device for image acquisition. Returns the selected Device object on success,
           * otherwise Nothing
           * @param WIA.WiaDeviceType [DeviceType=0]
           * @param boolean [AlwaysSelectDevice=false]
           * @param boolean [CancelError=false]
           */
  def ShowSelectDevice(): Device | scala.Null = js.native
  /**
           * Displays a dialog box that enables the user to select a hardware device for image acquisition. Returns the selected Device object on success,
           * otherwise Nothing
           * @param WIA.WiaDeviceType [DeviceType=0]
           * @param boolean [AlwaysSelectDevice=false]
           * @param boolean [CancelError=false]
           */
  def ShowSelectDevice(DeviceType: WiaDeviceType): Device | scala.Null = js.native
  /**
           * Displays a dialog box that enables the user to select a hardware device for image acquisition. Returns the selected Device object on success,
           * otherwise Nothing
           * @param WIA.WiaDeviceType [DeviceType=0]
           * @param boolean [AlwaysSelectDevice=false]
           * @param boolean [CancelError=false]
           */
  def ShowSelectDevice(DeviceType: WiaDeviceType, AlwaysSelectDevice: scala.Boolean): Device | scala.Null = js.native
  /**
           * Displays a dialog box that enables the user to select a hardware device for image acquisition. Returns the selected Device object on success,
           * otherwise Nothing
           * @param WIA.WiaDeviceType [DeviceType=0]
           * @param boolean [AlwaysSelectDevice=false]
           * @param boolean [CancelError=false]
           */
  def ShowSelectDevice(DeviceType: WiaDeviceType, AlwaysSelectDevice: scala.Boolean, CancelError: scala.Boolean): Device | scala.Null = js.native
  /**
           * Displays a dialog box that enables the user to select an item for transfer from a hardware device for image acquisition. Returns the selection as an
           * Items collection on success, otherwise Nothing
           * @param WIA.WiaImageIntent [Intent=0]
           * @param WIA.WiaImageBias [Bias=131072]
           * @param boolean [SingleSelect=true]
           * @param boolean [UseCommonUI=true]
           * @param boolean [CancelError=false]
           */
  def ShowSelectItems(Device: Device): Items | scala.Null = js.native
  /**
           * Displays a dialog box that enables the user to select an item for transfer from a hardware device for image acquisition. Returns the selection as an
           * Items collection on success, otherwise Nothing
           * @param WIA.WiaImageIntent [Intent=0]
           * @param WIA.WiaImageBias [Bias=131072]
           * @param boolean [SingleSelect=true]
           * @param boolean [UseCommonUI=true]
           * @param boolean [CancelError=false]
           */
  def ShowSelectItems(Device: Device, Intent: WiaImageIntent): Items | scala.Null = js.native
  /**
           * Displays a dialog box that enables the user to select an item for transfer from a hardware device for image acquisition. Returns the selection as an
           * Items collection on success, otherwise Nothing
           * @param WIA.WiaImageIntent [Intent=0]
           * @param WIA.WiaImageBias [Bias=131072]
           * @param boolean [SingleSelect=true]
           * @param boolean [UseCommonUI=true]
           * @param boolean [CancelError=false]
           */
  def ShowSelectItems(Device: Device, Intent: WiaImageIntent, Bias: WiaImageBias): Items | scala.Null = js.native
  /**
           * Displays a dialog box that enables the user to select an item for transfer from a hardware device for image acquisition. Returns the selection as an
           * Items collection on success, otherwise Nothing
           * @param WIA.WiaImageIntent [Intent=0]
           * @param WIA.WiaImageBias [Bias=131072]
           * @param boolean [SingleSelect=true]
           * @param boolean [UseCommonUI=true]
           * @param boolean [CancelError=false]
           */
  def ShowSelectItems(Device: Device, Intent: WiaImageIntent, Bias: WiaImageBias, SingleSelect: scala.Boolean): Items | scala.Null = js.native
  /**
           * Displays a dialog box that enables the user to select an item for transfer from a hardware device for image acquisition. Returns the selection as an
           * Items collection on success, otherwise Nothing
           * @param WIA.WiaImageIntent [Intent=0]
           * @param WIA.WiaImageBias [Bias=131072]
           * @param boolean [SingleSelect=true]
           * @param boolean [UseCommonUI=true]
           * @param boolean [CancelError=false]
           */
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: WiaImageBias,
    SingleSelect: scala.Boolean,
    UseCommonUI: scala.Boolean
  ): Items | scala.Null = js.native
  /**
           * Displays a dialog box that enables the user to select an item for transfer from a hardware device for image acquisition. Returns the selection as an
           * Items collection on success, otherwise Nothing
           * @param WIA.WiaImageIntent [Intent=0]
           * @param WIA.WiaImageBias [Bias=131072]
           * @param boolean [SingleSelect=true]
           * @param boolean [UseCommonUI=true]
           * @param boolean [CancelError=false]
           */
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: WiaImageBias,
    SingleSelect: scala.Boolean,
    UseCommonUI: scala.Boolean,
    CancelError: scala.Boolean
  ): Items | scala.Null = js.native
  /**
           * Displays a progress dialog box while transferring the specified Item to the local machine. See Item.Transfer for additional information.
           * @param string [FormatID='{00000000-0000-0000-0000-000000000000}']
           * @param boolean [CancelError=false]
           */
  def ShowTransfer(Item: Item): ImageFile = js.native
  /**
           * Displays a progress dialog box while transferring the specified Item to the local machine. See Item.Transfer for additional information.
           * @param string [FormatID='{00000000-0000-0000-0000-000000000000}']
           * @param boolean [CancelError=false]
           */
  def ShowTransfer(Item: Item, FormatID: java.lang.String): ImageFile = js.native
  /**
           * Displays a progress dialog box while transferring the specified Item to the local machine. See Item.Transfer for additional information.
           * @param string [FormatID='{00000000-0000-0000-0000-000000000000}']
           * @param boolean [CancelError=false]
           */
  def ShowTransfer(Item: Item, FormatID: java.lang.String, CancelError: scala.Boolean): ImageFile = js.native
}

