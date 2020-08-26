package typings.apostrophe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema extends js.Object {
  def addFieldType(`type`: AposType): Unit = js.native
  def addFilters(schema: Schema, options: js.Any, cursor: js.Any): Unit = js.native
  def addJoinSlugFilter(field: js.Any, cursor: js.Any, suffix: js.Any): Unit = js.native
  def afterInit(): Unit = js.native
  def compose(options: AposObject): Unit = js.native
  def convert(
    req: js.Any,
    schema: Schema,
    to: js.Any,
    `object`: AposObject,
    output: js.Any,
    callback: js.Function0[_]
  ): Unit = js.native
  def createRoutes(): js.Array[_] = js.native
  def cursorFilterInterested(cursor: js.Any, name: String): Unit = js.native
  def empty(schema: Schema, `object`: AposObject): Unit = js.native
  def export(
    req: js.Any,
    schema: Schema,
    to: js.Any,
    `object`: AposObject,
    output: js.Any,
    callback: js.Function0[_]
  ): Unit = js.native
  def getFieldType(typeName: String): Unit = js.native
  def indexFields(schema: Schema, `object`: AposObject, texts: js.Any): Unit = js.native
  def isVisible(schema: Schema, `object`: AposObject, name: String): Unit = js.native
  def join(req: js.Any, schema: Schema, objectOrArray: js.Any, withJoins: js.Any, callback: js.Function0[_]): Unit = js.native
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
  ): Unit = js.native
  def joinFilterChoices(field: js.Any, cursor: js.Any, valueField: js.Any): Unit = js.native
  def newInstance(schema: Schema): js.Any = js.native
  def pageServe(req: js.Any): Unit = js.native
  def pushAssets(): Unit = js.native
  def pushCreateSingleton(): Unit = js.native
  def refine(schema: Schema, options: AposObject): Unit = js.native
  def sortedDistinct(property: js.Any, cursor: js.Any, callback: js.Function0[_]): Unit = js.native
  def subset(schema: Schema, fields: Fields): Schema = js.native
  def subsetInstance(schema: Schema, instance: AposObject): js.Any = js.native
  def toGroups(fields: Fields): Unit = js.native
  def validate(schema: Schema, options: js.Any): Unit = js.native
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
  @scala.inline
  implicit class SchemaOps[Self <: Schema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddFieldType(value: AposType => Unit): Self = this.set("addFieldType", js.Any.fromFunction1(value))
    @scala.inline
    def setAddFilters(value: (Schema, js.Any, js.Any) => Unit): Self = this.set("addFilters", js.Any.fromFunction3(value))
    @scala.inline
    def setAddJoinSlugFilter(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("addJoinSlugFilter", js.Any.fromFunction3(value))
    @scala.inline
    def setAfterInit(value: () => Unit): Self = this.set("afterInit", js.Any.fromFunction0(value))
    @scala.inline
    def setCompose(value: AposObject => Unit): Self = this.set("compose", js.Any.fromFunction1(value))
    @scala.inline
    def setConvert(value: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => Unit): Self = this.set("convert", js.Any.fromFunction6(value))
    @scala.inline
    def setCreateRoutes(value: () => js.Array[_]): Self = this.set("createRoutes", js.Any.fromFunction0(value))
    @scala.inline
    def setCursorFilterInterested(value: (js.Any, String) => Unit): Self = this.set("cursorFilterInterested", js.Any.fromFunction2(value))
    @scala.inline
    def setEmpty(value: (Schema, AposObject) => Unit): Self = this.set("empty", js.Any.fromFunction2(value))
    @scala.inline
    def setExport(value: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => Unit): Self = this.set("export", js.Any.fromFunction6(value))
    @scala.inline
    def setGetFieldType(value: String => Unit): Self = this.set("getFieldType", js.Any.fromFunction1(value))
    @scala.inline
    def setIndexFields(value: (Schema, AposObject, js.Any) => Unit): Self = this.set("indexFields", js.Any.fromFunction3(value))
    @scala.inline
    def setIsVisible(value: (Schema, AposObject, String) => Unit): Self = this.set("isVisible", js.Any.fromFunction3(value))
    @scala.inline
    def setJoin(value: (js.Any, Schema, js.Any, js.Any, js.Function0[_]) => Unit): Self = this.set("join", js.Any.fromFunction5(value))
    @scala.inline
    def setJoinDriver(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Function0[_]) => Unit): Self = this.set("joinDriver", js.Any.fromFunction9(value))
    @scala.inline
    def setJoinFilterChoices(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("joinFilterChoices", js.Any.fromFunction3(value))
    @scala.inline
    def setNewInstance(value: Schema => js.Any): Self = this.set("newInstance", js.Any.fromFunction1(value))
    @scala.inline
    def setPageServe(value: js.Any => Unit): Self = this.set("pageServe", js.Any.fromFunction1(value))
    @scala.inline
    def setPushAssets(value: () => Unit): Self = this.set("pushAssets", js.Any.fromFunction0(value))
    @scala.inline
    def setPushCreateSingleton(value: () => Unit): Self = this.set("pushCreateSingleton", js.Any.fromFunction0(value))
    @scala.inline
    def setRefine(value: (Schema, AposObject) => Unit): Self = this.set("refine", js.Any.fromFunction2(value))
    @scala.inline
    def setSortedDistinct(value: (js.Any, js.Any, js.Function0[_]) => Unit): Self = this.set("sortedDistinct", js.Any.fromFunction3(value))
    @scala.inline
    def setSubset(value: (Schema, Fields) => Schema): Self = this.set("subset", js.Any.fromFunction2(value))
    @scala.inline
    def setSubsetInstance(value: (Schema, AposObject) => js.Any): Self = this.set("subsetInstance", js.Any.fromFunction2(value))
    @scala.inline
    def setToGroups(value: Fields => Unit): Self = this.set("toGroups", js.Any.fromFunction1(value))
    @scala.inline
    def setValidate(value: (Schema, js.Any) => Unit): Self = this.set("validate", js.Any.fromFunction2(value))
  }
  
}

