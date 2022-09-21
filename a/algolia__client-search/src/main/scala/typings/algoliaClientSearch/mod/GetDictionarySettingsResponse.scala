package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.RecordDictionaryNameRecor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDictionarySettingsResponse extends StObject {
  
  /**
    * Disable the builtin Algolia entries for a type of dictionary per language.
    */
  val disableStandardEntries: RequireAtLeastOne[RecordDictionaryNameRecor]
}
object GetDictionarySettingsResponse {
  
  inline def apply(disableStandardEntries: RequireAtLeastOne[RecordDictionaryNameRecor]): GetDictionarySettingsResponse = {
    val __obj = js.Dynamic.literal(disableStandardEntries = disableStandardEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDictionarySettingsResponse]
  }
  
  extension [Self <: GetDictionarySettingsResponse](x: Self) {
    
    inline def setDisableStandardEntries(value: RequireAtLeastOne[RecordDictionaryNameRecor]): Self = StObject.set(x, "disableStandardEntries", value.asInstanceOf[js.Any])
  }
}
