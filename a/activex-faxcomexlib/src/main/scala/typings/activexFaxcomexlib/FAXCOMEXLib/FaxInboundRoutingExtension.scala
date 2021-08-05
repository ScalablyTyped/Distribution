package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxInboundRoutingExtension Class */
trait FaxInboundRoutingExtension extends StObject {
  
  /** Is extension built in debug environment */
  val Debug: Boolean
  
  /* private */ @JSName("FAXCOMEXLib.FaxInboundRoutingExtension_typekey")
  var FAXCOMEXLibDotFaxInboundRoutingExtension_typekey: FaxInboundRoutingExtension
  
  /** Extension's friendly name */
  val FriendlyName: String
  
  /** Full path and file name of the extension DLL */
  val ImageName: String
  
  /** Last error code at load or initialization */
  val InitErrorCode: Double
  
  /** The major part of extension's build number */
  val MajorBuild: Double
  
  /** The major part of extension's version number */
  val MajorVersion: Double
  
  /** Array of methods exposed by extension */
  val Methods: SafeArray[String]
  
  /** The minor part of extension's build number */
  val MinorBuild: Double
  
  /** The minor part of extension's version number */
  val MinorVersion: Double
  
  /** Load and initialization status of the extension */
  val Status: FAX_PROVIDER_STATUS_ENUM
  
  /** Extension's unique name */
  val UniqueName: String
}
object FaxInboundRoutingExtension {
  
  inline def apply(
    Debug: Boolean,
    FAXCOMEXLibDotFaxInboundRoutingExtension_typekey: FaxInboundRoutingExtension,
    FriendlyName: String,
    ImageName: String,
    InitErrorCode: Double,
    MajorBuild: Double,
    MajorVersion: Double,
    Methods: SafeArray[String],
    MinorBuild: Double,
    MinorVersion: Double,
    Status: FAX_PROVIDER_STATUS_ENUM,
    UniqueName: String
  ): FaxInboundRoutingExtension = {
    val __obj = js.Dynamic.literal(Debug = Debug.asInstanceOf[js.Any], FriendlyName = FriendlyName.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any], InitErrorCode = InitErrorCode.asInstanceOf[js.Any], MajorBuild = MajorBuild.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], Methods = Methods.asInstanceOf[js.Any], MinorBuild = MinorBuild.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UniqueName = UniqueName.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxInboundRoutingExtension_typekey")(FAXCOMEXLibDotFaxInboundRoutingExtension_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxInboundRoutingExtension]
  }
  
  extension [Self <: FaxInboundRoutingExtension](x: Self) {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "Debug", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxInboundRoutingExtension_typekey(value: FaxInboundRoutingExtension): Self = StObject.set(x, "FAXCOMEXLib.FaxInboundRoutingExtension_typekey", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "FriendlyName", value.asInstanceOf[js.Any])
    
    inline def setImageName(value: String): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    inline def setInitErrorCode(value: Double): Self = StObject.set(x, "InitErrorCode", value.asInstanceOf[js.Any])
    
    inline def setMajorBuild(value: Double): Self = StObject.set(x, "MajorBuild", value.asInstanceOf[js.Any])
    
    inline def setMajorVersion(value: Double): Self = StObject.set(x, "MajorVersion", value.asInstanceOf[js.Any])
    
    inline def setMethods(value: SafeArray[String]): Self = StObject.set(x, "Methods", value.asInstanceOf[js.Any])
    
    inline def setMinorBuild(value: Double): Self = StObject.set(x, "MinorBuild", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: Double): Self = StObject.set(x, "MinorVersion", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: FAX_PROVIDER_STATUS_ENUM): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "UniqueName", value.asInstanceOf[js.Any])
  }
}
