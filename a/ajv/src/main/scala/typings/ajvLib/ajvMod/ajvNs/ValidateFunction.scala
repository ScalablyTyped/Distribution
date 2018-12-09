package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateFunction extends js.Object {
  @JSName("$async")
  var $async: js.UndefOr[ajvLib.ajvLibNumbers.`true`] = js.native
  var errors: js.UndefOr[scala.Null | js.Array[ErrorObject]] = js.native
  var refVal: js.UndefOr[js.Array[_]] = js.native
  var refs: js.UndefOr[js.Object] = js.native
  var root: js.UndefOr[ValidateFunction | js.Object] = js.native
  var schema: js.UndefOr[js.Object | scala.Boolean] = js.native
  var source: js.UndefOr[js.Object] = js.native
  def apply(data: js.Any): scala.Boolean | js.Thenable[_] = js.native
  def apply(data: js.Any, dataPath: java.lang.String): scala.Boolean | js.Thenable[_] = js.native
  def apply(data: js.Any, dataPath: java.lang.String, parentData: js.Array[_]): scala.Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: java.lang.String,
    parentData: js.Array[_],
    parentDataProperty: java.lang.String
  ): scala.Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: java.lang.String,
    parentData: js.Array[_],
    parentDataProperty: java.lang.String,
    rootData: js.Array[_]
  ): scala.Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: java.lang.String,
    parentData: js.Array[_],
    parentDataProperty: java.lang.String,
    rootData: js.Object
  ): scala.Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: java.lang.String,
    parentData: js.Array[_],
    parentDataProperty: scala.Double
  ): scala.Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: java.lang.String,
    parentData: js.Array[_],
    parentDataProperty: scala.Double,
    rootData: js.Array[_]
  ): scala.Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: java.lang.String,
    parentData: js.Array[_],
    parentDataProperty: scala.Double,
    rootData: js.Object
  ): scala.Boolean | js.Thenable[_] = js.native
  def apply(data: js.Any, dataPath: java.lang.String, parentData: js.Object): scala.Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: java.lang.String,
    parentData: js.Object,
    parentDataProperty: java.lang.String
  ): scala.Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: java.lang.String,
    parentData: js.Object,
    parentDataProperty: java.lang.String,
    rootData: js.Array[_]
  ): scala.Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: java.lang.String,
    parentData: js.Object,
    parentDataProperty: java.lang.String,
    rootData: js.Object
  ): scala.Boolean | js.Thenable[_] = js.native
  def apply(data: js.Any, dataPath: java.lang.String, parentData: js.Object, parentDataProperty: scala.Double): scala.Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: java.lang.String,
    parentData: js.Object,
    parentDataProperty: scala.Double,
    rootData: js.Array[_]
  ): scala.Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: java.lang.String,
    parentData: js.Object,
    parentDataProperty: scala.Double,
    rootData: js.Object
  ): scala.Boolean | js.Thenable[_] = js.native
}

