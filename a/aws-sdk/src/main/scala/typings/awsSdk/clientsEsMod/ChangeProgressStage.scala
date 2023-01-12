package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeProgressStage extends StObject {
  
  /**
    * The description of the progress stage.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsEsMod.Description] = js.undefined
  
  /**
    * The last updated timestamp of the progress stage.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the specific progress stage.
    */
  var Name: js.UndefOr[ChangeProgressStageName] = js.undefined
  
  /**
    * The overall status of a specific progress stage.
    */
  var Status: js.UndefOr[ChangeProgressStageStatus] = js.undefined
}
object ChangeProgressStage {
  
  inline def apply(): ChangeProgressStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeProgressStage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeProgressStage] (val x: Self) extends AnyVal {
    
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
