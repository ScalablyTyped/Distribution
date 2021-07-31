package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationResponse extends StObject {
  
  /**
    * Information about the application. 
    */
  var ApplicationInfo: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationInfo] = js.undefined
}
object UpdateApplicationResponse {
  
  @scala.inline
  def apply(): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
  
  @scala.inline
  implicit class UpdateApplicationResponseMutableBuilder[Self <: UpdateApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationInfo(value: ApplicationInfo): Self = StObject.set(x, "ApplicationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationInfoUndefined: Self = StObject.set(x, "ApplicationInfo", js.undefined)
  }
}
