package typings
package atAngularRouterLib.srcUrlUnderscoreTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/url_tree", "UrlSegmentGroup")
@js.native
class UrlSegmentGroup protected () extends js.Object {
  def this(/** The URL segments of this group. See `UrlSegment` for more information */
  segments: js.Array[UrlSegment], /** The list of children of this group */
  children: org.scalablytyped.runtime.StringDictionary[UrlSegmentGroup]) = this()
  /** The list of children of this group */
  var children: org.scalablytyped.runtime.StringDictionary[UrlSegmentGroup] = js.native
  /** Number of child segments */
  val numberOfChildren: scala.Double = js.native
  /** The parent node in the url tree */
  var parent: UrlSegmentGroup | scala.Null = js.native
  /** The URL segments of this group. See `UrlSegment` for more information */
  var segments: js.Array[UrlSegment] = js.native
  /** Whether the segment has child segments */
  def hasChildren(): scala.Boolean = js.native
}

