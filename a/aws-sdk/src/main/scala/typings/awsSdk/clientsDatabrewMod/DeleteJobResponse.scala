package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobResponse extends StObject {
  
  /**
    * The name of the job that you deleted.
    */
  var Name: JobName
}
object DeleteJobResponse {
  
  inline def apply(Name: JobName): DeleteJobResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteJobResponse] (val x: Self) extends AnyVal {
    
    inline def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
