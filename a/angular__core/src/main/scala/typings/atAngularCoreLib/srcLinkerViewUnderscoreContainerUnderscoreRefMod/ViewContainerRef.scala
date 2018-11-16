package typings
package atAngularCoreLib.srcLinkerViewUnderscoreContainerUnderscoreRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/linker/view_container_ref", "ViewContainerRef")
@js.native
abstract class ViewContainerRef () extends js.Object {
  /**
       * Anchor element that specifies the location of this container in the containing view.
       * Each view container can have only one anchor element, and each anchor element
       * can have only a single view container.
       *
       * Root elements of views attached to this container become siblings of the anchor element in
       * the rendered view.
       *
       * Access the `ViewContainerRef` of an element by placing a `Directive` injected
       * with `ViewContainerRef` on the element, or use a `ViewChild` query.
       *
       * <!-- TODO: rename to anchorElement -->
       */
  val element: atAngularCoreLib.srcLinkerElementUnderscoreRefMod.ElementRef[_] = js.native
  /**
       * The [dependency injector](guide/glossary#injector) for this view container.
       */
  val injector: atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  /**
       * Reports how many views are currently attached to this container.
       * @returns The number of views.
       */
  val length: scala.Double = js.native
  /** @deprecated No replacement */
  val parentInjector: atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  /**
       * Destroys all views in this container.
       */
  def clear(): scala.Unit = js.native
  /**
       * Instantiates a single component and inserts its host view into this container.
       *
       * @param componentFactory The factory to use.
       * @param index The index at which to insert the new component's host view into this container.
       * If not specified, appends the new view as the last entry.
       * @param injector The injector to use as the parent for the new component.
       * @param projectableNodes
       * @param ngModule
       *
       * @returns The new component instance, containing the host view.
       *
       */
  def createComponent[C](componentFactory: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[C]): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[C] = js.native
  /**
       * Instantiates a single component and inserts its host view into this container.
       *
       * @param componentFactory The factory to use.
       * @param index The index at which to insert the new component's host view into this container.
       * If not specified, appends the new view as the last entry.
       * @param injector The injector to use as the parent for the new component.
       * @param projectableNodes
       * @param ngModule
       *
       * @returns The new component instance, containing the host view.
       *
       */
  def createComponent[C](
    componentFactory: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[C],
    index: scala.Double
  ): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[C] = js.native
  /**
       * Instantiates a single component and inserts its host view into this container.
       *
       * @param componentFactory The factory to use.
       * @param index The index at which to insert the new component's host view into this container.
       * If not specified, appends the new view as the last entry.
       * @param injector The injector to use as the parent for the new component.
       * @param projectableNodes
       * @param ngModule
       *
       * @returns The new component instance, containing the host view.
       *
       */
  def createComponent[C](
    componentFactory: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[C],
    index: scala.Double,
    injector: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[C] = js.native
  /**
       * Instantiates a single component and inserts its host view into this container.
       *
       * @param componentFactory The factory to use.
       * @param index The index at which to insert the new component's host view into this container.
       * If not specified, appends the new view as the last entry.
       * @param injector The injector to use as the parent for the new component.
       * @param projectableNodes
       * @param ngModule
       *
       * @returns The new component instance, containing the host view.
       *
       */
  def createComponent[C](
    componentFactory: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[C],
    index: scala.Double,
    injector: atAngularCoreLib.srcDiInjectorMod.Injector,
    projectableNodes: js.Array[js.Array[_]]
  ): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[C] = js.native
  /**
       * Instantiates a single component and inserts its host view into this container.
       *
       * @param componentFactory The factory to use.
       * @param index The index at which to insert the new component's host view into this container.
       * If not specified, appends the new view as the last entry.
       * @param injector The injector to use as the parent for the new component.
       * @param projectableNodes
       * @param ngModule
       *
       * @returns The new component instance, containing the host view.
       *
       */
  def createComponent[C](
    componentFactory: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[C],
    index: scala.Double,
    injector: atAngularCoreLib.srcDiInjectorMod.Injector,
    projectableNodes: js.Array[js.Array[_]],
    ngModule: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_]
  ): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[C] = js.native
  /**
       * Instantiates an embedded view and inserts it
       * into this container.
       * @param templateRef The HTML template that defines the view.
       * @param index The 0-based index at which to insert the new view into this container.
       * If not specified, appends the new view as the last entry.
       *
       * @returns The `ViewRef` instance for the newly created view.
       */
  def createEmbeddedView[C](templateRef: atAngularCoreLib.srcLinkerTemplateUnderscoreRefMod.TemplateRef[C]): atAngularCoreLib.srcLinkerViewUnderscoreRefMod.EmbeddedViewRef[C] = js.native
  /**
       * Instantiates an embedded view and inserts it
       * into this container.
       * @param templateRef The HTML template that defines the view.
       * @param index The 0-based index at which to insert the new view into this container.
       * If not specified, appends the new view as the last entry.
       *
       * @returns The `ViewRef` instance for the newly created view.
       */
  def createEmbeddedView[C](templateRef: atAngularCoreLib.srcLinkerTemplateUnderscoreRefMod.TemplateRef[C], context: C): atAngularCoreLib.srcLinkerViewUnderscoreRefMod.EmbeddedViewRef[C] = js.native
  /**
       * Instantiates an embedded view and inserts it
       * into this container.
       * @param templateRef The HTML template that defines the view.
       * @param index The 0-based index at which to insert the new view into this container.
       * If not specified, appends the new view as the last entry.
       *
       * @returns The `ViewRef` instance for the newly created view.
       */
  def createEmbeddedView[C](
    templateRef: atAngularCoreLib.srcLinkerTemplateUnderscoreRefMod.TemplateRef[C],
    context: C,
    index: scala.Double
  ): atAngularCoreLib.srcLinkerViewUnderscoreRefMod.EmbeddedViewRef[C] = js.native
  /**
       * Detaches a view from this container without destroying it.
       * Use along with `insert()` to move a view within the current container.
       * @param index The 0-based index of the view to detach.
       * If not specified, the last view in the container is detached.
       */
  def detach(): atAngularCoreLib.srcLinkerViewUnderscoreRefMod.ViewRef | scala.Null = js.native
  /**
       * Detaches a view from this container without destroying it.
       * Use along with `insert()` to move a view within the current container.
       * @param index The 0-based index of the view to detach.
       * If not specified, the last view in the container is detached.
       */
  def detach(index: scala.Double): atAngularCoreLib.srcLinkerViewUnderscoreRefMod.ViewRef | scala.Null = js.native
  /**
       * Retrieves a view from this container.
       * @param index The 0-based index of the view to retrieve.
       * @returns The `ViewRef` instance, or null if the index is out of range.
       */
  def get(index: scala.Double): atAngularCoreLib.srcLinkerViewUnderscoreRefMod.ViewRef | scala.Null = js.native
  /**
       * Returns the index of a view within the current container.
       * @param viewRef The view to query.
       * @returns The 0-based index of the view's position in this container,
       * or `-1` if this container doesn't contain the view.
       */
  def indexOf(viewRef: atAngularCoreLib.srcLinkerViewUnderscoreRefMod.ViewRef): scala.Double = js.native
  /**
       * Inserts a view into this container.
       * @param viewRef The view to insert.
       * @param index The 0-based index at which to insert the view.
       * If not specified, appends the new view as the last entry.
       * @returns The inserted `ViewRef` instance.
       *
       */
  def insert(viewRef: atAngularCoreLib.srcLinkerViewUnderscoreRefMod.ViewRef): atAngularCoreLib.srcLinkerViewUnderscoreRefMod.ViewRef = js.native
  /**
       * Inserts a view into this container.
       * @param viewRef The view to insert.
       * @param index The 0-based index at which to insert the view.
       * If not specified, appends the new view as the last entry.
       * @returns The inserted `ViewRef` instance.
       *
       */
  def insert(viewRef: atAngularCoreLib.srcLinkerViewUnderscoreRefMod.ViewRef, index: scala.Double): atAngularCoreLib.srcLinkerViewUnderscoreRefMod.ViewRef = js.native
  /**
       * Moves a view to a new location in this container.
       * @param viewRef The view to move.
       * @param index The 0-based index of the new location.
       * @returns The moved `ViewRef` instance.
       */
  def move(viewRef: atAngularCoreLib.srcLinkerViewUnderscoreRefMod.ViewRef, currentIndex: scala.Double): atAngularCoreLib.srcLinkerViewUnderscoreRefMod.ViewRef = js.native
  /**
       * Destroys a view attached to this container
       * @param index The 0-based index of the view to destroy.
       * If not specified, the last view in the container is removed.
       */
  def remove(): scala.Unit = js.native
  /**
       * Destroys a view attached to this container
       * @param index The 0-based index of the view to destroy.
       * If not specified, the last view in the container is removed.
       */
  def remove(index: scala.Double): scala.Unit = js.native
}

