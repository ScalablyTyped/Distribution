package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`16`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`32`
import typings.activexLibreoffice.activexLibreofficeInts.`64`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object status {
  
  /**
    * contains a list of format IDs and names which are part of the system clipboard.
    * @since OOo 2.0
    */
  trait ClipboardFormats extends StObject {
    
    /** specifies a sequence of format IDs which are contained in the system clipboard. */
    var Identifiers: SafeArray[Double]
    
    /** specifies a sequence of format names which are contained in the system clipboard. */
    var Names: SafeArray[String]
  }
  object ClipboardFormats {
    
    inline def apply(Identifiers: SafeArray[Double], Names: SafeArray[String]): ClipboardFormats = {
      val __obj = js.Dynamic.literal(Identifiers = Identifiers.asInstanceOf[js.Any], Names = Names.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipboardFormats]
    }
    
    extension [Self <: ClipboardFormats](x: Self) {
      
      inline def setIdentifiers(value: SafeArray[Double]): Self = StObject.set(x, "Identifiers", value.asInstanceOf[js.Any])
      
      inline def setNames(value: SafeArray[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * describes the characteristics of a font.
    *
    * For example, this can be used to select a font.
    * @since OOo 2.0
    */
  trait FontHeight extends StObject {
    
    /** specifies the width of the font in the measure of the destination. */
    var Diff: Double
    
    /** specifies the current height of the font. */
    var Height: Double
    
    /** specifies the height of the font in the measure of the destination. */
    var Prop: Double
  }
  object FontHeight {
    
    inline def apply(Diff: Double, Height: Double, Prop: Double): FontHeight = {
      val __obj = js.Dynamic.literal(Diff = Diff.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Prop = Prop.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontHeight]
    }
    
    extension [Self <: FontHeight](x: Self) {
      
      inline def setDiff(value: Double): Self = StObject.set(x, "Diff", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
      
      inline def setProp(value: Double): Self = StObject.set(x, "Prop", value.asInstanceOf[js.Any])
    }
  }
  
  object ItemState {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeInts.`32`
      - typings.activexLibreoffice.activexLibreofficeInts.`1`
      - typings.activexLibreoffice.activexLibreofficeInts.`16`
      - typings.activexLibreoffice.activexLibreofficeInts.`2`
      - typings.activexLibreoffice.activexLibreofficeInts.`64`
      - typings.activexLibreoffice.activexLibreofficeInts.`0`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def DEFAULT_VALUE: `32` = 32.asInstanceOf[`32`]
      
      inline def DISABLED: `1` = 1.asInstanceOf[`1`]
      
      inline def DONT_CARE: `16` = 16.asInstanceOf[`16`]
      
      inline def READ_ONLY: `2` = 2.asInstanceOf[`2`]
      
      inline def SET: `64` = 64.asInstanceOf[`64`]
      
      inline def UNKNOWN: `0` = 0.asInstanceOf[`0`]
    }
  }
  
  /**
    * describes a state of a property.
    * @since OOo 2.0
    */
  trait ItemStatus extends StObject {
    
    /**
      * numerical value which describes the current state of an item.
      * @see ItemState
      */
    var State: Double
    
    /** optional data which can be used by an implementation to send additional information. The content is dependent on the specific implementation. */
    var aStateData: Any
  }
  object ItemStatus {
    
    inline def apply(State: Double, aStateData: Any): ItemStatus = {
      val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], aStateData = aStateData.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemStatus]
    }
    
    extension [Self <: ItemStatus](x: Self) {
      
      inline def setAStateData(value: Any): Self = StObject.set(x, "aStateData", value.asInstanceOf[js.Any])
      
      inline def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies a left and right margin.
    * @since OOo 2.0
    */
  trait LeftRightMargin extends StObject {
    
    /** specifies a left side margin in 1/100th mm. */
    var Left: Double
    
    /** specifies a right side margin in 1/100th mm. */
    var Right: Double
  }
  object LeftRightMargin {
    
    inline def apply(Left: Double, Right: Double): LeftRightMargin = {
      val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeftRightMargin]
    }
    
    extension [Self <: LeftRightMargin](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies a left and right margin.
    * @since LibreOffice 5.3
    */
  trait LeftRightMarginScale extends StObject {
    
    /** specifies if the automatic calculation of the first line indent occurs. */
    var AutoFirstLine: Boolean
    
    /** specifies a first line indent relative to TextLeft in 1/100th mm. */
    var FirstLine: Double
    
    /** specifies a left margin in 1/100th mm. */
    var Left: Double
    
    /** specifies a right margin in 1/100th mm. */
    var Right: Double
    
    /** specifies a scale value for the first line margin in percent. */
    var ScaleFirstLine: Double
    
    /** specifies a scale value for the left margin in percent. */
    var ScaleLeft: Double
    
    /** specifies a scale value for the right margin in percent. */
    var ScaleRight: Double
    
    /** specifies a left text margin in 1/100th mm. */
    var TextLeft: Double
  }
  object LeftRightMarginScale {
    
    inline def apply(
      AutoFirstLine: Boolean,
      FirstLine: Double,
      Left: Double,
      Right: Double,
      ScaleFirstLine: Double,
      ScaleLeft: Double,
      ScaleRight: Double,
      TextLeft: Double
    ): LeftRightMarginScale = {
      val __obj = js.Dynamic.literal(AutoFirstLine = AutoFirstLine.asInstanceOf[js.Any], FirstLine = FirstLine.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], ScaleFirstLine = ScaleFirstLine.asInstanceOf[js.Any], ScaleLeft = ScaleLeft.asInstanceOf[js.Any], ScaleRight = ScaleRight.asInstanceOf[js.Any], TextLeft = TextLeft.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeftRightMarginScale]
    }
    
    extension [Self <: LeftRightMarginScale](x: Self) {
      
      inline def setAutoFirstLine(value: Boolean): Self = StObject.set(x, "AutoFirstLine", value.asInstanceOf[js.Any])
      
      inline def setFirstLine(value: Double): Self = StObject.set(x, "FirstLine", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
      
      inline def setScaleFirstLine(value: Double): Self = StObject.set(x, "ScaleFirstLine", value.asInstanceOf[js.Any])
      
      inline def setScaleLeft(value: Double): Self = StObject.set(x, "ScaleLeft", value.asInstanceOf[js.Any])
      
      inline def setScaleRight(value: Double): Self = StObject.set(x, "ScaleRight", value.asInstanceOf[js.Any])
      
      inline def setTextLeft(value: Double): Self = StObject.set(x, "TextLeft", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * contains an association between a style name and a value.
    * @since OOo 2.0
    */
  trait Template extends StObject {
    
    /** specifies a style name. */
    var StyleName: String
    
    /** specifies a value that is bound to the style name. */
    var Value: Double
  }
  object Template {
    
    inline def apply(StyleName: String, Value: Double): Template = {
      val __obj = js.Dynamic.literal(StyleName = StyleName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Template]
    }
    
    extension [Self <: Template](x: Self) {
      
      inline def setStyleName(value: String): Self = StObject.set(x, "StyleName", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies an upper and lower margin.
    * @since OOo 2.0
    */
  trait UpperLowerMargin extends StObject {
    
    /** specifies a lower margin in 1/100th mm. */
    var Lower: Double
    
    /** specifies a upper margin in 1/100th mm. */
    var Upper: Double
  }
  object UpperLowerMargin {
    
    inline def apply(Lower: Double, Upper: Double): UpperLowerMargin = {
      val __obj = js.Dynamic.literal(Lower = Lower.asInstanceOf[js.Any], Upper = Upper.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpperLowerMargin]
    }
    
    extension [Self <: UpperLowerMargin](x: Self) {
      
      inline def setLower(value: Double): Self = StObject.set(x, "Lower", value.asInstanceOf[js.Any])
      
      inline def setUpper(value: Double): Self = StObject.set(x, "Upper", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies an upper and lower margin.
    * @since OOo 2.0
    */
  trait UpperLowerMarginScale extends StObject {
    
    /** specifies a lower margin in 1/100th mm. */
    var Lower: Double
    
    /** specifies a scale value for the lower margin. */
    var ScaleLower: Double
    
    /** specifies a scale value for the upper margin. */
    var ScaleUpper: Double
    
    /** specifies a upper margin in 1/100th mm. */
    var Upper: Double
  }
  object UpperLowerMarginScale {
    
    inline def apply(Lower: Double, ScaleLower: Double, ScaleUpper: Double, Upper: Double): UpperLowerMarginScale = {
      val __obj = js.Dynamic.literal(Lower = Lower.asInstanceOf[js.Any], ScaleLower = ScaleLower.asInstanceOf[js.Any], ScaleUpper = ScaleUpper.asInstanceOf[js.Any], Upper = Upper.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpperLowerMarginScale]
    }
    
    extension [Self <: UpperLowerMarginScale](x: Self) {
      
      inline def setLower(value: Double): Self = StObject.set(x, "Lower", value.asInstanceOf[js.Any])
      
      inline def setScaleLower(value: Double): Self = StObject.set(x, "ScaleLower", value.asInstanceOf[js.Any])
      
      inline def setScaleUpper(value: Double): Self = StObject.set(x, "ScaleUpper", value.asInstanceOf[js.Any])
      
      inline def setUpper(value: Double): Self = StObject.set(x, "Upper", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * describes a command that can be send to an OLE object
    *
    * For example, this can be used to select a font.
    * @since OOo 2.0
    */
  trait Verb extends StObject {
    
    /** specifies the Id of the command. */
    var VerbId: Double
    
    /** specifies if the command is available for a constant object. */
    var VerbIsConst: Boolean
    
    /** specifies if the command should be visible in a menu. */
    var VerbIsOnMenu: Boolean
    
    /** specifies the name of the command. The name is localized. */
    var VerbName: String
  }
  object Verb {
    
    inline def apply(VerbId: Double, VerbIsConst: Boolean, VerbIsOnMenu: Boolean, VerbName: String): Verb = {
      val __obj = js.Dynamic.literal(VerbId = VerbId.asInstanceOf[js.Any], VerbIsConst = VerbIsConst.asInstanceOf[js.Any], VerbIsOnMenu = VerbIsOnMenu.asInstanceOf[js.Any], VerbName = VerbName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Verb]
    }
    
    extension [Self <: Verb](x: Self) {
      
      inline def setVerbId(value: Double): Self = StObject.set(x, "VerbId", value.asInstanceOf[js.Any])
      
      inline def setVerbIsConst(value: Boolean): Self = StObject.set(x, "VerbIsConst", value.asInstanceOf[js.Any])
      
      inline def setVerbIsOnMenu(value: Boolean): Self = StObject.set(x, "VerbIsOnMenu", value.asInstanceOf[js.Any])
      
      inline def setVerbName(value: String): Self = StObject.set(x, "VerbName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * describes the visibility state of a property.
    * @since OOo 2.0
    */
  trait Visibility extends StObject {
    
    /** `TRUE` if the property is visible otherwise `FALSE` . */
    var bVisible: Boolean
  }
  object Visibility {
    
    inline def apply(bVisible: Boolean): Visibility = {
      val __obj = js.Dynamic.literal(bVisible = bVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Visibility]
    }
    
    extension [Self <: Visibility](x: Self) {
      
      inline def setBVisible(value: Boolean): Self = StObject.set(x, "bVisible", value.asInstanceOf[js.Any])
    }
  }
}
