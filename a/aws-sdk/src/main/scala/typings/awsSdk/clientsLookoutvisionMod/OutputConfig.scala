package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputConfig extends StObject {
  
  /**
    * The S3 location for the output.
    */
  var S3Location: typings.awsSdk.clientsLookoutvisionMod.S3Location
}
object OutputConfig {
  
  inline def apply(S3Location: S3Location): OutputConfig = {
    val __obj = js.Dynamic.literal(S3Location = S3Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputConfig]
  }
  
  extension [Self <: OutputConfig](x: Self) {
    
    inline def setS3Location(value: S3Location): Self = StObject.set(x, "S3Location", value.asInstanceOf[js.Any])
  }
}
