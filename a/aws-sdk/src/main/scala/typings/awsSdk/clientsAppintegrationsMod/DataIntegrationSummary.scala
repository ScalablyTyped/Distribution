package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIntegrationSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the DataIntegration.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.Arn] = js.undefined
  
  /**
    * The name of the DataIntegration.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.Name] = js.undefined
  
  /**
    * The URI of the data source.
    */
  var SourceURI: js.UndefOr[NonBlankString] = js.undefined
}
object DataIntegrationSummary {
  
  inline def apply(): DataIntegrationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataIntegrationSummary]
  }
  
  extension [Self <: DataIntegrationSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSourceURI(value: NonBlankString): Self = StObject.set(x, "SourceURI", value.asInstanceOf[js.Any])
    
    inline def setSourceURIUndefined: Self = StObject.set(x, "SourceURI", js.undefined)
  }
}
