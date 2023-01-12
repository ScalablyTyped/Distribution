package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProfileJobResponse extends StObject {
  
  /**
    * The name of the job that was updated.
    */
  var Name: JobName
}
object UpdateProfileJobResponse {
  
  inline def apply(Name: JobName): UpdateProfileJobResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfileJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProfileJobResponse] (val x: Self) extends AnyVal {
    
    inline def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
