package typings.activexAdodb.ADODB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bookmark extends StObject {
  
  @JSName("ADODB.Bookmark_typekey")
  var ADODBDotBookmark_typekey: Bookmark = js.native
}
object Bookmark {
  
  @scala.inline
  def apply(ADODBDotBookmark_typekey: Bookmark): Bookmark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADODB.Bookmark_typekey")(ADODBDotBookmark_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bookmark]
  }
  
  @scala.inline
  implicit class BookmarkMutableBuilder[Self <: Bookmark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADODBDotBookmark_typekey(value: Bookmark): Self = StObject.set(x, "ADODB.Bookmark_typekey", value.asInstanceOf[js.Any])
  }
}
