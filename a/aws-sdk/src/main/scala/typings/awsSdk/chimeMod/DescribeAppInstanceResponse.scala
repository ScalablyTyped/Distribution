package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppInstanceResponse extends StObject {
  
  /**
    * The ARN, metadata, created and last-updated timestamps, and the name of the app instance. All timestamps use epoch milliseconds.
    */
  var AppInstance: js.UndefOr[typings.awsSdk.chimeMod.AppInstance] = js.undefined
}
object DescribeAppInstanceResponse {
  
  @scala.inline
  def apply(): DescribeAppInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppInstanceResponse]
  }
  
  @scala.inline
  implicit class DescribeAppInstanceResponseMutableBuilder[Self <: DescribeAppInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstance(value: AppInstance): Self = StObject.set(x, "AppInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceUndefined: Self = StObject.set(x, "AppInstance", js.undefined)
  }
}
