package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrategyOption extends StObject {
  
  /**
    *  Indicates if a specific strategy is preferred for the application component. 
    */
  var isPreferred: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Type of transformation. For example, Rehost, Replatform, and so on. 
    */
  var strategy: js.UndefOr[Strategy] = js.undefined
  
  /**
    *  Destination information about where the application component can migrate to. For example, EC2, ECS, and so on. 
    */
  var targetDestination: js.UndefOr[TargetDestination] = js.undefined
  
  /**
    *  The name of the tool that can be used to transform an application component using this strategy. 
    */
  var toolName: js.UndefOr[TransformationToolName] = js.undefined
}
object StrategyOption {
  
  inline def apply(): StrategyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrategyOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StrategyOption] (val x: Self) extends AnyVal {
    
    inline def setIsPreferred(value: Boolean): Self = StObject.set(x, "isPreferred", value.asInstanceOf[js.Any])
    
    inline def setIsPreferredUndefined: Self = StObject.set(x, "isPreferred", js.undefined)
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setTargetDestination(value: TargetDestination): Self = StObject.set(x, "targetDestination", value.asInstanceOf[js.Any])
    
    inline def setTargetDestinationUndefined: Self = StObject.set(x, "targetDestination", js.undefined)
    
    inline def setToolName(value: TransformationToolName): Self = StObject.set(x, "toolName", value.asInstanceOf[js.Any])
    
    inline def setToolNameUndefined: Self = StObject.set(x, "toolName", js.undefined)
  }
}
