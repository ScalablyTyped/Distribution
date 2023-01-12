package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQualificationScoreResponse extends StObject {
  
  /**
    *  The Qualification data structure of the Qualification assigned to a user, including the Qualification type and the value (score). 
    */
  var Qualification: js.UndefOr[typings.awsSdk.clientsMturkMod.Qualification] = js.undefined
}
object GetQualificationScoreResponse {
  
  inline def apply(): GetQualificationScoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQualificationScoreResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetQualificationScoreResponse] (val x: Self) extends AnyVal {
    
    inline def setQualification(value: Qualification): Self = StObject.set(x, "Qualification", value.asInstanceOf[js.Any])
    
    inline def setQualificationUndefined: Self = StObject.set(x, "Qualification", js.undefined)
  }
}
