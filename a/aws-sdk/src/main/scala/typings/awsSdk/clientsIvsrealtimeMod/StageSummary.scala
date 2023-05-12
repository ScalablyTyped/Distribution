package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageSummary extends StObject {
  
  /**
    * ID of the active session within the stage.
    */
  var activeSessionId: js.UndefOr[StageSessionId] = js.undefined
  
  /**
    * Stage ARN.
    */
  var arn: StageArn
  
  /**
    * Stage name.
    */
  var name: js.UndefOr[StageName] = js.undefined
  
  /**
    * Tags attached to the resource. Array of maps, each of the form string:string (key:value). See Tagging AWS Resources for details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints on tags beyond what is documented there.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object StageSummary {
  
  inline def apply(arn: StageArn): StageSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StageSummary] (val x: Self) extends AnyVal {
    
    inline def setActiveSessionId(value: StageSessionId): Self = StObject.set(x, "activeSessionId", value.asInstanceOf[js.Any])
    
    inline def setActiveSessionIdUndefined: Self = StObject.set(x, "activeSessionId", js.undefined)
    
    inline def setArn(value: StageArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: StageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
