package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageVersionInputConfig extends StObject {
  
  /**
    * A location in Amazon S3.
    */
  var S3Location: typings.awsSdk.clientsPanoramaMod.S3Location
}
object PackageVersionInputConfig {
  
  inline def apply(S3Location: S3Location): PackageVersionInputConfig = {
    val __obj = js.Dynamic.literal(S3Location = S3Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageVersionInputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageVersionInputConfig] (val x: Self) extends AnyVal {
    
    inline def setS3Location(value: S3Location): Self = StObject.set(x, "S3Location", value.asInstanceOf[js.Any])
  }
}
