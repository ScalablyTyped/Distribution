package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition extends StObject {
  
  /**
    * The content of the application definition. This is a JSON object that contains the resource configuration/definitions that identify an application.
    */
  var content: js.UndefOr[StringFree65000] = js.undefined
  
  /**
    * The S3 bucket that contains the application definition.
    */
  var s3Location: js.UndefOr[String2000] = js.undefined
}
object Definition {
  
  inline def apply(): Definition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Definition]
  }
  
  extension [Self <: Definition](x: Self) {
    
    inline def setContent(value: StringFree65000): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setS3Location(value: String2000): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
