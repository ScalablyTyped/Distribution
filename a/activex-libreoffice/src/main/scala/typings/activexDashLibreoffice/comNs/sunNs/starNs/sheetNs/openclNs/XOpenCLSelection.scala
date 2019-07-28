package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.openclNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XOpenCLSelection extends XInterface {
  /**
    * returns the index of the currently selected device. This is an index into the sequence of devices in the OpenCLPLatform object the device is part of
    * in the current instance of LibreOffice (and not some a priori defined identifier for a specific model of device accessed through a specific platform).
    */
  val DeviceID: Double
  var FormulaCellNumberLimit: Double
  /** lists all OpenCL devices and platforms */
  val OpenCLPlatforms: SafeArray[OpenCLPlatform]
  /**
    * returns the index of the platform of the currently selected device. This is an index into the sequence that getOpenCLPlatforms returns in the current
    * instance of LibreOffice (and not some a priori defined identifier for an OpenCL platform).
    */
  val PlatformID: Double
  /** Disables automatic OpenCL Device Selection */
  def disableAutomaticDeviceSelection(): Unit
  def disableOpcodeSubsetTest(): Unit
  /**
    * Enables automatic OpenCL Device Selection
    * @param force forces a new evaluation of the best device
    */
  def enableAutomaticDeviceSelection(force: Boolean): Unit
  def enableOpcodeSubsetTest(): Unit
  /**
    * Enables or disables use of OpenCL for calculations. When using this API to enable OpenCL the configuration parameters are set to their built-in
    * default values, not ones read from the installation of user-specific configuration.
    */
  def enableOpenCL(enable: Boolean): Unit
  /**
    * returns the index of the currently selected device. This is an index into the sequence of devices in the OpenCLPLatform object the device is part of
    * in the current instance of LibreOffice (and not some a priori defined identifier for a specific model of device accessed through a specific platform).
    */
  def getDeviceID(): Double
  def getFormulaCellNumberLimit(): Double
  /** lists all OpenCL devices and platforms */
  def getOpenCLPlatforms(): SafeArray[OpenCLPlatform]
  /**
    * returns the index of the platform of the currently selected device. This is an index into the sequence that getOpenCLPlatforms returns in the current
    * instance of LibreOffice (and not some a priori defined identifier for an OpenCL platform).
    */
  def getPlatformID(): Double
  def isOpcodeSubsetTested(): Boolean
  /**
    * Returns true if calculation with OpenCL is enabled (at all). The actual use of OpenCL for a formula is also affected by the configuration settings
    * specifying whether OpenCL is used for all opcodes or just for a subset, and the black- and whitelists of OpenCL implementations that are in use.
    */
  def isOpenCLEnabled(): Boolean
  /**
    * Select the OpenCL device with the given platform and device number. The platform number corresponds to an index into the sequence returned by
    * getOpenCLPlatforms, and the device number corresponds to an index into the sequence of devices in that platform.
    */
  def selectOpenCLDevice(platform: Double, device: Double): Unit
  def setFormulaCellNumberLimit(number: Double): Unit
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
    val __obj = js.Dynamic.literal(DeviceID = DeviceID, FormulaCellNumberLimit = FormulaCellNumberLimit, OpenCLPlatforms = OpenCLPlatforms, PlatformID = PlatformID, acquire = js.Any.fromFunction0(acquire), disableAutomaticDeviceSelection = js.Any.fromFunction0(disableAutomaticDeviceSelection), disableOpcodeSubsetTest = js.Any.fromFunction0(disableOpcodeSubsetTest), enableAutomaticDeviceSelection = js.Any.fromFunction1(enableAutomaticDeviceSelection), enableOpcodeSubsetTest = js.Any.fromFunction0(enableOpcodeSubsetTest), enableOpenCL = js.Any.fromFunction1(enableOpenCL), getDeviceID = js.Any.fromFunction0(getDeviceID), getFormulaCellNumberLimit = js.Any.fromFunction0(getFormulaCellNumberLimit), getOpenCLPlatforms = js.Any.fromFunction0(getOpenCLPlatforms), getPlatformID = js.Any.fromFunction0(getPlatformID), isOpcodeSubsetTested = js.Any.fromFunction0(isOpcodeSubsetTested), isOpenCLEnabled = js.Any.fromFunction0(isOpenCLEnabled), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectOpenCLDevice = js.Any.fromFunction2(selectOpenCLDevice), setFormulaCellNumberLimit = js.Any.fromFunction1(setFormulaCellNumberLimit))
  
    __obj.asInstanceOf[XOpenCLSelection]
  }
}

