package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeProgressStage extends StObject {
  
  /**
    * A description of the stage.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The most recent updated timestamp of the stage.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the stage.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the stage that the change is in.
    */
  var Status: js.UndefOr[ChangeProgressStageStatuses] = js.undefined
}
object ChangeProgressStage {
  
  inline def apply(): ChangeProgressStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeProgressStage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeProgressStage] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: ChangeProgressStageStatuses): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
