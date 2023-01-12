package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opencl {
  
  trait OpenCLDevice extends StObject {
    
    /** The driver version as returned by OpenCL */
    var Driver: String
    
    /** The name of the device as returned by OpenCL */
    var Name: String
    
    /** The vendor of the device as returned by OpenCL */
    var Vendor: String
  }
  object OpenCLDevice {
    
    inline def apply(Driver: String, Name: String, Vendor: String): OpenCLDevice = {
      val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Vendor = Vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenCLDevice]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenCLDevice] (val x: Self) extends AnyVal {
      
      inline def setDriver(value: String): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: String): Self = StObject.set(x, "Vendor", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenCLPlatform extends StObject {
    
    var Devices: SafeArray[OpenCLDevice]
    
    /** The name of the platform as returned by OpenCL */
    var Name: String
    
    var Vendor: String
  }
  object OpenCLPlatform {
    
    inline def apply(Devices: SafeArray[OpenCLDevice], Name: String, Vendor: String): OpenCLPlatform = {
      val __obj = js.Dynamic.literal(Devices = Devices.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Vendor = Vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenCLPlatform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenCLPlatform] (val x: Self) extends AnyVal {
      
      inline def setDevices(value: SafeArray[OpenCLDevice]): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: String): Self = StObject.set(x, "Vendor", value.asInstanceOf[js.Any])
    }
  }
  
  trait XOpenCLSelection
    extends StObject
       with XInterface {
    
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
    
    inline def apply(
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
      queryInterface: `type` => Any,
      release: () => Unit,
      selectOpenCLDevice: (Double, Double) => Unit,
      setFormulaCellNumberLimit: Double => Unit
    ): XOpenCLSelection = {
      val __obj = js.Dynamic.literal(DeviceID = DeviceID.asInstanceOf[js.Any], FormulaCellNumberLimit = FormulaCellNumberLimit.asInstanceOf[js.Any], OpenCLPlatforms = OpenCLPlatforms.asInstanceOf[js.Any], PlatformID = PlatformID.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), disableAutomaticDeviceSelection = js.Any.fromFunction0(disableAutomaticDeviceSelection), disableOpcodeSubsetTest = js.Any.fromFunction0(disableOpcodeSubsetTest), enableAutomaticDeviceSelection = js.Any.fromFunction1(enableAutomaticDeviceSelection), enableOpcodeSubsetTest = js.Any.fromFunction0(enableOpcodeSubsetTest), enableOpenCL = js.Any.fromFunction1(enableOpenCL), getDeviceID = js.Any.fromFunction0(getDeviceID), getFormulaCellNumberLimit = js.Any.fromFunction0(getFormulaCellNumberLimit), getOpenCLPlatforms = js.Any.fromFunction0(getOpenCLPlatforms), getPlatformID = js.Any.fromFunction0(getPlatformID), isOpcodeSubsetTested = js.Any.fromFunction0(isOpcodeSubsetTested), isOpenCLEnabled = js.Any.fromFunction0(isOpenCLEnabled), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectOpenCLDevice = js.Any.fromFunction2(selectOpenCLDevice), setFormulaCellNumberLimit = js.Any.fromFunction1(setFormulaCellNumberLimit))
      __obj.asInstanceOf[XOpenCLSelection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XOpenCLSelection] (val x: Self) extends AnyVal {
      
      inline def setDeviceID(value: Double): Self = StObject.set(x, "DeviceID", value.asInstanceOf[js.Any])
      
      inline def setDisableAutomaticDeviceSelection(value: () => Unit): Self = StObject.set(x, "disableAutomaticDeviceSelection", js.Any.fromFunction0(value))
      
      inline def setDisableOpcodeSubsetTest(value: () => Unit): Self = StObject.set(x, "disableOpcodeSubsetTest", js.Any.fromFunction0(value))
      
      inline def setEnableAutomaticDeviceSelection(value: Boolean => Unit): Self = StObject.set(x, "enableAutomaticDeviceSelection", js.Any.fromFunction1(value))
      
      inline def setEnableOpcodeSubsetTest(value: () => Unit): Self = StObject.set(x, "enableOpcodeSubsetTest", js.Any.fromFunction0(value))
      
      inline def setEnableOpenCL(value: Boolean => Unit): Self = StObject.set(x, "enableOpenCL", js.Any.fromFunction1(value))
      
      inline def setFormulaCellNumberLimit(value: Double): Self = StObject.set(x, "FormulaCellNumberLimit", value.asInstanceOf[js.Any])
      
      inline def setGetDeviceID(value: () => Double): Self = StObject.set(x, "getDeviceID", js.Any.fromFunction0(value))
      
      inline def setGetFormulaCellNumberLimit(value: () => Double): Self = StObject.set(x, "getFormulaCellNumberLimit", js.Any.fromFunction0(value))
      
      inline def setGetOpenCLPlatforms(value: () => SafeArray[OpenCLPlatform]): Self = StObject.set(x, "getOpenCLPlatforms", js.Any.fromFunction0(value))
      
      inline def setGetPlatformID(value: () => Double): Self = StObject.set(x, "getPlatformID", js.Any.fromFunction0(value))
      
      inline def setIsOpcodeSubsetTested(value: () => Boolean): Self = StObject.set(x, "isOpcodeSubsetTested", js.Any.fromFunction0(value))
      
      inline def setIsOpenCLEnabled(value: () => Boolean): Self = StObject.set(x, "isOpenCLEnabled", js.Any.fromFunction0(value))
      
      inline def setOpenCLPlatforms(value: SafeArray[OpenCLPlatform]): Self = StObject.set(x, "OpenCLPlatforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformID(value: Double): Self = StObject.set(x, "PlatformID", value.asInstanceOf[js.Any])
      
      inline def setSelectOpenCLDevice(value: (Double, Double) => Unit): Self = StObject.set(x, "selectOpenCLDevice", js.Any.fromFunction2(value))
      
      inline def setSetFormulaCellNumberLimit(value: Double => Unit): Self = StObject.set(x, "setFormulaCellNumberLimit", js.Any.fromFunction1(value))
    }
  }
}
