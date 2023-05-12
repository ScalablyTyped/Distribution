package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HubS3StorageConfig extends StObject {
  
  /**
    * The Amazon S3 bucket prefix for hosting hub content.
    */
  var S3OutputPath: js.UndefOr[typings.awsSdk.clientsSagemakerMod.S3OutputPath] = js.undefined
}
object HubS3StorageConfig {
  
  inline def apply(): HubS3StorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HubS3StorageConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HubS3StorageConfig] (val x: Self) extends AnyVal {
    
    inline def setS3OutputPath(value: S3OutputPath): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
    
    inline def setS3OutputPathUndefined: Self = StObject.set(x, "S3OutputPath", js.undefined)
  }
}
