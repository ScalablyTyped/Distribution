package typings.androiduix.global.androidui

import typings.androiduix.android.graphics.Paint
import typings.androiduix.android.graphics.drawable.Drawable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object image {
  
  @JSGlobal("androidui.image.ChangeImageSizeDrawable")
  @js.native
  class ChangeImageSizeDrawable protected ()
    extends typings.androiduix.androidui.image.ChangeImageSizeDrawable {
    def this(drawable: Drawable, overrideWidth: Double) = this()
    def this(drawable: Drawable, overrideWidth: Double, overrideHeight: Double) = this()
  }
  
  @JSGlobal("androidui.image.NetDrawable")
  @js.native
  class NetDrawable protected ()
    extends typings.androiduix.androidui.image.NetDrawable {
    def this(src: String) = this()
    def this(src: typings.androiduix.androidui.image.NetImage) = this()
    def this(src: String, paint: Paint) = this()
    def this(src: typings.androiduix.androidui.image.NetImage, paint: Paint) = this()
    def this(src: String, paint: js.UndefOr[scala.Nothing], overrideImageRatio: Double) = this()
    def this(src: String, paint: Paint, overrideImageRatio: Double) = this()
    def this(
      src: typings.androiduix.androidui.image.NetImage,
      paint: js.UndefOr[scala.Nothing],
      overrideImageRatio: Double
    ) = this()
    def this(src: typings.androiduix.androidui.image.NetImage, paint: Paint, overrideImageRatio: Double) = this()
  }
  object NetDrawable {
    
    @JSGlobal("androidui.image.NetDrawable.TileMode")
    @js.native
    object TileMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.androiduix.androidui.image.NetDrawable.TileMode with Double] = js.native
      
      /* 0 */ val DEFAULT: typings.androiduix.androidui.image.NetDrawable.TileMode.DEFAULT with Double = js.native
      
      /* 1 */ val REPEAT: typings.androiduix.androidui.image.NetDrawable.TileMode.REPEAT with Double = js.native
    }
  }
  
  @JSGlobal("androidui.image.NetImage")
  @js.native
  class NetImage protected ()
    extends typings.androiduix.androidui.image.NetImage {
    def this(src: String) = this()
    def this(src: String, overrideImageRatio: Double) = this()
  }
  
  @JSGlobal("androidui.image.NinePatchDrawable")
  @js.native
  class NinePatchDrawable ()
    extends typings.androiduix.androidui.image.NinePatchDrawable
  object NinePatchDrawable {
    
    @JSGlobal("androidui.image.NinePatchDrawable")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("androidui.image.NinePatchDrawable.GlobalBorderInfoCache")
    @js.native
    def GlobalBorderInfoCache: js.Any = js.native
    @scala.inline
    def GlobalBorderInfoCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobalBorderInfoCache")(x.asInstanceOf[js.Any])
  }
}
