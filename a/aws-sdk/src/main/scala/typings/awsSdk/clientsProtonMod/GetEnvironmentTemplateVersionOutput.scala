package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentTemplateVersionOutput extends StObject {
  
  /**
    * The detailed data of the requested environment template version.
    */
  var environmentTemplateVersion: EnvironmentTemplateVersion
}
object GetEnvironmentTemplateVersionOutput {
  
  inline def apply(environmentTemplateVersion: EnvironmentTemplateVersion): GetEnvironmentTemplateVersionOutput = {
    val __obj = js.Dynamic.literal(environmentTemplateVersion = environmentTemplateVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentTemplateVersionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEnvironmentTemplateVersionOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentTemplateVersion(value: EnvironmentTemplateVersion): Self = StObject.set(x, "environmentTemplateVersion", value.asInstanceOf[js.Any])
  }
}
