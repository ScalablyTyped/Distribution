package typings.accessibility

import typings.accessibility.mod.SizeOrPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Buttons extends StObject {
    
    /** @default true */
    var buttons: js.UndefOr[Boolean] = js.undefined
  }
  object Buttons {
    
    inline def apply(): Buttons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Buttons]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Buttons] (val x: Self) extends AnyVal {
      
      inline def setButtons(value: Boolean): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    }
  }
  
  trait CBackground extends StObject {
    
    /** @default '#000000' */
    var cBackground: js.UndefOr[String] = js.undefined
    
    /** @default '#20ff69' */
    var cBorder: js.UndefOr[String] = js.undefined
    
    /** @default '12px' */
    var height: js.UndefOr[String] = js.undefined
  }
  object CBackground {
    
    inline def apply(): CBackground = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CBackground]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CBackground] (val x: Self) extends AnyVal {
      
      inline def setCBackground(value: String): Self = StObject.set(x, "cBackground", value.asInstanceOf[js.Any])
      
      inline def setCBackgroundUndefined: Self = StObject.set(x, "cBackground", js.undefined)
      
      inline def setCBorder(value: String): Self = StObject.set(x, "cBorder", value.asInstanceOf[js.Any])
      
      inline def setCBorderUndefined: Self = StObject.set(x, "cBorder", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    }
  }
  
  trait Dimensions extends StObject {
    
    var dimensions: js.UndefOr[typings.accessibility.mod.Dimensions] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
  }
  object Dimensions {
    
    inline def apply(): Dimensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dimensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
      
      inline def setDimensions(value: typings.accessibility.mod.Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    }
  }
  
  trait Font extends StObject {
    
    var font: SizeOrPosition
  }
  object Font {
    
    inline def apply(font: SizeOrPosition): Font = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
      __obj.asInstanceOf[Font]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
      
      inline def setFont(value: SizeOrPosition): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    }
  }
  
  trait Persistent extends StObject {
    
    /** @default true */
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object Persistent {
    
    inline def apply(): Persistent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Persistent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Persistent] (val x: Self) extends AnyVal {
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
}
