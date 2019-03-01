package typings
package arangodbLib.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectingEdgesOptions extends js.Object {
  var edgeCollectionRestriction: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var edgeExamples: js.UndefOr[Example] = js.undefined
  var vertex1CollectionRestriction: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var vertex2CollectionRestriction: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
}

object ConnectingEdgesOptions {
  @scala.inline
  def apply(
    edgeCollectionRestriction: js.Array[java.lang.String] | java.lang.String = null,
    edgeExamples: Example = null,
    vertex1CollectionRestriction: js.Array[java.lang.String] | java.lang.String = null,
    vertex2CollectionRestriction: js.Array[java.lang.String] | java.lang.String = null
  ): ConnectingEdgesOptions = {
    val __obj = js.Dynamic.literal()
    if (edgeCollectionRestriction != null) __obj.updateDynamic("edgeCollectionRestriction")(edgeCollectionRestriction.asInstanceOf[js.Any])
    if (edgeExamples != null) __obj.updateDynamic("edgeExamples")(edgeExamples.asInstanceOf[js.Any])
    if (vertex1CollectionRestriction != null) __obj.updateDynamic("vertex1CollectionRestriction")(vertex1CollectionRestriction.asInstanceOf[js.Any])
    if (vertex2CollectionRestriction != null) __obj.updateDynamic("vertex2CollectionRestriction")(vertex2CollectionRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectingEdgesOptions]
  }
}

