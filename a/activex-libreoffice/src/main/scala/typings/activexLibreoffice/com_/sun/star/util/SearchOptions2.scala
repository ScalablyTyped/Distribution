package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This augments {@link com.sun.star.util.SearchOptions} to be able to specify additional search algorithms for use with {@link
  * com.sun.star.util.XTextSearch2}
  * @since LibreOffice 5.2
  */
trait SearchOptions2
  extends StObject
     with SearchOptions {
  
  /**
    * Search type, one of {@link com.sun.star.util.SearchAlgorithms2} constants. This is preferred over the content of the SearchAlgorithms {@link
    * SearchOptions.algorithmType} enum field.
    */
  var AlgorithmType2: Double
  
  /**
    * The escape character to be used with a {@link com.sun.star.util.SearchAlgorithms2.WILDCARD} search.
    *
    * A Unicode character, if not 0 escapes the special meaning of a question mark, asterisk or escape character that follows immediately after the escape
    * character. If 0 defines no escape character is used.
    *
    * Common values are '\' (U+005C REVERSE SOLIDUS) aka backslash in text processing context, or '~' (U+007E TILDE) in spreadsheet processing context.
    */
  var WildcardEscapeCharacter: Double
}
object SearchOptions2 {
  
  @scala.inline
  def apply(
    AlgorithmType2: Double,
    Locale: Locale,
    WildcardEscapeCharacter: Double,
    algorithmType: SearchAlgorithms,
    changedChars: Double,
    deletedChars: Double,
    insertedChars: Double,
    replaceString: String,
    searchFlag: Double,
    searchString: String,
    transliterateFlags: Double
  ): SearchOptions2 = {
    val __obj = js.Dynamic.literal(AlgorithmType2 = AlgorithmType2.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], WildcardEscapeCharacter = WildcardEscapeCharacter.asInstanceOf[js.Any], algorithmType = algorithmType.asInstanceOf[js.Any], changedChars = changedChars.asInstanceOf[js.Any], deletedChars = deletedChars.asInstanceOf[js.Any], insertedChars = insertedChars.asInstanceOf[js.Any], replaceString = replaceString.asInstanceOf[js.Any], searchFlag = searchFlag.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any], transliterateFlags = transliterateFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions2]
  }
  
  @scala.inline
  implicit class SearchOptions2MutableBuilder[Self <: SearchOptions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmType2(value: Double): Self = StObject.set(x, "AlgorithmType2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWildcardEscapeCharacter(value: Double): Self = StObject.set(x, "WildcardEscapeCharacter", value.asInstanceOf[js.Any])
  }
}
