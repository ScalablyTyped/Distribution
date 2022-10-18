package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataDestination extends StObject {
  
  /**
    * The path to an Amazon Simple Storage Service (Amazon S3) bucket along with the credentials to access the bucket.
    */
  var S3Config: typings.awsSdk.clientsForecastserviceMod.S3Config
}
object DataDestination {
  
  inline def apply(S3Config: S3Config): DataDestination = {
    val __obj = js.Dynamic.literal(S3Config = S3Config.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDestination]
  }
  
  extension [Self <: DataDestination](x: Self) {
    
    inline def setS3Config(value: S3Config): Self = StObject.set(x, "S3Config", value.asInstanceOf[js.Any])
  }
}
