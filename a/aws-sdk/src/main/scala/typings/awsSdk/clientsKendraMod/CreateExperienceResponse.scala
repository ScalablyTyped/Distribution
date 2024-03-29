package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExperienceResponse extends StObject {
  
  /**
    * The identifier of your Amazon Kendra experience.
    */
  var Id: ExperienceId
}
object CreateExperienceResponse {
  
  inline def apply(Id: ExperienceId): CreateExperienceResponse = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExperienceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateExperienceResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: ExperienceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
