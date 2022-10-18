package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the template.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the template was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the template was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the template.
    */
  var name: js.UndefOr[TemplateName] = js.undefined
  
  /**
    * The version of the template that you're using.
    */
  var version: js.UndefOr[GenericString] = js.undefined
}
object TemplateSummary {
  
  inline def apply(): TemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSummary]
  }
  
  extension [Self <: TemplateSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setName(value: TemplateName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: GenericString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
