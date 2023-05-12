package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedQueryOutputConfiguration extends StObject {
  
  /**
    * Required configuration for a protected query with an `S3` output type.
    */
  var s3: js.UndefOr[ProtectedQueryS3OutputConfiguration] = js.undefined
}
object ProtectedQueryOutputConfiguration {
  
  inline def apply(): ProtectedQueryOutputConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectedQueryOutputConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectedQueryOutputConfiguration] (val x: Self) extends AnyVal {
    
    inline def setS3(value: ProtectedQueryS3OutputConfiguration): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
