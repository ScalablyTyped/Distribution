package typings.activexStdole

import typings.activexStdole.activexStdoleInts.`0`
import typings.activexStdole.activexStdoleInts.`1`
import typings.activexStdole.activexStdoleInts.`2`
import typings.activexStdole.activexStdoleInts.`4`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stdole {
  
  trait DISPPARAMS extends StObject {
    
    val cArgs: Double
    
    val cNamedArgs: Double
    
    val rgdispidNamedArgs: Double
    
    val rgvarg: Any
  }
  object DISPPARAMS {
    
    inline def apply(cArgs: Double, cNamedArgs: Double, rgdispidNamedArgs: Double, rgvarg: Any): DISPPARAMS = {
      val __obj = js.Dynamic.literal(cArgs = cArgs.asInstanceOf[js.Any], cNamedArgs = cNamedArgs.asInstanceOf[js.Any], rgdispidNamedArgs = rgdispidNamedArgs.asInstanceOf[js.Any], rgvarg = rgvarg.asInstanceOf[js.Any])
      __obj.asInstanceOf[DISPPARAMS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DISPPARAMS] (val x: Self) extends AnyVal {
      
      inline def setCArgs(value: Double): Self = StObject.set(x, "cArgs", value.asInstanceOf[js.Any])
      
      inline def setCNamedArgs(value: Double): Self = StObject.set(x, "cNamedArgs", value.asInstanceOf[js.Any])
      
      inline def setRgdispidNamedArgs(value: Double): Self = StObject.set(x, "rgdispidNamedArgs", value.asInstanceOf[js.Any])
      
      inline def setRgvarg(value: Any): Self = StObject.set(x, "rgvarg", value.asInstanceOf[js.Any])
    }
  }
  
  trait EXCEPINFO extends StObject {
    
    val bstrDescription: String
    
    val bstrHelpFile: String
    
    val bstrSource: String
    
    val dwHelpContext: Double
    
    val pfnDeferredFillIn: Unit
    
    val pvReserved: Unit
    
    val scode: Any
    
    val wCode: Double
    
    val wReserved: Double
  }
  object EXCEPINFO {
    
    inline def apply(
      bstrDescription: String,
      bstrHelpFile: String,
      bstrSource: String,
      dwHelpContext: Double,
      pfnDeferredFillIn: Unit,
      pvReserved: Unit,
      scode: Any,
      wCode: Double,
      wReserved: Double
    ): EXCEPINFO = {
      val __obj = js.Dynamic.literal(bstrDescription = bstrDescription.asInstanceOf[js.Any], bstrHelpFile = bstrHelpFile.asInstanceOf[js.Any], bstrSource = bstrSource.asInstanceOf[js.Any], dwHelpContext = dwHelpContext.asInstanceOf[js.Any], pfnDeferredFillIn = pfnDeferredFillIn.asInstanceOf[js.Any], pvReserved = pvReserved.asInstanceOf[js.Any], scode = scode.asInstanceOf[js.Any], wCode = wCode.asInstanceOf[js.Any], wReserved = wReserved.asInstanceOf[js.Any])
      __obj.asInstanceOf[EXCEPINFO]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EXCEPINFO] (val x: Self) extends AnyVal {
      
      inline def setBstrDescription(value: String): Self = StObject.set(x, "bstrDescription", value.asInstanceOf[js.Any])
      
      inline def setBstrHelpFile(value: String): Self = StObject.set(x, "bstrHelpFile", value.asInstanceOf[js.Any])
      
      inline def setBstrSource(value: String): Self = StObject.set(x, "bstrSource", value.asInstanceOf[js.Any])
      
      inline def setDwHelpContext(value: Double): Self = StObject.set(x, "dwHelpContext", value.asInstanceOf[js.Any])
      
      inline def setPfnDeferredFillIn(value: Unit): Self = StObject.set(x, "pfnDeferredFillIn", value.asInstanceOf[js.Any])
      
      inline def setPvReserved(value: Unit): Self = StObject.set(x, "pvReserved", value.asInstanceOf[js.Any])
      
      inline def setScode(value: Any): Self = StObject.set(x, "scode", value.asInstanceOf[js.Any])
      
      inline def setWCode(value: Double): Self = StObject.set(x, "wCode", value.asInstanceOf[js.Any])
      
      inline def setWReserved(value: Double): Self = StObject.set(x, "wReserved", value.asInstanceOf[js.Any])
    }
  }
  
  trait GUID extends StObject {
    
    val Data1: Double
    
    val Data2: Double
    
    val Data3: Double
    
    val Data4: SafeArray[Double]
  }
  object GUID {
    
    inline def apply(Data1: Double, Data2: Double, Data3: Double, Data4: SafeArray[Double]): GUID = {
      val __obj = js.Dynamic.literal(Data1 = Data1.asInstanceOf[js.Any], Data2 = Data2.asInstanceOf[js.Any], Data3 = Data3.asInstanceOf[js.Any], Data4 = Data4.asInstanceOf[js.Any])
      __obj.asInstanceOf[GUID]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GUID] (val x: Self) extends AnyVal {
      
      inline def setData1(value: Double): Self = StObject.set(x, "Data1", value.asInstanceOf[js.Any])
      
      inline def setData2(value: Double): Self = StObject.set(x, "Data2", value.asInstanceOf[js.Any])
      
      inline def setData3(value: Double): Self = StObject.set(x, "Data3", value.asInstanceOf[js.Any])
      
      inline def setData4(value: SafeArray[Double]): Self = StObject.set(x, "Data4", value.asInstanceOf[js.Any])
    }
  }
  
  type IFontDisp = StdFont
  
  type IPictureDisp = StdPicture
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexStdole.activexStdoleInts.`4`
    - typings.activexStdole.activexStdoleInts.`0`
    - typings.activexStdole.activexStdoleInts.`1`
    - typings.activexStdole.activexStdoleInts.`2`
  */
  trait LoadPictureConstants extends StObject
  object LoadPictureConstants {
    
    inline def Color: `4` = 4.asInstanceOf[`4`]
    
    inline def Default: `0` = 0.asInstanceOf[`0`]
    
    inline def Monochrome: `1` = 1.asInstanceOf[`1`]
    
    inline def VgaColor: `2` = 2.asInstanceOf[`2`]
  }
  
  type OLE_COLOR = Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexStdole.activexStdoleInts.`1`
    - typings.activexStdole.activexStdoleInts.`2`
    - typings.activexStdole.activexStdoleInts.`0`
  */
  trait OLE_TRISTATE extends StObject
  object OLE_TRISTATE {
    
    inline def Checked: `1` = 1.asInstanceOf[`1`]
    
    inline def Gray: `2` = 2.asInstanceOf[`2`]
    
    inline def Unchecked: `0` = 0.asInstanceOf[`0`]
  }
  
  type OLE_XPOS_CONTAINER = Double
  
  type OLE_XPOS_PIXELS = Double
  
  type OLE_YPOS_CONTAINER = Double
  
  type OLE_YPOS_PIXELS = Double
  
  trait StdFont extends StObject {
    
    val Bold: Boolean
    
    val Charset: Double
    
    val Italic: Boolean
    
    val Name: String
    
    val Size: Double
    
    val Strikethrough: Boolean
    
    val Underline: Boolean
    
    val Weight: Double
    
    /* private */ @JSName("stdole.StdFont_typekey")
    var stdoleDotStdFont_typekey: StdFont
  }
  object StdFont {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: StdFont] (val x: Self) extends AnyVal {
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
      
      inline def setCharset(value: Double): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
      
      inline def setStdoleDotStdFont_typekey(value: StdFont): Self = StObject.set(x, "stdole.StdFont_typekey", value.asInstanceOf[js.Any])
      
      inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "Strikethrough", value.asInstanceOf[js.Any])
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait StdPicture extends StObject {
    
    val Handle: Double
    
    val Height: Double
    
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
      prcWBounds: Unit
    ): Unit
    
    val Type: Double
    
    val Width: Double
    
    val hPal: Double
    
    /* private */ @JSName("stdole.StdPicture_typekey")
    var stdoleDotStdPicture_typekey: StdPicture
  }
  object StdPicture {
    
    inline def apply(
      Handle: Double,
      Height: Double,
      Render: (Double, Double, Double, Double, Double, Double, Double, Double, Double, Unit) => Unit,
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
    implicit open class MutableBuilder[Self <: StdPicture] (val x: Self) extends AnyVal {
      
      inline def setHPal(value: Double): Self = StObject.set(x, "hPal", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: Double): Self = StObject.set(x, "Handle", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
      
      inline def setRender(value: (Double, Double, Double, Double, Double, Double, Double, Double, Double, Unit) => Unit): Self = StObject.set(x, "Render", js.Any.fromFunction10(value))
      
      inline def setStdoleDotStdPicture_typekey(value: StdPicture): Self = StObject.set(x, "stdole.StdPicture_typekey", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    }
  }
}
