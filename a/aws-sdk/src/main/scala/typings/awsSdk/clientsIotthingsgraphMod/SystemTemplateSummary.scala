package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemTemplateSummary extends StObject {
  
  /**
    * The ARN of the system.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The date when the system was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the system.
    */
  var id: js.UndefOr[Urn] = js.undefined
  
  /**
    * The revision number of the system.
    */
  var revisionNumber: js.UndefOr[Version] = js.undefined
}
object SystemTemplateSummary {
  
  inline def apply(): SystemTemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemTemplateSummary]
  }
  
  extension [Self <: SystemTemplateSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRevisionNumber(value: Version): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    inline def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
  }
}
