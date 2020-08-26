package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SynonymInfo extends js.Object {
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
  val Word: String = js.native
  @JSName("Word.SynonymInfo_typekey")
  var WordDotSynonymInfo_typekey: SynonymInfo = js.native
  def SynonymList(Meaning: js.Any): js.Any = js.native
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
  implicit class SynonymInfoOps[Self <: SynonymInfo] (val x: Self) extends AnyVal {
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
    def setAntonymList(value: js.Any): Self = this.set("AntonymList", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFound(value: Boolean): Self = this.set("Found", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeaningCount(value: Double): Self = this.set("MeaningCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeaningList(value: js.Any): Self = this.set("MeaningList", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartOfSpeechList(value: js.Any): Self = this.set("PartOfSpeechList", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedExpressionList(value: js.Any): Self = this.set("RelatedExpressionList", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedWordList(value: js.Any): Self = this.set("RelatedWordList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSynonymList(value: js.Any => js.Any): Self = this.set("SynonymList", js.Any.fromFunction1(value))
    @scala.inline
    def setWord(value: String): Self = this.set("Word", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotSynonymInfo_typekey(value: SynonymInfo): Self = this.set("Word.SynonymInfo_typekey", value.asInstanceOf[js.Any])
  }
  
}

