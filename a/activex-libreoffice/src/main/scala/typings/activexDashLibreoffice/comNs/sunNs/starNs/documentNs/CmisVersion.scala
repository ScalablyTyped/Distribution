package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
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
    val __obj = js.Dynamic.literal(Author = Author, Comment = Comment, Id = Id, TimeStamp = TimeStamp)
  
    __obj.asInstanceOf[CmisVersion]
  }
}

