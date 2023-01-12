package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectResponse extends StObject {
  
  /**
    * The description of the project.
    */
  var ProjectDescription: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ProjectDescription] = js.undefined
}
object DescribeProjectResponse {
  
  inline def apply(): DescribeProjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProjectResponse] (val x: Self) extends AnyVal {
    
    inline def setProjectDescription(value: ProjectDescription): Self = StObject.set(x, "ProjectDescription", value.asInstanceOf[js.Any])
    
    inline def setProjectDescriptionUndefined: Self = StObject.set(x, "ProjectDescription", js.undefined)
  }
}
