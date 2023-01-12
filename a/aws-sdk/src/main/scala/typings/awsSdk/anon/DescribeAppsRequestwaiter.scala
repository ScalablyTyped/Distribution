package typings.awsSdk.anon

import typings.awsSdk.clientsOpsworksMod.String
import typings.awsSdk.clientsOpsworksMod.Strings
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/opsworks.DescribeAppsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeAppsRequestwaiter extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * An array of app IDs for the apps to be described. If you use this parameter, DescribeApps returns a description of the specified apps. Otherwise, it returns a description of every app.
    */
  var AppIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The app stack ID. If you use this parameter, DescribeApps returns a description of the apps in the specified stack.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object DescribeAppsRequestwaiter {
  
  inline def apply(): DescribeAppsRequestwaiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppsRequestwaiter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppsRequestwaiter] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setAppIds(value: Strings): Self = StObject.set(x, "AppIds", value.asInstanceOf[js.Any])
    
    inline def setAppIdsUndefined: Self = StObject.set(x, "AppIds", js.undefined)
    
    inline def setAppIdsVarargs(value: String*): Self = StObject.set(x, "AppIds", js.Array(value*))
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
