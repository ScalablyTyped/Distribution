package typings
package atAngularCoreLib.srcCoreUnderscorePrivateUnderscoreExportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/core_private_export", JSImport.Namespace)
@js.native
object srcCoreUnderscorePrivateUnderscoreExportModMembers extends js.Object {
  val ɵALLOW_MULTIPLE_PLATFORMS: atAngularCoreLib.srcDiMod.InjectionToken[scala.Boolean] = js.native
  val ɵAPP_ID_RANDOM_PROVIDER: atAngularCoreLib.Anon_Deps = js.native
  val ɵAPP_ROOT: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[scala.Boolean] = js.native
  val ɵdefaultIterableDiffers: atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableDiffers = js.native
  val ɵdefaultKeyValueDiffers: atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueDiffers = js.native
  var ɵglobal: nodeLib.NodeJSNs.Global = js.native
  val ɵivyEnabled: /* false */ scala.Boolean = js.native
  def ɵ_sanitizeHtml(defaultDoc: js.Any, unsafeHtmlInput: java.lang.String): java.lang.String = js.native
  def ɵ_sanitizeStyle(value: java.lang.String): java.lang.String = js.native
  def ɵ_sanitizeUrl(url: java.lang.String): java.lang.String = js.native
  def ɵclearOverrides(): scala.Unit = js.native
  def ɵdevModeEqual(a: js.Any, b: js.Any): scala.Boolean = js.native
  def ɵgetInjectableDef[T](`type`: js.Any): atAngularCoreLib.srcDiDefsMod.InjectableDef[T] | scala.Null = js.native
  def ɵinitServicesIfNeeded(): scala.Unit = js.native
  def ɵinject[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T | scala.Null = js.native
  def ɵinject[T](
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T | scala.Null = js.native
  def ɵinject[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T | scala.Null = js.native
  def ɵinject[T](
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T | scala.Null = js.native
  @JSName("ɵinject")
  def ɵinject_TT[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T = js.native
  @JSName("ɵinject")
  def ɵinject_TT[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def ɵisDefaultChangeDetectionStrategy(
    changeDetectionStrategy: atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectionStrategy
  ): scala.Boolean = js.native
  def ɵisListLikeIterable(obj: js.Any): scala.Boolean = js.native
  def ɵisObservable(obj: js.Any): /* is Observable */scala.Boolean = js.native
  def ɵisObservable(obj: rxjsLib.rxjsMod.Observable[_]): /* is Observable */scala.Boolean = js.native
  def ɵisPromise(obj: js.Any): /* is Promise */scala.Boolean = js.native
  def ɵlooseIdentical(a: js.Any, b: js.Any): scala.Boolean = js.native
  def ɵmakeDecorator[T](name: java.lang.String): atAngularCoreLib.Anon_Args = js.native
  def ɵmakeDecorator[T](name: java.lang.String, props: js.Function1[/* repeated */js.Any, _]): atAngularCoreLib.Anon_Args = js.native
  def ɵmakeDecorator[T](name: java.lang.String, props: js.Function1[/* repeated */js.Any, _], parentClass: js.Any): atAngularCoreLib.Anon_Args = js.native
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ atAngularCoreLib.srcTypeMod.Type[T], scala.Unit]
  ): atAngularCoreLib.Anon_Args = js.native
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ atAngularCoreLib.srcTypeMod.Type[T], scala.Unit],
    typeFn: js.Function2[/* type */ atAngularCoreLib.srcTypeMod.Type[T], /* repeated */js.Any, scala.Unit]
  ): atAngularCoreLib.Anon_Args = js.native
  def ɵoverrideComponentView(
    comp: atAngularCoreLib.srcTypeMod.Type[_],
    componentFactory: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[_]
  ): scala.Unit = js.native
  def ɵoverrideProvider(`override`: atAngularCoreLib.srcViewTypesMod.ProviderOverride): scala.Unit = js.native
  def ɵresolveComponentResources(
    resourceResolver: js.Function1[
      /* url */ java.lang.String, 
      stdLib.Promise[java.lang.String | atAngularCoreLib.Anon_Text]
    ]
  ): stdLib.Promise[scala.Null] = js.native
  def ɵsetCurrentInjector(): js.UndefOr[atAngularCoreLib.srcDiInjectorMod.Injector | scala.Null] = js.native
  def ɵsetCurrentInjector(injector: atAngularCoreLib.srcDiInjectorMod.Injector): js.UndefOr[atAngularCoreLib.srcDiInjectorMod.Injector | scala.Null] = js.native
  def ɵstringify(token: js.Any): java.lang.String = js.native
}

