package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentTemplateOutput extends StObject {
  
  /**
    * The environment template detail data that's returned by Proton.
    */
  var environmentTemplate: EnvironmentTemplate
}
object CreateEnvironmentTemplateOutput {
  
  inline def apply(environmentTemplate: EnvironmentTemplate): CreateEnvironmentTemplateOutput = {
    val __obj = js.Dynamic.literal(environmentTemplate = environmentTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentTemplateOutput]
  }
  
  extension [Self <: CreateEnvironmentTemplateOutput](x: Self) {
    
    inline def setEnvironmentTemplate(value: EnvironmentTemplate): Self = StObject.set(x, "environmentTemplate", value.asInstanceOf[js.Any])
  }
}
