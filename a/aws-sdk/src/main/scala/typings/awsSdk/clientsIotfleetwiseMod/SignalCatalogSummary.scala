package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalCatalogSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signal catalog.
    */
  var arn: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.arn] = js.undefined
  
  /**
    * The time the signal catalog was created in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the signal catalog was last updated in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var lastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the signal catalog.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}
object SignalCatalogSummary {
  
  inline def apply(): SignalCatalogSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignalCatalogSummary]
  }
  
  extension [Self <: SignalCatalogSummary](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "lastModificationTime", js.undefined)
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
