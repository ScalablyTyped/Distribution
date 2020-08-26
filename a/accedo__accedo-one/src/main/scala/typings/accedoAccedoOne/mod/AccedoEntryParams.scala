package typings.accedoAccedoOne.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccedoEntryParams extends js.Object {
  /** an array of entry aliases (strings) */
  var alias: js.UndefOr[js.Array[String]] = js.native
  /** when given, get the version at the given time */
  var at: js.UndefOr[String | Date] = js.native
  /** an array of entry ids (strings) */
  var id: js.UndefOr[js.Array[String]] = js.native
  /**
    * if available, get the version for the given locale
    * (defaults to the default locale)
    */
  var locale: js.UndefOr[String] = js.native
  /** Offset the result by that many pages */
  var offset: js.UndefOr[Double | String] = js.native
  /** when true, get the preview version */
  var preview: js.UndefOr[Boolean] = js.native
  /**
    * Limit to that many results per page (limits as per Accedo
    * One API, currently 1 to 50, default 20)
    */
  var size: js.UndefOr[Double | String] = js.native
  /** only return entries whose entry type has this alias */
  var typeAlias: js.UndefOr[String] = js.native
  /** only return entries of the given type ids (strings) */
  var typeId: js.UndefOr[js.Array[String]] = js.native
}

object AccedoEntryParams {
  @scala.inline
  def apply(): AccedoEntryParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccedoEntryParams]
  }
  @scala.inline
  implicit class AccedoEntryParamsOps[Self <: AccedoEntryParams] (val x: Self) extends AnyVal {
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
    def setAliasVarargs(value: String*): Self = this.set("alias", js.Array(value :_*))
    @scala.inline
    def setAlias(value: js.Array[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setAt(value: String | Date): Self = this.set("at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
    @scala.inline
    def setIdVarargs(value: String*): Self = this.set("id", js.Array(value :_*))
    @scala.inline
    def setId(value: js.Array[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTypeAlias(value: String): Self = this.set("typeAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAlias: Self = this.set("typeAlias", js.undefined)
    @scala.inline
    def setTypeIdVarargs(value: String*): Self = this.set("typeId", js.Array(value :_*))
    @scala.inline
    def setTypeId(value: js.Array[String]): Self = this.set("typeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeId: Self = this.set("typeId", js.undefined)
  }
  
}

