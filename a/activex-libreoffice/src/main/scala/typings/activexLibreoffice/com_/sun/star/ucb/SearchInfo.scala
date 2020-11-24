package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** information needed to (recursively) search an object. */
@js.native
trait SearchInfo extends js.Object {
  
  /** the search criteria. */
  var Criteria: SafeArray[SearchCriterium] = js.native
  
  /** whether to follow indirections (link objects) and search through their respective targets also. */
  var FollowIndirections: Boolean = js.native
  
  /** whether to include the object itself in the search or only (some of) its sub-objects. */
  var IncludeBase: Boolean = js.native
  
  /** the mode of recursion to use. */
  var Recursion: SearchRecursion = js.native
  
  /**
    * whether to respect the "view restrictions" specified for the documents hierarchically contained within an object (e.g., only searches through marked
    * documents).
    */
  var RespectDocViewRestrictions: Boolean = js.native
  
  /**
    * whether to respect the "view restrictions" specified for the folders hierarchically contained within an object (e.g., only searches through subscribed
    * folders).
    */
  var RespectFolderViewRestrictions: Boolean = js.native
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
  
  @scala.inline
  implicit class SearchInfoOps[Self <: SearchInfo] (val x: Self) extends AnyVal {
    
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
    def setCriteria(value: SafeArray[SearchCriterium]): Self = this.set("Criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowIndirections(value: Boolean): Self = this.set("FollowIndirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBase(value: Boolean): Self = this.set("IncludeBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursion(value: SearchRecursion): Self = this.set("Recursion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespectDocViewRestrictions(value: Boolean): Self = this.set("RespectDocViewRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespectFolderViewRestrictions(value: Boolean): Self = this.set("RespectFolderViewRestrictions", value.asInstanceOf[js.Any])
  }
}
