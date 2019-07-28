package typings.applicationinsightsDashJs

import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Metrics extends js.Object {
  var metrics: FieldType
  var properties: FieldType
  var ver: FieldType
}

object Anon_Metrics {
  @scala.inline
  def apply(metrics: FieldType, properties: FieldType, ver: FieldType): Anon_Metrics = {
    val __obj = js.Dynamic.literal(metrics = metrics, properties = properties, ver = ver)
  
    __obj.asInstanceOf[Anon_Metrics]
  }
}

