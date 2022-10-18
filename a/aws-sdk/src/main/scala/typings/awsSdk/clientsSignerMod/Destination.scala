package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    * The S3Destination object.
    */
  var s3: js.UndefOr[S3Destination] = js.undefined
}
object Destination {
  
  inline def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  
  extension [Self <: Destination](x: Self) {
    
    inline def setS3(value: S3Destination): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
