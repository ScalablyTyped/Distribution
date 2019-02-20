package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents the information that describes a revision of something. */
trait RevisionTag extends js.Object {
  /** contains an identifier for the author that created the revision( can be empty ) */
  var Author: java.lang.String
  /** contains a comment that the author has left for this revision ( can be empty ) */
  var Comment: java.lang.String
  /**
    * contains a unique identifier for the revision and must not be empty
    *
    * This identifier can have any form. It can be something like "1.2.3" or "Version 1" etc. It depends on the revision control system how it names the
    * revisions.
    */
  var Identifier: java.lang.String
  /** contains the time when the revision was created ( can be invalid ) */
  var TimeStamp: DateTime
}

