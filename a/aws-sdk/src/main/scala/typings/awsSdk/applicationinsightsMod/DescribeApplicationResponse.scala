package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationResponse extends StObject {
  
  /**
    * Information about the application.
    */
  var ApplicationInfo: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationInfo] = js.undefined
}
object DescribeApplicationResponse {
  
  @scala.inline
  def apply(): DescribeApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationResponse]
  }
  
  @scala.inline
  implicit class DescribeApplicationResponseMutableBuilder[Self <: DescribeApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationInfo(value: ApplicationInfo): Self = StObject.set(x, "ApplicationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationInfoUndefined: Self = StObject.set(x, "ApplicationInfo", js.undefined)
  }
}
