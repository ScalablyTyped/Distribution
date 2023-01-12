package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationCodeConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to the code content type.
    */
  var CodeContentTypeUpdate: js.UndefOr[CodeContentType] = js.undefined
  
  /**
    * Describes updates to the code content of an application.
    */
  var CodeContentUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.CodeContentUpdate] = js.undefined
}
object ApplicationCodeConfigurationUpdate {
  
  inline def apply(): ApplicationCodeConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationCodeConfigurationUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationCodeConfigurationUpdate] (val x: Self) extends AnyVal {
    
    inline def setCodeContentTypeUpdate(value: CodeContentType): Self = StObject.set(x, "CodeContentTypeUpdate", value.asInstanceOf[js.Any])
    
    inline def setCodeContentTypeUpdateUndefined: Self = StObject.set(x, "CodeContentTypeUpdate", js.undefined)
    
    inline def setCodeContentUpdate(value: CodeContentUpdate): Self = StObject.set(x, "CodeContentUpdate", value.asInstanceOf[js.Any])
    
    inline def setCodeContentUpdateUndefined: Self = StObject.set(x, "CodeContentUpdate", js.undefined)
  }
}
