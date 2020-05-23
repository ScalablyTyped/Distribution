package typings.activexLibreoffice.com_.sun.star.ucb

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
    val __obj = js.Dynamic.literal(Criteria = Criteria.asInstanceOf[js.Any], FollowIndirections = FollowIndirections.asInstanceOf[js.Any], IncludeBase = IncludeBase.asInstanceOf[js.Any], Recursion = Recursion.asInstanceOf[js.Any], RespectDocViewRestrictions = RespectDocViewRestrictions.asInstanceOf[js.Any], RespectFolderViewRestrictions = RespectFolderViewRestrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInfo]
  }
}

