package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileLocation extends StObject {
  
  /**
    * The location of the updated firmware in S3.
    */
  var s3Location: js.UndefOr[S3Location] = js.undefined
  
  /**
    * The stream that contains the OTA update.
    */
  var stream: js.UndefOr[Stream] = js.undefined
}
object FileLocation {
  
  inline def apply(): FileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileLocation] (val x: Self) extends AnyVal {
    
    inline def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
    
    inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
