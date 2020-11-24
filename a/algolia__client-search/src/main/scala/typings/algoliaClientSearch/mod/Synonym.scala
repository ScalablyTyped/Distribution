package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Synonym extends js.Object {
  
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
  implicit class SynonymOps[Self <: Synonym] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObjectID(value: String): Self = this.set("objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SynonymType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectionsVarargs(value: String*): Self = this.set("corrections", js.Array(value :_*))
    
    @scala.inline
    def setCorrections(value: js.Array[String]): Self = this.set("corrections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrections: Self = this.set("corrections", js.undefined)
    
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setReplacementsVarargs(value: String*): Self = this.set("replacements", js.Array(value :_*))
    
    @scala.inline
    def setReplacements(value: js.Array[String]): Self = this.set("replacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacements: Self = this.set("replacements", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = this.set("synonyms", js.Array(value :_*))
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = this.set("synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynonyms: Self = this.set("synonyms", js.undefined)
    
    @scala.inline
    def setWord(value: String): Self = this.set("word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWord: Self = this.set("word", js.undefined)
  }
}
