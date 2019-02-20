package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** information needed to (recursively) search an object. */
trait SearchInfo extends js.Object {
  /** the search criteria. */
  var Criteria: activexDashInteropLib.SafeArray[SearchCriterium]
  /** whether to follow indirections (link objects) and search through their respective targets also. */
  var FollowIndirections: scala.Boolean
  /** whether to include the object itself in the search or only (some of) its sub-objects. */
  var IncludeBase: scala.Boolean
  /** the mode of recursion to use. */
  var Recursion: SearchRecursion
  /**
    * whether to respect the "view restrictions" specified for the documents hierarchically contained within an object (e.g., only searches through marked
    * documents).
    */
  var RespectDocViewRestrictions: scala.Boolean
  /**
    * whether to respect the "view restrictions" specified for the folders hierarchically contained within an object (e.g., only searches through subscribed
    * folders).
    */
  var RespectFolderViewRestrictions: scala.Boolean
}

