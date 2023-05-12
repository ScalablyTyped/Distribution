package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationData extends StObject {
  
  /**
    * The recommendation of a target Amazon RDS database engine.
    */
  var RdsEngine: js.UndefOr[RdsRecommendation] = js.undefined
}
object RecommendationData {
  
  inline def apply(): RecommendationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationData] (val x: Self) extends AnyVal {
    
    inline def setRdsEngine(value: RdsRecommendation): Self = StObject.set(x, "RdsEngine", value.asInstanceOf[js.Any])
    
    inline def setRdsEngineUndefined: Self = StObject.set(x, "RdsEngine", js.undefined)
  }
}
