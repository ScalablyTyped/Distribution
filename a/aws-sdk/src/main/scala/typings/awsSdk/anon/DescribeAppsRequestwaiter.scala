package typings.awsSdk.anon

import typings.awsSdk.opsworksMod.String
import typings.awsSdk.opsworksMod.Strings
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/opsworks.DescribeAppsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeAppsRequestwaiter extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * An array of app IDs for the apps to be described. If you use this parameter, DescribeApps returns a description of the specified apps. Otherwise, it returns a description of every app.
    */
  var AppIds: js.UndefOr[Strings] = js.native
  
  /**
    * The app stack ID. If you use this parameter, DescribeApps returns a description of the apps in the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}
object DescribeAppsRequestwaiter {
  
  @scala.inline
  def apply(): DescribeAppsRequestwaiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppsRequestwaiter]
  }
  
  @scala.inline
  implicit class DescribeAppsRequestwaiterMutableBuilder[Self <: DescribeAppsRequestwaiter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setAppIds(value: Strings): Self = StObject.set(x, "AppIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdsUndefined: Self = StObject.set(x, "AppIds", js.undefined)
    
    @scala.inline
    def setAppIdsVarargs(value: String*): Self = StObject.set(x, "AppIds", js.Array(value :_*))
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
