package typings.awsSdk.anon

import typings.awsSdk.ec2Mod.Boolean
import typings.awsSdk.ec2Mod.ConversionIdStringList
import typings.awsSdk.ec2Mod.ConversionTaskId
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeConversionTasksRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeConversionTasksRe extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * The conversion task IDs.
    */
  var ConversionTaskIds: js.UndefOr[ConversionIdStringList] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}
object DescribeConversionTasksRe {
  
  @scala.inline
  def apply(): DescribeConversionTasksRe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConversionTasksRe]
  }
  
  @scala.inline
  implicit class DescribeConversionTasksReMutableBuilder[Self <: DescribeConversionTasksRe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setConversionTaskIds(value: ConversionIdStringList): Self = StObject.set(x, "ConversionTaskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionTaskIdsUndefined: Self = StObject.set(x, "ConversionTaskIds", js.undefined)
    
    @scala.inline
    def setConversionTaskIdsVarargs(value: ConversionTaskId*): Self = StObject.set(x, "ConversionTaskIds", js.Array(value :_*))
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
