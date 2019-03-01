package typings
package atAngularCompilerLib.srcRender3ViewCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3BaseRefMetaData extends js.Object {
  var inputs: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])]
  ] = js.undefined
  var outputs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object R3BaseRefMetaData {
  @scala.inline
  def apply(
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])] = null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): R3BaseRefMetaData = {
    val __obj = js.Dynamic.literal()
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    __obj.asInstanceOf[R3BaseRefMetaData]
  }
}

