package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizationObjective extends StObject {
  
  /**
    * The numerical metadata column in an Items dataset related to the optimization objective. For example, VIDEO_LENGTH (to maximize streaming minutes), or PRICE (to maximize revenue).
    */
  var itemAttribute: js.UndefOr[ItemAttribute] = js.undefined
  
  /**
    * Specifies how Amazon Personalize balances the importance of your optimization objective versus relevance.
    */
  var objectiveSensitivity: js.UndefOr[ObjectiveSensitivity] = js.undefined
}
object OptimizationObjective {
  
  inline def apply(): OptimizationObjective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizationObjective]
  }
  
  extension [Self <: OptimizationObjective](x: Self) {
    
    inline def setItemAttribute(value: ItemAttribute): Self = StObject.set(x, "itemAttribute", value.asInstanceOf[js.Any])
    
    inline def setItemAttributeUndefined: Self = StObject.set(x, "itemAttribute", js.undefined)
    
    inline def setObjectiveSensitivity(value: ObjectiveSensitivity): Self = StObject.set(x, "objectiveSensitivity", value.asInstanceOf[js.Any])
    
    inline def setObjectiveSensitivityUndefined: Self = StObject.set(x, "objectiveSensitivity", js.undefined)
  }
}
