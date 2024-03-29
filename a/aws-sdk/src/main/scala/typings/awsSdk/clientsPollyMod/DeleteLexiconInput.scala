package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLexiconInput extends StObject {
  
  /**
    * The name of the lexicon to delete. Must be an existing lexicon in the region.
    */
  var Name: LexiconName
}
object DeleteLexiconInput {
  
  inline def apply(Name: LexiconName): DeleteLexiconInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLexiconInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLexiconInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: LexiconName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
