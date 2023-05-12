package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSimulationInput extends StObject {
  
  /**
    * A value that you provide to ensure that repeated calls to this API operation using the same parameters complete only once. A ClientToken is also known as an idempotency token. A ClientToken expires after 24 hours.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.ClientToken] = js.undefined
  
  /**
    * The description of the simulation.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.Description] = js.undefined
  
  /**
    * The maximum running time of the simulation, specified as a number of minutes (m or M), hours (h or H), or days (d or D). The simulation stops when it reaches this limit. The maximum value is 14D, or its equivalent in the other units. The default value is 14D. A value equivalent to 0 makes the simulation immediately transition to Stopping as soon as it reaches Started.
    */
  var MaximumDuration: js.UndefOr[TimeToLiveString] = js.undefined
  
  /**
    * The name of the simulation.
    */
  var Name: SimSpaceWeaverResourceName
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation assumes to perform actions. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference. For more information about IAM roles, see IAM roles in the Identity and Access Management User Guide.
    */
  var RoleArn: typings.awsSdk.clientsSimspaceweaverMod.RoleArn
  
  /**
    * The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information about Amazon S3, see the  Amazon Simple Storage Service User Guide . Provide a SchemaS3Location to start your simulation from a schema. If you provide a SchemaS3Location then you can't provide a SnapshotS3Location.
    */
  var SchemaS3Location: js.UndefOr[S3Location] = js.undefined
  
  /**
    * The location of the snapshot .zip file in Amazon Simple Storage Service (Amazon S3). For more information about Amazon S3, see the  Amazon Simple Storage Service User Guide . Provide a SnapshotS3Location to start your simulation from a snapshot. If you provide a SnapshotS3Location then you can't provide a SchemaS3Location.
    */
  var SnapshotS3Location: js.UndefOr[S3Location] = js.undefined
  
  /**
    * A list of tags for the simulation. For more information about tags, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object StartSimulationInput {
  
  inline def apply(Name: SimSpaceWeaverResourceName, RoleArn: RoleArn): StartSimulationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSimulationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSimulationInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMaximumDuration(value: TimeToLiveString): Self = StObject.set(x, "MaximumDuration", value.asInstanceOf[js.Any])
    
    inline def setMaximumDurationUndefined: Self = StObject.set(x, "MaximumDuration", js.undefined)
    
    inline def setName(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaS3Location(value: S3Location): Self = StObject.set(x, "SchemaS3Location", value.asInstanceOf[js.Any])
    
    inline def setSchemaS3LocationUndefined: Self = StObject.set(x, "SchemaS3Location", js.undefined)
    
    inline def setSnapshotS3Location(value: S3Location): Self = StObject.set(x, "SnapshotS3Location", value.asInstanceOf[js.Any])
    
    inline def setSnapshotS3LocationUndefined: Self = StObject.set(x, "SnapshotS3Location", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
