package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Severity extends StObject {
  
  /**
    * The qualitative representation of the finding's severity, ranging from Low (least severe) to High (most severe).
    */
  var description: js.UndefOr[SeverityDescription] = js.undefined
  
  /**
    * The numerical representation of the finding's severity, ranging from 1 (least severe) to 3 (most severe).
    */
  var score: js.UndefOr[long] = js.undefined
}
object Severity {
  
  inline def apply(): Severity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Severity]
  }
  
  extension [Self <: Severity](x: Self) {
    
    inline def setDescription(value: SeverityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setScore(value: long): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
