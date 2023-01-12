package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputDataConfig extends StObject {
  
  /**
    *  The output data configuration that was supplied when the export job was created. 
    */
  var S3Configuration: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.S3Configuration] = js.undefined
}
object OutputDataConfig {
  
  inline def apply(): OutputDataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDataConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputDataConfig] (val x: Self) extends AnyVal {
    
    inline def setS3Configuration(value: S3Configuration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigurationUndefined: Self = StObject.set(x, "S3Configuration", js.undefined)
  }
}
