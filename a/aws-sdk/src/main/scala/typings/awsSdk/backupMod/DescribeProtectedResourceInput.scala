package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProtectedResourceInput extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: ARN
}
object DescribeProtectedResourceInput {
  
  @scala.inline
  def apply(ResourceArn: ARN): DescribeProtectedResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProtectedResourceInput]
  }
  
  @scala.inline
  implicit class DescribeProtectedResourceInputMutableBuilder[Self <: DescribeProtectedResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
