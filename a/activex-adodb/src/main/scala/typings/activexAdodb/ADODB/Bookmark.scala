package typings.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bookmark extends js.Object {
  @JSName("ADODB.Bookmark_typekey")
  var ADODBDotBookmark_typekey: Bookmark
}

object Bookmark {
  @scala.inline
  def apply(ADODBDotBookmark_typekey: Bookmark): Bookmark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADODB.Bookmark_typekey")(ADODBDotBookmark_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bookmark]
  }
}

