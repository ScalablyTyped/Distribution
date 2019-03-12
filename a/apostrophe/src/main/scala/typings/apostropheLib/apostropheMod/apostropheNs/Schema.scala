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
    addFieldType: AposType => scala.Unit,
    addFilters: (Schema, js.Any, js.Any) => scala.Unit,
    addJoinSlugFilter: (js.Any, js.Any, js.Any) => scala.Unit,
    afterInit: () => scala.Unit,
    compose: AposObject => scala.Unit,
    convert: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => scala.Unit,
    createRoutes: () => js.Array[_],
    cursorFilterInterested: (js.Any, java.lang.String) => scala.Unit,
    empty: (Schema, AposObject) => scala.Unit,
    export: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => scala.Unit,
    getFieldType: java.lang.String => scala.Unit,
    indexFields: (Schema, AposObject, js.Any) => scala.Unit,
    isVisible: (Schema, AposObject, java.lang.String) => scala.Unit,
    join: (js.Any, Schema, js.Any, js.Any, js.Function0[_]) => scala.Unit,
    joinDriver: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Function0[_]) => scala.Unit,
    joinFilterChoices: (js.Any, js.Any, js.Any) => scala.Unit,
    newInstance: Schema => js.Any,
    pageServe: js.Any => scala.Unit,
    pushAssets: () => scala.Unit,
    pushCreateSingleton: () => scala.Unit,
    refine: (Schema, AposObject) => scala.Unit,
    sortedDistinct: (js.Any, js.Any, js.Function0[_]) => scala.Unit,
    subset: (Schema, Fields) => Schema,
    subsetInstance: (Schema, AposObject) => js.Any,
    toGroups: Fields => scala.Unit,
    validate: (Schema, js.Any) => scala.Unit
  ): Schema = {
    val __obj = js.Dynamic.literal(addFieldType = js.Any.fromFunction1(addFieldType), addFilters = js.Any.fromFunction3(addFilters), addJoinSlugFilter = js.Any.fromFunction3(addJoinSlugFilter), afterInit = js.Any.fromFunction0(afterInit), compose = js.Any.fromFunction1(compose), convert = js.Any.fromFunction6(convert), createRoutes = js.Any.fromFunction0(createRoutes), cursorFilterInterested = js.Any.fromFunction2(cursorFilterInterested), empty = js.Any.fromFunction2(empty), export = js.Any.fromFunction6(export), getFieldType = js.Any.fromFunction1(getFieldType), indexFields = js.Any.fromFunction3(indexFields), isVisible = js.Any.fromFunction3(isVisible), join = js.Any.fromFunction5(join), joinDriver = js.Any.fromFunction9(joinDriver), joinFilterChoices = js.Any.fromFunction3(joinFilterChoices), newInstance = js.Any.fromFunction1(newInstance), pageServe = js.Any.fromFunction1(pageServe), pushAssets = js.Any.fromFunction0(pushAssets), pushCreateSingleton = js.Any.fromFunction0(pushCreateSingleton), refine = js.Any.fromFunction2(refine), sortedDistinct = js.Any.fromFunction3(sortedDistinct), subset = js.Any.fromFunction2(subset), subsetInstance = js.Any.fromFunction2(subsetInstance), toGroups = js.Any.fromFunction1(toGroups), validate = js.Any.fromFunction2(validate))
  
    __obj.asInstanceOf[Schema]
  }
}

