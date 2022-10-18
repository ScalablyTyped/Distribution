package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputLocation extends StObject {
  
  /**
    * Describes an S3 location that will receive the results of the restore request.
    */
  var S3: js.UndefOr[S3Location] = js.undefined
}
object OutputLocation {
  
  inline def apply(): OutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLocation]
  }
  
  extension [Self <: OutputLocation](x: Self) {
    
    inline def setS3(value: S3Location): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
  }
}
