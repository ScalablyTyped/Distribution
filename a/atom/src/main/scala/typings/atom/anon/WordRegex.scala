package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordRegex extends StObject {
  
  var wordRegex: js.UndefOr[js.RegExp] = js.undefined
}
object WordRegex {
  
  inline def apply(): WordRegex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordRegex]
  }
  
  extension [Self <: WordRegex](x: Self) {
    
    inline def setWordRegex(value: js.RegExp): Self = StObject.set(x, "wordRegex", value.asInstanceOf[js.Any])
    
    inline def setWordRegexUndefined: Self = StObject.set(x, "wordRegex", js.undefined)
  }
}
