package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedRemoteDependencyDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of Remote Dependency represents an interaction of the monitored component with a remote component/service like SQL or an HTTP endpoint.
  */
@js.native
trait RemoteDependencyData
  extends applicationinsightsLib.outDeclarationsContractsGeneratedDomainMod.^ {
  /**
    * Command initiated by this dependency call. Examples are SQL statement and HTTP URL's with all query parameters.
    */
  var data: java.lang.String = js.native
  /**
    * Request duration in format: DD.HH:MM:SS.MMMMMM. Must be less than 1000 days.
    */
  var duration: java.lang.String = js.native
  /**
    * Identifier of a dependency call instance. Used for correlation with the request telemetry item corresponding to this dependency call.
    */
  var id: java.lang.String = js.native
  /**
    * Collection of custom measurements.
    */
  var measurements: js.Any = js.native
  /**
    * Name of the command initiated with this dependency call. Low cardinality value. Examples are stored procedure name and URL path template.
    */
  var name: java.lang.String = js.native
  /**
    * Collection of custom properties.
    */
  var properties: js.Any = js.native
  /**
    * Result code of a dependency call. Examples are SQL error code and HTTP status code.
    */
  var resultCode: java.lang.String = js.native
  /**
    * Indication of successfull or unsuccessfull call.
    */
  var success: scala.Boolean = js.native
  /**
    * Target site of a dependency call. Examples are server name, host address.
    */
  var target: java.lang.String = js.native
  /**
    * Dependency type name. Very low cardinality value for logical grouping of dependencies and interpretation of other fields like commandName and resultCode. Examples are SQL, Azure table, and HTTP.
    */
  var `type`: java.lang.String = js.native
  /**
    * Schema version
    */
  var ver: scala.Double = js.native
}

