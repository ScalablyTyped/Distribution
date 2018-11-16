package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/view_attach", JSImport.Namespace)
@js.native
object srcViewViewUnderscoreAttachMod extends js.Object {
  def attachEmbeddedView(
    parentView: atAngularCoreLib.srcViewTypesMod.ViewData,
    elementData: atAngularCoreLib.srcViewTypesMod.ElementData,
    viewIndex: js.UndefOr[scala.Nothing],
    view: atAngularCoreLib.srcViewTypesMod.ViewData
  ): scala.Unit = js.native
  def attachEmbeddedView(
    parentView: atAngularCoreLib.srcViewTypesMod.ViewData,
    elementData: atAngularCoreLib.srcViewTypesMod.ElementData,
    viewIndex: scala.Double,
    view: atAngularCoreLib.srcViewTypesMod.ViewData
  ): scala.Unit = js.native
  def attachEmbeddedView(
    parentView: atAngularCoreLib.srcViewTypesMod.ViewData,
    elementData: atAngularCoreLib.srcViewTypesMod.ElementData,
    viewIndex: scala.Null,
    view: atAngularCoreLib.srcViewTypesMod.ViewData
  ): scala.Unit = js.native
  def detachEmbeddedView(elementData: atAngularCoreLib.srcViewTypesMod.ElementData): atAngularCoreLib.srcViewTypesMod.ViewData | scala.Null = js.native
  def detachEmbeddedView(elementData: atAngularCoreLib.srcViewTypesMod.ElementData, viewIndex: scala.Double): atAngularCoreLib.srcViewTypesMod.ViewData | scala.Null = js.native
  def detachProjectedView(view: atAngularCoreLib.srcViewTypesMod.ViewData): scala.Unit = js.native
  def moveEmbeddedView(
    elementData: atAngularCoreLib.srcViewTypesMod.ElementData,
    oldViewIndex: scala.Double,
    newViewIndex: scala.Double
  ): atAngularCoreLib.srcViewTypesMod.ViewData = js.native
  def renderDetachView(view: atAngularCoreLib.srcViewTypesMod.ViewData): scala.Unit = js.native
}

