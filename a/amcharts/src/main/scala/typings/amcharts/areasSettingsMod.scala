package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areasSettingsMod {
  
  @JSImport("amcharts/AreasSettings", JSImport.Default)
  @js.native
  class default () extends AreasSettings
  
  @js.native
  trait AreasSettings extends StObject {
    
    /**
      * Opacity of areas.
      * @default 1
      */
    var alpha: Double = js.native
    
    /**
      * Specifies if the areas should be zoomed-in when user clicks on them, event if zoom properties are not set.
      */
    var autoZoom: Boolean = js.native
    
    /**
      * Text which is displayed in a roll-over balloon. You can use the following tags:
      * [[title]], [[description]], [[value]] and [[percent]] [[title]]
      */
    var balloonText: String = js.native
    
    /**
      * Color of the areas.
      * @default "#FFCC00"
      */
    var color: String = js.native
    
    /**
      * Color of area with highest value.
      * Colors for areas with values less then highest will be colored with intermediate colors
      * between color and colorSolid.
      * Use colorSteps property of AmMap to change the number of intermediate colors.
      * @default "#990000"
      */
    var colorSolid: String = js.native
    
    /**
      * Height of a description window.
      */
    var descriptionWindowHeight: Double = js.native
    
    /**
      * Width of a description window.
      * @default 250
      */
    var descriptionWindowWidth: Double = js.native
    
    /**
      * X position of a description window.
      */
    var descriptionWindowX: Double = js.native
    
    /**
      * Y position of a description window.
      */
    var descriptionWindowY: Double = js.native
    
    /**
      * Opacity of area's outline.
      * @default 1
      */
    var outlineAlpha: Double = js.native
    
    /**
      * Color of area's outline. #FFFFFF
      */
    var outlineColor: String = js.native
    
    /**
      * Thickness of area's outline. 0.5
      */
    var outlineThickness: Double = js.native
    
    /**
      * Color of area when user rolls-over it. undefined
      */
    var rollOverColor: String = js.native
    
    /**
      * Color of area's outline when user rolls-over it. #CC0000
      */
    var rollOverOutlineColor: String = js.native
    
    /**
      * Color of area which is currently selected. #CC0000
      */
    var selectedColor: String = js.native
    
    /**
      * Opacity of all areas which are in the map svg file, but not listed as areas in DataSet.
      * @default 1
      */
    var unlistedAreasAlpha: Double = js.native
    
    /**
      * Color of all areas which are in the map svg file, but not listed as areas in DataSet. #DDDDDD
      */
    var unlistedAreasColor: String = js.native
    
    /**
      * Opacity of all areas' outline which are in the map svg file, but not listed as areas in DataSet.
      * @default 1
      */
    var unlistedAreasOutlineAlpha: Double = js.native
    
    /**
      * Color of all areas' outline which are in the map svg file, but not listed as areas in DataSet. #FFFFFF
      */
    var unlistedAreasOutlineColor: String = js.native
  }
  object AreasSettings {
    
    @scala.inline
    def apply(
      alpha: Double,
      autoZoom: Boolean,
      balloonText: String,
      color: String,
      colorSolid: String,
      descriptionWindowHeight: Double,
      descriptionWindowWidth: Double,
      descriptionWindowX: Double,
      descriptionWindowY: Double,
      outlineAlpha: Double,
      outlineColor: String,
      outlineThickness: Double,
      rollOverColor: String,
      rollOverOutlineColor: String,
      selectedColor: String,
      unlistedAreasAlpha: Double,
      unlistedAreasColor: String,
      unlistedAreasOutlineAlpha: Double,
      unlistedAreasOutlineColor: String
    ): AreasSettings = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], autoZoom = autoZoom.asInstanceOf[js.Any], balloonText = balloonText.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorSolid = colorSolid.asInstanceOf[js.Any], descriptionWindowHeight = descriptionWindowHeight.asInstanceOf[js.Any], descriptionWindowWidth = descriptionWindowWidth.asInstanceOf[js.Any], descriptionWindowX = descriptionWindowX.asInstanceOf[js.Any], descriptionWindowY = descriptionWindowY.asInstanceOf[js.Any], outlineAlpha = outlineAlpha.asInstanceOf[js.Any], outlineColor = outlineColor.asInstanceOf[js.Any], outlineThickness = outlineThickness.asInstanceOf[js.Any], rollOverColor = rollOverColor.asInstanceOf[js.Any], rollOverOutlineColor = rollOverOutlineColor.asInstanceOf[js.Any], selectedColor = selectedColor.asInstanceOf[js.Any], unlistedAreasAlpha = unlistedAreasAlpha.asInstanceOf[js.Any], unlistedAreasColor = unlistedAreasColor.asInstanceOf[js.Any], unlistedAreasOutlineAlpha = unlistedAreasOutlineAlpha.asInstanceOf[js.Any], unlistedAreasOutlineColor = unlistedAreasOutlineColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[AreasSettings]
    }
    
    @scala.inline
    implicit class AreasSettingsMutableBuilder[Self <: AreasSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoZoom(value: Boolean): Self = StObject.set(x, "autoZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalloonText(value: String): Self = StObject.set(x, "balloonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSolid(value: String): Self = StObject.set(x, "colorSolid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionWindowHeight(value: Double): Self = StObject.set(x, "descriptionWindowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionWindowWidth(value: Double): Self = StObject.set(x, "descriptionWindowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionWindowX(value: Double): Self = StObject.set(x, "descriptionWindowX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionWindowY(value: Double): Self = StObject.set(x, "descriptionWindowY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineAlpha(value: Double): Self = StObject.set(x, "outlineAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineThickness(value: Double): Self = StObject.set(x, "outlineThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRollOverColor(value: String): Self = StObject.set(x, "rollOverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRollOverOutlineColor(value: String): Self = StObject.set(x, "rollOverOutlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnlistedAreasAlpha(value: Double): Self = StObject.set(x, "unlistedAreasAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnlistedAreasColor(value: String): Self = StObject.set(x, "unlistedAreasColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnlistedAreasOutlineAlpha(value: Double): Self = StObject.set(x, "unlistedAreasOutlineAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnlistedAreasOutlineColor(value: String): Self = StObject.set(x, "unlistedAreasOutlineColor", value.asInstanceOf[js.Any])
    }
  }
}
