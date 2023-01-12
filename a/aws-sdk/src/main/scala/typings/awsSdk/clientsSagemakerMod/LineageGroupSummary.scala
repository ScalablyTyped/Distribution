package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineageGroupSummary extends StObject {
  
  /**
    * The creation time of the lineage group summary.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The display name of the lineage group summary.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The last modified time of the lineage group summary.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the lineage group resource.
    */
  var LineageGroupArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LineageGroupArn] = js.undefined
  
  /**
    * The name or Amazon Resource Name (ARN) of the lineage group.
    */
  var LineageGroupName: js.UndefOr[ExperimentEntityName] = js.undefined
}
object LineageGroupSummary {
  
  inline def apply(): LineageGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineageGroupSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineageGroupSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLineageGroupArn(value: LineageGroupArn): Self = StObject.set(x, "LineageGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLineageGroupArnUndefined: Self = StObject.set(x, "LineageGroupArn", js.undefined)
    
    inline def setLineageGroupName(value: ExperimentEntityName): Self = StObject.set(x, "LineageGroupName", value.asInstanceOf[js.Any])
    
    inline def setLineageGroupNameUndefined: Self = StObject.set(x, "LineageGroupName", js.undefined)
  }
}
