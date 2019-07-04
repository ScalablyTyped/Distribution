package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3BaseMetadataFacade extends js.Object {
  var inputs: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])]
  ] = js.undefined
  var name: java.lang.String
  var outputs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var propMetadata: org.scalablytyped.runtime.StringDictionary[js.Array[_]]
  var queries: js.UndefOr[js.Array[R3QueryMetadataFacade]] = js.undefined
  var viewQueries: js.UndefOr[js.Array[R3QueryMetadataFacade]] = js.undefined
}

object R3BaseMetadataFacade {
  @scala.inline
  def apply(
    name: java.lang.String,
    propMetadata: org.scalablytyped.runtime.StringDictionary[js.Array[_]],
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])] = null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    queries: js.Array[R3QueryMetadataFacade] = null,
    viewQueries: js.Array[R3QueryMetadataFacade] = null
  ): R3BaseMetadataFacade = {
    val __obj = js.Dynamic.literal(name = name, propMetadata = propMetadata)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (viewQueries != null) __obj.updateDynamic("viewQueries")(viewQueries)
    __obj.asInstanceOf[R3BaseMetadataFacade]
  }
}

