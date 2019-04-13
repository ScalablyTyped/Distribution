package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyDBClusterEndpointMessage extends js.Object {
  /**
    * The identifier of the endpoint to modify. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String
  /**
    * The type of the endpoint. One of: READER, ANY. 
    */
  var EndpointType: js.UndefOr[String] = js.undefined
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
    */
  var ExcludedMembers: js.UndefOr[StringList] = js.undefined
  /**
    * List of DB instance identifiers that are part of the custom endpoint group.
    */
  var StaticMembers: js.UndefOr[StringList] = js.undefined
}

object ModifyDBClusterEndpointMessage {
  @scala.inline
  def apply(
    DBClusterEndpointIdentifier: String,
    EndpointType: String = null,
    ExcludedMembers: StringList = null,
    StaticMembers: StringList = null
  ): ModifyDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier)
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType)
    if (ExcludedMembers != null) __obj.updateDynamic("ExcludedMembers")(ExcludedMembers)
    if (StaticMembers != null) __obj.updateDynamic("StaticMembers")(StaticMembers)
    __obj.asInstanceOf[ModifyDBClusterEndpointMessage]
  }
}

