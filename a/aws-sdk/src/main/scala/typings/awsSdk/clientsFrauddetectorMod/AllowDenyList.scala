package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowDenyList extends StObject {
  
  /**
    *  The ARN of the list. 
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    *  The time the list was created. 
    */
  var createdTime: js.UndefOr[time] = js.undefined
  
  /**
    *  The description of the list. 
    */
  var description: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.description] = js.undefined
  
  /**
    *  The name of the list. 
    */
  var name: noDashIdentifier
  
  /**
    *  The time the list was last updated. 
    */
  var updatedTime: js.UndefOr[time] = js.undefined
  
  /**
    *  The variable type of the list. 
    */
  var variableType: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.variableType] = js.undefined
}
object AllowDenyList {
  
  inline def apply(name: noDashIdentifier): AllowDenyList = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowDenyList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowDenyList] (val x: Self) extends AnyVal {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: noDashIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTime(value: time): Self = StObject.set(x, "updatedTime", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimeUndefined: Self = StObject.set(x, "updatedTime", js.undefined)
    
    inline def setVariableType(value: variableType): Self = StObject.set(x, "variableType", value.asInstanceOf[js.Any])
    
    inline def setVariableTypeUndefined: Self = StObject.set(x, "variableType", js.undefined)
  }
}
