package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkGroupSummary extends StObject {
  
  /**
    * The workgroup creation date and time.
    */
  var CreationTime: js.UndefOr[Date] = js.native
  
  /**
    * The workgroup description.
    */
  var Description: js.UndefOr[WorkGroupDescriptionString] = js.native
  
  /**
    * The name of the workgroup.
    */
  var Name: js.UndefOr[WorkGroupName] = js.native
  
  /**
    * The state of the workgroup.
    */
  var State: js.UndefOr[WorkGroupState] = js.native
}
object WorkGroupSummary {
  
  @scala.inline
  def apply(): WorkGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkGroupSummary]
  }
  
  @scala.inline
  implicit class WorkGroupSummaryMutableBuilder[Self <: WorkGroupSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: WorkGroupDescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: WorkGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setState(value: WorkGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
