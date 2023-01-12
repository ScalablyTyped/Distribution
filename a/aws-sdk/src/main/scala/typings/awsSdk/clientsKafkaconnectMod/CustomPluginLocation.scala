package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPluginLocation extends StObject {
  
  /**
    * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the plugin file stored in Amazon S3.
    */
  var s3Location: S3Location
}
object CustomPluginLocation {
  
  inline def apply(s3Location: S3Location): CustomPluginLocation = {
    val __obj = js.Dynamic.literal(s3Location = s3Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPluginLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomPluginLocation] (val x: Self) extends AnyVal {
    
    inline def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
  }
}
