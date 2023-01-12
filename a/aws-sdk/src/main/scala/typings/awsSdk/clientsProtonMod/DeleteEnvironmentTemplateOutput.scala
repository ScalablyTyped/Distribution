package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentTemplateOutput extends StObject {
  
  /**
    * The detailed data of the environment template being deleted.
    */
  var environmentTemplate: js.UndefOr[EnvironmentTemplate] = js.undefined
}
object DeleteEnvironmentTemplateOutput {
  
  inline def apply(): DeleteEnvironmentTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEnvironmentTemplateOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEnvironmentTemplateOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentTemplate(value: EnvironmentTemplate): Self = StObject.set(x, "environmentTemplate", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentTemplateUndefined: Self = StObject.set(x, "environmentTemplate", js.undefined)
  }
}
