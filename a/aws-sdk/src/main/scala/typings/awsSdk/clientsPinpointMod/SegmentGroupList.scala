package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentGroupList extends StObject {
  
  /**
    * An array that defines the set of segment criteria to evaluate when handling segment groups for the segment.
    */
  var Groups: js.UndefOr[ListOfSegmentGroup] = js.undefined
  
  /**
    * Specifies how to handle multiple segment groups for the segment. For example, if the segment includes three segment groups, whether the resulting segment includes endpoints that match all, any, or none of the segment groups.
    */
  var Include: js.UndefOr[typings.awsSdk.clientsPinpointMod.Include] = js.undefined
}
object SegmentGroupList {
  
  inline def apply(): SegmentGroupList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentGroupList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentGroupList] (val x: Self) extends AnyVal {
    
    inline def setGroups(value: ListOfSegmentGroup): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: SegmentGroup*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setInclude(value: Include): Self = StObject.set(x, "Include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "Include", js.undefined)
  }
}
