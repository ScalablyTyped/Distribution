package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "UrlSegmentGroup")
@js.native
class UrlSegmentGroup protected () extends StObject {
  def this(
    /** The URL segments of this group. See `UrlSegment` for more information */
  segments: js.Array[UrlSegment],
    /** The list of children of this group */
  children: StringDictionary[UrlSegmentGroup]
  ) = this()
  
  /** The list of children of this group */
  var children: StringDictionary[UrlSegmentGroup] = js.native
  
  /** Whether the segment has child segments */
  def hasChildren(): Boolean = js.native
  
  /** Number of child segments */
  def numberOfChildren: Double = js.native
  
  /** The parent node in the url tree */
  var parent: UrlSegmentGroup | Null = js.native
  
  /** The URL segments of this group. See `UrlSegment` for more information */
  var segments: js.Array[UrlSegment] = js.native
}
