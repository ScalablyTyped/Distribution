package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationResponse extends StObject {
  
  /**
    * Information about the application.
    */
  var ApplicationInfo: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationInfo] = js.undefined
}
object CreateApplicationResponse {
  
  @scala.inline
  def apply(): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  @scala.inline
  implicit class CreateApplicationResponseMutableBuilder[Self <: CreateApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationInfo(value: ApplicationInfo): Self = StObject.set(x, "ApplicationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationInfoUndefined: Self = StObject.set(x, "ApplicationInfo", js.undefined)
  }
}
