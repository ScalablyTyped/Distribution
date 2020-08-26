package typings.apostrophe.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Pass in custom modules as first argument
// second argument is additional custom options e.g. restApi exposed by apostrophe-headless
@js.native
trait AposConstructor[M, O] extends js.Object {
  var afterInit: js.UndefOr[js.Function0[Unit]] = js.native
  var afterListen: js.UndefOr[js.Function0[Unit]] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var initFailed: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
  var modules: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
    */ typings.apostrophe.apostropheStrings.AposConstructor with TopLevel[js.Any] = js.native
  var prefix: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var rootDir: js.UndefOr[String] = js.native
  var shortName: String = js.native
}

object AposConstructor {
  @scala.inline
  def apply[M, O](
    modules: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
    */ typings.apostrophe.apostropheStrings.AposConstructor with TopLevel[js.Any],
    shortName: String
  ): AposConstructor[M, O] = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AposConstructor[M, O]]
  }
  @scala.inline
  implicit class AposConstructorOps[Self <: AposConstructor[_, _], M, O] (val x: Self with (AposConstructor[M, O])) extends AnyVal {
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
    def setModules(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
      */ typings.apostrophe.apostropheStrings.AposConstructor with TopLevel[js.Any]
    ): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterInit(value: () => Unit): Self = this.set("afterInit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterInit: Self = this.set("afterInit", js.undefined)
    @scala.inline
    def setAfterListen(value: () => Unit): Self = this.set("afterListen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterListen: Self = this.set("afterListen", js.undefined)
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setInitFailed(value: /* error */ js.Any => Unit): Self = this.set("initFailed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitFailed: Self = this.set("initFailed", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootDir(value: String): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDir: Self = this.set("rootDir", js.undefined)
  }
  
}

