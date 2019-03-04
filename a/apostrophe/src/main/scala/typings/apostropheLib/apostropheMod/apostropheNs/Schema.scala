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

object Schema {
  @scala.inline
  def apply(
    addFieldType: js.Function1[AposType, scala.Unit],
    addFilters: js.Function3[Schema, js.Any, js.Any, scala.Unit],
    addJoinSlugFilter: js.Function3[js.Any, js.Any, js.Any, scala.Unit],
    afterInit: js.Function0[scala.Unit],
    compose: js.Function1[AposObject, scala.Unit],
    convert: js.Function6[js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_], scala.Unit],
    createRoutes: js.Function0[js.Array[_]],
    cursorFilterInterested: js.Function2[js.Any, java.lang.String, scala.Unit],
    empty: js.Function2[Schema, AposObject, scala.Unit],
    export: js.Function6[js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_], scala.Unit],
    getFieldType: js.Function1[java.lang.String, scala.Unit],
    indexFields: js.Function3[Schema, AposObject, js.Any, scala.Unit],
    isVisible: js.Function3[Schema, AposObject, java.lang.String, scala.Unit],
    join: js.Function5[js.Any, Schema, js.Any, js.Any, js.Function0[_], scala.Unit],
    joinDriver: js.Function9[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Function0[_], scala.Unit],
    joinFilterChoices: js.Function3[js.Any, js.Any, js.Any, scala.Unit],
    newInstance: js.Function1[Schema, js.Any],
    pageServe: js.Function1[js.Any, scala.Unit],
    pushAssets: js.Function0[scala.Unit],
    pushCreateSingleton: js.Function0[scala.Unit],
    refine: js.Function2[Schema, AposObject, scala.Unit],
    sortedDistinct: js.Function3[js.Any, js.Any, js.Function0[_], scala.Unit],
    subset: js.Function2[Schema, Fields, Schema],
    subsetInstance: js.Function2[Schema, AposObject, js.Any],
    toGroups: js.Function1[Fields, scala.Unit],
    validate: js.Function2[Schema, js.Any, scala.Unit]
  ): Schema = {
    val __obj = js.Dynamic.literal(addFieldType = addFieldType, addFilters = addFilters, addJoinSlugFilter = addJoinSlugFilter, afterInit = afterInit, compose = compose, convert = convert, createRoutes = createRoutes, cursorFilterInterested = cursorFilterInterested, empty = empty, export = export, getFieldType = getFieldType, indexFields = indexFields, isVisible = isVisible, join = join, joinDriver = joinDriver, joinFilterChoices = joinFilterChoices, newInstance = newInstance, pageServe = pageServe, pushAssets = pushAssets, pushCreateSingleton = pushCreateSingleton, refine = refine, sortedDistinct = sortedDistinct, subset = subset, subsetInstance = subsetInstance, toGroups = toGroups, validate = validate)
  
    __obj.asInstanceOf[Schema]
  }
}

