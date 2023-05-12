package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThesaurusResponse extends StObject {
  
  /**
    * The identifier of the thesaurus. 
    */
  var Id: js.UndefOr[ThesaurusId] = js.undefined
}
object CreateThesaurusResponse {
  
  inline def apply(): CreateThesaurusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThesaurusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateThesaurusResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: ThesaurusId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
