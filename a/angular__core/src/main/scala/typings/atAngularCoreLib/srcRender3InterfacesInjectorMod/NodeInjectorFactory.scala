package typings
package atAngularCoreLib.srcRender3InterfacesInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/interfaces/injector", "NodeInjectorFactory")
@js.native
class NodeInjectorFactory protected () extends js.Object {
  def this(/**
       * Factory to invoke in order to create a new instance.
       */
  factory: js.ThisFunction4[
      /* this */ NodeInjectorFactory, 
      /* _ */ scala.Null, 
      /* tData */ atAngularCoreLib.srcRender3InterfacesViewMod.TData, 
      /* lData */ atAngularCoreLib.srcRender3InterfacesViewMod.LViewData, 
      /* tNode */ atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode, 
      _
    ], /**
       * Set to `true` if the token is declared in `viewProviders` (or if it is component).
       */
  isViewProvider: scala.Boolean) = this()
  def this(/**
       * Factory to invoke in order to create a new instance.
       */
  factory: js.ThisFunction4[
      /* this */ NodeInjectorFactory, 
      /* _ */ scala.Null, 
      /* tData */ atAngularCoreLib.srcRender3InterfacesViewMod.TData, 
      /* lData */ atAngularCoreLib.srcRender3InterfacesViewMod.LViewData, 
      /* tNode */ atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode, 
      _
    ], /**
       * Set to `true` if the token is declared in `viewProviders` (or if it is component).
       */
  isViewProvider: scala.Boolean, injectImplementation: js.Function2[
      /* token */ atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[_], 
      /* flags */ atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags, 
      _
    ]) = this()
  /**
       * Marks that the token can see other Tokens declared in `viewProviders` on the same node.
       */
  var canSeeViewProviders: scala.Boolean = js.native
  /**
       * Number of `multi`-providers which belong to the component.
       *
       * This is needed because when multiple components and directives declare the `multi` provider
       * they have to be concatenated in the correct order.
       *
       * Example:
       *
       * If we have a component and directive active an a single element as declared here
       * ```
       * component:
       *   provides: [ {provide: String, useValue: 'component', multi: true} ],
       *   viewProvides: [ {provide: String, useValue: 'componentView', multi: true} ],
       *
       * directive:
       *   provides: [ {provide: String, useValue: 'directive', multi: true} ],
       * ```
       *
       * Then the expected results are:
       *
       * ```
       * providers: ['component', 'directive']
       * viewProviders: ['component', 'componentView', 'directive']
       * ```
       *
       * The way to think about it is that the `viewProviders` have been inserted after the component
       * but before the directives, which is why we need to know how many `multi`s have been declared by
       * the component.
       */
  var componentProviders: js.UndefOr[scala.Double] = js.native
  /**
       * Current index of the Factory in the `data`. Needed for `viewProviders` and `providers` merging.
       * See `providerFactory`.
       */
  var index: js.UndefOr[scala.Double] = js.native
  /**
       * The inject implementation to be activated when using the factory.
       */
  var injectImpl: scala.Null | (js.Function2[
    /* token */ atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[_], 
    /* flags */ atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags, 
    _
  ]) = js.native
  /**
       * An array of factories to use in case of `multi` provider.
       */
  var multi: js.UndefOr[js.Array[js.Function0[_]]] = js.native
  /**
       * Because the same `multi` provider can be declared in `provides` and `viewProvides` it is
       * possible for `viewProvides` to shadow the `provides`. For this reason we store the
       * `provideFactory` of the `providers` so that `providers` can be extended with `viewProviders`.
       *
       * Example:
       *
       * Given:
       * ```
       * provides: [ {provide: String, useValue: 'all', multi: true} ],
       * viewProvides: [ {provide: String, useValue: 'viewOnly', multi: true} ],
       * ```
       *
       * We have to return `['all']` in case of content injection, but `['all', 'viewOnly']` in case
       * of view injection. We further have to make sure that the shared instances (in our case
       * `all`) are the exact same instance in both the content as well as the view injection. (We
       * have to make sure that we don't double instantiate.) For this reason the `viewProvides`
       * `Factory` has a pointer to the shadowed `provides` factory so that it can instantiate the
       * `providers` (`['all']`) and then extend it with `viewProviders` (`['all'] + ['viewOnly'] =
       * ['all', 'viewOnly']`).
       */
  var providerFactory: js.UndefOr[NodeInjectorFactory | scala.Null] = js.native
  /**
       * Marker set to true during factory invocation to see if we get into recursive loop.
       * Recursive loop causes an error to be displayed.
       */
  var resolving: scala.Boolean = js.native
  /**
       * Factory to invoke in order to create a new instance.
       */
  def factory(
    `this`: NodeInjectorFactory,
    `_`: scala.Null,
    /**
       * array where injectables tokens are stored. This is used in
       * case of an error reporting to produce friendlier errors.
       */
  tData: atAngularCoreLib.srcRender3InterfacesViewMod.TData,
    /**
       * array where existing instances of injectables are stored. This is used in case
       * of multi shadow is needed. See `multi` field documentation.
       */
  lData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    /**
       * The TNode of the same element injector.
       */
  tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode
  ): js.Any = js.native
}

