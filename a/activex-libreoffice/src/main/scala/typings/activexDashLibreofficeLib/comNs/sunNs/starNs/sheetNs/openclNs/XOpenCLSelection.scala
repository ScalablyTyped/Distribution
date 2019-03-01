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
  val OpenCLPlatforms: activexDashInteropLib.SafeArray[OpenCLPlatform]
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
  def getOpenCLPlatforms(): activexDashInteropLib.SafeArray[OpenCLPlatform]
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
    OpenCLPlatforms: activexDashInteropLib.SafeArray[OpenCLPlatform],
    PlatformID: scala.Double,
    acquire: js.Function0[scala.Unit],
    disableAutomaticDeviceSelection: js.Function0[scala.Unit],
    disableOpcodeSubsetTest: js.Function0[scala.Unit],
    enableAutomaticDeviceSelection: js.Function1[scala.Boolean, scala.Unit],
    enableOpcodeSubsetTest: js.Function0[scala.Unit],
    enableOpenCL: js.Function1[scala.Boolean, scala.Unit],
    getDeviceID: js.Function0[scala.Double],
    getFormulaCellNumberLimit: js.Function0[scala.Double],
    getOpenCLPlatforms: js.Function0[activexDashInteropLib.SafeArray[OpenCLPlatform]],
    getPlatformID: js.Function0[scala.Double],
    isOpcodeSubsetTested: js.Function0[scala.Boolean],
    isOpenCLEnabled: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    selectOpenCLDevice: js.Function2[scala.Double, scala.Double, scala.Unit],
    setFormulaCellNumberLimit: js.Function1[scala.Double, scala.Unit]
  ): XOpenCLSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DeviceID")(DeviceID)
    __obj.updateDynamic("FormulaCellNumberLimit")(FormulaCellNumberLimit)
    __obj.updateDynamic("OpenCLPlatforms")(OpenCLPlatforms)
    __obj.updateDynamic("PlatformID")(PlatformID)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("disableAutomaticDeviceSelection")(disableAutomaticDeviceSelection)
    __obj.updateDynamic("disableOpcodeSubsetTest")(disableOpcodeSubsetTest)
    __obj.updateDynamic("enableAutomaticDeviceSelection")(enableAutomaticDeviceSelection)
    __obj.updateDynamic("enableOpcodeSubsetTest")(enableOpcodeSubsetTest)
    __obj.updateDynamic("enableOpenCL")(enableOpenCL)
    __obj.updateDynamic("getDeviceID")(getDeviceID)
    __obj.updateDynamic("getFormulaCellNumberLimit")(getFormulaCellNumberLimit)
    __obj.updateDynamic("getOpenCLPlatforms")(getOpenCLPlatforms)
    __obj.updateDynamic("getPlatformID")(getPlatformID)
    __obj.updateDynamic("isOpcodeSubsetTested")(isOpcodeSubsetTested)
    __obj.updateDynamic("isOpenCLEnabled")(isOpenCLEnabled)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("selectOpenCLDevice")(selectOpenCLDevice)
    __obj.updateDynamic("setFormulaCellNumberLimit")(setFormulaCellNumberLimit)
    __obj.asInstanceOf[XOpenCLSelection]
  }
}

