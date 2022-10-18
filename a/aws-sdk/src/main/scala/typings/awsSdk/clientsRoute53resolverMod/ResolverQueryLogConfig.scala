package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverQueryLogConfig extends StObject {
  
  /**
    * The ARN for the query logging configuration.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Arn] = js.undefined
  
  /**
    * The number of VPCs that are associated with the query logging configuration.
    */
  var AssociationCount: js.UndefOr[Count] = js.undefined
  
  /**
    * The date and time that the query logging configuration was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * A unique string that identifies the request that created the query logging configuration. The CreatorRequestId allows failed requests to be retried without the risk of running the operation twice.
    */
  var CreatorRequestId: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.CreatorRequestId] = js.undefined
  
  /**
    * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
    */
  var DestinationArn: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.DestinationArn] = js.undefined
  
  /**
    * The ID for the query logging configuration.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The name of the query logging configuration. 
    */
  var Name: js.UndefOr[ResolverQueryLogConfigName] = js.undefined
  
  /**
    * The Amazon Web Services account ID for the account that created the query logging configuration. 
    */
  var OwnerId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * An indication of whether the query logging configuration is shared with other Amazon Web Services accounts, or was shared with the current account by another Amazon Web Services account. Sharing is configured through Resource Access Manager (RAM).
    */
  var ShareStatus: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ShareStatus] = js.undefined
  
  /**
    * The status of the specified query logging configuration. Valid values include the following:    CREATING: Resolver is creating the query logging configuration.    CREATED: The query logging configuration was successfully created. Resolver is logging queries that originate in the specified VPC.    DELETING: Resolver is deleting this query logging configuration.    FAILED: Resolver can't deliver logs to the location that is specified in the query logging configuration. Here are two common causes:   The specified destination (for example, an Amazon S3 bucket) was deleted.   Permissions don't allow sending logs to the destination.    
    */
  var Status: js.UndefOr[ResolverQueryLogConfigStatus] = js.undefined
}
object ResolverQueryLogConfig {
  
  inline def apply(): ResolverQueryLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverQueryLogConfig]
  }
  
  extension [Self <: ResolverQueryLogConfig](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAssociationCount(value: Count): Self = StObject.set(x, "AssociationCount", value.asInstanceOf[js.Any])
    
    inline def setAssociationCountUndefined: Self = StObject.set(x, "AssociationCount", js.undefined)
    
    inline def setCreationTime(value: Rfc3339TimeString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setDestinationArn(value: DestinationArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ResolverQueryLogConfigName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerId(value: AccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setShareStatus(value: ShareStatus): Self = StObject.set(x, "ShareStatus", value.asInstanceOf[js.Any])
    
    inline def setShareStatusUndefined: Self = StObject.set(x, "ShareStatus", js.undefined)
    
    inline def setStatus(value: ResolverQueryLogConfigStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
