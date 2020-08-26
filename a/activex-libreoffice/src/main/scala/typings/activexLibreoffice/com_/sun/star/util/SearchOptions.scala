package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOptions extends js.Object {
  /** The locale for case insensitive search. */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  /** search type */
  var algorithmType: SearchAlgorithms = js.native
  /** This many characters can be different (as a replacement) between the found word and the search pattern in a "Weighted Levenshtein; Distance" search. */
  var changedChars: Double = js.native
  /** This many characters can be missing in the found word in a "Weighted Levenshtein Distance" search. */
  var deletedChars: Double = js.native
  /** This many characters can be additional in the found word in a "Weighted Levenshtein Distance" search. */
  var insertedChars: Double = js.native
  /** The replacement text (is for optional replacing - SearchOption is only the data container for it) */
  var replaceString: String = js.native
  /**
    * some flags - can be mixed
    * @see SearchFlags
    */
  var searchFlag: Double = js.native
  /** The text or pattern to be searched. */
  var searchString: String = js.native
  /** Flags for the transliteration. Same meaning as the enum of {@link com.sun.star.i18n.TransliterationModules} */
  var transliterateFlags: Double = js.native
}

object SearchOptions {
  @scala.inline
  def apply(
    Locale: Locale,
    algorithmType: SearchAlgorithms,
    changedChars: Double,
    deletedChars: Double,
    insertedChars: Double,
    replaceString: String,
    searchFlag: Double,
    searchString: String,
    transliterateFlags: Double
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], algorithmType = algorithmType.asInstanceOf[js.Any], changedChars = changedChars.asInstanceOf[js.Any], deletedChars = deletedChars.asInstanceOf[js.Any], insertedChars = insertedChars.asInstanceOf[js.Any], replaceString = replaceString.asInstanceOf[js.Any], searchFlag = searchFlag.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any], transliterateFlags = transliterateFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
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
    def setLocale(value: Locale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlgorithmType(value: SearchAlgorithms): Self = this.set("algorithmType", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedChars(value: Double): Self = this.set("changedChars", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletedChars(value: Double): Self = this.set("deletedChars", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertedChars(value: Double): Self = this.set("insertedChars", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaceString(value: String): Self = this.set("replaceString", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchFlag(value: Double): Self = this.set("searchFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransliterateFlags(value: Double): Self = this.set("transliterateFlags", value.asInstanceOf[js.Any])
  }
  
}

