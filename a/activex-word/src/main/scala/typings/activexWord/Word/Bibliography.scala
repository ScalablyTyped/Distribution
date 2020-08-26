package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bibliography extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var BibliographyStyle: String = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  val Sources: typings.activexWord.Word.Sources = js.native
  @JSName("Word.Bibliography_typekey")
  var WordDotBibliography_typekey: Bibliography = js.native
  def GenerateUniqueTag(): String = js.native
}

object Bibliography {
  @scala.inline
  def apply(
    Application: Application,
    BibliographyStyle: String,
    Creator: Double,
    GenerateUniqueTag: () => String,
    Parent: js.Any,
    Sources: Sources,
    WordDotBibliography_typekey: Bibliography
  ): Bibliography = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BibliographyStyle = BibliographyStyle.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], GenerateUniqueTag = js.Any.fromFunction0(GenerateUniqueTag), Parent = Parent.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Bibliography_typekey")(WordDotBibliography_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bibliography]
  }
  @scala.inline
  implicit class BibliographyOps[Self <: Bibliography] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setBibliographyStyle(value: String): Self = this.set("BibliographyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerateUniqueTag(value: () => String): Self = this.set("GenerateUniqueTag", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSources(value: Sources): Self = this.set("Sources", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotBibliography_typekey(value: Bibliography): Self = this.set("Word.Bibliography_typekey", value.asInstanceOf[js.Any])
  }
  
}

