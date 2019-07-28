package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** information needed to (recursively) search an object. */
trait SearchInfo extends js.Object {
  /** the search criteria. */
  var Criteria: SafeArray[SearchCriterium]
  /** whether to follow indirections (link objects) and search through their respective targets also. */
  var FollowIndirections: Boolean
  /** whether to include the object itself in the search or only (some of) its sub-objects. */
  var IncludeBase: Boolean
  /** the mode of recursion to use. */
  var Recursion: SearchRecursion
  /**
    * whether to respect the "view restrictions" specified for the documents hierarchically contained within an object (e.g., only searches through marked
    * documents).
    */
  var RespectDocViewRestrictions: Boolean
  /**
    * whether to respect the "view restrictions" specified for the folders hierarchically contained within an object (e.g., only searches through subscribed
    * folders).
    */
  var RespectFolderViewRestrictions: Boolean
}

object SearchInfo {
  @scala.inline
  def apply(
    Criteria: SafeArray[SearchCriterium],
    FollowIndirections: Boolean,
    IncludeBase: Boolean,
    Recursion: SearchRecursion,
    RespectDocViewRestrictions: Boolean,
    RespectFolderViewRestrictions: Boolean
  ): SearchInfo = {
    val __obj = js.Dynamic.literal(Criteria = Criteria, FollowIndirections = FollowIndirections, IncludeBase = IncludeBase, Recursion = Recursion, RespectDocViewRestrictions = RespectDocViewRestrictions, RespectFolderViewRestrictions = RespectFolderViewRestrictions)
  
    __obj.asInstanceOf[SearchInfo]
  }
}

