package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationCodeConfigurationDescription extends StObject {
  
  /**
    * Describes details about the location and format of the application code.
    */
  var CodeContentDescription: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.CodeContentDescription] = js.undefined
  
  /**
    * Specifies whether the code content is in text or zip format.
    */
  var CodeContentType: typings.awsSdk.clientsKinesisanalyticsv2Mod.CodeContentType
}
object ApplicationCodeConfigurationDescription {
  
  inline def apply(CodeContentType: CodeContentType): ApplicationCodeConfigurationDescription = {
    val __obj = js.Dynamic.literal(CodeContentType = CodeContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCodeConfigurationDescription]
  }
  
  extension [Self <: ApplicationCodeConfigurationDescription](x: Self) {
    
    inline def setCodeContentDescription(value: CodeContentDescription): Self = StObject.set(x, "CodeContentDescription", value.asInstanceOf[js.Any])
    
    inline def setCodeContentDescriptionUndefined: Self = StObject.set(x, "CodeContentDescription", js.undefined)
    
    inline def setCodeContentType(value: CodeContentType): Self = StObject.set(x, "CodeContentType", value.asInstanceOf[js.Any])
  }
}
