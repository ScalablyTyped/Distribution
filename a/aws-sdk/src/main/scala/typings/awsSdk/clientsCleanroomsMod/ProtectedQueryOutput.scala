package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedQueryOutput extends StObject {
  
  /**
    * If present, the output for a protected query with an `S3` output type.
    */
  var s3: js.UndefOr[ProtectedQueryS3Output] = js.undefined
}
object ProtectedQueryOutput {
  
  inline def apply(): ProtectedQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectedQueryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectedQueryOutput] (val x: Self) extends AnyVal {
    
    inline def setS3(value: ProtectedQueryS3Output): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
