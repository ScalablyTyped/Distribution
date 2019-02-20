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

