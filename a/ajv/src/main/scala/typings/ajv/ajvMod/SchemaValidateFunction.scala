package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaValidateFunction extends js.Object {
  var errors: js.UndefOr[js.Array[ErrorObject]] = js.native
  def apply(schema: js.Any, data: js.Any): Boolean | js.Thenable[_] = js.native
  def apply(schema: js.Any, data: js.Any, parentSchema: js.Object): Boolean | js.Thenable[_] = js.native
  def apply(schema: js.Any, data: js.Any, parentSchema: js.Object, dataPath: String): Boolean | js.Thenable[_] = js.native
  def apply(schema: js.Any, data: js.Any, parentSchema: js.Object, dataPath: String, parentData: js.Array[_]): Boolean | js.Thenable[_] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.Object,
    dataPath: String,
    parentData: js.Array[_],
    parentDataProperty: String
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.Object,
    dataPath: String,
    parentData: js.Array[_],
    parentDataProperty: String,
    rootData: js.Array[_]
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.Object,
    dataPath: String,
    parentData: js.Array[_],
    parentDataProperty: String,
    rootData: js.Object
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.Object,
    dataPath: String,
    parentData: js.Array[_],
    parentDataProperty: Double
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.Object,
    dataPath: String,
    parentData: js.Array[_],
    parentDataProperty: Double,
    rootData: js.Array[_]
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.Object,
    dataPath: String,
    parentData: js.Array[_],
    parentDataProperty: Double,
    rootData: js.Object
  ): Boolean | js.Thenable[_] = js.native
  def apply(schema: js.Any, data: js.Any, parentSchema: js.Object, dataPath: String, parentData: js.Object): Boolean | js.Thenable[_] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.Object,
    dataPath: String,
    parentData: js.Object,
    parentDataProperty: String
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.Object,
    dataPath: String,
    parentData: js.Object,
    parentDataProperty: String,
    rootData: js.Array[_]
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.Object,
    dataPath: String,
    parentData: js.Object,
    parentDataProperty: String,
    rootData: js.Object
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.Object,
    dataPath: String,
    parentData: js.Object,
    parentDataProperty: Double
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.Object,
    dataPath: String,
    parentData: js.Object,
    parentDataProperty: Double,
    rootData: js.Array[_]
  ): Boolean | js.Thenable[_] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.Object,
    dataPath: String,
    parentData: js.Object,
    parentDataProperty: Double,
    rootData: js.Object
  ): Boolean | js.Thenable[_] = js.native
}

