package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/view", JSImport.Namespace)
@js.native
object srcViewViewMod extends js.Object {
  def checkAndUpdateNode(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    nodeDef: atAngularCoreLib.srcViewTypesMod.NodeDef,
    argStyle: atAngularCoreLib.srcViewTypesMod.ArgumentType,
    v0: js.UndefOr[js.Any],
    v1: js.UndefOr[js.Any],
    v2: js.UndefOr[js.Any],
    v3: js.UndefOr[js.Any],
    v4: js.UndefOr[js.Any],
    v5: js.UndefOr[js.Any],
    v6: js.UndefOr[js.Any],
    v7: js.UndefOr[js.Any],
    v8: js.UndefOr[js.Any],
    v9: js.UndefOr[js.Any]
  ): scala.Boolean = js.native
  def checkAndUpdateView(view: atAngularCoreLib.srcViewTypesMod.ViewData): scala.Unit = js.native
  def checkNoChangesNode(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    nodeDef: atAngularCoreLib.srcViewTypesMod.NodeDef,
    argStyle: atAngularCoreLib.srcViewTypesMod.ArgumentType,
    v0: js.UndefOr[js.Any],
    v1: js.UndefOr[js.Any],
    v2: js.UndefOr[js.Any],
    v3: js.UndefOr[js.Any],
    v4: js.UndefOr[js.Any],
    v5: js.UndefOr[js.Any],
    v6: js.UndefOr[js.Any],
    v7: js.UndefOr[js.Any],
    v8: js.UndefOr[js.Any],
    v9: js.UndefOr[js.Any]
  ): js.Any = js.native
  def checkNoChangesView(view: atAngularCoreLib.srcViewTypesMod.ViewData): scala.Unit = js.native
  def createComponentView(
    parentView: atAngularCoreLib.srcViewTypesMod.ViewData,
    nodeDef: atAngularCoreLib.srcViewTypesMod.NodeDef,
    viewDef: atAngularCoreLib.srcViewTypesMod.ViewDefinition,
    hostElement: js.Any
  ): atAngularCoreLib.srcViewTypesMod.ViewData = js.native
  def createEmbeddedView(
    parent: atAngularCoreLib.srcViewTypesMod.ViewData,
    anchorDef: atAngularCoreLib.srcViewTypesMod.NodeDef,
    viewDef: atAngularCoreLib.srcViewTypesMod.ViewDefinition
  ): atAngularCoreLib.srcViewTypesMod.ViewData = js.native
  def createEmbeddedView(
    parent: atAngularCoreLib.srcViewTypesMod.ViewData,
    anchorDef: atAngularCoreLib.srcViewTypesMod.NodeDef,
    viewDef: atAngularCoreLib.srcViewTypesMod.ViewDefinition,
    context: js.Any
  ): atAngularCoreLib.srcViewTypesMod.ViewData = js.native
  def createRootView(
    root: atAngularCoreLib.srcViewTypesMod.RootData,
    `def`: atAngularCoreLib.srcViewTypesMod.ViewDefinition
  ): atAngularCoreLib.srcViewTypesMod.ViewData = js.native
  def createRootView(
    root: atAngularCoreLib.srcViewTypesMod.RootData,
    `def`: atAngularCoreLib.srcViewTypesMod.ViewDefinition,
    context: js.Any
  ): atAngularCoreLib.srcViewTypesMod.ViewData = js.native
  def destroyView(view: atAngularCoreLib.srcViewTypesMod.ViewData): scala.Unit = js.native
  def viewDef(
    flags: atAngularCoreLib.srcViewTypesMod.ViewFlags,
    nodes: js.Array[atAngularCoreLib.srcViewTypesMod.NodeDef]
  ): atAngularCoreLib.srcViewTypesMod.ViewDefinition = js.native
  def viewDef(
    flags: atAngularCoreLib.srcViewTypesMod.ViewFlags,
    nodes: js.Array[atAngularCoreLib.srcViewTypesMod.NodeDef],
    updateDirectives: atAngularCoreLib.srcViewTypesMod.ViewUpdateFn
  ): atAngularCoreLib.srcViewTypesMod.ViewDefinition = js.native
  def viewDef(
    flags: atAngularCoreLib.srcViewTypesMod.ViewFlags,
    nodes: js.Array[atAngularCoreLib.srcViewTypesMod.NodeDef],
    updateDirectives: atAngularCoreLib.srcViewTypesMod.ViewUpdateFn,
    updateRenderer: atAngularCoreLib.srcViewTypesMod.ViewUpdateFn
  ): atAngularCoreLib.srcViewTypesMod.ViewDefinition = js.native
  def viewDef(
    flags: atAngularCoreLib.srcViewTypesMod.ViewFlags,
    nodes: js.Array[atAngularCoreLib.srcViewTypesMod.NodeDef],
    updateDirectives: scala.Null,
    updateRenderer: atAngularCoreLib.srcViewTypesMod.ViewUpdateFn
  ): atAngularCoreLib.srcViewTypesMod.ViewDefinition = js.native
}

