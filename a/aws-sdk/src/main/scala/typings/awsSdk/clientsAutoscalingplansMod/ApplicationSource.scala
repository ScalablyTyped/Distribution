package typings.awsSdk.clientsAutoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
    */
  var CloudFormationStackARN: js.UndefOr[XmlString] = js.undefined
  
  /**
    * A set of tags (up to 50).
    */
  var TagFilters: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.TagFilters] = js.undefined
}
object ApplicationSource {
  
  inline def apply(): ApplicationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationSource]
  }
  
  extension [Self <: ApplicationSource](x: Self) {
    
    inline def setCloudFormationStackARN(value: XmlString): Self = StObject.set(x, "CloudFormationStackARN", value.asInstanceOf[js.Any])
    
    inline def setCloudFormationStackARNUndefined: Self = StObject.set(x, "CloudFormationStackARN", js.undefined)
    
    inline def setTagFilters(value: TagFilters): Self = StObject.set(x, "TagFilters", value.asInstanceOf[js.Any])
    
    inline def setTagFiltersUndefined: Self = StObject.set(x, "TagFilters", js.undefined)
    
    inline def setTagFiltersVarargs(value: TagFilter*): Self = StObject.set(x, "TagFilters", js.Array(value*))
  }
}
