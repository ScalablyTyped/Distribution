package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExperienceResponse extends StObject {
  
  /**
    * The identifier for your created Amazon Kendra experience.
    */
  var Id: ExperienceId
}
object CreateExperienceResponse {
  
  inline def apply(Id: ExperienceId): CreateExperienceResponse = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExperienceResponse]
  }
  
  extension [Self <: CreateExperienceResponse](x: Self) {
    
    inline def setId(value: ExperienceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
