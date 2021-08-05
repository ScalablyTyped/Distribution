package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkGroupSummary extends StObject {
  
  /**
    * The workgroup creation date and time.
    */
  var CreationTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The workgroup description.
    */
  var Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined
  
  /**
    * The name of the workgroup.
    */
  var Name: js.UndefOr[WorkGroupName] = js.undefined
  
  /**
    * The state of the workgroup.
    */
  var State: js.UndefOr[WorkGroupState] = js.undefined
}
object WorkGroupSummary {
  
  inline def apply(): WorkGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkGroupSummary]
  }
  
  extension [Self <: WorkGroupSummary](x: Self) {
    
    inline def setCreationTime(value: Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: WorkGroupDescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: WorkGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: WorkGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
