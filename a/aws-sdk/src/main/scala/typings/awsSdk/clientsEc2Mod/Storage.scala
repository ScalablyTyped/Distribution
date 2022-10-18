package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Storage extends StObject {
  
  /**
    * An Amazon S3 storage location.
    */
  var S3: js.UndefOr[S3Storage] = js.undefined
}
object Storage {
  
  inline def apply(): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Storage]
  }
  
  extension [Self <: Storage](x: Self) {
    
    inline def setS3(value: S3Storage): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
  }
}
