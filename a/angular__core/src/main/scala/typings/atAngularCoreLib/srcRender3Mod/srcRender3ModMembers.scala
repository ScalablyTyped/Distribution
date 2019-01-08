package typings
package atAngularCoreLib.srcRender3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3", JSImport.Namespace)
@js.native
object srcRender3ModMembers extends js.Object {
  val NO_CHANGE: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  val QueryList: org.scalablytyped.runtime.Instantiable0[
    atAngularCoreLib.srcLinkerQueryUnderscoreListMod.QueryList[
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T */ js.Any
    ]
  ] = js.native
  def InheritDefinitionFeature(definition: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_]): scala.Unit = js.native
  def InheritDefinitionFeature(definition: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDef[_]): scala.Unit = js.native
  def LifecycleHooksFeature(component: js.Any, `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_]): scala.Unit = js.native
  def NgOnChangesFeature[T](definition: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDef[T]): scala.Unit = js.native
  def ProvidersFeature[T](providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider]): js.Function1[
    /* definition */ atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDef[T], 
    scala.Unit
  ] = js.native
  def ProvidersFeature[T](
    providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider],
    viewProviders: js.Array[atAngularCoreLib.srcDiProviderMod.Provider]
  ): js.Function1[
    /* definition */ atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDef[T], 
    scala.Unit
  ] = js.native
  def allocHostVars(count: scala.Double): scala.Unit = js.native
  def bind[T](value: T): T | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def componentHostSyntheticProperty[T](index: scala.Double, propName: java.lang.String, value: T): scala.Unit = js.native
  def componentHostSyntheticProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: T,
    sanitizer: atAngularCoreLib.srcRender3InterfacesSanitizationMod.SanitizerFn
  ): scala.Unit = js.native
  def componentHostSyntheticProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: T,
    sanitizer: atAngularCoreLib.srcRender3InterfacesSanitizationMod.SanitizerFn,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def componentHostSyntheticProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: T,
    sanitizer: scala.Null,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def componentHostSyntheticProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE
  ): scala.Unit = js.native
  def componentHostSyntheticProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    sanitizer: atAngularCoreLib.srcRender3InterfacesSanitizationMod.SanitizerFn
  ): scala.Unit = js.native
  def componentHostSyntheticProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    sanitizer: atAngularCoreLib.srcRender3InterfacesSanitizationMod.SanitizerFn,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def componentHostSyntheticProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    sanitizer: scala.Null,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def container(index: scala.Double): scala.Unit = js.native
  def containerRefreshEnd(): scala.Unit = js.native
  def containerRefreshStart(index: scala.Double): scala.Unit = js.native
  def defineBase[T](baseDefinition: atAngularCoreLib.Anon_Outputs[T]): atAngularCoreLib.srcRender3InterfacesDefinitionMod.BaseDef[T] = js.native
  def defineComponent[T](componentDefinition: atAngularCoreLib.Anon_Directives[T]): scala.Nothing = js.native
  def defineDirective[T](directiveDefinition: atAngularCoreLib.Anon_Features[T]): scala.Nothing = js.native
  def defineNgModule[T](
    `def`: atAngularCoreLib.Anon_TypeT[T] with stdLib.Partial[atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.NgModuleDef[T]]
  ): scala.Nothing = js.native
  def definePipe[T](pipeDef: atAngularCoreLib.Anon_Type[T]): scala.Nothing = js.native
  def detectChanges[T](component: T): scala.Unit = js.native
  def directiveInject[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T = js.native
  def directiveInject[T](
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T = js.native
  def directiveInject[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def directiveInject[T](
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T = js.native
  def disableBindings(): scala.Unit = js.native
  def element(index: scala.Double, name: java.lang.String): scala.Unit = js.native
  def element(
    index: scala.Double,
    name: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): scala.Unit = js.native
  def element(
    index: scala.Double,
    name: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def element(
    index: scala.Double,
    name: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def elementAttribute(index: scala.Double, name: java.lang.String, value: js.Any): scala.Unit = js.native
  def elementAttribute(
    index: scala.Double,
    name: java.lang.String,
    value: js.Any,
    sanitizer: atAngularCoreLib.srcRender3InterfacesSanitizationMod.SanitizerFn
  ): scala.Unit = js.native
  def elementClassProp(
    index: scala.Double,
    classIndex: scala.Double,
    value: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactory
  ): scala.Unit = js.native
  def elementClassProp(
    index: scala.Double,
    classIndex: scala.Double,
    value: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactory,
    directive: js.Object
  ): scala.Unit = js.native
  def elementClassProp(index: scala.Double, classIndex: scala.Double, value: scala.Boolean): scala.Unit = js.native
  def elementClassProp(index: scala.Double, classIndex: scala.Double, value: scala.Boolean, directive: js.Object): scala.Unit = js.native
  def elementContainerEnd(): scala.Unit = js.native
  def elementContainerStart(index: scala.Double): scala.Unit = js.native
  def elementContainerStart(index: scala.Double, attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes): scala.Unit = js.native
  def elementContainerStart(
    index: scala.Double,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def elementContainerStart(index: scala.Double, attrs: scala.Null, localRefs: js.Array[java.lang.String]): scala.Unit = js.native
  def elementEnd(): scala.Unit = js.native
  def elementHostAttrs(directive: js.Any, attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes): scala.Unit = js.native
  def elementProperty[T](index: scala.Double, propName: java.lang.String, value: T): scala.Unit = js.native
  def elementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: T,
    sanitizer: atAngularCoreLib.srcRender3InterfacesSanitizationMod.SanitizerFn
  ): scala.Unit = js.native
  def elementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: T,
    sanitizer: atAngularCoreLib.srcRender3InterfacesSanitizationMod.SanitizerFn,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def elementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: T,
    sanitizer: scala.Null,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def elementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE
  ): scala.Unit = js.native
  def elementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    sanitizer: atAngularCoreLib.srcRender3InterfacesSanitizationMod.SanitizerFn
  ): scala.Unit = js.native
  def elementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    sanitizer: atAngularCoreLib.srcRender3InterfacesSanitizationMod.SanitizerFn,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def elementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    sanitizer: scala.Null,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def elementStart(index: scala.Double, name: java.lang.String): scala.Unit = js.native
  def elementStart(
    index: scala.Double,
    name: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): scala.Unit = js.native
  def elementStart(
    index: scala.Double,
    name: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def elementStart(
    index: scala.Double,
    name: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def elementStyleProp(index: scala.Double, styleIndex: scala.Double): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactory
  ): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactory,
    suffix: java.lang.String
  ): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactory,
    suffix: java.lang.String,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactory,
    suffix: scala.Null,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyleProp(index: scala.Double, styleIndex: scala.Double, value: java.lang.String): scala.Unit = js.native
  def elementStyleProp(index: scala.Double, styleIndex: scala.Double, value: java.lang.String, suffix: java.lang.String): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: java.lang.String,
    suffix: java.lang.String,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: java.lang.String,
    suffix: scala.Null,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyleProp(index: scala.Double, styleIndex: scala.Double, value: nodeLib.String): scala.Unit = js.native
  def elementStyleProp(index: scala.Double, styleIndex: scala.Double, value: nodeLib.String, suffix: java.lang.String): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: nodeLib.String,
    suffix: java.lang.String,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: nodeLib.String,
    suffix: scala.Null,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyleProp(index: scala.Double, styleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  def elementStyleProp(index: scala.Double, styleIndex: scala.Double, value: scala.Double, suffix: java.lang.String): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: scala.Double,
    suffix: java.lang.String,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: scala.Double,
    suffix: scala.Null,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyleProp(index: scala.Double, styleIndex: scala.Double, value: scala.Null, suffix: java.lang.String): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: scala.Null,
    suffix: java.lang.String,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: scala.Null,
    suffix: scala.Null,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyling(): scala.Unit = js.native
  def elementStyling(classBindingNames: js.Array[java.lang.String]): scala.Unit = js.native
  def elementStyling(classBindingNames: js.Array[java.lang.String], styleBindingNames: js.Array[java.lang.String]): scala.Unit = js.native
  def elementStyling(
    classBindingNames: js.Array[java.lang.String],
    styleBindingNames: js.Array[java.lang.String],
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn
  ): scala.Unit = js.native
  def elementStyling(
    classBindingNames: js.Array[java.lang.String],
    styleBindingNames: js.Array[java.lang.String],
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyling(
    classBindingNames: js.Array[java.lang.String],
    styleBindingNames: js.Array[java.lang.String],
    styleSanitizer: scala.Null,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyling(
    classBindingNames: js.Array[java.lang.String],
    styleBindingNames: scala.Null,
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn
  ): scala.Unit = js.native
  def elementStyling(
    classBindingNames: js.Array[java.lang.String],
    styleBindingNames: scala.Null,
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyling(
    classBindingNames: js.Array[java.lang.String],
    styleBindingNames: scala.Null,
    styleSanitizer: scala.Null,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyling(classBindingNames: scala.Null, styleBindingNames: js.Array[java.lang.String]): scala.Unit = js.native
  def elementStyling(
    classBindingNames: scala.Null,
    styleBindingNames: js.Array[java.lang.String],
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn
  ): scala.Unit = js.native
  def elementStyling(
    classBindingNames: scala.Null,
    styleBindingNames: js.Array[java.lang.String],
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyling(
    classBindingNames: scala.Null,
    styleBindingNames: js.Array[java.lang.String],
    styleSanitizer: scala.Null,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyling(
    classBindingNames: scala.Null,
    styleBindingNames: scala.Null,
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn
  ): scala.Unit = js.native
  def elementStyling(
    classBindingNames: scala.Null,
    styleBindingNames: scala.Null,
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStyling(
    classBindingNames: scala.Null,
    styleBindingNames: scala.Null,
    styleSanitizer: scala.Null,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStylingApply(index: scala.Double): scala.Unit = js.native
  def elementStylingApply(index: scala.Double, directive: js.Any): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double, classes: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any],
    directive: js.Object
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    styles: scala.Null,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double, classes: java.lang.String): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: java.lang.String,
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: java.lang.String,
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: java.lang.String,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: java.lang.String,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any],
    directive: js.Object
  ): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double, classes: java.lang.String, styles: scala.Null, directive: js.Object): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double, classes: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: org.scalablytyped.runtime.StringDictionary[js.Any],
    directive: js.Object
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: scala.Null,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double, classes: scala.Null, styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: scala.Null,
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    directive: js.Object
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: scala.Null,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: scala.Null,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any],
    directive: js.Object
  ): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double, classes: scala.Null, styles: scala.Null, directive: js.Object): scala.Unit = js.native
  def embeddedViewEnd(): scala.Unit = js.native
  def embeddedViewStart(viewBlockId: scala.Double, consts: scala.Double, vars: scala.Double): atAngularCoreLib.srcRender3InterfacesDefinitionMod.RenderFlags = js.native
  def enableBindings(): scala.Unit = js.native
  def getComponent[T](element: stdLib.Element): T | scala.Null = js.native
  def getCurrentView(): atAngularCoreLib.srcRender3InterfacesViewMod.OpaqueViewState = js.native
  def getFactoryOf[T](`type`: atAngularCoreLib.srcTypeMod.Type[_]): (js.Function1[/* type */ atAngularCoreLib.srcTypeMod.Type[T] | scala.Null, T]) | scala.Null = js.native
  def getHostElement[T](directive: T): stdLib.Element = js.native
  def getInheritedFactory[T](`type`: atAngularCoreLib.srcTypeMod.Type[_]): js.Function1[/* type */ atAngularCoreLib.srcTypeMod.Type[T], T] = js.native
  def getRenderedText(component: js.Any): java.lang.String = js.native
  def i18n(index: scala.Double, message: java.lang.String): scala.Unit = js.native
  def i18n(index: scala.Double, message: java.lang.String, subTemplateIndex: scala.Double): scala.Unit = js.native
  def i18nApply(index: scala.Double): scala.Unit = js.native
  def i18nAttributes(index: scala.Double, values: js.Array[java.lang.String]): scala.Unit = js.native
  def i18nEnd(): scala.Unit = js.native
  def i18nExp[T](expression: T): scala.Unit = js.native
  def i18nExp[T](expression: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE): scala.Unit = js.native
  def i18nPostprocess(
    message: java.lang.String,
    replacements: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): java.lang.String = js.native
  def i18nStart(index: scala.Double, message: java.lang.String): scala.Unit = js.native
  def i18nStart(index: scala.Double, message: java.lang.String, subTemplateIndex: scala.Double): scala.Unit = js.native
  def injectAttribute(attrNameToInject: java.lang.String): java.lang.String | scala.Null = js.native
  def injectComponentFactoryResolver(): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryUnderscoreResolverMod.ComponentFactoryResolver = js.native
  def interpolation1(prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation2(prefix: java.lang.String, v0: js.Any, i0: java.lang.String, v1: js.Any, suffix: java.lang.String): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation3(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation4(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation5(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation6(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation7(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation8(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolationV(values: js.Array[_]): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def listener(eventName: java.lang.String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _]): scala.Unit = js.native
  def listener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def load[T](index: scala.Double): T = js.native
  def loadQueryList[T](queryListIdx: scala.Double): atAngularCoreLib.srcLinkerMod.QueryList[T] = js.native
  def markDirty[T](component: T): scala.Unit = js.native
  def namespaceHTML(): scala.Unit = js.native
  def namespaceMathML(): scala.Unit = js.native
  def namespaceSVG(): scala.Unit = js.native
  def nextContext[T](): T = js.native
  def nextContext[T](level: scala.Double): T = js.native
  def pipe(index: scala.Double, pipeName: java.lang.String): js.Any = js.native
  def pipeBind1(index: scala.Double, slotOffset: scala.Double, v1: js.Any): js.Any = js.native
  def pipeBind2(index: scala.Double, slotOffset: scala.Double, v1: js.Any, v2: js.Any): js.Any = js.native
  def pipeBind3(index: scala.Double, slotOffset: scala.Double, v1: js.Any, v2: js.Any, v3: js.Any): js.Any = js.native
  def pipeBind4(index: scala.Double, slotOffset: scala.Double, v1: js.Any, v2: js.Any, v3: js.Any, v4: js.Any): js.Any = js.native
  def pipeBindV(index: scala.Double, slotOffset: scala.Double, values: js.Array[_]): js.Any = js.native
  def projection(nodeIndex: scala.Double): scala.Unit = js.native
  def projection(nodeIndex: scala.Double, selectorIndex: scala.Double): scala.Unit = js.native
  def projection(nodeIndex: scala.Double, selectorIndex: scala.Double, attrs: js.Array[java.lang.String]): scala.Unit = js.native
  def projectionDef(): scala.Unit = js.native
  def projectionDef(selectors: js.Array[atAngularCoreLib.srcRender3InterfacesProjectionMod.CssSelectorList]): scala.Unit = js.native
  def projectionDef(
    selectors: js.Array[atAngularCoreLib.srcRender3InterfacesProjectionMod.CssSelectorList],
    textSelectors: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def pureFunction0[T](slotOffset: scala.Double, pureFn: js.Function0[T]): T = js.native
  def pureFunction0[T](slotOffset: scala.Double, pureFn: js.Function0[T], thisArg: js.Any): T = js.native
  def pureFunction1(slotOffset: scala.Double, pureFn: js.Function1[/* v */ js.Any, _], exp: js.Any): js.Any = js.native
  def pureFunction1(slotOffset: scala.Double, pureFn: js.Function1[/* v */ js.Any, _], exp: js.Any, thisArg: js.Any): js.Any = js.native
  def pureFunction2(
    slotOffset: scala.Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any
  ): js.Any = js.native
  def pureFunction2(
    slotOffset: scala.Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def pureFunction3(
    slotOffset: scala.Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any
  ): js.Any = js.native
  def pureFunction3(
    slotOffset: scala.Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def pureFunction4(
    slotOffset: scala.Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any
  ): js.Any = js.native
  def pureFunction4(
    slotOffset: scala.Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def pureFunction5(
    slotOffset: scala.Double,
    pureFn: js.Function5[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, /* v5 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any
  ): js.Any = js.native
  def pureFunction5(
    slotOffset: scala.Double,
    pureFn: js.Function5[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, /* v5 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def pureFunction6(
    slotOffset: scala.Double,
    pureFn: js.Function6[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any
  ): js.Any = js.native
  def pureFunction6(
    slotOffset: scala.Double,
    pureFn: js.Function6[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def pureFunction7(
    slotOffset: scala.Double,
    pureFn: js.Function7[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any
  ): js.Any = js.native
  def pureFunction7(
    slotOffset: scala.Double,
    pureFn: js.Function7[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def pureFunction8(
    slotOffset: scala.Double,
    pureFn: js.Function8[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      /* v8 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any,
    exp8: js.Any
  ): js.Any = js.native
  def pureFunction8(
    slotOffset: scala.Double,
    pureFn: js.Function8[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      /* v8 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any,
    exp8: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def pureFunctionV(slotOffset: scala.Double, pureFn: js.Function1[/* repeated */ js.Any, _], exps: js.Array[_]): js.Any = js.native
  def pureFunctionV(
    slotOffset: scala.Double,
    pureFn: js.Function1[/* repeated */ js.Any, _],
    exps: js.Array[_],
    thisArg: js.Any
  ): js.Any = js.native
  def query[T](memoryIndex: scala.Double, predicate: atAngularCoreLib.srcTypeMod.Type[_]): atAngularCoreLib.srcRender3QueryMod.QueryList[T] = js.native
  def query[T](memoryIndex: scala.Double, predicate: atAngularCoreLib.srcTypeMod.Type[_], descend: scala.Boolean): atAngularCoreLib.srcRender3QueryMod.QueryList[T] = js.native
  def query[T](
    memoryIndex: scala.Double,
    predicate: atAngularCoreLib.srcTypeMod.Type[_],
    descend: scala.Boolean,
    read: js.Any
  ): atAngularCoreLib.srcRender3QueryMod.QueryList[T] = js.native
  def query[T](memoryIndex: scala.Double, predicate: js.Array[java.lang.String]): atAngularCoreLib.srcRender3QueryMod.QueryList[T] = js.native
  def query[T](memoryIndex: scala.Double, predicate: js.Array[java.lang.String], descend: scala.Boolean): atAngularCoreLib.srcRender3QueryMod.QueryList[T] = js.native
  def query[T](
    memoryIndex: scala.Double,
    predicate: js.Array[java.lang.String],
    descend: scala.Boolean,
    read: js.Any
  ): atAngularCoreLib.srcRender3QueryMod.QueryList[T] = js.native
  def query[T](memoryIndex: scala.Null, predicate: atAngularCoreLib.srcTypeMod.Type[_]): atAngularCoreLib.srcRender3QueryMod.QueryList[T] = js.native
  def query[T](memoryIndex: scala.Null, predicate: atAngularCoreLib.srcTypeMod.Type[_], descend: scala.Boolean): atAngularCoreLib.srcRender3QueryMod.QueryList[T] = js.native
  def query[T](
    memoryIndex: scala.Null,
    predicate: atAngularCoreLib.srcTypeMod.Type[_],
    descend: scala.Boolean,
    read: js.Any
  ): atAngularCoreLib.srcRender3QueryMod.QueryList[T] = js.native
  def query[T](memoryIndex: scala.Null, predicate: js.Array[java.lang.String]): atAngularCoreLib.srcRender3QueryMod.QueryList[T] = js.native
  def query[T](memoryIndex: scala.Null, predicate: js.Array[java.lang.String], descend: scala.Boolean): atAngularCoreLib.srcRender3QueryMod.QueryList[T] = js.native
  def query[T](
    memoryIndex: scala.Null,
    predicate: js.Array[java.lang.String],
    descend: scala.Boolean,
    read: js.Any
  ): atAngularCoreLib.srcRender3QueryMod.QueryList[T] = js.native
  def queryRefresh(queryList: atAngularCoreLib.srcRender3QueryMod.QueryList[_]): scala.Boolean = js.native
  def reference[T](index: scala.Double): T = js.native
  def registerContentQuery[Q](queryList: atAngularCoreLib.srcLinkerMod.QueryList[Q], currentDirectiveIndex: scala.Double): scala.Unit = js.native
  def renderComponent[T](componentType: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentType[T]): T = js.native
  def renderComponent[T](
    componentType: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentType[T],
    opts: atAngularCoreLib.srcRender3ComponentMod.CreateComponentOptions
  ): T = js.native
  def renderComponent[T](componentType: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def renderComponent[T](
    componentType: atAngularCoreLib.srcTypeMod.Type[T],
    opts: atAngularCoreLib.srcRender3ComponentMod.CreateComponentOptions
  ): T = js.native
  def restoreView(viewToRestore: atAngularCoreLib.srcRender3InterfacesViewMod.OpaqueViewState): scala.Unit = js.native
  def setClassMetadata(`type`: atAngularCoreLib.srcTypeMod.Type[_]): scala.Unit = js.native
  def setClassMetadata(`type`: atAngularCoreLib.srcTypeMod.Type[_], decorators: js.Array[_]): scala.Unit = js.native
  def setClassMetadata(
    `type`: atAngularCoreLib.srcTypeMod.Type[_],
    decorators: js.Array[_],
    ctorParameters: js.Function0[js.Array[_]]
  ): scala.Unit = js.native
  def setClassMetadata(
    `type`: atAngularCoreLib.srcTypeMod.Type[_],
    decorators: js.Array[_],
    ctorParameters: js.Function0[js.Array[_]],
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def setClassMetadata(
    `type`: atAngularCoreLib.srcTypeMod.Type[_],
    decorators: js.Array[_],
    ctorParameters: scala.Null,
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def setClassMetadata(
    `type`: atAngularCoreLib.srcTypeMod.Type[_],
    decorators: scala.Null,
    ctorParameters: js.Function0[js.Array[_]]
  ): scala.Unit = js.native
  def setClassMetadata(
    `type`: atAngularCoreLib.srcTypeMod.Type[_],
    decorators: scala.Null,
    ctorParameters: js.Function0[js.Array[_]],
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def setClassMetadata(
    `type`: atAngularCoreLib.srcTypeMod.Type[_],
    decorators: scala.Null,
    ctorParameters: scala.Null,
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def store[T](index: scala.Double, value: T): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(index: scala.Double, templateFn: scala.Null, consts: scala.Double, vars: scala.Double): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def templateRefExtractor(
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LView
  ): atAngularCoreLib.srcLinkerTemplateUnderscoreRefMod.TemplateRef[js.Object] | scala.Null = js.native
  def text(index: scala.Double): scala.Unit = js.native
  def text(index: scala.Double, value: js.Any): scala.Unit = js.native
  def textBinding[T](index: scala.Double, value: T): scala.Unit = js.native
  def textBinding[T](index: scala.Double, value: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE): scala.Unit = js.native
  def tick[T](component: T): scala.Unit = js.native
  def whenRendered(component: js.Any): js.Promise[scala.Null] = js.native
}

