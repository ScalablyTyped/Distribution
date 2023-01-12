package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScoreAttributes extends StObject {
  
  /**
    * A relative ranking for how well the response matches the query.
    */
  var ScoreConfidence: js.UndefOr[typings.awsSdk.clientsKendraMod.ScoreConfidence] = js.undefined
}
object ScoreAttributes {
  
  inline def apply(): ScoreAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScoreAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScoreAttributes] (val x: Self) extends AnyVal {
    
    inline def setScoreConfidence(value: ScoreConfidence): Self = StObject.set(x, "ScoreConfidence", value.asInstanceOf[js.Any])
    
    inline def setScoreConfidenceUndefined: Self = StObject.set(x, "ScoreConfidence", js.undefined)
  }
}
