package typings.activexLibreoffice.com_.sun.star.sheet.opencl

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XOpenCLSelection extends XInterface {
  /**
    * returns the index of the currently selected device. This is an index into the sequence of devices in the OpenCLPLatform object the device is part of
    * in the current instance of LibreOffice (and not some a priori defined identifier for a specific model of device accessed through a specific platform).
    */
  val DeviceID: Double = js.native
  var FormulaCellNumberLimit: Double = js.native
  /** lists all OpenCL devices and platforms */
  val OpenCLPlatforms: SafeArray[OpenCLPlatform] = js.native
  /**
    * returns the index of the platform of the currently selected device. This is an index into the sequence that getOpenCLPlatforms returns in the current
    * instance of LibreOffice (and not some a priori defined identifier for an OpenCL platform).
    */
  val PlatformID: Double = js.native
  /** Disables automatic OpenCL Device Selection */
  def disableAutomaticDeviceSelection(): Unit = js.native
  def disableOpcodeSubsetTest(): Unit = js.native
  /**
    * Enables automatic OpenCL Device Selection
    * @param force forces a new evaluation of the best device
    */
  def enableAutomaticDeviceSelection(force: Boolean): Unit = js.native
  def enableOpcodeSubsetTest(): Unit = js.native
  /**
    * Enables or disables use of OpenCL for calculations. When using this API to enable OpenCL the configuration parameters are set to their built-in
    * default values, not ones read from the installation of user-specific configuration.
    */
  def enableOpenCL(enable: Boolean): Unit = js.native
  /**
    * returns the index of the currently selected device. This is an index into the sequence of devices in the OpenCLPLatform object the device is part of
    * in the current instance of LibreOffice (and not some a priori defined identifier for a specific model of device accessed through a specific platform).
    */
  def getDeviceID(): Double = js.native
  def getFormulaCellNumberLimit(): Double = js.native
  /** lists all OpenCL devices and platforms */
  def getOpenCLPlatforms(): SafeArray[OpenCLPlatform] = js.native
  /**
    * returns the index of the platform of the currently selected device. This is an index into the sequence that getOpenCLPlatforms returns in the current
    * instance of LibreOffice (and not some a priori defined identifier for an OpenCL platform).
    */
  def getPlatformID(): Double = js.native
  def isOpcodeSubsetTested(): Boolean = js.native
  /**
    * Returns true if calculation with OpenCL is enabled (at all). The actual use of OpenCL for a formula is also affected by the configuration settings
    * specifying whether OpenCL is used for all opcodes or just for a subset, and the black- and whitelists of OpenCL implementations that are in use.
    */
  def isOpenCLEnabled(): Boolean = js.native
  /**
    * Select the OpenCL device with the given platform and device number. The platform number corresponds to an index into the sequence returned by
    * getOpenCLPlatforms, and the device number corresponds to an index into the sequence of devices in that platform.
    */
  def selectOpenCLDevice(platform: Double, device: Double): Unit = js.native
  def setFormulaCellNumberLimit(number: Double): Unit = js.native
}

