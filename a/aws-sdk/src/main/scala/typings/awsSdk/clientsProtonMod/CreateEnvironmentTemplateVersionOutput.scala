package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentTemplateVersionOutput extends StObject {
  
  /**
    * The environment template detail data that's returned by Proton.
    */
  var environmentTemplateVersion: EnvironmentTemplateVersion
}
object CreateEnvironmentTemplateVersionOutput {
  
  inline def apply(environmentTemplateVersion: EnvironmentTemplateVersion): CreateEnvironmentTemplateVersionOutput = {
    val __obj = js.Dynamic.literal(environmentTemplateVersion = environmentTemplateVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentTemplateVersionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEnvironmentTemplateVersionOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentTemplateVersion(value: EnvironmentTemplateVersion): Self = StObject.set(x, "environmentTemplateVersion", value.asInstanceOf[js.Any])
  }
}
