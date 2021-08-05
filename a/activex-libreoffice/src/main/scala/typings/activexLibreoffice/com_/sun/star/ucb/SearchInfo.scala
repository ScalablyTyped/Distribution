package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** information needed to (recursively) search an object. */
trait SearchInfo extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: SearchInfo](x: Self) {
    
    inline def setCriteria(value: SafeArray[SearchCriterium]): Self = StObject.set(x, "Criteria", value.asInstanceOf[js.Any])
    
    inline def setFollowIndirections(value: Boolean): Self = StObject.set(x, "FollowIndirections", value.asInstanceOf[js.Any])
    
    inline def setIncludeBase(value: Boolean): Self = StObject.set(x, "IncludeBase", value.asInstanceOf[js.Any])
    
    inline def setRecursion(value: SearchRecursion): Self = StObject.set(x, "Recursion", value.asInstanceOf[js.Any])
    
    inline def setRespectDocViewRestrictions(value: Boolean): Self = StObject.set(x, "RespectDocViewRestrictions", value.asInstanceOf[js.Any])
    
    inline def setRespectFolderViewRestrictions(value: Boolean): Self = StObject.set(x, "RespectFolderViewRestrictions", value.asInstanceOf[js.Any])
  }
}