object XOpenCLSelection {
  @scala.inline
  def apply(
    DeviceID: Double,
    FormulaCellNumberLimit: Double,
    OpenCLPlatforms: SafeArray[OpenCLPlatform],
    PlatformID: Double,
    acquire: () => Unit,
    disableAutomaticDeviceSelection: () => Unit,
    disableOpcodeSubsetTest: () => Unit,
    enableAutomaticDeviceSelection: Boolean => Unit,
    enableOpcodeSubsetTest: () => Unit,
    enableOpenCL: Boolean => Unit,
    getDeviceID: () => Double,
    getFormulaCellNumberLimit: () => Double,
    getOpenCLPlatforms: () => SafeArray[OpenCLPlatform],
    getPlatformID: () => Double,
    isOpcodeSubsetTested: () => Boolean,
    isOpenCLEnabled: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    selectOpenCLDevice: (Double, Double) => Unit,
    setFormulaCellNumberLimit: Double => Unit
  ): XOpenCLSelection = {
    val __obj = js.Dynamic.literal(DeviceID = DeviceID.asInstanceOf[js.Any], FormulaCellNumberLimit = FormulaCellNumberLimit.asInstanceOf[js.Any], OpenCLPlatforms = OpenCLPlatforms.asInstanceOf[js.Any], PlatformID = PlatformID.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), disableAutomaticDeviceSelection = js.Any.fromFunction0(disableAutomaticDeviceSelection), disableOpcodeSubsetTest = js.Any.fromFunction0(disableOpcodeSubsetTest), enableAutomaticDeviceSelection = js.Any.fromFunction1(enableAutomaticDeviceSelection), enableOpcodeSubsetTest = js.Any.fromFunction0(enableOpcodeSubsetTest), enableOpenCL = js.Any.fromFunction1(enableOpenCL), getDeviceID = js.Any.fromFunction0(getDeviceID), getFormulaCellNumberLimit = js.Any.fromFunction0(getFormulaCellNumberLimit), getOpenCLPlatforms = js.Any.fromFunction0(getOpenCLPlatforms), getPlatformID = js.Any.fromFunction0(getPlatformID), isOpcodeSubsetTested = js.Any.fromFunction0(isOpcodeSubsetTested), isOpenCLEnabled = js.Any.fromFunction0(isOpenCLEnabled), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectOpenCLDevice = js.Any.fromFunction2(selectOpenCLDevice), setFormulaCellNumberLimit = js.Any.fromFunction1(setFormulaCellNumberLimit))
    __obj.asInstanceOf[XOpenCLSelection]
  }
  @scala.inline
  implicit class XOpenCLSelectionOps[Self <: XOpenCLSelection] (val x: Self) extends AnyVal {
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
    def setDeviceID(value: Double): Self = this.set("DeviceID", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormulaCellNumberLimit(value: Double): Self = this.set("FormulaCellNumberLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenCLPlatforms(value: SafeArray[OpenCLPlatform]): Self = this.set("OpenCLPlatforms", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatformID(value: Double): Self = this.set("PlatformID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableAutomaticDeviceSelection(value: () => Unit): Self = this.set("disableAutomaticDeviceSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setDisableOpcodeSubsetTest(value: () => Unit): Self = this.set("disableOpcodeSubsetTest", js.Any.fromFunction0(value))
    @scala.inline
    def setEnableAutomaticDeviceSelection(value: Boolean => Unit): Self = this.set("enableAutomaticDeviceSelection", js.Any.fromFunction1(value))
    @scala.inline
    def setEnableOpcodeSubsetTest(value: () => Unit): Self = this.set("enableOpcodeSubsetTest", js.Any.fromFunction0(value))
    @scala.inline
    def setEnableOpenCL(value: Boolean => Unit): Self = this.set("enableOpenCL", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDeviceID(value: () => Double): Self = this.set("getDeviceID", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFormulaCellNumberLimit(value: () => Double): Self = this.set("getFormulaCellNumberLimit", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOpenCLPlatforms(value: () => SafeArray[OpenCLPlatform]): Self = this.set("getOpenCLPlatforms", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPlatformID(value: () => Double): Self = this.set("getPlatformID", js.Any.fromFunction0(value))
    @scala.inline
    def setIsOpcodeSubsetTested(value: () => Boolean): Self = this.set("isOpcodeSubsetTested", js.Any.fromFunction0(value))
    @scala.inline
    def setIsOpenCLEnabled(value: () => Boolean): Self = this.set("isOpenCLEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setSelectOpenCLDevice(value: (Double, Double) => Unit): Self = this.set("selectOpenCLDevice", js.Any.fromFunction2(value))
    @scala.inline
    def setSetFormulaCellNumberLimit(value: Double => Unit): Self = this.set("setFormulaCellNumberLimit", js.Any.fromFunction1(value))
  }
  
}

