package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameConfigurationDetails extends StObject {
  
  /**
    * The date when the game was created.
    */
  var Created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date when the game was last modified.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Configuration data, organized by section name.
    */
  var Sections: js.UndefOr[typings.awsSdk.clientsGamesparksMod.Sections] = js.undefined
}
object GameConfigurationDetails {
  
  inline def apply(): GameConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameConfigurationDetails]
  }
  
  extension [Self <: GameConfigurationDetails](x: Self) {
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setSections(value: Sections): Self = StObject.set(x, "Sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "Sections", js.undefined)
  }
}
