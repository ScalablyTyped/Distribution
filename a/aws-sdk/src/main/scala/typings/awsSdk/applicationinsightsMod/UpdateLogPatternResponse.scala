package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLogPatternResponse extends StObject {
  
  /**
    * The successfully created log pattern.
    */
  var LogPattern: js.UndefOr[typings.awsSdk.applicationinsightsMod.LogPattern] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.undefined
}
object UpdateLogPatternResponse {
  
  @scala.inline
  def apply(): UpdateLogPatternResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLogPatternResponse]
  }
  
  @scala.inline
  implicit class UpdateLogPatternResponseMutableBuilder[Self <: UpdateLogPatternResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogPattern(value: LogPattern): Self = StObject.set(x, "LogPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogPatternUndefined: Self = StObject.set(x, "LogPattern", js.undefined)
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
  }
}
