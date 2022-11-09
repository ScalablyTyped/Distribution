package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeProgressStage extends StObject {
  
  /**
    * The description of the stage.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsOpensearchMod.Description] = js.undefined
  
  /**
    * The most recent updated timestamp of the stage.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the stage.
    */
  var Name: js.UndefOr[ChangeProgressStageName] = js.undefined
  
  /**
    * The status of the stage.
    */
  var Status: js.UndefOr[ChangeProgressStageStatus] = js.undefined
}
object ChangeProgressStage {
  
  inline def apply(): ChangeProgressStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeProgressStage]
  }
  
  extension [Self <: ChangeProgressStage](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setName(value: ChangeProgressStageName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: ChangeProgressStageStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
