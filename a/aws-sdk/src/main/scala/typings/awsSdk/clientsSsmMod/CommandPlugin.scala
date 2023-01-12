package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandPlugin extends StObject {
  
  /**
    * The name of the plugin. Must be one of the following: aws:updateAgent, aws:domainjoin, aws:applications, aws:runPowerShellScript, aws:psmodule, aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent. 
    */
  var Name: js.UndefOr[CommandPluginName] = js.undefined
  
  /**
    * Output of the plugin execution.
    */
  var Output: js.UndefOr[CommandPluginOutput] = js.undefined
  
  /**
    * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command. For example, in the following response:  doc-example-bucket/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-02573cafcfEXAMPLE/awsrunShellScript   doc-example-bucket is the name of the S3 bucket;  ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;  i-02573cafcfEXAMPLE is the managed node ID;  awsrunShellScript is the name of the plugin.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command. For example, in the following response:  doc-example-bucket/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-02573cafcfEXAMPLE/awsrunShellScript   doc-example-bucket is the name of the S3 bucket;  ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;  i-02573cafcfEXAMPLE is the managed node ID;  awsrunShellScript is the name of the plugin.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Amazon Web Services Systems Manager automatically determines the S3 bucket region.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.undefined
  
  /**
    * A numeric response code generated after running the plugin. 
    */
  var ResponseCode: js.UndefOr[typings.awsSdk.clientsSsmMod.ResponseCode] = js.undefined
  
  /**
    * The time the plugin stopped running. Could stop prematurely if, for example, a cancel command was sent. 
    */
  var ResponseFinishDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the plugin started running. 
    */
  var ResponseStartDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The URL for the complete text written by the plugin to stderr. If execution isn't yet complete, then this string is empty.
    */
  var StandardErrorUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * The URL for the complete text written by the plugin to stdout in Amazon S3. If the S3 bucket for the command wasn't specified, then this string is empty.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * The status of this plugin. You can run a document with multiple plugins.
    */
  var Status: js.UndefOr[CommandPluginStatus] = js.undefined
  
  /**
    * A detailed status of the plugin execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding command statuses in the Amazon Web Services Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command hasn't been sent to the managed node.   In Progress: The command has been sent to the managed node but hasn't reached a terminal state.   Success: The execution of the command or plugin was successfully completed. This is a terminal state.   Delivery Timed Out: The command wasn't delivered to the managed node before the delivery timeout expired. Delivery timeouts don't count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: Command execution started on the managed node, but the execution wasn't complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command wasn't successful on the managed node. For a plugin, this indicates that the result code wasn't zero. For a command invocation, this indicates that the result code for one or more plugins wasn't zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Cancelled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the managed node. The managed node might not exist, or it might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit, and they don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[typings.awsSdk.clientsSsmMod.StatusDetails] = js.undefined
}
object CommandPlugin {
  
  inline def apply(): CommandPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandPlugin] (val x: Self) extends AnyVal {
    
    inline def setName(value: CommandPluginName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutput(value: CommandPluginOutput): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setOutputS3BucketName(value: S3BucketName): Self = StObject.set(x, "OutputS3BucketName", value.asInstanceOf[js.Any])
    
    inline def setOutputS3BucketNameUndefined: Self = StObject.set(x, "OutputS3BucketName", js.undefined)
    
    inline def setOutputS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "OutputS3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setOutputS3KeyPrefixUndefined: Self = StObject.set(x, "OutputS3KeyPrefix", js.undefined)
    
    inline def setOutputS3Region(value: S3Region): Self = StObject.set(x, "OutputS3Region", value.asInstanceOf[js.Any])
    
    inline def setOutputS3RegionUndefined: Self = StObject.set(x, "OutputS3Region", js.undefined)
    
    inline def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
    
    inline def setResponseCode(value: ResponseCode): Self = StObject.set(x, "ResponseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeUndefined: Self = StObject.set(x, "ResponseCode", js.undefined)
    
    inline def setResponseFinishDateTime(value: js.Date): Self = StObject.set(x, "ResponseFinishDateTime", value.asInstanceOf[js.Any])
    
    inline def setResponseFinishDateTimeUndefined: Self = StObject.set(x, "ResponseFinishDateTime", js.undefined)
    
    inline def setResponseStartDateTime(value: js.Date): Self = StObject.set(x, "ResponseStartDateTime", value.asInstanceOf[js.Any])
    
    inline def setResponseStartDateTimeUndefined: Self = StObject.set(x, "ResponseStartDateTime", js.undefined)
    
    inline def setStandardErrorUrl(value: Url): Self = StObject.set(x, "StandardErrorUrl", value.asInstanceOf[js.Any])
    
    inline def setStandardErrorUrlUndefined: Self = StObject.set(x, "StandardErrorUrl", js.undefined)
    
    inline def setStandardOutputUrl(value: Url): Self = StObject.set(x, "StandardOutputUrl", value.asInstanceOf[js.Any])
    
    inline def setStandardOutputUrlUndefined: Self = StObject.set(x, "StandardOutputUrl", js.undefined)
    
    inline def setStatus(value: CommandPluginStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetails(value: StatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
