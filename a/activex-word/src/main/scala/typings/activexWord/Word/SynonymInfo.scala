package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynonymInfo extends StObject {
  
  val AntonymList: js.Any = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Found: Boolean = js.native
  
  val MeaningCount: Double = js.native
  
  val MeaningList: js.Any = js.native
  
  val Parent: js.Any = js.native
  
  val PartOfSpeechList: js.Any = js.native
  
  val RelatedExpressionList: js.Any = js.native
  
  val RelatedWordList: js.Any = js.native
  
  def SynonymList(Meaning: js.Any): js.Any = js.native
  
  val Word: String = js.native
  
  @JSName("Word.SynonymInfo_typekey")
  var WordDotSynonymInfo_typekey: SynonymInfo = js.native
}
object SynonymInfo {
  
  @scala.inline
  def apply(
    AntonymList: js.Any,
    Application: Application,
    Creator: Double,
    Found: Boolean,
    MeaningCount: Double,
    MeaningList: js.Any,
    Parent: js.Any,
    PartOfSpeechList: js.Any,
    RelatedExpressionList: js.Any,
    RelatedWordList: js.Any,
    SynonymList: js.Any => js.Any,
    Word: String,
    WordDotSynonymInfo_typekey: SynonymInfo
  ): SynonymInfo = {
    val __obj = js.Dynamic.literal(AntonymList = AntonymList.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Found = Found.asInstanceOf[js.Any], MeaningCount = MeaningCount.asInstanceOf[js.Any], MeaningList = MeaningList.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PartOfSpeechList = PartOfSpeechList.asInstanceOf[js.Any], RelatedExpressionList = RelatedExpressionList.asInstanceOf[js.Any], RelatedWordList = RelatedWordList.asInstanceOf[js.Any], SynonymList = js.Any.fromFunction1(SynonymList), Word = Word.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SynonymInfo_typekey")(WordDotSynonymInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynonymInfo]
  }
  
  @scala.inline
  implicit class SynonymInfoMutableBuilder[Self <: SynonymInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntonymList(value: js.Any): Self = StObject.set(x, "AntonymList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFound(value: Boolean): Self = StObject.set(x, "Found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeaningCount(value: Double): Self = StObject.set(x, "MeaningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeaningList(value: js.Any): Self = StObject.set(x, "MeaningList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfSpeechList(value: js.Any): Self = StObject.set(x, "PartOfSpeechList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedExpressionList(value: js.Any): Self = StObject.set(x, "RelatedExpressionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedWordList(value: js.Any): Self = StObject.set(x, "RelatedWordList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymList(value: js.Any => js.Any): Self = StObject.set(x, "SynonymList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWord(value: String): Self = StObject.set(x, "Word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSynonymInfo_typekey(value: SynonymInfo): Self = StObject.set(x, "Word.SynonymInfo_typekey", value.asInstanceOf[js.Any])
  }
}
