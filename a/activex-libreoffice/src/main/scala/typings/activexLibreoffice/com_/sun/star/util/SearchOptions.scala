package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOptions extends StObject {
  
  /** The locale for case insensitive search. */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** search type */
  var algorithmType: SearchAlgorithms
  
  /** This many characters can be different (as a replacement) between the found word and the search pattern in a "Weighted Levenshtein; Distance" search. */
  var changedChars: Double
  
  /** This many characters can be missing in the found word in a "Weighted Levenshtein Distance" search. */
  var deletedChars: Double
  
  /** This many characters can be additional in the found word in a "Weighted Levenshtein Distance" search. */
  var insertedChars: Double
  
  /** The replacement text (is for optional replacing - SearchOption is only the data container for it) */
  var replaceString: String
  
  /**
    * some flags - can be mixed
    * @see SearchFlags
    */
  var searchFlag: Double
  
  /** The text or pattern to be searched. */
  var searchString: String
  
  /** Flags for the transliteration. Same meaning as the enum of {@link com.sun.star.i18n.TransliterationModules} */
  var transliterateFlags: Double
}
object SearchOptions {
  
  inline def apply(
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
  
  extension [Self <: SearchOptions](x: Self) {
    
    inline def setAlgorithmType(value: SearchAlgorithms): Self = StObject.set(x, "algorithmType", value.asInstanceOf[js.Any])
    
    inline def setChangedChars(value: Double): Self = StObject.set(x, "changedChars", value.asInstanceOf[js.Any])
    
    inline def setDeletedChars(value: Double): Self = StObject.set(x, "deletedChars", value.asInstanceOf[js.Any])
    
    inline def setInsertedChars(value: Double): Self = StObject.set(x, "insertedChars", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setReplaceString(value: String): Self = StObject.set(x, "replaceString", value.asInstanceOf[js.Any])
    
    inline def setSearchFlag(value: Double): Self = StObject.set(x, "searchFlag", value.asInstanceOf[js.Any])
    
    inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    inline def setTransliterateFlags(value: Double): Self = StObject.set(x, "transliterateFlags", value.asInstanceOf[js.Any])
  }
}
