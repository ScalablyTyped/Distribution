package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentTemplateVersionOutput extends StObject {
  
  /**
    * The detailed data of the environment template version being deleted.
    */
  var environmentTemplateVersion: js.UndefOr[EnvironmentTemplateVersion] = js.undefined
}
object DeleteEnvironmentTemplateVersionOutput {
  
  inline def apply(): DeleteEnvironmentTemplateVersionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEnvironmentTemplateVersionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEnvironmentTemplateVersionOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentTemplateVersion(value: EnvironmentTemplateVersion): Self = StObject.set(x, "environmentTemplateVersion", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentTemplateVersionUndefined: Self = StObject.set(x, "environmentTemplateVersion", js.undefined)
  }
}
