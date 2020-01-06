package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterEndpoint extends js.Object {
  /**
    * The type associated with a custom endpoint. One of: READER, WRITER, ANY.
    */
  var CustomEndpointType: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the endpoint.
    */
  var DBClusterEndpointArn: js.UndefOr[String] = js.native
  /**
    * The identifier associated with the endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: js.UndefOr[String] = js.native
  /**
    * A unique system-generated identifier for an endpoint. It remains the same for the whole life of the endpoint.
    */
  var DBClusterEndpointResourceIdentifier: js.UndefOr[String] = js.native
  /**
    * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The DNS address of the endpoint.
    */
  var Endpoint: js.UndefOr[String] = js.native
  /**
    * The type of the endpoint. One of: READER, WRITER, CUSTOM.
    */
  var EndpointType: js.UndefOr[String] = js.native
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
    */
  var ExcludedMembers: js.UndefOr[StringList] = js.native
  /**
    * List of DB instance identifiers that are part of the custom endpoint group.
    */
  var StaticMembers: js.UndefOr[StringList] = js.native
  /**
    * The current status of the endpoint. One of: creating, available, deleting, modifying.
    */
  var Status: js.UndefOr[String] = js.native
}

object DBClusterEndpoint {
  @scala.inline
  def apply(
    CustomEndpointType: String = null,
    DBClusterEndpointArn: String = null,
    DBClusterEndpointIdentifier: String = null,
    DBClusterEndpointResourceIdentifier: String = null,
    DBClusterIdentifier: String = null,
    Endpoint: String = null,
    EndpointType: String = null,
    ExcludedMembers: StringList = null,
    StaticMembers: StringList = null,
    Status: String = null
  ): DBClusterEndpoint = {
    val __obj = js.Dynamic.literal()
    if (CustomEndpointType != null) __obj.updateDynamic("CustomEndpointType")(CustomEndpointType.asInstanceOf[js.Any])
    if (DBClusterEndpointArn != null) __obj.updateDynamic("DBClusterEndpointArn")(DBClusterEndpointArn.asInstanceOf[js.Any])
    if (DBClusterEndpointIdentifier != null) __obj.updateDynamic("DBClusterEndpointIdentifier")(DBClusterEndpointIdentifier.asInstanceOf[js.Any])
    if (DBClusterEndpointResourceIdentifier != null) __obj.updateDynamic("DBClusterEndpointResourceIdentifier")(DBClusterEndpointResourceIdentifier.asInstanceOf[js.Any])
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier.asInstanceOf[js.Any])
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (ExcludedMembers != null) __obj.updateDynamic("ExcludedMembers")(ExcludedMembers.asInstanceOf[js.Any])
    if (StaticMembers != null) __obj.updateDynamic("StaticMembers")(StaticMembers.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterEndpoint]
  }
}

