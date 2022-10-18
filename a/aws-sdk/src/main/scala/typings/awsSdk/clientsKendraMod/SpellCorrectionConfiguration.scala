package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpellCorrectionConfiguration extends StObject {
  
  /**
    *  TRUE to suggest spell corrections for queries.
    */
  var IncludeQuerySpellCheckSuggestions: Boolean
}
object SpellCorrectionConfiguration {
  
  inline def apply(IncludeQuerySpellCheckSuggestions: Boolean): SpellCorrectionConfiguration = {
    val __obj = js.Dynamic.literal(IncludeQuerySpellCheckSuggestions = IncludeQuerySpellCheckSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellCorrectionConfiguration]
  }
  
  extension [Self <: SpellCorrectionConfiguration](x: Self) {
    
    inline def setIncludeQuerySpellCheckSuggestions(value: Boolean): Self = StObject.set(x, "IncludeQuerySpellCheckSuggestions", value.asInstanceOf[js.Any])
  }
}
