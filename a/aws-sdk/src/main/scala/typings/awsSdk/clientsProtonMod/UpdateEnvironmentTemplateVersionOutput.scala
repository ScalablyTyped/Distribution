package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentTemplateVersionOutput extends StObject {
  
  /**
    * The environment template version detail data that's returned by Proton.
    */
  var environmentTemplateVersion: EnvironmentTemplateVersion
}
object UpdateEnvironmentTemplateVersionOutput {
  
  inline def apply(environmentTemplateVersion: EnvironmentTemplateVersion): UpdateEnvironmentTemplateVersionOutput = {
    val __obj = js.Dynamic.literal(environmentTemplateVersion = environmentTemplateVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentTemplateVersionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEnvironmentTemplateVersionOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentTemplateVersion(value: EnvironmentTemplateVersion): Self = StObject.set(x, "environmentTemplateVersion", value.asInstanceOf[js.Any])
  }
}
