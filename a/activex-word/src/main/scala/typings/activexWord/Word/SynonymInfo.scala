package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynonymInfo extends StObject {
  
  val AntonymList: Any
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val Found: Boolean
  
  val MeaningCount: Double
  
  val MeaningList: Any
  
  val Parent: Any
  
  val PartOfSpeechList: Any
  
  val RelatedExpressionList: Any
  
  val RelatedWordList: Any
  
  def SynonymList(Meaning: Any): Any
  
  val Word: String
  
  /* private */ @JSName("Word.SynonymInfo_typekey")
  var WordDotSynonymInfo_typekey: SynonymInfo
}
object SynonymInfo {
  
  inline def apply(
    AntonymList: Any,
    Application: Application,
    Creator: Double,
    Found: Boolean,
    MeaningCount: Double,
    MeaningList: Any,
    Parent: Any,
    PartOfSpeechList: Any,
    RelatedExpressionList: Any,
    RelatedWordList: Any,
    SynonymList: Any => Any,
    Word: String,
    WordDotSynonymInfo_typekey: SynonymInfo
  ): SynonymInfo = {
    val __obj = js.Dynamic.literal(AntonymList = AntonymList.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Found = Found.asInstanceOf[js.Any], MeaningCount = MeaningCount.asInstanceOf[js.Any], MeaningList = MeaningList.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PartOfSpeechList = PartOfSpeechList.asInstanceOf[js.Any], RelatedExpressionList = RelatedExpressionList.asInstanceOf[js.Any], RelatedWordList = RelatedWordList.asInstanceOf[js.Any], SynonymList = js.Any.fromFunction1(SynonymList), Word = Word.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SynonymInfo_typekey")(WordDotSynonymInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynonymInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynonymInfo] (val x: Self) extends AnyVal {
    
    inline def setAntonymList(value: Any): Self = StObject.set(x, "AntonymList", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "Found", value.asInstanceOf[js.Any])
    
    inline def setMeaningCount(value: Double): Self = StObject.set(x, "MeaningCount", value.asInstanceOf[js.Any])
    
    inline def setMeaningList(value: Any): Self = StObject.set(x, "MeaningList", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPartOfSpeechList(value: Any): Self = StObject.set(x, "PartOfSpeechList", value.asInstanceOf[js.Any])
    
    inline def setRelatedExpressionList(value: Any): Self = StObject.set(x, "RelatedExpressionList", value.asInstanceOf[js.Any])
    
    inline def setRelatedWordList(value: Any): Self = StObject.set(x, "RelatedWordList", value.asInstanceOf[js.Any])
    
    inline def setSynonymList(value: Any => Any): Self = StObject.set(x, "SynonymList", js.Any.fromFunction1(value))
    
    inline def setWord(value: String): Self = StObject.set(x, "Word", value.asInstanceOf[js.Any])
    
    inline def setWordDotSynonymInfo_typekey(value: SynonymInfo): Self = StObject.set(x, "Word.SynonymInfo_typekey", value.asInstanceOf[js.Any])
  }
}
