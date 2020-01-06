package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputFormatConfiguration extends js.Object {
  /**
    * Specifies which serializer to use. You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server rejects the request.
    */
  var Serializer: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.Serializer] = js.native
}

object OutputFormatConfiguration {
  @scala.inline
  def apply(Serializer: Serializer = null): OutputFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Serializer != null) __obj.updateDynamic("Serializer")(Serializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFormatConfiguration]
  }
}

