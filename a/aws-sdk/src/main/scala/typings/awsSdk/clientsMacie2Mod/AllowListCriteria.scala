package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowListCriteria extends StObject {
  
  /**
    * The regular expression (regex) that defines the text pattern to ignore. The expression can contain as many as 512 characters.
    */
  var regex: js.UndefOr[stringMin1Max512PatternSS] = js.undefined
  
  /**
    * The location and name of the S3 object that lists specific text to ignore.
    */
  var s3WordsList: js.UndefOr[S3WordsList] = js.undefined
}
object AllowListCriteria {
  
  inline def apply(): AllowListCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowListCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowListCriteria] (val x: Self) extends AnyVal {
    
    inline def setRegex(value: stringMin1Max512PatternSS): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    inline def setS3WordsList(value: S3WordsList): Self = StObject.set(x, "s3WordsList", value.asInstanceOf[js.Any])
    
    inline def setS3WordsListUndefined: Self = StObject.set(x, "s3WordsList", js.undefined)
  }
}
