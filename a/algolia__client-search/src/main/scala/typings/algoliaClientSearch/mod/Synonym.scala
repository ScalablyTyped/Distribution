package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Synonym extends StObject {
  
  /**
    * An list of corrections of the word.
    */
  val corrections: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Defines the synonym. A word or expression, used as the basis for the array of synonyms.
    */
  val input: js.UndefOr[String] = js.native
  
  /**
    *  Synonym object ID.
    */
  val objectID: String = js.native
  
  /**
    * A single word, used as the basis for the below list of replacements.
    */
  val placeholder: js.UndefOr[String] = js.native
  
  /**
    * An list of replacements of the placeholder.
    */
  val replacements: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of synonyms.
    */
  val synonyms: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * There are 4 synonym types. The parameter can be one of the following value.
    */
  val `type`: SynonymType = js.native
  
  /**
    * A single word, used as the basis for the below array of corrections.
    */
  val word: js.UndefOr[String] = js.native
}
object Synonym {
  
  @scala.inline
  def apply(objectID: String, `type`: SynonymType): Synonym = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Synonym]
  }
  
  @scala.inline
  implicit class SynonymMutableBuilder[Self <: Synonym] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrections(value: js.Array[String]): Self = StObject.set(x, "corrections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectionsUndefined: Self = StObject.set(x, "corrections", js.undefined)
    
    @scala.inline
    def setCorrectionsVarargs(value: String*): Self = StObject.set(x, "corrections", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setReplacements(value: js.Array[String]): Self = StObject.set(x, "replacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementsUndefined: Self = StObject.set(x, "replacements", js.undefined)
    
    @scala.inline
    def setReplacementsVarargs(value: String*): Self = StObject.set(x, "replacements", js.Array(value :_*))
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
    
    @scala.inline
    def setType(value: SynonymType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
