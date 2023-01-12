package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterSet extends StObject {
  
  /**
    * The description of the character set.
    */
  var CharacterSetDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the character set.
    */
  var CharacterSetName: js.UndefOr[String] = js.undefined
}
object CharacterSet {
  
  inline def apply(): CharacterSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharacterSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CharacterSet] (val x: Self) extends AnyVal {
    
    inline def setCharacterSetDescription(value: String): Self = StObject.set(x, "CharacterSetDescription", value.asInstanceOf[js.Any])
    
    inline def setCharacterSetDescriptionUndefined: Self = StObject.set(x, "CharacterSetDescription", js.undefined)
    
    inline def setCharacterSetName(value: String): Self = StObject.set(x, "CharacterSetName", value.asInstanceOf[js.Any])
    
    inline def setCharacterSetNameUndefined: Self = StObject.set(x, "CharacterSetName", js.undefined)
  }
}
