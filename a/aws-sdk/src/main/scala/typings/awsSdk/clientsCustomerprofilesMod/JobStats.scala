package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStats extends StObject {
  
  /**
    * The number of matches found.
    */
  var NumberOfMatchesFound: js.UndefOr[long] = js.undefined
  
  /**
    * The number of merges completed.
    */
  var NumberOfMergesDone: js.UndefOr[long] = js.undefined
  
  /**
    * The number of profiles reviewed.
    */
  var NumberOfProfilesReviewed: js.UndefOr[long] = js.undefined
}
object JobStats {
  
  inline def apply(): JobStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobStats] (val x: Self) extends AnyVal {
    
    inline def setNumberOfMatchesFound(value: long): Self = StObject.set(x, "NumberOfMatchesFound", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMatchesFoundUndefined: Self = StObject.set(x, "NumberOfMatchesFound", js.undefined)
    
    inline def setNumberOfMergesDone(value: long): Self = StObject.set(x, "NumberOfMergesDone", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMergesDoneUndefined: Self = StObject.set(x, "NumberOfMergesDone", js.undefined)
    
    inline def setNumberOfProfilesReviewed(value: long): Self = StObject.set(x, "NumberOfProfilesReviewed", value.asInstanceOf[js.Any])
    
    inline def setNumberOfProfilesReviewedUndefined: Self = StObject.set(x, "NumberOfProfilesReviewed", js.undefined)
  }
}
