package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Epss extends StObject {
  
  /**
    * The Exploit Prediction Scoring System (EPSS) score.
    */
  var score: js.UndefOr[EpssScore] = js.undefined
}
object Epss {
  
  inline def apply(): Epss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Epss]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Epss] (val x: Self) extends AnyVal {
    
    inline def setScore(value: EpssScore): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
