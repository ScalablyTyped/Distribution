package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bibliography extends js.Object {
  val Application: typings.activexWord.Word.Application
  var BibliographyStyle: String
  val Creator: Double
  val Parent: js.Any
  val Sources: typings.activexWord.Word.Sources
  @JSName("Word.Bibliography_typekey")
  var WordDotBibliography_typekey: Bibliography
  def GenerateUniqueTag(): String
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
}

