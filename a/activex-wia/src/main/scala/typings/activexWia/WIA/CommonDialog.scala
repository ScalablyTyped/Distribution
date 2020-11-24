package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CommonDialog control is an invisible-at-runtime control that contains all the methods that display a User Interface. A CommonDialog control can be
  * created using "WIA.CommonDialog" in a call to CreateObject or by dropping a CommonDialog on a form.
  */
@js.native
trait CommonDialog extends js.Object {
  
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
    FormatID: js.UndefOr[String],
    AlwaysSelectDevice: js.UndefOr[Boolean],
    UseCommonUI: js.UndefOr[Boolean],
    CancelError: js.UndefOr[Boolean]
  ): ImageFile | Null = js.native
  
  /** Launches the Windows Scanner and Camera Wizard and returns Nothing. Future versions may return a collection of ImageFile objects. */
  def ShowAcquisitionWizard(Device: Device): Null = js.native
  
  /**
    * Displays the properties dialog box for the specified Device
    * @param boolean [CancelError=false]
    */
  def ShowDeviceProperties(Device: Device): Unit = js.native
  def ShowDeviceProperties(Device: Device, CancelError: Boolean): Unit = js.native
  
  /**
    * Displays the properties dialog box for the specified Item
    * @param boolean [CancelError=false]
    */
  def ShowItemProperties(Item: Item): Unit = js.native
  def ShowItemProperties(Item: Item, CancelError: Boolean): Unit = js.native
  
  /** Launches the Photo Printing Wizard with the absolute path of a specific file or Vector of absolute paths to files */
  def ShowPhotoPrintingWizard(Files: String): Unit = js.native
  def ShowPhotoPrintingWizard(Files: Vector[String]): Unit = js.native
  
  /**
    * Displays a dialog box that enables the user to select a hardware device for image acquisition. Returns the selected Device object on success,
    * otherwise Nothing
    * @param WIA.WiaDeviceType [DeviceType=0]
    * @param boolean [AlwaysSelectDevice=false]
    * @param boolean [CancelError=false]
    */
  def ShowSelectDevice(): Device | Null = js.native
  def ShowSelectDevice(
    DeviceType: js.UndefOr[scala.Nothing],
    AlwaysSelectDevice: js.UndefOr[scala.Nothing],
    CancelError: Boolean
  ): Device | Null = js.native
  def ShowSelectDevice(DeviceType: js.UndefOr[scala.Nothing], AlwaysSelectDevice: Boolean): Device | Null = js.native
  def ShowSelectDevice(DeviceType: js.UndefOr[scala.Nothing], AlwaysSelectDevice: Boolean, CancelError: Boolean): Device | Null = js.native
  def ShowSelectDevice(DeviceType: WiaDeviceType): Device | Null = js.native
  def ShowSelectDevice(DeviceType: WiaDeviceType, AlwaysSelectDevice: js.UndefOr[scala.Nothing], CancelError: Boolean): Device | Null = js.native
  def ShowSelectDevice(DeviceType: WiaDeviceType, AlwaysSelectDevice: Boolean): Device | Null = js.native
  def ShowSelectDevice(DeviceType: WiaDeviceType, AlwaysSelectDevice: Boolean, CancelError: Boolean): Device | Null = js.native
  
  /**
    * Displays a dialog box that enables the user to select an item for transfer from a hardware device for image acquisition. Returns the selection as an
    * Items collection on success, otherwise Nothing
    * @param WIA.WiaImageIntent [Intent=0]
    * @param WIA.WiaImageBias [Bias=131072]
    * @param boolean [SingleSelect=true]
    * @param boolean [UseCommonUI=true]
    * @param boolean [CancelError=false]
    */
  def ShowSelectItems(Device: Device): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: js.UndefOr[scala.Nothing],
    UseCommonUI: js.UndefOr[scala.Nothing],
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: js.UndefOr[scala.Nothing],
    UseCommonUI: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: js.UndefOr[scala.Nothing],
    UseCommonUI: Boolean,
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: Boolean,
    UseCommonUI: js.UndefOr[scala.Nothing],
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: Boolean,
    UseCommonUI: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: Boolean,
    UseCommonUI: Boolean,
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(Device: Device, Intent: js.UndefOr[scala.Nothing], Bias: WiaImageBias): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: WiaImageBias,
    SingleSelect: js.UndefOr[scala.Nothing],
    UseCommonUI: js.UndefOr[scala.Nothing],
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: WiaImageBias,
    SingleSelect: js.UndefOr[scala.Nothing],
    UseCommonUI: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: WiaImageBias,
    SingleSelect: js.UndefOr[scala.Nothing],
    UseCommonUI: Boolean,
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(Device: Device, Intent: js.UndefOr[scala.Nothing], Bias: WiaImageBias, SingleSelect: Boolean): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: WiaImageBias,
    SingleSelect: Boolean,
    UseCommonUI: js.UndefOr[scala.Nothing],
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: WiaImageBias,
    SingleSelect: Boolean,
    UseCommonUI: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: js.UndefOr[scala.Nothing],
    Bias: WiaImageBias,
    SingleSelect: Boolean,
    UseCommonUI: Boolean,
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(Device: Device, Intent: WiaImageIntent): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: js.UndefOr[scala.Nothing],
    UseCommonUI: js.UndefOr[scala.Nothing],
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: js.UndefOr[scala.Nothing],
    UseCommonUI: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: js.UndefOr[scala.Nothing],
    UseCommonUI: Boolean,
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(Device: Device, Intent: WiaImageIntent, Bias: js.UndefOr[scala.Nothing], SingleSelect: Boolean): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: Boolean,
    UseCommonUI: js.UndefOr[scala.Nothing],
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: Boolean,
    UseCommonUI: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: js.UndefOr[scala.Nothing],
    SingleSelect: Boolean,
    UseCommonUI: Boolean,
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(Device: Device, Intent: WiaImageIntent, Bias: WiaImageBias): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: WiaImageBias,
    SingleSelect: js.UndefOr[scala.Nothing],
    UseCommonUI: js.UndefOr[scala.Nothing],
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: WiaImageBias,
    SingleSelect: js.UndefOr[scala.Nothing],
    UseCommonUI: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: WiaImageBias,
    SingleSelect: js.UndefOr[scala.Nothing],
    UseCommonUI: Boolean,
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(Device: Device, Intent: WiaImageIntent, Bias: WiaImageBias, SingleSelect: Boolean): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: WiaImageBias,
    SingleSelect: Boolean,
    UseCommonUI: js.UndefOr[scala.Nothing],
    CancelError: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: WiaImageBias,
    SingleSelect: Boolean,
    UseCommonUI: Boolean
  ): Items | Null = js.native
  def ShowSelectItems(
    Device: Device,
    Intent: WiaImageIntent,
    Bias: WiaImageBias,
    SingleSelect: Boolean,
    UseCommonUI: Boolean,
    CancelError: Boolean
  ): Items | Null = js.native
  
  /**
    * Displays a progress dialog box while transferring the specified Item to the local machine. See Item.Transfer for additional information.
    * @param string [FormatID='{00000000-0000-0000-0000-000000000000}']
    * @param boolean [CancelError=false]
    */
  def ShowTransfer(Item: Item): ImageFile = js.native
  def ShowTransfer(Item: Item, FormatID: js.UndefOr[scala.Nothing], CancelError: Boolean): ImageFile = js.native
  def ShowTransfer(Item: Item, FormatID: String): ImageFile = js.native
  def ShowTransfer(Item: Item, FormatID: String, CancelError: Boolean): ImageFile = js.native
  
  @JSName("WIA.CommonDialog_typekey")
  var WIADotCommonDialog_typekey: CommonDialog = js.native
}
