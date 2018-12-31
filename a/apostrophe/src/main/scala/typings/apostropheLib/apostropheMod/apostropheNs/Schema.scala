package typings
package apostropheLib.apostropheMod.apostropheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  def addFieldType(`type`: AposType): scala.Unit
  def addFilters(schema: Schema, options: js.Any, cursor: js.Any): scala.Unit
  def addJoinSlugFilter(field: js.Any, cursor: js.Any, suffix: js.Any): scala.Unit
  def afterInit(): scala.Unit
  def compose(options: AposObject): scala.Unit
  def convert(
    req: js.Any,
    schema: Schema,
    to: js.Any,
    `object`: AposObject,
    output: js.Any,
    callback: js.Function0[_]
  ): scala.Unit
  def createRoutes(): js.Array[_]
  def cursorFilterInterested(cursor: js.Any, name: java.lang.String): scala.Unit
  def empty(schema: Schema, `object`: AposObject): scala.Unit
  def export(
    req: js.Any,
    schema: Schema,
    to: js.Any,
    `object`: AposObject,
    output: js.Any,
    callback: js.Function0[_]
  ): scala.Unit
  def getFieldType(typeName: java.lang.String): scala.Unit
  def indexFields(schema: Schema, `object`: AposObject, texts: js.Any): scala.Unit
  def isVisible(schema: Schema, `object`: AposObject, name: java.lang.String): scala.Unit
  def join(req: js.Any, schema: Schema, objectOrArray: js.Any, withJoins: js.Any, callback: js.Function0[_]): scala.Unit
  def joinDriver(
    req: js.Any,
    method: js.Any,
    reverse: js.Any,
    items: js.Any,
    idField: js.Any,
    relationshipsField: js.Any,
    objectField: js.Any,
    options: js.Any,
    callback: js.Function0[_]
  ): scala.Unit
  def joinFilterChoices(field: js.Any, cursor: js.Any, valueField: js.Any): scala.Unit
  def newInstance(schema: Schema): js.Any
  def pageServe(req: js.Any): scala.Unit
  def pushAssets(): scala.Unit
  def pushCreateSingleton(): scala.Unit
  def refine(schema: Schema, options: AposObject): scala.Unit
  def sortedDistinct(property: js.Any, cursor: js.Any, callback: js.Function0[_]): scala.Unit
  def subset(schema: Schema, fields: Fields): Schema
  def subsetInstance(schema: Schema, instance: AposObject): js.Any
  def toGroups(fields: Fields): scala.Unit
  def validate(schema: Schema, options: js.Any): scala.Unit
}

