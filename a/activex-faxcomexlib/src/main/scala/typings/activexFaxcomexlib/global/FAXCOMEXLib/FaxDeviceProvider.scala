package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_PROVIDER_STATUS_ENUM
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxDeviceProvider Class */
@JSGlobal("FAXCOMEXLib.FaxDeviceProvider")
@js.native
/* private */ open class FaxDeviceProvider ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxDeviceProvider {
  
  /** Is device provider built in debug environment */
  /* CompleteClass */
  override val Debug: Boolean = js.native
  
  /** Array of device IDs exposed by the provider */
  /* CompleteClass */
  override val DeviceIds: SafeArray[Double] = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxDeviceProvider_typekey")
  var FAXCOMEXLibDotFaxDeviceProvider_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxDeviceProvider = js.native
  
  /** Provider's friendly name */
  /* CompleteClass */
  override val FriendlyName: String = js.native
  
  /** Full path and file name of the provider DLL */
  /* CompleteClass */
  override val ImageName: String = js.native
  
  /** Last error code at load or initialization */
  /* CompleteClass */
  override val InitErrorCode: Double = js.native
  
  /** The major part of the device provider's build number */
  /* CompleteClass */
  override val MajorBuild: Double = js.native
  
  /** The major part of the device provider's version number */
  /* CompleteClass */
  override val MajorVersion: Double = js.native
  
  /** The minor part of the device provider's build number */
  /* CompleteClass */
  override val MinorBuild: Double = js.native
  
  /** The minor part of the device provider's version number */
  /* CompleteClass */
  override val MinorVersion: Double = js.native
  
  /** Status of the device provider */
  /* CompleteClass */
  override val Status: FAX_PROVIDER_STATUS_ENUM = js.native
  
  /** TSP name used by the provider */
  /* CompleteClass */
  override val TapiProviderName: String = js.native
  
  /** Unique name of the provider */
  /* CompleteClass */
  override val UniqueName: String = js.native
}
