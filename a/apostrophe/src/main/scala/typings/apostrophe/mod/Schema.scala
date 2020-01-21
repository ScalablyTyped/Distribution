package typings.apostrophe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  def addFieldType(`type`: AposType): Unit
  def addFilters(schema: Schema, options: js.Any, cursor: js.Any): Unit
  def addJoinSlugFilter(field: js.Any, cursor: js.Any, suffix: js.Any): Unit
  def afterInit(): Unit
  def compose(options: AposObject): Unit
  def convert(
    req: js.Any,
    schema: Schema,
    to: js.Any,
    `object`: AposObject,
    output: js.Any,
    callback: js.Function0[_]
  ): Unit
  def createRoutes(): js.Array[_]
  def cursorFilterInterested(cursor: js.Any, name: String): Unit
  def empty(schema: Schema, `object`: AposObject): Unit
  def export(
    req: js.Any,
    schema: Schema,
    to: js.Any,
    `object`: AposObject,
    output: js.Any,
    callback: js.Function0[_]
  ): Unit
  def getFieldType(typeName: String): Unit
  def indexFields(schema: Schema, `object`: AposObject, texts: js.Any): Unit
  def isVisible(schema: Schema, `object`: AposObject, name: String): Unit
  def join(req: js.Any, schema: Schema, objectOrArray: js.Any, withJoins: js.Any, callback: js.Function0[_]): Unit
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
  ): Unit
  def joinFilterChoices(field: js.Any, cursor: js.Any, valueField: js.Any): Unit
  def newInstance(schema: Schema): js.Any
  def pageServe(req: js.Any): Unit
  def pushAssets(): Unit
  def pushCreateSingleton(): Unit
  def refine(schema: Schema, options: AposObject): Unit
  def sortedDistinct(property: js.Any, cursor: js.Any, callback: js.Function0[_]): Unit
  def subset(schema: Schema, fields: Fields): Schema
  def subsetInstance(schema: Schema, instance: AposObject): js.Any
  def toGroups(fields: Fields): Unit
  def validate(schema: Schema, options: js.Any): Unit
}

object Schema {
  @scala.inline
  def apply(
    addFieldType: AposType => Unit,
    addFilters: (Schema, js.Any, js.Any) => Unit,
    addJoinSlugFilter: (js.Any, js.Any, js.Any) => Unit,
    afterInit: () => Unit,
    compose: AposObject => Unit,
    convert: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => Unit,
    createRoutes: () => js.Array[_],
    cursorFilterInterested: (js.Any, String) => Unit,
    empty: (Schema, AposObject) => Unit,
    export: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => Unit,
    getFieldType: String => Unit,
    indexFields: (Schema, AposObject, js.Any) => Unit,
    isVisible: (Schema, AposObject, String) => Unit,
    join: (js.Any, Schema, js.Any, js.Any, js.Function0[_]) => Unit,
    joinDriver: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Function0[_]) => Unit,
    joinFilterChoices: (js.Any, js.Any, js.Any) => Unit,
    newInstance: Schema => js.Any,
    pageServe: js.Any => Unit,
    pushAssets: () => Unit,
    pushCreateSingleton: () => Unit,
    refine: (Schema, AposObject) => Unit,
    sortedDistinct: (js.Any, js.Any, js.Function0[_]) => Unit,
    subset: (Schema, Fields) => Schema,
    subsetInstance: (Schema, AposObject) => js.Any,
    toGroups: Fields => Unit,
    validate: (Schema, js.Any) => Unit
  ): Schema = {
    val __obj = js.Dynamic.literal(addFieldType = js.Any.fromFunction1(addFieldType), addFilters = js.Any.fromFunction3(addFilters), addJoinSlugFilter = js.Any.fromFunction3(addJoinSlugFilter), afterInit = js.Any.fromFunction0(afterInit), compose = js.Any.fromFunction1(compose), convert = js.Any.fromFunction6(convert), createRoutes = js.Any.fromFunction0(createRoutes), cursorFilterInterested = js.Any.fromFunction2(cursorFilterInterested), empty = js.Any.fromFunction2(empty), export = js.Any.fromFunction6(export), getFieldType = js.Any.fromFunction1(getFieldType), indexFields = js.Any.fromFunction3(indexFields), isVisible = js.Any.fromFunction3(isVisible), join = js.Any.fromFunction5(join), joinDriver = js.Any.fromFunction9(joinDriver), joinFilterChoices = js.Any.fromFunction3(joinFilterChoices), newInstance = js.Any.fromFunction1(newInstance), pageServe = js.Any.fromFunction1(pageServe), pushAssets = js.Any.fromFunction0(pushAssets), pushCreateSingleton = js.Any.fromFunction0(pushCreateSingleton), refine = js.Any.fromFunction2(refine), sortedDistinct = js.Any.fromFunction3(sortedDistinct), subset = js.Any.fromFunction2(subset), subsetInstance = js.Any.fromFunction2(subsetInstance), toGroups = js.Any.fromFunction1(toGroups), validate = js.Any.fromFunction2(validate))
  
    __obj.asInstanceOf[Schema]
  }
}

