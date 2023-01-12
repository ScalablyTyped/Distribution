package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsInfo extends StObject {
  
  /**
    * Describes the optimized EBS performance for the instance type.
    */
  var EbsOptimizedInfo: js.UndefOr[typings.awsSdk.clientsEc2Mod.EbsOptimizedInfo] = js.undefined
  
  /**
    * Indicates whether the instance type is Amazon EBS-optimized. For more information, see Amazon EBS-optimized instances in Amazon EC2 User Guide.
    */
  var EbsOptimizedSupport: js.UndefOr[typings.awsSdk.clientsEc2Mod.EbsOptimizedSupport] = js.undefined
  
  /**
    * Indicates whether Amazon EBS encryption is supported.
    */
  var EncryptionSupport: js.UndefOr[EbsEncryptionSupport] = js.undefined
  
  /**
    * Indicates whether non-volatile memory express (NVMe) is supported.
    */
  var NvmeSupport: js.UndefOr[EbsNvmeSupport] = js.undefined
}
object EbsInfo {
  
  inline def apply(): EbsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EbsInfo] (val x: Self) extends AnyVal {
    
    inline def setEbsOptimizedInfo(value: EbsOptimizedInfo): Self = StObject.set(x, "EbsOptimizedInfo", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedInfoUndefined: Self = StObject.set(x, "EbsOptimizedInfo", js.undefined)
    
    inline def setEbsOptimizedSupport(value: EbsOptimizedSupport): Self = StObject.set(x, "EbsOptimizedSupport", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedSupportUndefined: Self = StObject.set(x, "EbsOptimizedSupport", js.undefined)
    
    inline def setEncryptionSupport(value: EbsEncryptionSupport): Self = StObject.set(x, "EncryptionSupport", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSupportUndefined: Self = StObject.set(x, "EncryptionSupport", js.undefined)
    
    inline def setNvmeSupport(value: EbsNvmeSupport): Self = StObject.set(x, "NvmeSupport", value.asInstanceOf[js.Any])
    
    inline def setNvmeSupportUndefined: Self = StObject.set(x, "NvmeSupport", js.undefined)
  }
}
