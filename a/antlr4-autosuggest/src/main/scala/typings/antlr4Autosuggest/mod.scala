package typings.antlr4Autosuggest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("antlr4-autosuggest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autosuggester(
    lexerCtr: Constructor[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify antlr4.Lexer */ Any
    ],
    parserCtr: Constructor[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify antlr4.Parser */ Any
    ]
  ): AutoSuggester_ = (^.asInstanceOf[js.Dynamic].applyDynamic("autosuggester")(lexerCtr.asInstanceOf[js.Any], parserCtr.asInstanceOf[js.Any])).asInstanceOf[AutoSuggester_]
  inline def autosuggester(
    lexerCtr: Constructor[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify antlr4.Lexer */ Any
    ],
    parserCtr: Constructor[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify antlr4.Parser */ Any
    ],
    casePref: CasePreference
  ): AutoSuggester_ = (^.asInstanceOf[js.Dynamic].applyDynamic("autosuggester")(lexerCtr.asInstanceOf[js.Any], parserCtr.asInstanceOf[js.Any], casePref.asInstanceOf[js.Any])).asInstanceOf[AutoSuggester_]
  
  trait AutoSuggester_ extends StObject {
    
    def autosuggest(inputText: String): js.Array[String]
  }
  object AutoSuggester_ {
    
    inline def apply(autosuggest: String => js.Array[String]): AutoSuggester_ = {
      val __obj = js.Dynamic.literal(autosuggest = js.Any.fromFunction1(autosuggest))
      __obj.asInstanceOf[AutoSuggester_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoSuggester_] (val x: Self) extends AnyVal {
      
      inline def setAutosuggest(value: String => js.Array[String]): Self = StObject.set(x, "autosuggest", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antlr4Autosuggest.antlr4AutosuggestStrings.LOWER
    - typings.antlr4Autosuggest.antlr4AutosuggestStrings.UPPER
    - typings.antlr4Autosuggest.antlr4AutosuggestStrings.BOTH
  */
  trait CasePreference extends StObject
  object CasePreference {
    
    inline def BOTH: typings.antlr4Autosuggest.antlr4AutosuggestStrings.BOTH = "BOTH".asInstanceOf[typings.antlr4Autosuggest.antlr4AutosuggestStrings.BOTH]
    
    inline def LOWER: typings.antlr4Autosuggest.antlr4AutosuggestStrings.LOWER = "LOWER".asInstanceOf[typings.antlr4Autosuggest.antlr4AutosuggestStrings.LOWER]
    
    inline def UPPER: typings.antlr4Autosuggest.antlr4AutosuggestStrings.UPPER = "UPPER".asInstanceOf[typings.antlr4Autosuggest.antlr4AutosuggestStrings.UPPER]
  }
  
  @js.native
  trait Constructor[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
}
