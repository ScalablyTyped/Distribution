package typings.apostrophe.mod

import typings.apostrophe.anon.Projection
import typings.apostrophe.apostropheBooleans.`false`
import typings.apostrophe.apostropheStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Pass in custom modules to AposModuleOptions to allow them in extend
@js.native
trait AposModuleOptions[C] extends js.Object {
  var addFields: js.UndefOr[js.Array[Field]] = js.native
  var arrangeFields: js.UndefOr[js.Array[typings.apostrophe.anon.Fields]] = js.native
  var beforeConstruct: js.UndefOr[js.Function2[/* self */ js.Any, /* options */ js.Any, _]] = js.native
  var defer: js.UndefOr[Boolean] = js.native
  var extend: AposCoreModules | C = js.native
  var filters: js.UndefOr[Projection] = js.native
  var label: String = js.native
  var name: js.UndefOr[String] = js.native
  var playerData: js.UndefOr[`false` | js.Array[String]] = js.native
  var pluralLabel: js.UndefOr[String] = js.native
  var removeFields: js.UndefOr[js.Array[Field]] = js.native
  var scene: js.UndefOr[user] = js.native
}

object AposModuleOptions {
  @scala.inline
  def apply[C](extend: AposCoreModules | C, label: String): AposModuleOptions[C] = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AposModuleOptions[C]]
  }
  @scala.inline
  implicit class AposModuleOptionsOps[Self <: AposModuleOptions[_], C] (val x: Self with AposModuleOptions[C]) extends AnyVal {
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
    def setExtend(value: AposCoreModules | C): Self = this.set("extend", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddFieldsVarargs(value: Field*): Self = this.set("addFields", js.Array(value :_*))
    @scala.inline
    def setAddFields(value: js.Array[Field]): Self = this.set("addFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddFields: Self = this.set("addFields", js.undefined)
    @scala.inline
    def setArrangeFieldsVarargs(value: typings.apostrophe.anon.Fields*): Self = this.set("arrangeFields", js.Array(value :_*))
    @scala.inline
    def setArrangeFields(value: js.Array[typings.apostrophe.anon.Fields]): Self = this.set("arrangeFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrangeFields: Self = this.set("arrangeFields", js.undefined)
    @scala.inline
    def setBeforeConstruct(value: (/* self */ js.Any, /* options */ js.Any) => _): Self = this.set("beforeConstruct", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeConstruct: Self = this.set("beforeConstruct", js.undefined)
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    @scala.inline
    def setFilters(value: Projection): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlayerDataVarargs(value: String*): Self = this.set("playerData", js.Array(value :_*))
    @scala.inline
    def setPlayerData(value: `false` | js.Array[String]): Self = this.set("playerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerData: Self = this.set("playerData", js.undefined)
    @scala.inline
    def setPluralLabel(value: String): Self = this.set("pluralLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluralLabel: Self = this.set("pluralLabel", js.undefined)
    @scala.inline
    def setRemoveFieldsVarargs(value: Field*): Self = this.set("removeFields", js.Array(value :_*))
    @scala.inline
    def setRemoveFields(value: js.Array[Field]): Self = this.set("removeFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveFields: Self = this.set("removeFields", js.undefined)
    @scala.inline
    def setScene(value: user): Self = this.set("scene", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScene: Self = this.set("scene", js.undefined)
  }
  
}

