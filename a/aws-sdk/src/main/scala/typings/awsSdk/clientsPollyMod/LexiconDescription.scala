package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexiconDescription extends StObject {
  
  /**
    * Provides lexicon metadata.
    */
  var Attributes: js.UndefOr[LexiconAttributes] = js.undefined
  
  /**
    * Name of the lexicon.
    */
  var Name: js.UndefOr[LexiconName] = js.undefined
}
object LexiconDescription {
  
  inline def apply(): LexiconDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexiconDescription]
  }
  
  extension [Self <: LexiconDescription](x: Self) {
    
    inline def setAttributes(value: LexiconAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setName(value: LexiconName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
