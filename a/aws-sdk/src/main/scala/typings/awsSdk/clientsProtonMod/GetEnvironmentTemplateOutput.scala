package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentTemplateOutput extends StObject {
  
  /**
    * The detailed data of the requested environment template.
    */
  var environmentTemplate: EnvironmentTemplate
}
object GetEnvironmentTemplateOutput {
  
  inline def apply(environmentTemplate: EnvironmentTemplate): GetEnvironmentTemplateOutput = {
    val __obj = js.Dynamic.literal(environmentTemplate = environmentTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentTemplateOutput]
  }
  
  extension [Self <: GetEnvironmentTemplateOutput](x: Self) {
    
    inline def setEnvironmentTemplate(value: EnvironmentTemplate): Self = StObject.set(x, "environmentTemplate", value.asInstanceOf[js.Any])
  }
}
