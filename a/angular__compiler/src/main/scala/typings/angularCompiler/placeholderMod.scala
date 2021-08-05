package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderMod {
  
  @JSImport("@angular/compiler/src/i18n/serializers/placeholder", "PlaceholderRegistry")
  @js.native
  class PlaceholderRegistry () extends StObject {
    
    /* private */ var _generateUniqueName: js.Any = js.native
    
    /* private */ var _hashClosingTag: js.Any = js.native
    
    /* private */ var _hashTag: js.Any = js.native
    
    /* private */ var _placeHolderNameCounts: js.Any = js.native
    
    /* private */ var _signatureToName: js.Any = js.native
    
    def getCloseTagPlaceholderName(tag: String): String = js.native
    
    def getPlaceholderName(name: String, content: String): String = js.native
    
    def getStartTagPlaceholderName(tag: String, attrs: StringDictionary[String], isVoid: Boolean): String = js.native
    
    def getUniquePlaceholder(name: String): String = js.native
  }
}
