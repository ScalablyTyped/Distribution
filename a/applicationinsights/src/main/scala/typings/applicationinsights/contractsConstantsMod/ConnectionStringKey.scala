package typings.applicationinsights.contractsConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.applicationinsights.applicationinsightsStrings.authorization
  - typings.applicationinsights.applicationinsightsStrings.instrumentationkey
  - typings.applicationinsights.applicationinsightsStrings.ingestionendpoint
  - typings.applicationinsights.applicationinsightsStrings.liveendpoint
  - typings.applicationinsights.applicationinsightsStrings.location
  - typings.applicationinsights.applicationinsightsStrings.endpointsuffix
*/
trait ConnectionStringKey extends js.Object

object ConnectionStringKey {
  @scala.inline
  def authorization: typings.applicationinsights.applicationinsightsStrings.authorization = this.cast("authorization")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def endpointsuffix: typings.applicationinsights.applicationinsightsStrings.endpointsuffix = this.cast("endpointsuffix")
  @scala.inline
  def ingestionendpoint: typings.applicationinsights.applicationinsightsStrings.ingestionendpoint = this.cast("ingestionendpoint")
  @scala.inline
  def instrumentationkey: typings.applicationinsights.applicationinsightsStrings.instrumentationkey = this.cast("instrumentationkey")
  @scala.inline
  def liveendpoint: typings.applicationinsights.applicationinsightsStrings.liveendpoint = this.cast("liveendpoint")
  @scala.inline
  def location: typings.applicationinsights.applicationinsightsStrings.location = this.cast("location")
}

