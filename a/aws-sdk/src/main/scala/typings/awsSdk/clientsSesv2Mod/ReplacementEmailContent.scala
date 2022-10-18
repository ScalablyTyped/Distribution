package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplacementEmailContent extends StObject {
  
  /**
    * The ReplacementTemplate associated with ReplacementEmailContent.
    */
  var ReplacementTemplate: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ReplacementTemplate] = js.undefined
}
object ReplacementEmailContent {
  
  inline def apply(): ReplacementEmailContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplacementEmailContent]
  }
  
  extension [Self <: ReplacementEmailContent](x: Self) {
    
    inline def setReplacementTemplate(value: ReplacementTemplate): Self = StObject.set(x, "ReplacementTemplate", value.asInstanceOf[js.Any])
    
    inline def setReplacementTemplateUndefined: Self = StObject.set(x, "ReplacementTemplate", js.undefined)
  }
}
