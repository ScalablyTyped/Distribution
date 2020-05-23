package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.util.DateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a CMIS document version. */
trait CmisVersion extends js.Object {
  /** contains the author that created the version. */
  var Author: String
  /** contains the comment the author has left. */
  var Comment: String
  /** unique ID of the Cmis version */
  var Id: String
  /** specifies the time when the revision was created. */
  var TimeStamp: DateTime
}

object CmisVersion {
  @scala.inline
  def apply(Author: String, Comment: String, Id: String, TimeStamp: DateTime): CmisVersion = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmisVersion]
  }
}

