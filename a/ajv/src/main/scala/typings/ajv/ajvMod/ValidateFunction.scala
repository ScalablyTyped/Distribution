package typings.ajv.ajvMod

import typings.ajv.ajvNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateFunction extends js.Object {
  @JSName("$async")
  var $async: js.UndefOr[`true`] = js.native
  var errors: js.UndefOr[Null | js.Array[ErrorObject]] = js.native
  var refVal: js.UndefOr[js.Array[_]] = js.native
  var refs: js.UndefOr[js.Object] = js.native
  var root: js.UndefOr[ValidateFunction | js.Object] = js.native
  var schema: js.UndefOr[js.Object | Boolean] = js.native
  var source: js.UndefOr[js.Object] = js.native
  def apply(data: js.Any): Boolean | js.Thenable[_] = js.native
  def apply(data: js.Any, dataPath: String): Boolean | js.Thenable[_] = js.native
  def apply(data: js.Any, dataPath: String, parentData: js.Array[_]): Boolean | js.Thenable[_] = js.native
  def apply(data: js.Any, dataPath: String, parentData: js.Array[_], parentDataProperty: String): Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: String,
    parentData: js.Array[_],
    parentDataProperty: String,
    rootData: js.Array[_]
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: String,
    parentData: js.Array[_],
    parentDataProperty: String,
    rootData: js.Object
  ): Boolean | js.Thenable[_] = js.native
  def apply(data: js.Any, dataPath: String, parentData: js.Array[_], parentDataProperty: Double): Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: String,
    parentData: js.Array[_],
    parentDataProperty: Double,
    rootData: js.Array[_]
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: String,
    parentData: js.Array[_],
    parentDataProperty: Double,
    rootData: js.Object
  ): Boolean | js.Thenable[_] = js.native
  def apply(data: js.Any, dataPath: String, parentData: js.Object): Boolean | js.Thenable[_] = js.native
  def apply(data: js.Any, dataPath: String, parentData: js.Object, parentDataProperty: String): Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: String,
    parentData: js.Object,
    parentDataProperty: String,
    rootData: js.Array[_]
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: String,
    parentData: js.Object,
    parentDataProperty: String,
    rootData: js.Object
  ): Boolean | js.Thenable[_] = js.native
  def apply(data: js.Any, dataPath: String, parentData: js.Object, parentDataProperty: Double): Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: String,
    parentData: js.Object,
    parentDataProperty: Double,
    rootData: js.Array[_]
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    data: js.Any,
    dataPath: String,
    parentData: js.Object,
    parentDataProperty: Double,
    rootData: js.Object
  ): Boolean | js.Thenable[_] = js.native
}

