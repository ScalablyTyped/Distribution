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
  
  inline def apply(options: AposConstructor[js.Object, js.Object], args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  @JSImport("apostrophe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object adminBar {
    
    @JSImport("apostrophe", "adminBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def link(name: String, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def change(arg: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("change")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def change(arg: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("change")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object contextPiece {
    
    @JSImport("apostrophe", "contextPiece")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "contextPiece._id")
    @js.native
    def id: String = js.native
    
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_id")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "contextPiece.slug")
    @js.native
    def slug: String = js.native
    inline def slug_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slug")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "contextPiece.title")
    @js.native
    def title: String = js.native
    inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "contextPiece.type")
    @js.native
    val `type`: String = js.native
  }
  
  inline def create(`type`: String, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def create(`type`: String, options: Any, callback: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def define(`type`: String, definition: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def define(`type`: String, definition: Any, extending: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], definition.asInstanceOf[js.Any], extending.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def define(`type`: js.Array[String], definition: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def define(`type`: js.Array[String], definition: Any, extending: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], definition.asInstanceOf[js.Any], extending.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object docs {
    
    @JSImport("apostrophe", "docs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getManager(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getManager")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def lock(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def lock(id: String, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lock")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def lockAndWatch(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lockAndWatch")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def lockAndWatch(id: String, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lockAndWatch")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setManager(`type`: String, manager: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setManager")(`type`.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def unlock(_id: String, sync: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(_id.asInstanceOf[js.Any], sync.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def unlock(_id: String, sync: Any, callback: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(_id.asInstanceOf[js.Any], sync.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  inline def emit(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def emit(name: String, arg: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(name.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object modalSupport {
    
    @JSImport("apostrophe", "modalSupport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "modalSupport.all")
    @js.native
    def all: js.Array[Any] = js.native
    inline def all_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    inline def cancelTopModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelTopModal")().asInstanceOf[Unit]
    
    inline def closeTopModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeTopModal")().asInstanceOf[Unit]
    
    @JSImport("apostrophe", "modalSupport.depth")
    @js.native
    def depth: Double = js.native
    inline def depth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depth")(x.asInstanceOf[js.Any])
    
    inline def getLatestModal(): Null | String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLatestModal")().asInstanceOf[Null | String]
    
    inline def getTopModalOrBody(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopModalOrBody")().asInstanceOf[String]
    
    @JSImport("apostrophe", "modalSupport.initialized")
    @js.native
    def initialized: Boolean = js.native
    inline def initialized_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialized")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "modalSupport.stack")
    @js.native
    def stack: js.Array[Any] = js.native
    inline def stack_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stack")(x.asInstanceOf[js.Any])
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
    inline def directory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directory")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "moogBundle.modules")
    @js.native
    def modules: js.Array[String] = js.native
    inline def modules_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
  }
  
  inline def notify_(message: String, options: AposObject): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def notify_(message: js.Object, options: AposObject): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def off(eventName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def off(eventName: String, fn: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def on(eventName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def on(eventName: String, fn: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object pages {
    
    @JSImport("apostrophe", "pages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "pages.page")
    @js.native
    def page: Id = js.native
    inline def page_=(x: Id): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("page")(x.asInstanceOf[js.Any])
  }
  
  object schemas {
    
    @JSImport("apostrophe", "schemas")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convert($el: HTMLElement, schema: Schema, data: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")($el.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def convert($el: HTMLElement, schema: Schema, data: Any, options: Any, callback: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")($el.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def newInstance(schema: Schema): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("newInstance")(schema.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def populate(data: Any, name: String, $field: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: js.Function0[Unit], $el: Unit, field: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: js.Function0[Unit], $el: HTMLElement): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: js.Function0[Unit], $el: HTMLElement, field: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: Unit, $el: Unit, field: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: Unit, $el: HTMLElement): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: Unit, $el: HTMLElement, field: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def returnToError($el: HTMLElement, schema: Schema, errorPath: Any, error: Any, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("returnToError")($el.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], errorPath.asInstanceOf[js.Any], error.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object ui {
    
    @JSImport("apostrophe", "ui")
    @js.native
    val ^ : js.Any = js.native
    
    inline def globalBusy(state: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("globalBusy")(state.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def link(sel: String, verb: String, `object`: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(sel.asInstanceOf[js.Any], verb.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def link(sel: String, verb: String, `object`: js.Object, callback: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(sel.asInstanceOf[js.Any], verb.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  object utils {
    
    @JSImport("apostrophe", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def camelName(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelName")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def capitalizeFirst(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalizeFirst")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def error(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def generateId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateId")().asInstanceOf[String]
  }
  
  object versions {
    
    @JSImport("apostrophe", "versions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def edit(id: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("edit")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def edit(id: String, afterRevert: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("edit")(id.asInstanceOf[js.Any], afterRevert.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  // Pass in custom modules as first argument
  // second argument is additional custom options e.g. restApi exposed by apostrophe-headless
  trait AposConstructor[M, O] extends StObject {
    
    var afterInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterListen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var initFailed: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var modules: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
      */ typings.apostrophe.apostropheStrings.AposConstructor & TopLevel[Any]
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var rootDir: js.UndefOr[String] = js.undefined
    
    var shortName: String
  }
  object AposConstructor {
    
    inline def apply[M, O](
      modules: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
      */ typings.apostrophe.apostropheStrings.AposConstructor & TopLevel[Any],
      shortName: String
    ): AposConstructor[M, O] = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AposConstructor[M, O]]
    }
    
    extension [Self <: AposConstructor[?, ?], M, O](x: Self & (AposConstructor[M, O])) {
      
      inline def setAfterInit(value: () => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction0(value))
      
      inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
      
      inline def setAfterListen(value: () => Unit): Self = StObject.set(x, "afterListen", js.Any.fromFunction0(value))
      
      inline def setAfterListenUndefined: Self = StObject.set(x, "afterListen", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setInitFailed(value: /* error */ Any => Unit): Self = StObject.set(x, "initFailed", js.Any.fromFunction1(value))
      
      inline def setInitFailedUndefined: Self = StObject.set(x, "initFailed", js.undefined)
      
      inline def setModules(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
        */ typings.apostrophe.apostropheStrings.AposConstructor & TopLevel[Any]
      ): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
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
    
    inline def `apostrophe-admin-bar`: typings.apostrophe.apostropheStrings.`apostrophe-admin-bar` = "apostrophe-admin-bar".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-admin-bar`]
    
    inline def `apostrophe-any-page-manager`: typings.apostrophe.apostropheStrings.`apostrophe-any-page-manager` = "apostrophe-any-page-manager".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-any-page-manager`]
    
    inline def `apostrophe-areas`: typings.apostrophe.apostropheStrings.`apostrophe-areas` = "apostrophe-areas".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-areas`]
    
    inline def `apostrophe-assets`: typings.apostrophe.apostropheStrings.`apostrophe-assets` = "apostrophe-assets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-assets`]
    
    inline def `apostrophe-attachments`: typings.apostrophe.apostropheStrings.`apostrophe-attachments` = "apostrophe-attachments".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-attachments`]
    
    inline def `apostrophe-browser-utils`: typings.apostrophe.apostropheStrings.`apostrophe-browser-utils` = "apostrophe-browser-utils".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-browser-utils`]
    
    inline def `apostrophe-caches`: typings.apostrophe.apostropheStrings.`apostrophe-caches` = "apostrophe-caches".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-caches`]
    
    inline def `apostrophe-custom-pages`: typings.apostrophe.apostropheStrings.`apostrophe-custom-pages` = "apostrophe-custom-pages".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-custom-pages`]
    
    inline def `apostrophe-db`: typings.apostrophe.apostropheStrings.`apostrophe-db` = "apostrophe-db".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-db`]
    
    inline def `apostrophe-doc-type-manager`: typings.apostrophe.apostropheStrings.`apostrophe-doc-type-manager` = "apostrophe-doc-type-manager".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-doc-type-manager`]
    
    inline def `apostrophe-docs`: typings.apostrophe.apostropheStrings.`apostrophe-docs` = "apostrophe-docs".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-docs`]
    
    inline def `apostrophe-email`: typings.apostrophe.apostropheStrings.`apostrophe-email` = "apostrophe-email".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-email`]
    
    inline def `apostrophe-express`: typings.apostrophe.apostropheStrings.`apostrophe-express` = "apostrophe-express".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-express`]
    
    inline def `apostrophe-files`: typings.apostrophe.apostropheStrings.`apostrophe-files` = "apostrophe-files".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-files`]
    
    inline def `apostrophe-files-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-files-widgets` = "apostrophe-files-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-files-widgets`]
    
    inline def `apostrophe-global`: typings.apostrophe.apostropheStrings.`apostrophe-global` = "apostrophe-global".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-global`]
    
    inline def `apostrophe-groups`: typings.apostrophe.apostropheStrings.`apostrophe-groups` = "apostrophe-groups".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-groups`]
    
    inline def `apostrophe-html-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-html-widgets` = "apostrophe-html-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-html-widgets`]
    
    inline def `apostrophe-i18n`: typings.apostrophe.apostropheStrings.`apostrophe-i18n` = "apostrophe-i18n".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-i18n`]
    
    inline def `apostrophe-images`: typings.apostrophe.apostropheStrings.`apostrophe-images` = "apostrophe-images".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-images`]
    
    inline def `apostrophe-images-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-images-widgets` = "apostrophe-images-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-images-widgets`]
    
    inline def `apostrophe-jobs`: typings.apostrophe.apostropheStrings.`apostrophe-jobs` = "apostrophe-jobs".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-jobs`]
    
    inline def `apostrophe-launder`: typings.apostrophe.apostropheStrings.`apostrophe-launder` = "apostrophe-launder".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-launder`]
    
    inline def `apostrophe-locks`: typings.apostrophe.apostropheStrings.`apostrophe-locks` = "apostrophe-locks".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-locks`]
    
    inline def `apostrophe-login`: typings.apostrophe.apostropheStrings.`apostrophe-login` = "apostrophe-login".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-login`]
    
    inline def `apostrophe-migrations`: typings.apostrophe.apostropheStrings.`apostrophe-migrations` = "apostrophe-migrations".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-migrations`]
    
    inline def `apostrophe-modal`: typings.apostrophe.apostropheStrings.`apostrophe-modal` = "apostrophe-modal".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-modal`]
    
    inline def `apostrophe-module`: typings.apostrophe.apostropheStrings.`apostrophe-module` = "apostrophe-module".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-module`]
    
    inline def `apostrophe-notifications`: typings.apostrophe.apostropheStrings.`apostrophe-notifications` = "apostrophe-notifications".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-notifications`]
    
    inline def `apostrophe-oembed`: typings.apostrophe.apostropheStrings.`apostrophe-oembed` = "apostrophe-oembed".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-oembed`]
    
    inline def `apostrophe-pager`: typings.apostrophe.apostropheStrings.`apostrophe-pager` = "apostrophe-pager".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-pager`]
    
    inline def `apostrophe-pages`: typings.apostrophe.apostropheStrings.`apostrophe-pages` = "apostrophe-pages".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-pages`]
    
    inline def `apostrophe-permissions`: typings.apostrophe.apostropheStrings.`apostrophe-permissions` = "apostrophe-permissions".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-permissions`]
    
    inline def `apostrophe-pieces`: typings.apostrophe.apostropheStrings.`apostrophe-pieces` = "apostrophe-pieces".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-pieces`]
    
    inline def `apostrophe-pieces-pages`: typings.apostrophe.apostropheStrings.`apostrophe-pieces-pages` = "apostrophe-pieces-pages".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-pieces-pages`]
    
    inline def `apostrophe-pieces-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-pieces-widgets` = "apostrophe-pieces-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-pieces-widgets`]
    
    inline def `apostrophe-polymorphic-manager`: typings.apostrophe.apostropheStrings.`apostrophe-polymorphic-manager` = "apostrophe-polymorphic-manager".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-polymorphic-manager`]
    
    inline def `apostrophe-push`: typings.apostrophe.apostropheStrings.`apostrophe-push` = "apostrophe-push".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-push`]
    
    inline def `apostrophe-rich-text-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-rich-text-widgets` = "apostrophe-rich-text-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-rich-text-widgets`]
    
    inline def `apostrophe-schemas`: typings.apostrophe.apostropheStrings.`apostrophe-schemas` = "apostrophe-schemas".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-schemas`]
    
    inline def `apostrophe-search`: typings.apostrophe.apostropheStrings.`apostrophe-search` = "apostrophe-search".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-search`]
    
    inline def `apostrophe-service-bridge`: typings.apostrophe.apostropheStrings.`apostrophe-service-bridge` = "apostrophe-service-bridge".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-service-bridge`]
    
    inline def `apostrophe-soft-redirects`: typings.apostrophe.apostropheStrings.`apostrophe-soft-redirects` = "apostrophe-soft-redirects".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-soft-redirects`]
    
    inline def `apostrophe-tags`: typings.apostrophe.apostropheStrings.`apostrophe-tags` = "apostrophe-tags".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-tags`]
    
    inline def `apostrophe-tasks`: typings.apostrophe.apostropheStrings.`apostrophe-tasks` = "apostrophe-tasks".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-tasks`]
    
    inline def `apostrophe-templates`: typings.apostrophe.apostropheStrings.`apostrophe-templates` = "apostrophe-templates".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-templates`]
    
    inline def `apostrophe-ui`: typings.apostrophe.apostropheStrings.`apostrophe-ui` = "apostrophe-ui".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-ui`]
    
    inline def `apostrophe-urls`: typings.apostrophe.apostropheStrings.`apostrophe-urls` = "apostrophe-urls".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-urls`]
    
    inline def `apostrophe-users`: typings.apostrophe.apostropheStrings.`apostrophe-users` = "apostrophe-users".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-users`]
    
    inline def `apostrophe-utils`: typings.apostrophe.apostropheStrings.`apostrophe-utils` = "apostrophe-utils".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-utils`]
    
    inline def `apostrophe-versions`: typings.apostrophe.apostropheStrings.`apostrophe-versions` = "apostrophe-versions".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-versions`]
    
    inline def `apostrophe-video-fields`: typings.apostrophe.apostropheStrings.`apostrophe-video-fields` = "apostrophe-video-fields".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-video-fields`]
    
    inline def `apostrophe-video-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-video-widgets` = "apostrophe-video-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-video-widgets`]
    
    inline def `apostrophe-widgets`: typings.apostrophe.apostropheStrings.`apostrophe-widgets` = "apostrophe-widgets".asInstanceOf[typings.apostrophe.apostropheStrings.`apostrophe-widgets`]
  }
  
  trait AposModule extends StObject {
    
    def emit(name: String): Unit
    
    def on(name: String, methodName: Any, fn: js.Function0[Any]): Unit
  }
  object AposModule {
    
    inline def apply(emit: String => Unit, on: (String, Any, js.Function0[Any]) => Unit): AposModule = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), on = js.Any.fromFunction3(on))
      __obj.asInstanceOf[AposModule]
    }
    
    extension [Self <: AposModule](x: Self) {
      
      inline def setEmit(value: String => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      inline def setOn(value: (String, Any, js.Function0[Any]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    }
  }
  
  // Pass in custom modules to AposModuleOptions to allow them in extend
  trait AposModuleOptions[C] extends StObject {
    
    var addFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    var arrangeFields: js.UndefOr[js.Array[typings.apostrophe.anon.Fields]] = js.undefined
    
    var beforeConstruct: js.UndefOr[js.Function2[/* self */ Any, /* options */ Any, Any]] = js.undefined
    
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
    
    inline def apply[C](extend: AposCoreModules | C, label: String): AposModuleOptions[C] = {
      val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[AposModuleOptions[C]]
    }
    
    extension [Self <: AposModuleOptions[?], C](x: Self & AposModuleOptions[C]) {
      
      inline def setAddFields(value: js.Array[Field]): Self = StObject.set(x, "addFields", value.asInstanceOf[js.Any])
      
      inline def setAddFieldsUndefined: Self = StObject.set(x, "addFields", js.undefined)
      
      inline def setAddFieldsVarargs(value: Field*): Self = StObject.set(x, "addFields", js.Array(value*))
      
      inline def setArrangeFields(value: js.Array[typings.apostrophe.anon.Fields]): Self = StObject.set(x, "arrangeFields", value.asInstanceOf[js.Any])
      
      inline def setArrangeFieldsUndefined: Self = StObject.set(x, "arrangeFields", js.undefined)
      
      inline def setArrangeFieldsVarargs(value: typings.apostrophe.anon.Fields*): Self = StObject.set(x, "arrangeFields", js.Array(value*))
      
      inline def setBeforeConstruct(value: (/* self */ Any, /* options */ Any) => Any): Self = StObject.set(x, "beforeConstruct", js.Any.fromFunction2(value))
      
      inline def setBeforeConstructUndefined: Self = StObject.set(x, "beforeConstruct", js.undefined)
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setExtend(value: AposCoreModules | C): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: Projection): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlayerData(value: `false` | js.Array[String]): Self = StObject.set(x, "playerData", value.asInstanceOf[js.Any])
      
      inline def setPlayerDataUndefined: Self = StObject.set(x, "playerData", js.undefined)
      
      inline def setPlayerDataVarargs(value: String*): Self = StObject.set(x, "playerData", js.Array(value*))
      
      inline def setPluralLabel(value: String): Self = StObject.set(x, "pluralLabel", value.asInstanceOf[js.Any])
      
      inline def setPluralLabelUndefined: Self = StObject.set(x, "pluralLabel", js.undefined)
      
      inline def setRemoveFields(value: js.Array[Field]): Self = StObject.set(x, "removeFields", value.asInstanceOf[js.Any])
      
      inline def setRemoveFieldsUndefined: Self = StObject.set(x, "removeFields", js.undefined)
      
      inline def setRemoveFieldsVarargs(value: Field*): Self = StObject.set(x, "removeFields", js.Array(value*))
      
      inline def setScene(value: user): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      inline def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    }
  }
  
  type AposObject = StringDictionary[Any]
  
  trait AposType extends StObject {
    
    var bless: js.UndefOr[js.Function2[/* req */ Any, /* field */ Any, Unit]] = js.undefined
    
    var converters: Form
    
    var empty: js.UndefOr[js.Function2[/* field */ Any, /* value */ Any, Unit]] = js.undefined
    
    def index(value: Any, field: Any, texts: Any): Unit
    
    var name: String
  }
  object AposType {
    
    inline def apply(converters: Form, index: (Any, Any, Any) => Unit, name: String): AposType = {
      val __obj = js.Dynamic.literal(converters = converters.asInstanceOf[js.Any], index = js.Any.fromFunction3(index), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AposType]
    }
    
    extension [Self <: AposType](x: Self) {
      
      inline def setBless(value: (/* req */ Any, /* field */ Any) => Unit): Self = StObject.set(x, "bless", js.Any.fromFunction2(value))
      
      inline def setBlessUndefined: Self = StObject.set(x, "bless", js.undefined)
      
      inline def setConverters(value: Form): Self = StObject.set(x, "converters", value.asInstanceOf[js.Any])
      
      inline def setEmpty(value: (/* field */ Any, /* value */ Any) => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction2(value))
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setIndex(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "index", js.Any.fromFunction3(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
    
    inline def apply(label: String, name: String, `type`: String): Field = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    extension [Self <: Field](x: Self) {
      
      inline def setChoices(value: js.Array[SelectChoice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      inline def setChoicesVarargs(value: SelectChoice*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: AposObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSchema(value: js.Array[Field]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSchemaVarargs(value: Field*): Self = StObject.set(x, "schema", js.Array(value*))
      
      inline def setTitleField(value: String): Self = StObject.set(x, "titleField", value.asInstanceOf[js.Any])
      
      inline def setTitleFieldUndefined: Self = StObject.set(x, "titleField", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidgetType(value: String): Self = StObject.set(x, "widgetType", value.asInstanceOf[js.Any])
      
      inline def setWidgetTypeUndefined: Self = StObject.set(x, "widgetType", js.undefined)
    }
  }
  
  type Fields = js.Array[Field]
  
  trait Schema extends StObject {
    
    def addFieldType(`type`: AposType): Unit
    
    def addFilters(schema: Schema, options: Any, cursor: Any): Unit
    
    def addJoinSlugFilter(field: Any, cursor: Any, suffix: Any): Unit
    
    def afterInit(): Unit
    
    def compose(options: AposObject): Unit
    
    def convert(req: Any, schema: Schema, to: Any, `object`: AposObject, output: Any, callback: js.Function0[Any]): Unit
    
    def createRoutes(): js.Array[Any]
    
    def cursorFilterInterested(cursor: Any, name: String): Unit
    
    def empty(schema: Schema, `object`: AposObject): Unit
    
    def `export`(req: Any, schema: Schema, to: Any, `object`: AposObject, output: Any, callback: js.Function0[Any]): Unit
    
    def getFieldType(typeName: String): Unit
    
    def indexFields(schema: Schema, `object`: AposObject, texts: Any): Unit
    
    def isVisible(schema: Schema, `object`: AposObject, name: String): Unit
    
    def join(req: Any, schema: Schema, objectOrArray: Any, withJoins: Any, callback: js.Function0[Any]): Unit
    
    def joinDriver(
      req: Any,
      method: Any,
      reverse: Any,
      items: Any,
      idField: Any,
      relationshipsField: Any,
      objectField: Any,
      options: Any,
      callback: js.Function0[Any]
    ): Unit
    
    def joinFilterChoices(field: Any, cursor: Any, valueField: Any): Unit
    
    def newInstance(schema: Schema): Any
    
    def pageServe(req: Any): Unit
    
    def pushAssets(): Unit
    
    def pushCreateSingleton(): Unit
    
    def refine(schema: Schema, options: AposObject): Unit
    
    def sortedDistinct(property: Any, cursor: Any, callback: js.Function0[Any]): Unit
    
    def subset(schema: Schema, fields: Fields): Schema
    
    def subsetInstance(schema: Schema, instance: AposObject): Any
    
    def toGroups(fields: Fields): Unit
    
    def validate(schema: Schema, options: Any): Unit
  }
  object Schema {
    
    inline def apply(
      addFieldType: AposType => Unit,
      addFilters: (Schema, Any, Any) => Unit,
      addJoinSlugFilter: (Any, Any, Any) => Unit,
      afterInit: () => Unit,
      compose: AposObject => Unit,
      convert: (Any, Schema, Any, AposObject, Any, js.Function0[Any]) => Unit,
      createRoutes: () => js.Array[Any],
      cursorFilterInterested: (Any, String) => Unit,
      empty: (Schema, AposObject) => Unit,
      `export`: (Any, Schema, Any, AposObject, Any, js.Function0[Any]) => Unit,
      getFieldType: String => Unit,
      indexFields: (Schema, AposObject, Any) => Unit,
      isVisible: (Schema, AposObject, String) => Unit,
      join: (Any, Schema, Any, Any, js.Function0[Any]) => Unit,
      joinDriver: (Any, Any, Any, Any, Any, Any, Any, Any, js.Function0[Any]) => Unit,
      joinFilterChoices: (Any, Any, Any) => Unit,
      newInstance: Schema => Any,
      pageServe: Any => Unit,
      pushAssets: () => Unit,
      pushCreateSingleton: () => Unit,
      refine: (Schema, AposObject) => Unit,
      sortedDistinct: (Any, Any, js.Function0[Any]) => Unit,
      subset: (Schema, Fields) => Schema,
      subsetInstance: (Schema, AposObject) => Any,
      toGroups: Fields => Unit,
      validate: (Schema, Any) => Unit
    ): Schema = {
      val __obj = js.Dynamic.literal(addFieldType = js.Any.fromFunction1(addFieldType), addFilters = js.Any.fromFunction3(addFilters), addJoinSlugFilter = js.Any.fromFunction3(addJoinSlugFilter), afterInit = js.Any.fromFunction0(afterInit), compose = js.Any.fromFunction1(compose), convert = js.Any.fromFunction6(convert), createRoutes = js.Any.fromFunction0(createRoutes), cursorFilterInterested = js.Any.fromFunction2(cursorFilterInterested), empty = js.Any.fromFunction2(empty), getFieldType = js.Any.fromFunction1(getFieldType), indexFields = js.Any.fromFunction3(indexFields), isVisible = js.Any.fromFunction3(isVisible), join = js.Any.fromFunction5(join), joinDriver = js.Any.fromFunction9(joinDriver), joinFilterChoices = js.Any.fromFunction3(joinFilterChoices), newInstance = js.Any.fromFunction1(newInstance), pageServe = js.Any.fromFunction1(pageServe), pushAssets = js.Any.fromFunction0(pushAssets), pushCreateSingleton = js.Any.fromFunction0(pushCreateSingleton), refine = js.Any.fromFunction2(refine), sortedDistinct = js.Any.fromFunction3(sortedDistinct), subset = js.Any.fromFunction2(subset), subsetInstance = js.Any.fromFunction2(subsetInstance), toGroups = js.Any.fromFunction1(toGroups), validate = js.Any.fromFunction2(validate))
      __obj.updateDynamic("export")(js.Any.fromFunction6(`export`))
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setAddFieldType(value: AposType => Unit): Self = StObject.set(x, "addFieldType", js.Any.fromFunction1(value))
      
      inline def setAddFilters(value: (Schema, Any, Any) => Unit): Self = StObject.set(x, "addFilters", js.Any.fromFunction3(value))
      
      inline def setAddJoinSlugFilter(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "addJoinSlugFilter", js.Any.fromFunction3(value))
      
      inline def setAfterInit(value: () => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction0(value))
      
      inline def setCompose(value: AposObject => Unit): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
      
      inline def setConvert(value: (Any, Schema, Any, AposObject, Any, js.Function0[Any]) => Unit): Self = StObject.set(x, "convert", js.Any.fromFunction6(value))
      
      inline def setCreateRoutes(value: () => js.Array[Any]): Self = StObject.set(x, "createRoutes", js.Any.fromFunction0(value))
      
      inline def setCursorFilterInterested(value: (Any, String) => Unit): Self = StObject.set(x, "cursorFilterInterested", js.Any.fromFunction2(value))
      
      inline def setEmpty(value: (Schema, AposObject) => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction2(value))
      
      inline def setExport(value: (Any, Schema, Any, AposObject, Any, js.Function0[Any]) => Unit): Self = StObject.set(x, "export", js.Any.fromFunction6(value))
      
      inline def setGetFieldType(value: String => Unit): Self = StObject.set(x, "getFieldType", js.Any.fromFunction1(value))
      
      inline def setIndexFields(value: (Schema, AposObject, Any) => Unit): Self = StObject.set(x, "indexFields", js.Any.fromFunction3(value))
      
      inline def setIsVisible(value: (Schema, AposObject, String) => Unit): Self = StObject.set(x, "isVisible", js.Any.fromFunction3(value))
      
      inline def setJoin(value: (Any, Schema, Any, Any, js.Function0[Any]) => Unit): Self = StObject.set(x, "join", js.Any.fromFunction5(value))
      
      inline def setJoinDriver(value: (Any, Any, Any, Any, Any, Any, Any, Any, js.Function0[Any]) => Unit): Self = StObject.set(x, "joinDriver", js.Any.fromFunction9(value))
      
      inline def setJoinFilterChoices(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "joinFilterChoices", js.Any.fromFunction3(value))
      
      inline def setNewInstance(value: Schema => Any): Self = StObject.set(x, "newInstance", js.Any.fromFunction1(value))
      
      inline def setPageServe(value: Any => Unit): Self = StObject.set(x, "pageServe", js.Any.fromFunction1(value))
      
      inline def setPushAssets(value: () => Unit): Self = StObject.set(x, "pushAssets", js.Any.fromFunction0(value))
      
      inline def setPushCreateSingleton(value: () => Unit): Self = StObject.set(x, "pushCreateSingleton", js.Any.fromFunction0(value))
      
      inline def setRefine(value: (Schema, AposObject) => Unit): Self = StObject.set(x, "refine", js.Any.fromFunction2(value))
      
      inline def setSortedDistinct(value: (Any, Any, js.Function0[Any]) => Unit): Self = StObject.set(x, "sortedDistinct", js.Any.fromFunction3(value))
      
      inline def setSubset(value: (Schema, Fields) => Schema): Self = StObject.set(x, "subset", js.Any.fromFunction2(value))
      
      inline def setSubsetInstance(value: (Schema, AposObject) => Any): Self = StObject.set(x, "subsetInstance", js.Any.fromFunction2(value))
      
      inline def setToGroups(value: Fields => Unit): Self = StObject.set(x, "toGroups", js.Any.fromFunction1(value))
      
      inline def setValidate(value: (Schema, Any) => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
  
  trait SelectChoice extends StObject {
    
    var label: String
    
    var value: String
  }
  object SelectChoice {
    
    inline def apply(label: String, value: String): SelectChoice = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectChoice]
    }
    
    extension [Self <: SelectChoice](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
