package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernelGatewayImageConfig extends StObject {
  
  /**
    * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
    */
  var FileSystemConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FileSystemConfig] = js.undefined
  
  /**
    * The specification of the Jupyter kernels in the image.
    */
  var KernelSpecs: typings.awsSdk.clientsSagemakerMod.KernelSpecs
}
object KernelGatewayImageConfig {
  
  inline def apply(KernelSpecs: KernelSpecs): KernelGatewayImageConfig = {
    val __obj = js.Dynamic.literal(KernelSpecs = KernelSpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelGatewayImageConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KernelGatewayImageConfig] (val x: Self) extends AnyVal {
    
    inline def setFileSystemConfig(value: FileSystemConfig): Self = StObject.set(x, "FileSystemConfig", value.asInstanceOf[js.Any])
    
    inline def setFileSystemConfigUndefined: Self = StObject.set(x, "FileSystemConfig", js.undefined)
    
    inline def setKernelSpecs(value: KernelSpecs): Self = StObject.set(x, "KernelSpecs", value.asInstanceOf[js.Any])
    
    inline def setKernelSpecsVarargs(value: KernelSpec*): Self = StObject.set(x, "KernelSpecs", js.Array(value*))
  }
}
