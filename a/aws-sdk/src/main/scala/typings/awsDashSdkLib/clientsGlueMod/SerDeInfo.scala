package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerDeInfo extends js.Object {
  /**
    * Name of the SerDe.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  /**
    * These key-value pairs define initialization parameters for the SerDe.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
  /**
    * Usually the class that implements the SerDe. An example is: org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
    */
  var SerializationLibrary: js.UndefOr[NameString] = js.undefined
}

object SerDeInfo {
  @scala.inline
  def apply(Name: NameString = null, Parameters: ParametersMap = null, SerializationLibrary: NameString = null): SerDeInfo = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (SerializationLibrary != null) __obj.updateDynamic("SerializationLibrary")(SerializationLibrary)
    __obj.asInstanceOf[SerDeInfo]
  }
}

