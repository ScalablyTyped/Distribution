package typings.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bookmark extends js.Object {
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
  implicit class BookmarkOps[Self <: Bookmark] (val x: Self) extends AnyVal {
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
    def setADODBDotBookmark_typekey(value: Bookmark): Self = this.set("ADODB.Bookmark_typekey", value.asInstanceOf[js.Any])
  }
  
}

