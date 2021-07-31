package typings.awsSdk.autoscalingplansMod

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
  var TagFilters: js.UndefOr[typings.awsSdk.autoscalingplansMod.TagFilters] = js.undefined
}
object ApplicationSource {
  
  @scala.inline
  def apply(): ApplicationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationSource]
  }
  
  @scala.inline
  implicit class ApplicationSourceMutableBuilder[Self <: ApplicationSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFormationStackARN(value: XmlString): Self = StObject.set(x, "CloudFormationStackARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFormationStackARNUndefined: Self = StObject.set(x, "CloudFormationStackARN", js.undefined)
    
    @scala.inline
    def setTagFilters(value: TagFilters): Self = StObject.set(x, "TagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagFiltersUndefined: Self = StObject.set(x, "TagFilters", js.undefined)
    
    @scala.inline
    def setTagFiltersVarargs(value: TagFilter*): Self = StObject.set(x, "TagFilters", js.Array(value :_*))
  }
}
