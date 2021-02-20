package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeComponentResponse extends StObject {
  
  var ApplicationComponent: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationComponent] = js.native
  
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceList] = js.native
}
object DescribeComponentResponse {
  
  @scala.inline
  def apply(): DescribeComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentResponse]
  }
  
  @scala.inline
  implicit class DescribeComponentResponseMutableBuilder[Self <: DescribeComponentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationComponent(value: ApplicationComponent): Self = StObject.set(x, "ApplicationComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationComponentUndefined: Self = StObject.set(x, "ApplicationComponent", js.undefined)
    
    @scala.inline
    def setResourceList(value: ResourceList): Self = StObject.set(x, "ResourceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceListUndefined: Self = StObject.set(x, "ResourceList", js.undefined)
    
    @scala.inline
    def setResourceListVarargs(value: ResourceARN*): Self = StObject.set(x, "ResourceList", js.Array(value :_*))
  }
}
