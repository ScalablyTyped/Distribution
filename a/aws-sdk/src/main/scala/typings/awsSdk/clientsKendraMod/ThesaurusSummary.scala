package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThesaurusSummary extends StObject {
  
  /**
    * The Unix datetime that the thesaurus was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the thesaurus.
    */
  var Id: js.UndefOr[ThesaurusId] = js.undefined
  
  /**
    * The name of the thesaurus.
    */
  var Name: js.UndefOr[ThesaurusName] = js.undefined
  
  /**
    * The status of the thesaurus.
    */
  var Status: js.UndefOr[ThesaurusStatus] = js.undefined
  
  /**
    * The Unix datetime that the thesaurus was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object ThesaurusSummary {
  
  inline def apply(): ThesaurusSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThesaurusSummary]
  }
  
  extension [Self <: ThesaurusSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setId(value: ThesaurusId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ThesaurusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: ThesaurusStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
