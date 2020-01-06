package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputFormatConfiguration extends js.Object {
  /**
    * Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are non-null, the server rejects the request.
    */
  var Deserializer: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.Deserializer] = js.native
}

object InputFormatConfiguration {
  @scala.inline
  def apply(Deserializer: Deserializer = null): InputFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Deserializer != null) __obj.updateDynamic("Deserializer")(Deserializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputFormatConfiguration]
  }
}

