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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpellCorrectionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIncludeQuerySpellCheckSuggestions(value: Boolean): Self = StObject.set(x, "IncludeQuerySpellCheckSuggestions", value.asInstanceOf[js.Any])
  }
}
