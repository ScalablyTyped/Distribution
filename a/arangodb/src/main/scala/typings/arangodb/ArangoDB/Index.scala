package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index[T /* <: js.Object */] extends js.Object {
  var code: Double = js.native
  var deduplicate: Boolean = js.native
  var expireAfter: js.UndefOr[Double] = js.native
  var fields: js.Array[/* keyof T */ String] = js.native
  var id: String = js.native
  var isNewlyCreated: Boolean = js.native
  var name: String = js.native
  var selectivityEstimate: Double = js.native
  var sparse: Boolean = js.native
  var `type`: IndexType = js.native
  var unique: Boolean = js.native
}

object Index {
  @scala.inline
  def apply[/* <: js.Object */ T](
    code: Double,
    deduplicate: Boolean,
    fields: js.Array[/* keyof T */ String],
    id: String,
    isNewlyCreated: Boolean,
    name: String,
    selectivityEstimate: Double,
    sparse: Boolean,
    `type`: IndexType,
    unique: Boolean
  ): Index[T] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], deduplicate = deduplicate.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isNewlyCreated = isNewlyCreated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectivityEstimate = selectivityEstimate.asInstanceOf[js.Any], sparse = sparse.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index[_], /* <: js.Object */ T] (val x: Self with Index[T]) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeduplicate(value: Boolean): Self = this.set("deduplicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldsVarargs(value: (/* keyof T */ String)*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[/* keyof T */ String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNewlyCreated(value: Boolean): Self = this.set("isNewlyCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectivityEstimate(value: Double): Self = this.set("selectivityEstimate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSparse(value: Boolean): Self = this.set("sparse", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: IndexType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpireAfter(value: Double): Self = this.set("expireAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpireAfter: Self = this.set("expireAfter", js.undefined)
  }
  
}

