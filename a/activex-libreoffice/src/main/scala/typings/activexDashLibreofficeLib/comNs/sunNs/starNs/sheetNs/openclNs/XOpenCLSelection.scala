package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.openclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XOpenCLSelection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the index of the currently selected device. This is an index into the sequence of devices in the OpenCLPLatform object the device is part of
    * in the current instance of LibreOffice (and not some a priori defined identifier for a specific model of device accessed through a specific platform).
    */
  val DeviceID: scala.Double
  var FormulaCellNumberLimit: scala.Double
  /** lists all OpenCL devices and platforms */
  val OpenCLPlatforms: stdLib.SafeArray[OpenCLPlatform]
  /**
    * returns the index of the platform of the currently selected device. This is an index into the sequence that getOpenCLPlatforms returns in the current
    * instance of LibreOffice (and not some a priori defined identifier for an OpenCL platform).
    */
  val PlatformID: scala.Double
  /** Disables automatic OpenCL Device Selection */
  def disableAutomaticDeviceSelection(): scala.Unit
  def disableOpcodeSubsetTest(): scala.Unit
  /**
    * Enables automatic OpenCL Device Selection
    * @param force forces a new evaluation of the best device
    */
  def enableAutomaticDeviceSelection(force: scala.Boolean): scala.Unit
  def enableOpcodeSubsetTest(): scala.Unit
  /**
    * Enables or disables use of OpenCL for calculations. When using this API to enable OpenCL the configuration parameters are set to their built-in
    * default values, not ones read from the installation of user-specific configuration.
    */
  def enableOpenCL(enable: scala.Boolean): scala.Unit
  /**
    * returns the index of the currently selected device. This is an index into the sequence of devices in the OpenCLPLatform object the device is part of
    * in the current instance of LibreOffice (and not some a priori defined identifier for a specific model of device accessed through a specific platform).
    */
  def getDeviceID(): scala.Double
  def getFormulaCellNumberLimit(): scala.Double
  /** lists all OpenCL devices and platforms */
  def getOpenCLPlatforms(): stdLib.SafeArray[OpenCLPlatform]
  /**
    * returns the index of the platform of the currently selected device. This is an index into the sequence that getOpenCLPlatforms returns in the current
    * instance of LibreOffice (and not some a priori defined identifier for an OpenCL platform).
    */
  def getPlatformID(): scala.Double
  def isOpcodeSubsetTested(): scala.Boolean
  /**
    * Returns true if calculation with OpenCL is enabled (at all). The actual use of OpenCL for a formula is also affected by the configuration settings
    * specifying whether OpenCL is used for all opcodes or just for a subset, and the black- and whitelists of OpenCL implementations that are in use.
    */
  def isOpenCLEnabled(): scala.Boolean
  /**
    * Select the OpenCL device with the given platform and device number. The platform number corresponds to an index into the sequence returned by
    * getOpenCLPlatforms, and the device number corresponds to an index into the sequence of devices in that platform.
    */
  def selectOpenCLDevice(platform: scala.Double, device: scala.Double): scala.Unit
  def setFormulaCellNumberLimit(number: scala.Double): scala.Unit
}

object XOpenCLSelection {
  @scala.inline
  def apply(
    DeviceID: scala.Double,
    FormulaCellNumberLimit: scala.Double,
    OpenCLPlatforms: stdLib.SafeArray[OpenCLPlatform],
    PlatformID: scala.Double,
    acquire: () => scala.Unit,
    disableAutomaticDeviceSelection: () => scala.Unit,
    disableOpcodeSubsetTest: () => scala.Unit,
    enableAutomaticDeviceSelection: scala.Boolean => scala.Unit,
    enableOpcodeSubsetTest: () => scala.Unit,
    enableOpenCL: scala.Boolean => scala.Unit,
    getDeviceID: () => scala.Double,
    getFormulaCellNumberLimit: () => scala.Double,
    getOpenCLPlatforms: () => stdLib.SafeArray[OpenCLPlatform],
    getPlatformID: () => scala.Double,
    isOpcodeSubsetTested: () => scala.Boolean,
    isOpenCLEnabled: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    selectOpenCLDevice: (scala.Double, scala.Double) => scala.Unit,
    setFormulaCellNumberLimit: scala.Double => scala.Unit
  ): XOpenCLSelection = {
    val __obj = js.Dynamic.literal(DeviceID = DeviceID, FormulaCellNumberLimit = FormulaCellNumberLimit, OpenCLPlatforms = OpenCLPlatforms, PlatformID = PlatformID, acquire = js.Any.fromFunction0(acquire), disableAutomaticDeviceSelection = js.Any.fromFunction0(disableAutomaticDeviceSelection), disableOpcodeSubsetTest = js.Any.fromFunction0(disableOpcodeSubsetTest), enableAutomaticDeviceSelection = js.Any.fromFunction1(enableAutomaticDeviceSelection), enableOpcodeSubsetTest = js.Any.fromFunction0(enableOpcodeSubsetTest), enableOpenCL = js.Any.fromFunction1(enableOpenCL), getDeviceID = js.Any.fromFunction0(getDeviceID), getFormulaCellNumberLimit = js.Any.fromFunction0(getFormulaCellNumberLimit), getOpenCLPlatforms = js.Any.fromFunction0(getOpenCLPlatforms), getPlatformID = js.Any.fromFunction0(getPlatformID), isOpcodeSubsetTested = js.Any.fromFunction0(isOpcodeSubsetTested), isOpenCLEnabled = js.Any.fromFunction0(isOpenCLEnabled), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectOpenCLDevice = js.Any.fromFunction2(selectOpenCLDevice), setFormulaCellNumberLimit = js.Any.fromFunction1(setFormulaCellNumberLimit))
  
    __obj.asInstanceOf[XOpenCLSelection]
  }
}

