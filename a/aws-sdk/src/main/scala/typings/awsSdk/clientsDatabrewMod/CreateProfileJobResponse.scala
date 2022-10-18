package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProfileJobResponse extends StObject {
  
  /**
    * The name of the job that was created.
    */
  var Name: JobName
}
object CreateProfileJobResponse {
  
  inline def apply(Name: JobName): CreateProfileJobResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileJobResponse]
  }
  
  extension [Self <: CreateProfileJobResponse](x: Self) {
    
    inline def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
