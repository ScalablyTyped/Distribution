package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExperimentTemplateResponse extends StObject {
  
  /**
    * Information about the experiment template.
    */
  var experimentTemplate: js.UndefOr[ExperimentTemplate] = js.undefined
}
object CreateExperimentTemplateResponse {
  
  inline def apply(): CreateExperimentTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateExperimentTemplateResponse]
  }
  
  extension [Self <: CreateExperimentTemplateResponse](x: Self) {
    
    inline def setExperimentTemplate(value: ExperimentTemplate): Self = StObject.set(x, "experimentTemplate", value.asInstanceOf[js.Any])
    
    inline def setExperimentTemplateUndefined: Self = StObject.set(x, "experimentTemplate", js.undefined)
  }
}
