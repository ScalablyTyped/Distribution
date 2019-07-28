package typings.applicationinsightsDashJs

import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomProcessing extends js.Object {
  var domProcessing: FieldType
  var duration: FieldType
  var measurements: FieldType
  var name: FieldType
  var networkConnect: FieldType
  var perfTotal: FieldType
  var properties: FieldType
  var receivedResponse: FieldType
  var sentRequest: FieldType
  var url: FieldType
  var ver: FieldType
}

object Anon_DomProcessing {
  @scala.inline
  def apply(
    domProcessing: FieldType,
    duration: FieldType,
    measurements: FieldType,
    name: FieldType,
    networkConnect: FieldType,
    perfTotal: FieldType,
    properties: FieldType,
    receivedResponse: FieldType,
    sentRequest: FieldType,
    url: FieldType,
    ver: FieldType
  ): Anon_DomProcessing = {
    val __obj = js.Dynamic.literal(domProcessing = domProcessing, duration = duration, measurements = measurements, name = name, networkConnect = networkConnect, perfTotal = perfTotal, properties = properties, receivedResponse = receivedResponse, sentRequest = sentRequest, url = url, ver = ver)
  
    __obj.asInstanceOf[Anon_DomProcessing]
  }
}

