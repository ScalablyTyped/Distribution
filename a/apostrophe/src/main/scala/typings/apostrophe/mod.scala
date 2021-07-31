package typings.apostrophe

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.apostrophe.anon.Form
import typings.apostrophe.anon.Id
import typings.apostrophe.anon.Projection
import typings.apostrophe.apostropheBooleans.`false`
import typings.apostrophe.apostropheStrings.user
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(options: AposConstructor[js.Object, js.Object], args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("apostrophe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object adminBar {
    
    @JSImport("apostrophe", "adminBar")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def link(name: String, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @scala.inline
  def change(arg: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("change")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def change(arg: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("change")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  object contextPiece {
    
    @JSImport("apostrophe", "contextPiece")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "contextPiece._id")
    @js.native
    def id: String = js.native
    
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_id")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "contextPiece.slug")
    @js.native
    def slug: String = js.native
    @scala.inline
    def slug_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slug")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "contextPiece.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "contextPiece.type")
    @js.native
    val `type`: String = js.native
  }
  
  @scala.inline
  def create(`type`: String, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def create(`type`: String, options: js.Any, callback: js.Function0[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def define(`type`: String, definition: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def define(`type`: String, definition: js.Any, extending: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], definition.asInstanceOf[js.Any], extending.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def define(`type`: js.Array[String], definition: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def define(`type`: js.Array[String], definition: js.Any, extending: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], definition.asInstanceOf[js.Any], extending.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  object docs {
    
    @JSImport("apostrophe", "docs")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getManager(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getManager")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def lock(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def lock(id: String, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lock")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def lockAndWatch(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lockAndWatch")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def lockAndWatch(id: String, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lockAndWatch")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setManager(`type`: String, manager: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setManager")(`type`.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def unlock(_id: String, sync: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(_id.asInstanceOf[js.Any], sync.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def unlock(_id: String, sync: js.Any, callback: js.Function0[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(_id.asInstanceOf[js.Any], sync.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @scala.inline
  def emit(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def emit(name: String, arg: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(name.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  object modalSupport {
    
    @JSImport("apostrophe", "modalSupport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "modalSupport.all")
    @js.native
    def all: js.Array[js.Any] = js.native
    @scala.inline
    def all_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelTopModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelTopModal")().asInstanceOf[Unit]
    
    @scala.inline
    def closeTopModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeTopModal")().asInstanceOf[Unit]
    
    @JSImport("apostrophe", "modalSupport.depth")
    @js.native
    def depth: Double = js.native
    @scala.inline
    def depth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depth")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getLatestModal(): Null | String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLatestModal")().asInstanceOf[Null | String]
    
    @scala.inline
    def getTopModalOrBody(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopModalOrBody")().asInstanceOf[String]
    
    @JSImport("apostrophe", "modalSupport.initialized")
    @js.native
    def initialized: Boolean = js.native
    @scala.inline
    def initialized_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialized")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "modalSupport.stack")
    @js.native
    def stack: js.Array[js.Any] = js.native
    @scala.inline
    def stack_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stack")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("apostrophe", "modules")
  @js.native
  val modules: js.Object = js.native
  
  object moogBundle {
    
    @JSImport("apostrophe", "moogBundle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "moogBundle.directory")
    @js.native
    def directory: String = js.native
    @scala.inline
    def directory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directory")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "moogBundle.modules")
    @js.native
    def modules: js.Array[String] = js.native
    @scala.inline
    def modules_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def notify_(message: String, options: AposObject): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def notify_(message: js.Object, options: AposObject): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def off(eventName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def off(eventName: String, fn: js.Function0[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def on(eventName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def on(eventName: String, fn: js.Function0[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  object pages {
    
    @JSImport("apostrophe", "pages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "pages.page")
    @js.native
    def page: Id = js.native
    @scala.inline
    def page_=(x: Id): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("page")(x.asInstanceOf[js.Any])
  }
  
  object schemas {
    
    @JSImport("apostrophe", "schemas")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def convert($el: HTMLElement, schema: Schema, data: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")($el.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def convert($el: HTMLElement, schema: Schema, data: js.Any, options: js.Any, callback: js.Function0[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")($el.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def newInstance(schema: Schema): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("newInstance")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def populate(data: js.Any, name: String, $field: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def populate(data: js.Any, name: String, $field: js.Any, callback: js.Function0[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def populate(data: js.Any, name: String, $field: js.Any, callback: js.Function0[Unit], $el: Unit, field: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def populate(data: js.Any, name: String, $field: js.Any, callback: js.Function0[Unit], $el: HTMLElement): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def populate(
      data: js.Any,
      name: String,
      $field: js.Any,
      callback: js.Function0[Unit],
      $el: HTMLElement,
      field: js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def populate(data: js.Any, name: String, $field: js.Any, callback: Unit, $el: Unit, field: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def populate(data: js.Any, name: String, $field: js.Any, callback: Unit, $el: HTMLElement): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def populate(data: js.Any, name: String, $field: js.Any, callback: Unit, $el: HTMLElement, field: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def returnToError($el: HTMLElement, schema: Schema, errorPath: js.Any, error: js.Any, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("returnToError")($el.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], errorPath.asInstanceOf[js.Any], error.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object ui {
    
    @JSImport("apostrophe", "ui")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def globalBusy(state: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("globalBusy")(state.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def link(sel: String, verb: String, `object`: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(sel.asInstanceOf[js.Any], verb.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def link(sel: String, verb: String, `object`: js.Object, callback: js.Function0[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(sel.asInstanceOf[js.Any], verb.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  object utils {
    
    @JSImport("apostrophe", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def camelName(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelName")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def capitalizeFirst(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalizeFirst")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def error(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def generateId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateId")().asInstanceOf[String]
  }
  
  object versions {
    
    @JSImport("apostrophe", "versions")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def edit(id: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("edit")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def edit(id: String, afterRevert: js.Function0[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("edit")(id.asInstanceOf[js.Any], afterRevert.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  // Pass in custom modules as first argument
  // second argument is additional custom options e.g. restApi exposed by apostrophe-headless
  trait AposConstructor[M, O] extends StObject {
    
    var afterInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterListen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var initFailed: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.undefined
    
    var modules: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
      */ typings.apostrophe.apostropheStrings.AposConstructor & TopLevel[js.Any]
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var rootDir: js.UndefOr[String] = js.undefined
    
    var shortName: String
  }
  object AposConstructor {
    
    @scala.inline
    def apply[M, O](
      modules: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
      */ typings.apostrophe.apostropheStrings.AposConstructor & TopLevel[js.Any],
      shortName: String
    ): AposConstructor[M, O] = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AposConstructor[M, O]]
    }
    
    @scala.inline
    implicit class AposConstructorMutableBuilder[Self <: AposConstructor[?, ?], M, O] (val x: Self & (AposConstructor[M, O])) extends AnyVal {
      
      @scala.inline
      def setAfterInit(value: () => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
      
      @scala.inline
      def setAfterListen(value: () => Unit): Self = StObject.set(x, "afterListen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterListenUndefined: Self = StObject.set(x, "afterListen", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setInitFailed(value: /* error */ js.Any => Unit): Self = StObject.set(x, "initFailed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitFailedUndefined: Self = StObject.set(x, "initFailed", js.undefined)
      
      @scala.inline
      def setModules(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
        */ typings.apostrophe.apostropheStrings.AposConstructor & TopLevel[js.Any]
      ): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.apostrophe.apostropheStrings.`apostrophe-admin-bar`
    - typings.apostrophe.apostropheStrings.`apostrophe-any-page-manager`
    - typings.apostrophe.apostropheStrings.`apostrophe-areas`
    - typings.apostrophe.apostropheStrings.`apostrophe-assets`
    - typings.apostrophe.apostropheStrings.`apostrophe-attachments`
    - typings.apostrophe.apostropheStrings.`apostrophe-browser-utils`
    - typings.apostrophe.apostropheStrings.`apostrophe-caches`
    - typings.apostrophe.apostropheStrings.`apostrophe-custom-pages`
    - typings.apostrophe.apostropheStrings.`apostrophe-db`
    - typings.apostrophe.apostropheStrings.`apostrophe-doc-type-manager`
    - typings.apostrophe.apostropheStrings.`apostrophe-docs`
    - typings.apostrophe.apostropheStrings.`apostrophe-email`
    - typings.apostrophe.apostropheStrings.`apostrophe-express`
    - typings.apostrophe.apostropheStrings.`apostrophe-files`
    - typings.apostrophe.apostropheStrings.`apostrophe-files-widgets`
    - typings.apostrophe.apostropheStrings.`apostrophe-global`
    - typings.apostrophe.apostropheStrings.`apostrophe-groups`
    - typings.apostrophe.apostropheStrings.`apostrophe-html-widgets`
    - typings.apostrophe.apostropheStrings.`apostrophe-i18n`
    - typings.apostrophe.apostropheStrings.`apostrophe-images`
    - typings.apostrophe.apostropheStrings.`apostrophe-images-widgets`
    - typings.apostrophe.apostropheStrings.`apostrophe-jobs`
    - typings.apostrophe.apostropheStrings.`apostrophe-launder`
    - typings.apostrophe.apostropheStrings.`apostrophe-locks`
    - typings.apostrophe.apostropheStrings.`apostrophe-login`
    - typings.apostrophe.apostropheStrings.`apostrophe-migrations`
    - typings.apostrophe.apostropheStrings.`apostrophe-modal`
    - typings.apostrophe.apostropheStrings.`apostrophe-module`
    - typings.apostrophe.apostropheStrings.`apostrophe-notifications`
    - typings.apostrophe.apostropheStrings.`apostrophe-oembed`
    - typings.apostrophe.apostropheStrings.`apostrophe-pager`
    - typings.apostrophe.apostropheStrings.`apostrophe-pages`
    - typings.apostrophe.apostropheStrings.`apostrophe-permissions`
    - typings.apostrophe.apostropheStrings.`apostrophe-pieces`
    - typings.apostrophe.apostropheStrings.`apostrophe-pieces-pages`
    - typings.apostrophe.apostropheStrings.`apostrophe-pieces-widgets`
    - typings.apostrophe.apostropheStrings.`apostrophe-polymorphic-manager`
    - typings.apostrophe.apostropheStrings.`apostrophe-push`
    - typings.apostrophe.apostropheStrings.`apostrophe-rich-text-widgets`
    - typings.apostrophe.apostropheStrings.`apostrophe-schemas`
    - typings.apostrophe.apostropheStrings.`apostrophe-search`
    - typings.apostrophe.apostropheStrings.`apostrophe-service-bridge`
    - typings.apostrophe.apostropheStrings.`apostrophe-soft-redirects`
    - typings.apostrophe.apostropheStrings.`apostrophe-tags`
    - typings.apostrophe.apostropheStrings.`apostrophe-tasks`
    - typings.apostrophe.apostropheStrings.`apostrophe-templates`
    - typings.apostrophe.apostropheStrings.`apostrophe-ui`
    - typings.apostrophe.apostropheStrings.`apostrophe-urls`
    - typings.apostrophe.apostropheStrings.`apostrophe-users`
    - typings.apostrophe.apostropheStrings.`apostrophe-utils`
    - typings.apostrophe.apostropheStrings.`apostrophe-versions`
    - typings.apostrophe.apostropheStrings.`apostrophe-video-fields`
    - typings.apostrophe.apostropheStrings.`apostrophe-video-widgets`
    - typings.apostrophe.apostropheStrings.`apostrophe-widgets`
  */
  trait AposCoreModules extends StObject
  object AposCoreModules {
    
    @scala.inline
    def `apostrophe-admin-bar`: typings.apostrophe.apostropheStrings.`apostrophe-admin-bar` = "apostrophe-admin-bar".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-admin-bar`]
    
    @scala.inline
    def `apostrophe-any-page-manager`: typings.apostrophe.apostropheStrings.`apostrophe-any-page-manager` = "apostrophe-any-page-manager".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-any-page-manager`]
    
    @scala.inline
    def `apostrophe-areas`: typings.apostrophe.apostropheStrings.`apostrophe-areas` = "apostrophe-areas".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-areas`]
    
    @scala.inline
    def `apostrophe-assets`: typings.apostrophe.apostropheStrings.`apostrophe-assets` = "apostrophe-assets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-assets`]
    
    @scala.inline
    def `apostrophe-attachments`: typings.apostrophe.apostropheStrings.`apostrophe-attachments` = "apostrophe-attachments".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-attachments`]
    
    @scala.inline
    def `apostrophe-browser-utils`: typings.apostrophe.apostropheStrings.`apostrophe-browser-utils` = "apostrophe-browser-utils".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-browser-utils`]
    
    @scala.inline
    def `apostrophe-caches`: typings.apostrophe.apostropheStrings.`apostrophe-caches` = "apostrophe-caches".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-caches`]
    
    @scala.inline
    def `apostrophe-custom-pages`: typings.apostrophe.apostropheStrings.`apostrophe-custom-pages` = "apostrophe-custom-pages".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-custom-pages`]
    
    @scala.inline
    def `apostrophe-db`: typings.apostrophe.apostropheStrings.`apostrophe-db` = "apostrophe-db".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-db`]
    
    @scala.inline
    def `apostrophe-doc-type-manager`: typings.apostrophe.apostropheStrings.`apostrophe-doc-type-manager` = "apostrophe-doc-type-manager".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-doc-type-manager`]
    
    @scala.inline
    def `apostrophe-docs`: typings.apostrophe.apostropheStrings.`apostrophe-docs` = "apostrophe-docs".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-docs`]
    
    @scala.inline
    def `apostrophe-email`: typings.apostrophe.apostropheStrings.`apostrophe-email` = "apostrophe-email".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-email`]
    
    @scala.inline
    def `apostrophe-express`: typings.apostrophe.apostropheStrings.`apostrophe-express` = "apostrophe-express".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-express`]
    
    @scala.inline
    def `apostrophe-files`: typings.apostrophe.apostropheStrings.`apostrophe-files` = "apostrophe-files".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-files`]
    
    @scala.inline
    def `apostrophe-files-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-files-widgets` = "apostrophe-files-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-files-widgets`]
    
    @scala.inline
    def `apostrophe-global`: typings.apostrophe.apostropheStrings.`apostrophe-global` = "apostrophe-global".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-global`]
    
    @scala.inline
    def `apostrophe-groups`: typings.apostrophe.apostropheStrings.`apostrophe-groups` = "apostrophe-groups".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-groups`]
    
    @scala.inline
    def `apostrophe-html-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-html-widgets` = "apostrophe-html-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-html-widgets`]
    
    @scala.inline
    def `apostrophe-i18n`: typings.apostrophe.apostropheStrings.`apostrophe-i18n` = "apostrophe-i18n".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-i18n`]
    
    @scala.inline
    def `apostrophe-images`: typings.apostrophe.apostropheStrings.`apostrophe-images` = "apostrophe-images".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-images`]
    
    @scala.inline
    def `apostrophe-images-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-images-widgets` = "apostrophe-images-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-images-widgets`]
    
    @scala.inline
    def `apostrophe-jobs`: typings.apostrophe.apostropheStrings.`apostrophe-jobs` = "apostrophe-jobs".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-jobs`]
    
    @scala.inline
    def `apostrophe-launder`: typings.apostrophe.apostropheStrings.`apostrophe-launder` = "apostrophe-launder".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-launder`]
    
    @scala.inline
    def `apostrophe-locks`: typings.apostrophe.apostropheStrings.`apostrophe-locks` = "apostrophe-locks".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-locks`]
    
    @scala.inline
    def `apostrophe-login`: typings.apostrophe.apostropheStrings.`apostrophe-login` = "apostrophe-login".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-login`]
    
    @scala.inline
    def `apostrophe-migrations`: typings.apostrophe.apostropheStrings.`apostrophe-migrations` = "apostrophe-migrations".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-migrations`]
    
    @scala.inline
    def `apostrophe-modal`: typings.apostrophe.apostropheStrings.`apostrophe-modal` = "apostrophe-modal".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-modal`]
    
    @scala.inline
    def `apostrophe-module`: typings.apostrophe.apostropheStrings.`apostrophe-module` = "apostrophe-module".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-module`]
    
    @scala.inline
    def `apostrophe-notifications`: typings.apostrophe.apostropheStrings.`apostrophe-notifications` = "apostrophe-notifications".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-notifications`]
    
    @scala.inline
    def `apostrophe-oembed`: typings.apostrophe.apostropheStrings.`apostrophe-oembed` = "apostrophe-oembed".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-oembed`]
    
    @scala.inline
    def `apostrophe-pager`: typings.apostrophe.apostropheStrings.`apostrophe-pager` = "apostrophe-pager".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-pager`]
    
    @scala.inline
    def `apostrophe-pages`: typings.apostrophe.apostropheStrings.`apostrophe-pages` = "apostrophe-pages".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-pages`]
    
    @scala.inline
    def `apostrophe-permissions`: typings.apostrophe.apostropheStrings.`apostrophe-permissions` = "apostrophe-permissions".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-permissions`]
    
    @scala.inline
    def `apostrophe-pieces`: typings.apostrophe.apostropheStrings.`apostrophe-pieces` = "apostrophe-pieces".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-pieces`]
    
    @scala.inline
    def `apostrophe-pieces-pages`: typings.apostrophe.apostropheStrings.`apostrophe-pieces-pages` = "apostrophe-pieces-pages".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-pieces-pages`]
    
    @scala.inline
    def `apostrophe-pieces-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-pieces-widgets` = "apostrophe-pieces-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-pieces-widgets`]
    
    @scala.inline
    def `apostrophe-polymorphic-manager`: typings.apostrophe.apostropheStrings.`apostrophe-polymorphic-manager` = "apostrophe-polymorphic-manager".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-polymorphic-manager`]
    
    @scala.inline
    def `apostrophe-push`: typings.apostrophe.apostropheStrings.`apostrophe-push` = "apostrophe-push".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-push`]
    
    @scala.inline
    def `apostrophe-rich-text-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-rich-text-widgets` = "apostrophe-rich-text-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-rich-text-widgets`]
    
    @scala.inline
    def `apostrophe-schemas`: typings.apostrophe.apostropheStrings.`apostrophe-schemas` = "apostrophe-schemas".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-schemas`]
    
    @scala.inline
    def `apostrophe-search`: typings.apostrophe.apostropheStrings.`apostrophe-search` = "apostrophe-search".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-search`]
    
    @scala.inline
    def `apostrophe-service-bridge`: typings.apostrophe.apostropheStrings.`apostrophe-service-bridge` = "apostrophe-service-bridge".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-service-bridge`]
    
    @scala.inline
    def `apostrophe-soft-redirects`: typings.apostrophe.apostropheStrings.`apostrophe-soft-redirects` = "apostrophe-soft-redirects".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-soft-redirects`]
    
    @scala.inline
    def `apostrophe-tags`: typings.apostrophe.apostropheStrings.`apostrophe-tags` = "apostrophe-tags".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-tags`]
    
    @scala.inline
    def `apostrophe-tasks`: typings.apostrophe.apostropheStrings.`apostrophe-tasks` = "apostrophe-tasks".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-tasks`]
    
    @scala.inline
    def `apostrophe-templates`: typings.apostrophe.apostropheStrings.`apostrophe-templates` = "apostrophe-templates".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-templates`]
    
    @scala.inline
    def `apostrophe-ui`: typings.apostrophe.apostropheStrings.`apostrophe-ui` = "apostrophe-ui".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-ui`]
    
    @scala.inline
    def `apostrophe-urls`: typings.apostrophe.apostropheStrings.`apostrophe-urls` = "apostrophe-urls".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-urls`]
    
    @scala.inline
    def `apostrophe-users`: typings.apostrophe.apostropheStrings.`apostrophe-users` = "apostrophe-users".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-users`]
    
    @scala.inline
    def `apostrophe-utils`: typings.apostrophe.apostropheStrings.`apostrophe-utils` = "apostrophe-utils".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-utils`]
    
    @scala.inline
    def `apostrophe-versions`: typings.apostrophe.apostropheStrings.`apostrophe-versions` = "apostrophe-versions".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-versions`]
    
    @scala.inline
    def `apostrophe-video-fields`: typings.apostrophe.apostropheStrings.`apostrophe-video-fields` = "apostrophe-video-fields".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-video-fields`]
    
    @scala.inline
    def `apostrophe-video-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-video-widgets` = "apostrophe-video-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-video-widgets`]
    
    @scala.inline
    def `apostrophe-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-widgets` = "apostrophe-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-widgets`]
  }
  
  trait AposModule extends StObject {
    
    def emit(name: String): Unit
    
    def on(name: String, methodName: js.Any, fn: js.Function0[js.Any]): Unit
  }
  object AposModule {
    
    @scala.inline
    def apply(emit: String => Unit, on: (String, js.Any, js.Function0[js.Any]) => Unit): AposModule = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), on = js.Any.fromFunction3(on))
      __obj.asInstanceOf[AposModule]
    }
    
    @scala.inline
    implicit class AposModuleMutableBuilder[Self <: AposModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmit(value: String => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOn(value: (String, js.Any, js.Function0[js.Any]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    }
  }
  
  // Pass in custom modules to AposModuleOptions to allow them in extend
  trait AposModuleOptions[C] extends StObject {
    
    var addFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    var arrangeFields: js.UndefOr[js.Array[typings.apostrophe.anon.Fields]] = js.undefined
    
    var beforeConstruct: js.UndefOr[js.Function2[/* self */ js.Any, /* options */ js.Any, js.Any]] = js.undefined
    
    var defer: js.UndefOr[Boolean] = js.undefined
    
    var extend: AposCoreModules | C
    
    var filters: js.UndefOr[Projection] = js.undefined
    
    var label: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var playerData: js.UndefOr[`false` | js.Array[String]] = js.undefined
    
    var pluralLabel: js.UndefOr[String] = js.undefined
    
    var removeFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    var scene: js.UndefOr[user] = js.undefined
  }
  object AposModuleOptions {
    
    @scala.inline
    def apply[C](extend: AposCoreModules | C, label: String): AposModuleOptions[C] = {
      val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[AposModuleOptions[C]]
    }
    
    @scala.inline
    implicit class AposModuleOptionsMutableBuilder[Self <: AposModuleOptions[?], C] (val x: Self & AposModuleOptions[C]) extends AnyVal {
      
      @scala.inline
      def setAddFields(value: js.Array[Field]): Self = StObject.set(x, "addFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddFieldsUndefined: Self = StObject.set(x, "addFields", js.undefined)
      
      @scala.inline
      def setAddFieldsVarargs(value: Field*): Self = StObject.set(x, "addFields", js.Array(value :_*))
      
      @scala.inline
      def setArrangeFields(value: js.Array[typings.apostrophe.anon.Fields]): Self = StObject.set(x, "arrangeFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrangeFieldsUndefined: Self = StObject.set(x, "arrangeFields", js.undefined)
      
      @scala.inline
      def setArrangeFieldsVarargs(value: typings.apostrophe.anon.Fields*): Self = StObject.set(x, "arrangeFields", js.Array(value :_*))
      
      @scala.inline
      def setBeforeConstruct(value: (/* self */ js.Any, /* options */ js.Any) => js.Any): Self = StObject.set(x, "beforeConstruct", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeConstructUndefined: Self = StObject.set(x, "beforeConstruct", js.undefined)
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setExtend(value: AposCoreModules | C): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: Projection): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlayerData(value: `false` | js.Array[String]): Self = StObject.set(x, "playerData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerDataUndefined: Self = StObject.set(x, "playerData", js.undefined)
      
      @scala.inline
      def setPlayerDataVarargs(value: String*): Self = StObject.set(x, "playerData", js.Array(value :_*))
      
      @scala.inline
      def setPluralLabel(value: String): Self = StObject.set(x, "pluralLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralLabelUndefined: Self = StObject.set(x, "pluralLabel", js.undefined)
      
      @scala.inline
      def setRemoveFields(value: js.Array[Field]): Self = StObject.set(x, "removeFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveFieldsUndefined: Self = StObject.set(x, "removeFields", js.undefined)
      
      @scala.inline
      def setRemoveFieldsVarargs(value: Field*): Self = StObject.set(x, "removeFields", js.Array(value :_*))
      
      @scala.inline
      def setScene(value: user): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    }
  }
  
  type AposObject = StringDictionary[js.Any]
  
  trait AposType extends StObject {
    
    var bless: js.UndefOr[js.Function2[/* req */ js.Any, /* field */ js.Any, Unit]] = js.undefined
    
    var converters: Form
    
    var empty: js.UndefOr[js.Function2[/* field */ js.Any, /* value */ js.Any, Unit]] = js.undefined
    
    def index(value: js.Any, field: js.Any, texts: js.Any): Unit
    
    var name: String
  }
  object AposType {
    
    @scala.inline
    def apply(converters: Form, index: (js.Any, js.Any, js.Any) => Unit, name: String): AposType = {
      val __obj = js.Dynamic.literal(converters = converters.asInstanceOf[js.Any], index = js.Any.fromFunction3(index), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AposType]
    }
    
    @scala.inline
    implicit class AposTypeMutableBuilder[Self <: AposType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBless(value: (/* req */ js.Any, /* field */ js.Any) => Unit): Self = StObject.set(x, "bless", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlessUndefined: Self = StObject.set(x, "bless", js.undefined)
      
      @scala.inline
      def setConverters(value: Form): Self = StObject.set(x, "converters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmpty(value: (/* field */ js.Any, /* value */ js.Any) => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setIndex(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "index", js.Any.fromFunction3(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Field extends StObject {
    
    var choices: js.UndefOr[js.Array[SelectChoice]] = js.undefined
    
    var help: js.UndefOr[String] = js.undefined
    
    var label: String
    
    var name: String
    
    var options: js.UndefOr[AposObject] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var schema: js.UndefOr[js.Array[Field]] = js.undefined
    
    var titleField: js.UndefOr[String] = js.undefined
    
    var `type`: String
    
    var widgetType: js.UndefOr[String] = js.undefined
  }
  object Field {
    
    @scala.inline
    def apply(label: String, name: String, `type`: String): Field = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoices(value: js.Array[SelectChoice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      @scala.inline
      def setChoicesVarargs(value: SelectChoice*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: AposObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setSchema(value: js.Array[Field]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSchemaVarargs(value: Field*): Self = StObject.set(x, "schema", js.Array(value :_*))
      
      @scala.inline
      def setTitleField(value: String): Self = StObject.set(x, "titleField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFieldUndefined: Self = StObject.set(x, "titleField", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetType(value: String): Self = StObject.set(x, "widgetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetTypeUndefined: Self = StObject.set(x, "widgetType", js.undefined)
    }
  }
  
  type Fields = js.Array[Field]
  
  trait Schema extends StObject {
    
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
      callback: js.Function0[js.Any]
    ): Unit
    
    def createRoutes(): js.Array[js.Any]
    
    def cursorFilterInterested(cursor: js.Any, name: String): Unit
    
    def empty(schema: Schema, `object`: AposObject): Unit
    
    def `export`(
      req: js.Any,
      schema: Schema,
      to: js.Any,
      `object`: AposObject,
      output: js.Any,
      callback: js.Function0[js.Any]
    ): Unit
    
    def getFieldType(typeName: String): Unit
    
    def indexFields(schema: Schema, `object`: AposObject, texts: js.Any): Unit
    
    def isVisible(schema: Schema, `object`: AposObject, name: String): Unit
    
    def join(
      req: js.Any,
      schema: Schema,
      objectOrArray: js.Any,
      withJoins: js.Any,
      callback: js.Function0[js.Any]
    ): Unit
    
    def joinDriver(
      req: js.Any,
      method: js.Any,
      reverse: js.Any,
      items: js.Any,
      idField: js.Any,
      relationshipsField: js.Any,
      objectField: js.Any,
      options: js.Any,
      callback: js.Function0[js.Any]
    ): Unit
    
    def joinFilterChoices(field: js.Any, cursor: js.Any, valueField: js.Any): Unit
    
    def newInstance(schema: Schema): js.Any
    
    def pageServe(req: js.Any): Unit
    
    def pushAssets(): Unit
    
    def pushCreateSingleton(): Unit
    
    def refine(schema: Schema, options: AposObject): Unit
    
    def sortedDistinct(property: js.Any, cursor: js.Any, callback: js.Function0[js.Any]): Unit
    
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
      convert: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[js.Any]) => Unit,
      createRoutes: () => js.Array[js.Any],
      cursorFilterInterested: (js.Any, String) => Unit,
      empty: (Schema, AposObject) => Unit,
      `export`: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[js.Any]) => Unit,
      getFieldType: String => Unit,
      indexFields: (Schema, AposObject, js.Any) => Unit,
      isVisible: (Schema, AposObject, String) => Unit,
      join: (js.Any, Schema, js.Any, js.Any, js.Function0[js.Any]) => Unit,
      joinDriver: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Function0[js.Any]) => Unit,
      joinFilterChoices: (js.Any, js.Any, js.Any) => Unit,
      newInstance: Schema => js.Any,
      pageServe: js.Any => Unit,
      pushAssets: () => Unit,
      pushCreateSingleton: () => Unit,
      refine: (Schema, AposObject) => Unit,
      sortedDistinct: (js.Any, js.Any, js.Function0[js.Any]) => Unit,
      subset: (Schema, Fields) => Schema,
      subsetInstance: (Schema, AposObject) => js.Any,
      toGroups: Fields => Unit,
      validate: (Schema, js.Any) => Unit
    ): Schema = {
      val __obj = js.Dynamic.literal(addFieldType = js.Any.fromFunction1(addFieldType), addFilters = js.Any.fromFunction3(addFilters), addJoinSlugFilter = js.Any.fromFunction3(addJoinSlugFilter), afterInit = js.Any.fromFunction0(afterInit), compose = js.Any.fromFunction1(compose), convert = js.Any.fromFunction6(convert), createRoutes = js.Any.fromFunction0(createRoutes), cursorFilterInterested = js.Any.fromFunction2(cursorFilterInterested), empty = js.Any.fromFunction2(empty), getFieldType = js.Any.fromFunction1(getFieldType), indexFields = js.Any.fromFunction3(indexFields), isVisible = js.Any.fromFunction3(isVisible), join = js.Any.fromFunction5(join), joinDriver = js.Any.fromFunction9(joinDriver), joinFilterChoices = js.Any.fromFunction3(joinFilterChoices), newInstance = js.Any.fromFunction1(newInstance), pageServe = js.Any.fromFunction1(pageServe), pushAssets = js.Any.fromFunction0(pushAssets), pushCreateSingleton = js.Any.fromFunction0(pushCreateSingleton), refine = js.Any.fromFunction2(refine), sortedDistinct = js.Any.fromFunction3(sortedDistinct), subset = js.Any.fromFunction2(subset), subsetInstance = js.Any.fromFunction2(subsetInstance), toGroups = js.Any.fromFunction1(toGroups), validate = js.Any.fromFunction2(validate))
      __obj.updateDynamic("export")(js.Any.fromFunction6(`export`))
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit class SchemaMutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddFieldType(value: AposType => Unit): Self = StObject.set(x, "addFieldType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddFilters(value: (Schema, js.Any, js.Any) => Unit): Self = StObject.set(x, "addFilters", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddJoinSlugFilter(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "addJoinSlugFilter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterInit(value: () => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompose(value: AposObject => Unit): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConvert(value: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[js.Any]) => Unit): Self = StObject.set(x, "convert", js.Any.fromFunction6(value))
      
      @scala.inline
      def setCreateRoutes(value: () => js.Array[js.Any]): Self = StObject.set(x, "createRoutes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCursorFilterInterested(value: (js.Any, String) => Unit): Self = StObject.set(x, "cursorFilterInterested", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmpty(value: (Schema, AposObject) => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExport(value: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[js.Any]) => Unit): Self = StObject.set(x, "export", js.Any.fromFunction6(value))
      
      @scala.inline
      def setGetFieldType(value: String => Unit): Self = StObject.set(x, "getFieldType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndexFields(value: (Schema, AposObject, js.Any) => Unit): Self = StObject.set(x, "indexFields", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIsVisible(value: (Schema, AposObject, String) => Unit): Self = StObject.set(x, "isVisible", js.Any.fromFunction3(value))
      
      @scala.inline
      def setJoin(value: (js.Any, Schema, js.Any, js.Any, js.Function0[js.Any]) => Unit): Self = StObject.set(x, "join", js.Any.fromFunction5(value))
      
      @scala.inline
      def setJoinDriver(
        value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Function0[js.Any]) => Unit
      ): Self = StObject.set(x, "joinDriver", js.Any.fromFunction9(value))
      
      @scala.inline
      def setJoinFilterChoices(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "joinFilterChoices", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNewInstance(value: Schema => js.Any): Self = StObject.set(x, "newInstance", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageServe(value: js.Any => Unit): Self = StObject.set(x, "pageServe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPushAssets(value: () => Unit): Self = StObject.set(x, "pushAssets", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPushCreateSingleton(value: () => Unit): Self = StObject.set(x, "pushCreateSingleton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRefine(value: (Schema, AposObject) => Unit): Self = StObject.set(x, "refine", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortedDistinct(value: (js.Any, js.Any, js.Function0[js.Any]) => Unit): Self = StObject.set(x, "sortedDistinct", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSubset(value: (Schema, Fields) => Schema): Self = StObject.set(x, "subset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubsetInstance(value: (Schema, AposObject) => js.Any): Self = StObject.set(x, "subsetInstance", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToGroups(value: Fields => Unit): Self = StObject.set(x, "toGroups", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidate(value: (Schema, js.Any) => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
  
  trait SelectChoice extends StObject {
    
    var label: String
    
    var value: String
  }
  object SelectChoice {
    
    @scala.inline
    def apply(label: String, value: String): SelectChoice = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectChoice]
    }
    
    @scala.inline
    implicit class SelectChoiceMutableBuilder[Self <: SelectChoice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
