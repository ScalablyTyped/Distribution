package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerConnectorInfo extends js.Object {
  /**
    * Number of active discovery connectors.
    */
  var activeConnectors: Integer
  /**
    * Number of blacklisted discovery connectors.
    */
  var blackListedConnectors: Integer
  /**
    * Number of healthy discovery connectors.
    */
  var healthyConnectors: Integer
  /**
    * Number of discovery connectors with status SHUTDOWN,
    */
  var shutdownConnectors: Integer
  /**
    * Total number of discovery connectors.
    */
  var totalConnectors: Integer
  /**
    * Number of unhealthy discovery connectors.
    */
  var unhealthyConnectors: Integer
  /**
    * Number of unknown discovery connectors.
    */
  var unknownConnectors: Integer
}

object CustomerConnectorInfo {
  @scala.inline
  def apply(
    activeConnectors: Integer,
    blackListedConnectors: Integer,
    healthyConnectors: Integer,
    shutdownConnectors: Integer,
    totalConnectors: Integer,
    unhealthyConnectors: Integer,
    unknownConnectors: Integer
  ): CustomerConnectorInfo = {
    val __obj = js.Dynamic.literal(activeConnectors = activeConnectors, blackListedConnectors = blackListedConnectors, healthyConnectors = healthyConnectors, shutdownConnectors = shutdownConnectors, totalConnectors = totalConnectors, unhealthyConnectors = unhealthyConnectors, unknownConnectors = unknownConnectors)
  
    __obj.asInstanceOf[CustomerConnectorInfo]
  }
}

