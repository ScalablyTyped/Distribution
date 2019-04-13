package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBClusterEndpointMessage extends js.Object {
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String
  /**
    * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: String
  /**
    * The type of the endpoint. One of: READER, ANY. 
    */
  var EndpointType: String
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
    */
  var ExcludedMembers: js.UndefOr[StringList] = js.undefined
  /**
    * List of DB instance identifiers that are part of the custom endpoint group.
    */
  var StaticMembers: js.UndefOr[StringList] = js.undefined
}

object CreateDBClusterEndpointMessage {
  @scala.inline
  def apply(
    DBClusterEndpointIdentifier: String,
    DBClusterIdentifier: String,
    EndpointType: String,
    ExcludedMembers: StringList = null,
    StaticMembers: StringList = null
  ): CreateDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier, DBClusterIdentifier = DBClusterIdentifier, EndpointType = EndpointType)
    if (ExcludedMembers != null) __obj.updateDynamic("ExcludedMembers")(ExcludedMembers)
    if (StaticMembers != null) __obj.updateDynamic("StaticMembers")(StaticMembers)
    __obj.asInstanceOf[CreateDBClusterEndpointMessage]
  }
}

