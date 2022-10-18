package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConflictingAliasesResult extends StObject {
  
  /**
    * A list of conflicting aliases.
    */
  var ConflictingAliasesList: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.ConflictingAliasesList] = js.undefined
}
object ListConflictingAliasesResult {
  
  inline def apply(): ListConflictingAliasesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConflictingAliasesResult]
  }
  
  extension [Self <: ListConflictingAliasesResult](x: Self) {
    
    inline def setConflictingAliasesList(value: ConflictingAliasesList): Self = StObject.set(x, "ConflictingAliasesList", value.asInstanceOf[js.Any])
    
    inline def setConflictingAliasesListUndefined: Self = StObject.set(x, "ConflictingAliasesList", js.undefined)
  }
}
