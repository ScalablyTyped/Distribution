package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynonymInfo extends js.Object {
  val AntonymList: js.Any
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Found: Boolean
  val MeaningCount: Double
  val MeaningList: js.Any
  val Parent: js.Any
  val PartOfSpeechList: js.Any
  val RelatedExpressionList: js.Any
  val RelatedWordList: js.Any
  val Word: String
  @JSName("Word.SynonymInfo_typekey")
  var WordDotSynonymInfo_typekey: SynonymInfo
  def SynonymList(Meaning: js.Any): js.Any
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
}

