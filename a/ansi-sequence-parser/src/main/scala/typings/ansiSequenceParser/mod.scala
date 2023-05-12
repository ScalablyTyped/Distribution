package typings.ansiSequenceParser

import typings.ansiSequenceParser.anon.Parse
import typings.ansiSequenceParser.anon.Value
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersign000000
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersign0000bb
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersign00bb00
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersign00bbbb
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersign00ff00
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersign555555
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersign5555ff
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersign55ffff
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersignbb0000
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersignbbbb00
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersigneeeeee
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersignff00ff
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersignff5555
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersignff55ff
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersignffff55
import typings.ansiSequenceParser.ansiSequenceParserStrings.Numbersignffffff
import typings.ansiSequenceParser.ansiSequenceParserStrings.black
import typings.ansiSequenceParser.ansiSequenceParserStrings.blue
import typings.ansiSequenceParser.ansiSequenceParserStrings.bold
import typings.ansiSequenceParser.ansiSequenceParserStrings.brightBlack
import typings.ansiSequenceParser.ansiSequenceParserStrings.brightBlue
import typings.ansiSequenceParser.ansiSequenceParserStrings.brightCyan
import typings.ansiSequenceParser.ansiSequenceParserStrings.brightGreen
import typings.ansiSequenceParser.ansiSequenceParserStrings.brightMagenta
import typings.ansiSequenceParser.ansiSequenceParserStrings.brightRed
import typings.ansiSequenceParser.ansiSequenceParserStrings.brightWhite
import typings.ansiSequenceParser.ansiSequenceParserStrings.brightYellow
import typings.ansiSequenceParser.ansiSequenceParserStrings.cyan
import typings.ansiSequenceParser.ansiSequenceParserStrings.dim
import typings.ansiSequenceParser.ansiSequenceParserStrings.green
import typings.ansiSequenceParser.ansiSequenceParserStrings.italic
import typings.ansiSequenceParser.ansiSequenceParserStrings.magenta
import typings.ansiSequenceParser.ansiSequenceParserStrings.named
import typings.ansiSequenceParser.ansiSequenceParserStrings.red
import typings.ansiSequenceParser.ansiSequenceParserStrings.reverse
import typings.ansiSequenceParser.ansiSequenceParserStrings.rgb
import typings.ansiSequenceParser.ansiSequenceParserStrings.strikethrough
import typings.ansiSequenceParser.ansiSequenceParserStrings.table
import typings.ansiSequenceParser.ansiSequenceParserStrings.underline
import typings.ansiSequenceParser.ansiSequenceParserStrings.white
import typings.ansiSequenceParser.ansiSequenceParserStrings.yellow
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ansi-sequence-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAnsiSequenceParser(): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnsiSequenceParser")().asInstanceOf[Parse]
  
  inline def createColorPalette(): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("createColorPalette")().asInstanceOf[Value]
  inline def createColorPalette(namedColorsMap: Record[ColorName, String]): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("createColorPalette")(namedColorsMap.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  object decorations {
    
    @JSImport("ansi-sequence-parser", "decorations.1")
    @js.native
    val `1`: bold = js.native
    
    @JSImport("ansi-sequence-parser", "decorations.2")
    @js.native
    val `2`: dim = js.native
    
    @JSImport("ansi-sequence-parser", "decorations.3")
    @js.native
    val `3`: italic = js.native
    
    @JSImport("ansi-sequence-parser", "decorations.4")
    @js.native
    val `4`: underline = js.native
    
    @JSImport("ansi-sequence-parser", "decorations.7")
    @js.native
    val `7`: reverse = js.native
    
    @JSImport("ansi-sequence-parser", "decorations.9")
    @js.native
    val `9`: strikethrough = js.native
  }
  
  object defaultNamedColorsMap {
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.black")
    @js.native
    val black: Numbersign000000 = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.blue")
    @js.native
    val blue: Numbersign0000bb = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.brightBlack")
    @js.native
    val brightBlack: Numbersign555555 = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.brightBlue")
    @js.native
    val brightBlue: Numbersign5555ff = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.brightCyan")
    @js.native
    val brightCyan: Numbersign55ffff = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.brightGreen")
    @js.native
    val brightGreen: Numbersign00ff00 = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.brightMagenta")
    @js.native
    val brightMagenta: Numbersignff55ff = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.brightRed")
    @js.native
    val brightRed: Numbersignff5555 = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.brightWhite")
    @js.native
    val brightWhite: Numbersignffffff = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.brightYellow")
    @js.native
    val brightYellow: Numbersignffff55 = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.cyan")
    @js.native
    val cyan: Numbersign00bbbb = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.green")
    @js.native
    val green: Numbersign00bb00 = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.magenta")
    @js.native
    val magenta: Numbersignff00ff = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.red")
    @js.native
    val red: Numbersignbb0000 = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.white")
    @js.native
    val white: Numbersigneeeeee = js.native
    
    @JSImport("ansi-sequence-parser", "defaultNamedColorsMap.yellow")
    @js.native
    val yellow: Numbersignbbbb00 = js.native
  }
  
  @JSImport("ansi-sequence-parser", "namedColors")
  @js.native
  val namedColors: js.Tuple16[
    black, 
    red, 
    green, 
    yellow, 
    blue, 
    magenta, 
    cyan, 
    white, 
    brightBlack, 
    brightRed, 
    brightGreen, 
    brightYellow, 
    brightBlue, 
    brightMagenta, 
    brightCyan, 
    brightWhite
  ] = js.native
  
  inline def parseAnsiSequences(value: String): js.Array[ParseToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAnsiSequences")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParseToken]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ansiSequenceParser.mod.NamedColor
    - typings.ansiSequenceParser.mod.TableColor
    - typings.ansiSequenceParser.mod.RgbColor
  */
  trait Color extends StObject
  object Color {
    
    inline def NamedColor(name: ColorName): typings.ansiSequenceParser.mod.NamedColor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("named")
      __obj.asInstanceOf[typings.ansiSequenceParser.mod.NamedColor]
    }
    
    inline def RgbColor(rgb: js.Tuple3[Double, Double, Double]): typings.ansiSequenceParser.mod.RgbColor = {
      val __obj = js.Dynamic.literal(rgb = rgb.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("rgb")
      __obj.asInstanceOf[typings.ansiSequenceParser.mod.RgbColor]
    }
    
    inline def TableColor(index: Double): typings.ansiSequenceParser.mod.TableColor = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("table")
      __obj.asInstanceOf[typings.ansiSequenceParser.mod.TableColor]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ansiSequenceParser.ansiSequenceParserStrings.black
    - typings.ansiSequenceParser.ansiSequenceParserStrings.red
    - typings.ansiSequenceParser.ansiSequenceParserStrings.green
    - typings.ansiSequenceParser.ansiSequenceParserStrings.yellow
    - typings.ansiSequenceParser.ansiSequenceParserStrings.blue
    - typings.ansiSequenceParser.ansiSequenceParserStrings.magenta
    - typings.ansiSequenceParser.ansiSequenceParserStrings.cyan
    - typings.ansiSequenceParser.ansiSequenceParserStrings.white
    - typings.ansiSequenceParser.ansiSequenceParserStrings.brightBlack
    - typings.ansiSequenceParser.ansiSequenceParserStrings.brightRed
    - typings.ansiSequenceParser.ansiSequenceParserStrings.brightGreen
    - typings.ansiSequenceParser.ansiSequenceParserStrings.brightYellow
    - typings.ansiSequenceParser.ansiSequenceParserStrings.brightBlue
    - typings.ansiSequenceParser.ansiSequenceParserStrings.brightMagenta
    - typings.ansiSequenceParser.ansiSequenceParserStrings.brightCyan
    - typings.ansiSequenceParser.ansiSequenceParserStrings.brightWhite
  */
  trait ColorName extends StObject
  
  /* Inlined { readonly 1 :'bold',  readonly 2 :'dim',  readonly 3 :'italic',  readonly 4 :'underline',  readonly 7 :'reverse',  readonly 9 :'strikethrough'}[keyof { readonly 1 :'bold',  readonly 2 :'dim',  readonly 3 :'italic',  readonly 4 :'underline',  readonly 7 :'reverse',  readonly 9 :'strikethrough'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.ansiSequenceParser.ansiSequenceParserStrings.underline
    - typings.ansiSequenceParser.ansiSequenceParserStrings.reverse
    - typings.ansiSequenceParser.ansiSequenceParserStrings.dim
    - typings.ansiSequenceParser.ansiSequenceParserStrings.strikethrough
    - typings.ansiSequenceParser.ansiSequenceParserStrings.italic
    - typings.ansiSequenceParser.ansiSequenceParserStrings.bold
  */
  trait DecorationType extends StObject
  object DecorationType {
    
    inline def bold: typings.ansiSequenceParser.ansiSequenceParserStrings.bold = "bold".asInstanceOf[typings.ansiSequenceParser.ansiSequenceParserStrings.bold]
    
    inline def dim: typings.ansiSequenceParser.ansiSequenceParserStrings.dim = "dim".asInstanceOf[typings.ansiSequenceParser.ansiSequenceParserStrings.dim]
    
    inline def italic: typings.ansiSequenceParser.ansiSequenceParserStrings.italic = "italic".asInstanceOf[typings.ansiSequenceParser.ansiSequenceParserStrings.italic]
    
    inline def reverse: typings.ansiSequenceParser.ansiSequenceParserStrings.reverse = "reverse".asInstanceOf[typings.ansiSequenceParser.ansiSequenceParserStrings.reverse]
    
    inline def strikethrough: typings.ansiSequenceParser.ansiSequenceParserStrings.strikethrough = "strikethrough".asInstanceOf[typings.ansiSequenceParser.ansiSequenceParserStrings.strikethrough]
    
    inline def underline: typings.ansiSequenceParser.ansiSequenceParserStrings.underline = "underline".asInstanceOf[typings.ansiSequenceParser.ansiSequenceParserStrings.underline]
  }
  
  trait NamedColor
    extends StObject
       with Color {
    
    var name: ColorName
    
    var `type`: named
  }
  object NamedColor {
    
    inline def apply(name: ColorName): NamedColor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("named")
      __obj.asInstanceOf[NamedColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NamedColor] (val x: Self) extends AnyVal {
      
      inline def setName(value: ColorName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: named): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseToken extends StObject {
    
    var background: Color | Null
    
    var decorations: Set[DecorationType]
    
    var foreground: Color | Null
    
    var value: String
  }
  object ParseToken {
    
    inline def apply(decorations: Set[DecorationType], value: String): ParseToken = {
      val __obj = js.Dynamic.literal(decorations = decorations.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], background = null, foreground = null)
      __obj.asInstanceOf[ParseToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseToken] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundNull: Self = StObject.set(x, "background", null)
      
      inline def setDecorations(value: Set[DecorationType]): Self = StObject.set(x, "decorations", value.asInstanceOf[js.Any])
      
      inline def setForeground(value: Color): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setForegroundNull: Self = StObject.set(x, "foreground", null)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RgbColor
    extends StObject
       with Color {
    
    var rgb: js.Tuple3[Double, Double, Double]
    
    var `type`: rgb
  }
  object RgbColor {
    
    inline def apply(rgb: js.Tuple3[Double, Double, Double]): RgbColor = {
      val __obj = js.Dynamic.literal(rgb = rgb.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("rgb")
      __obj.asInstanceOf[RgbColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RgbColor] (val x: Self) extends AnyVal {
      
      inline def setRgb(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
      
      inline def setType(value: rgb): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableColor
    extends StObject
       with Color {
    
    var index: Double
    
    var `type`: table
  }
  object TableColor {
    
    inline def apply(index: Double): TableColor = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("table")
      __obj.asInstanceOf[TableColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableColor] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setType(value: table): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
