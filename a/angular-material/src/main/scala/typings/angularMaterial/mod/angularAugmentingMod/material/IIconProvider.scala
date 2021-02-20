package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// id is a unique ID or URL
@js.native
trait IIconProvider extends StObject {
  
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
