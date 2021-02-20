package typings.activexStdole

import typings.activexStdole.activexStdoleNumbers.`0`
import typings.activexStdole.activexStdoleNumbers.`1`
import typings.activexStdole.activexStdoleNumbers.`2`
import typings.activexStdole.activexStdoleNumbers.`4`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stdole {
  
  @js.native
  trait DISPPARAMS extends StObject {
    
    val cArgs: Double = js.native
    
    val cNamedArgs: Double = js.native
    
    val rgdispidNamedArgs: Double = js.native
    
    val rgvarg: js.Any = js.native
  }
  object DISPPARAMS {
    
    @scala.inline
    def apply(cArgs: Double, cNamedArgs: Double, rgdispidNamedArgs: Double, rgvarg: js.Any): DISPPARAMS = {
      val __obj = js.Dynamic.literal(cArgs = cArgs.asInstanceOf[js.Any], cNamedArgs = cNamedArgs.asInstanceOf[js.Any], rgdispidNamedArgs = rgdispidNamedArgs.asInstanceOf[js.Any], rgvarg = rgvarg.asInstanceOf[js.Any])
      __obj.asInstanceOf[DISPPARAMS]
    }
    
    @scala.inline
    implicit class DISPPARAMSMutableBuilder[Self <: DISPPARAMS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCArgs(value: Double): Self = StObject.set(x, "cArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCNamedArgs(value: Double): Self = StObject.set(x, "cNamedArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRgdispidNamedArgs(value: Double): Self = StObject.set(x, "rgdispidNamedArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRgvarg(value: js.Any): Self = StObject.set(x, "rgvarg", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EXCEPINFO extends StObject {
    
    val bstrDescription: String = js.native
    
    val bstrHelpFile: String = js.native
    
    val bstrSource: String = js.native
    
    val dwHelpContext: Double = js.native
    
    val pfnDeferredFillIn: js.UndefOr[scala.Nothing] = js.native
    
    val pvReserved: js.UndefOr[scala.Nothing] = js.native
    
    val scode: js.Any = js.native
    
    val wCode: Double = js.native
    
    val wReserved: Double = js.native
  }
  object EXCEPINFO {
    
    @scala.inline
    def apply(
      bstrDescription: String,
      bstrHelpFile: String,
      bstrSource: String,
      dwHelpContext: Double,
      scode: js.Any,
      wCode: Double,
      wReserved: Double
    ): EXCEPINFO = {
      val __obj = js.Dynamic.literal(bstrDescription = bstrDescription.asInstanceOf[js.Any], bstrHelpFile = bstrHelpFile.asInstanceOf[js.Any], bstrSource = bstrSource.asInstanceOf[js.Any], dwHelpContext = dwHelpContext.asInstanceOf[js.Any], scode = scode.asInstanceOf[js.Any], wCode = wCode.asInstanceOf[js.Any], wReserved = wReserved.asInstanceOf[js.Any])
      __obj.asInstanceOf[EXCEPINFO]
    }
    
    @scala.inline
    implicit class EXCEPINFOMutableBuilder[Self <: EXCEPINFO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBstrDescription(value: String): Self = StObject.set(x, "bstrDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBstrHelpFile(value: String): Self = StObject.set(x, "bstrHelpFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBstrSource(value: String): Self = StObject.set(x, "bstrSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDwHelpContext(value: Double): Self = StObject.set(x, "dwHelpContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScode(value: js.Any): Self = StObject.set(x, "scode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWCode(value: Double): Self = StObject.set(x, "wCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWReserved(value: Double): Self = StObject.set(x, "wReserved", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GUID extends StObject {
    
    val Data1: Double = js.native
    
    val Data2: Double = js.native
    
    val Data3: Double = js.native
    
    val Data4: SafeArray[Double] = js.native
  }
  object GUID {
    
    @scala.inline
    def apply(Data1: Double, Data2: Double, Data3: Double, Data4: SafeArray[Double]): GUID = {
      val __obj = js.Dynamic.literal(Data1 = Data1.asInstanceOf[js.Any], Data2 = Data2.asInstanceOf[js.Any], Data3 = Data3.asInstanceOf[js.Any], Data4 = Data4.asInstanceOf[js.Any])
      __obj.asInstanceOf[GUID]
    }
    
    @scala.inline
    implicit class GUIDMutableBuilder[Self <: GUID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData1(value: Double): Self = StObject.set(x, "Data1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData2(value: Double): Self = StObject.set(x, "Data2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData3(value: Double): Self = StObject.set(x, "Data3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData4(value: SafeArray[Double]): Self = StObject.set(x, "Data4", value.asInstanceOf[js.Any])
    }
  }
  
  type IFontDisp = StdFont
  
  type IPictureDisp = StdPicture
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexStdole.activexStdoleNumbers.`4`
    - typings.activexStdole.activexStdoleNumbers.`0`
    - typings.activexStdole.activexStdoleNumbers.`1`
    - typings.activexStdole.activexStdoleNumbers.`2`
  */
  trait LoadPictureConstants extends StObject
  object LoadPictureConstants {
    
    @scala.inline
    def Color: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def Default: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def Monochrome: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def VgaColor: `2` = 2.asInstanceOf[`2`]
  }
  
  type OLE_COLOR = Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexStdole.activexStdoleNumbers.`1`
    - typings.activexStdole.activexStdoleNumbers.`2`
    - typings.activexStdole.activexStdoleNumbers.`0`
  */
  trait OLE_TRISTATE extends StObject
  object OLE_TRISTATE {
    
    @scala.inline
    def Checked: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def Gray: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def Unchecked: `0` = 0.asInstanceOf[`0`]
  }
  
  type OLE_XPOS_CONTAINER = Double
  
  type OLE_XPOS_PIXELS = Double
  
  type OLE_YPOS_CONTAINER = Double
  
  type OLE_YPOS_PIXELS = Double
  
  @js.native
  trait StdFont extends StObject {
    
    val Bold: Boolean = js.native
    
    val Charset: Double = js.native
    
    val Italic: Boolean = js.native
    
    val Name: String = js.native
    
    val Size: Double = js.native
    
    val Strikethrough: Boolean = js.native
    
    val Underline: Boolean = js.native
    
    val Weight: Double = js.native
    
    @JSName("stdole.StdFont_typekey")
    var stdoleDotStdFont_typekey: StdFont = js.native
  }
  object StdFont {
    
    @scala.inline
    def apply(
      Bold: Boolean,
      Charset: Double,
      Italic: Boolean,
      Name: String,
      Size: Double,
      Strikethrough: Boolean,
      Underline: Boolean,
      Weight: Double,
      stdoleDotStdFont_typekey: StdFont
    ): StdFont = {
      val __obj = js.Dynamic.literal(Bold = Bold.asInstanceOf[js.Any], Charset = Charset.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
      __obj.updateDynamic("stdole.StdFont_typekey")(stdoleDotStdFont_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[StdFont]
    }
    
    @scala.inline
    implicit class StdFontMutableBuilder[Self <: StdFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharset(value: Double): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoleDotStdFont_typekey(value: StdFont): Self = StObject.set(x, "stdole.StdFont_typekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikethrough(value: Boolean): Self = StObject.set(x, "Strikethrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderline(value: Boolean): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StdPicture extends StObject {
    
    val Handle: Double = js.native
    
    val Height: Double = js.native
    
    def Render(
      hdc: Double,
      x: Double,
      y: Double,
      cx: Double,
      cy: Double,
      xSrc: Double,
      ySrc: Double,
      cxSrc: Double,
      cySrc: Double,
      prcWBounds: js.UndefOr[scala.Nothing]
    ): Unit = js.native
    
    val Type: Double = js.native
    
    val Width: Double = js.native
    
    val hPal: Double = js.native
    
    @JSName("stdole.StdPicture_typekey")
    var stdoleDotStdPicture_typekey: StdPicture = js.native
  }
  object StdPicture {
    
    @scala.inline
    def apply(
      Handle: Double,
      Height: Double,
      Render: (Double, Double, Double, Double, Double, Double, Double, Double, Double, js.UndefOr[scala.Nothing]) => Unit,
      Type: Double,
      Width: Double,
      hPal: Double,
      stdoleDotStdPicture_typekey: StdPicture
    ): StdPicture = {
      val __obj = js.Dynamic.literal(Handle = Handle.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Render = js.Any.fromFunction10(Render), Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], hPal = hPal.asInstanceOf[js.Any])
      __obj.updateDynamic("stdole.StdPicture_typekey")(stdoleDotStdPicture_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[StdPicture]
    }
    
    @scala.inline
    implicit class StdPictureMutableBuilder[Self <: StdPicture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHPal(value: Double): Self = StObject.set(x, "hPal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandle(value: Double): Self = StObject.set(x, "Handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(
        value: (Double, Double, Double, Double, Double, Double, Double, Double, Double, js.UndefOr[scala.Nothing]) => Unit
      ): Self = StObject.set(x, "Render", js.Any.fromFunction10(value))
      
      @scala.inline
      def setStdoleDotStdPicture_typekey(value: StdPicture): Self = StObject.set(x, "stdole.StdPicture_typekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    }
  }
}
