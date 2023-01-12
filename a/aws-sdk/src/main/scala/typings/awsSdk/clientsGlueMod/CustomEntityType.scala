package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEntityType extends StObject {
  
  /**
    * A list of context words. If none of these context words are found within the vicinity of the regular expression the data will not be detected as sensitive data. If no context words are passed only a regular expression is checked.
    */
  var ContextWords: js.UndefOr[typings.awsSdk.clientsGlueMod.ContextWords] = js.undefined
  
  /**
    * A name for the custom pattern that allows it to be retrieved or deleted later. This name must be unique per Amazon Web Services account.
    */
  var Name: NameString
  
  /**
    * A regular expression string that is used for detecting sensitive data in a custom pattern.
    */
  var RegexString: NameString
}
object CustomEntityType {
  
  inline def apply(Name: NameString, RegexString: NameString): CustomEntityType = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RegexString = RegexString.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEntityType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomEntityType] (val x: Self) extends AnyVal {
    
    inline def setContextWords(value: ContextWords): Self = StObject.set(x, "ContextWords", value.asInstanceOf[js.Any])
    
    inline def setContextWordsUndefined: Self = StObject.set(x, "ContextWords", js.undefined)
    
    inline def setContextWordsVarargs(value: NameString*): Self = StObject.set(x, "ContextWords", js.Array(value*))
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRegexString(value: NameString): Self = StObject.set(x, "RegexString", value.asInstanceOf[js.Any])
  }
}
