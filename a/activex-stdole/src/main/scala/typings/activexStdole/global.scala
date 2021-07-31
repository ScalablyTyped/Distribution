package typings.activexStdole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object stdole {
    
    @JSGlobal("stdole.StdFont")
    @js.native
    class StdFont protected ()
      extends StObject
         with typings.activexStdole.stdole.StdFont {
      
      /* CompleteClass */
      override val Bold: Boolean = js.native
      
      /* CompleteClass */
      override val Charset: Double = js.native
      
      /* CompleteClass */
      override val Italic: Boolean = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
      
      /* CompleteClass */
      override val Size: Double = js.native
      
      /* CompleteClass */
      override val Strikethrough: Boolean = js.native
      
      /* CompleteClass */
      override val Underline: Boolean = js.native
      
      /* CompleteClass */
      override val Weight: Double = js.native
      
      /* CompleteClass */
      @JSName("stdole.StdFont_typekey")
      var stdoleDotStdFont_typekey: typings.activexStdole.stdole.StdFont = js.native
    }
    
    @JSGlobal("stdole.StdPicture")
    @js.native
    class StdPicture protected ()
      extends StObject
         with typings.activexStdole.stdole.StdPicture {
      
      /* CompleteClass */
      override val Handle: Double = js.native
      
      /* CompleteClass */
      override val Height: Double = js.native
      
      /* CompleteClass */
      override def Render(
        hdc: Double,
        x: Double,
        y: Double,
        cx: Double,
        cy: Double,
        xSrc: Double,
        ySrc: Double,
        cxSrc: Double,
        cySrc: Double,
        prcWBounds: Unit
      ): Unit = js.native
      
      /* CompleteClass */
      override val Type: Double = js.native
      
      /* CompleteClass */
      override val Width: Double = js.native
      
      /* CompleteClass */
      override val hPal: Double = js.native
      
      /* CompleteClass */
      @JSName("stdole.StdPicture_typekey")
      var stdoleDotStdPicture_typekey: typings.activexStdole.stdole.StdPicture = js.native
    }
  }
}
