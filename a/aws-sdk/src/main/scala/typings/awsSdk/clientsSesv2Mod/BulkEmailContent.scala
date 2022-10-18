package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEmailContent extends StObject {
  
  /**
    * The template to use for the bulk email message.
    */
  var Template: js.UndefOr[typings.awsSdk.clientsSesv2Mod.Template] = js.undefined
}
object BulkEmailContent {
  
  inline def apply(): BulkEmailContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEmailContent]
  }
  
  extension [Self <: BulkEmailContent](x: Self) {
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "Template", js.undefined)
  }
}
