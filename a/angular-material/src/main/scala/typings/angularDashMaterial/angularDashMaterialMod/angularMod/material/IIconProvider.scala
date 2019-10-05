package typings.angularDashMaterial.angularDashMaterialMod.angularMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconProvider extends js.Object {
   // default: 24
  def defaultFontSet(name: String): IIconProvider = js.native
   // viewBoxSize default: 24
  def defaultIconSet(url: String): IIconProvider = js.native
  def defaultIconSet(url: String, viewBoxSize: Double): IIconProvider = js.native
   // viewBoxSize default: 24
  def defaultViewBoxSize(viewBoxSize: Double): IIconProvider = js.native
  def icon(id: String, url: String): IIconProvider = js.native
  def icon(id: String, url: String, viewBoxSize: Double): IIconProvider = js.native
   // viewBoxSize default: 24
  def iconSet(id: String, url: String): IIconProvider = js.native
  def iconSet(id: String, url: String, viewBoxSize: Double): IIconProvider = js.native
}

