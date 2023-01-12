package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceInput extends StObject {
  
  /**
    * A unique identifier to ensure the idempotency of the resource request. As a best practice, specify this token to ensure idempotency, so that Amazon Web Services Cloud Control API can accurately distinguish between request retries and new resource requests. You might retry a resource request to ensure that it was successfully received. A client token is valid for 36 hours once used. After that, a resource request with the same client token is treated as a new request. If you do not specify a client token, one is generated for inclusion in the request. For more information, see Ensuring resource operation requests are unique in the Amazon Web Services Cloud Control API User Guide.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.ClientToken] = js.undefined
  
  /**
    * Structured data format representing the desired state of the resource, consisting of that resource's properties and their desired values.  Cloud Control API currently supports JSON as a structured data format.   &lt;p&gt;Specify the desired state as one of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;A JSON blob&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;A local path containing the desired state in JSON data format&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-create.html#resource-operations-create-desiredstate&quot;&gt;Composing the desired state of the resource&lt;/a&gt; in the &lt;i&gt;Amazon Web Services Cloud Control API User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;For more information about the properties of a specific resource, refer to the related topic for the resource in the &lt;a href=&quot;https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html&quot;&gt;Resource and property types reference&lt;/a&gt; in the &lt;i&gt;CloudFormation Users Guide&lt;/i&gt;.&lt;/p&gt; 
    */
  var DesiredState: Properties
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role for Cloud Control API to use when performing this resource operation. The role specified must have the permissions required for this operation. The necessary permissions for each event handler are defined in the  handlers  section of the resource type definition schema. If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web Services user credentials. For more information, see Specifying credentials in the Amazon Web Services Cloud Control API User Guide.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.RoleArn] = js.undefined
  
  /**
    * The name of the resource type.
    */
  var TypeName: typings.awsSdk.clientsCloudcontrolMod.TypeName
  
  /**
    * For private resource types, the type version to use in this resource operation. If you do not specify a resource version, CloudFormation uses the default version.
    */
  var TypeVersionId: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.TypeVersionId] = js.undefined
}
object CreateResourceInput {
  
  inline def apply(DesiredState: Properties, TypeName: TypeName): CreateResourceInput = {
    val __obj = js.Dynamic.literal(DesiredState = DesiredState.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateResourceInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDesiredState(value: Properties): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeVersionId(value: TypeVersionId): Self = StObject.set(x, "TypeVersionId", value.asInstanceOf[js.Any])
    
    inline def setTypeVersionIdUndefined: Self = StObject.set(x, "TypeVersionId", js.undefined)
  }
}
