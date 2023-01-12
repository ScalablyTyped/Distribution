package typings.activexAdodb.ADODB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bookmark extends StObject {
  
  /* private */ @JSName("ADODB.Bookmark_typekey")
  var ADODBDotBookmark_typekey: Bookmark
}
object Bookmark {
  
  inline def apply(ADODBDotBookmark_typekey: Bookmark): Bookmark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADODB.Bookmark_typekey")(ADODBDotBookmark_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bookmark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bookmark] (val x: Self) extends AnyVal {
    
    inline def setADODBDotBookmark_typekey(value: Bookmark): Self = StObject.set(x, "ADODB.Bookmark_typekey", value.asInstanceOf[js.Any])
  }
}
