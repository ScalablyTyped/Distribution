package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ColorConstructor
import typings.arcgisJsApi.esri.Color_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriColorMod extends Shortcut {
  
  @JSImport("esri/Color", JSImport.Namespace)
  @js.native
  val ^ : ColorConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/Color", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with Color_ {
    def this(color: String) = this()
    def this(color: js.Array[Double]) = this()
    def this(color: Any) = this()
  }
  
  type _To = ColorConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriColorMod.foo` */
  override def _to: ColorConstructor = ^
}
