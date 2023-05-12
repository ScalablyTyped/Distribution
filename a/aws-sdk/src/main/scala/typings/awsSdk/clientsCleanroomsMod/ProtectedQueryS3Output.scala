package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedQueryS3Output extends StObject {
  
  /**
    * The S3 location of the result.
    */
  var location: String
}
object ProtectedQueryS3Output {
  
  inline def apply(location: String): ProtectedQueryS3Output = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedQueryS3Output]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectedQueryS3Output] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
