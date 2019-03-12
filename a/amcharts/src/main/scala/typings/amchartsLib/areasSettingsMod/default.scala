package typings
package amchartsLib.areasSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/AreasSettings", JSImport.Default)
@js.native
class default () extends AreasSettings {
  /**
    * Opacity of areas.
    * @default 1
    */
  /* CompleteClass */
  override var alpha: scala.Double = js.native
  /**
    * Specifies if the areas should be zoomed-in when user clicks on them, event if zoom properties are not set.
    */
  /* CompleteClass */
  override var autoZoom: scala.Boolean = js.native
  /**
    * Text which is displayed in a roll-over balloon. You can use the following tags:
    * [[title]], [[description]], [[value]] and [[percent]] [[title]]
    */
  /* CompleteClass */
  override var balloonText: java.lang.String = js.native
  /**
    * Color of the areas.
    * @default "#FFCC00"
    */
  /* CompleteClass */
  override var color: java.lang.String = js.native
  /**
    * Color of area with highest value.
    * Colors for areas with values less then highest will be colored with intermediate colors
    * between color and colorSolid.
    * Use colorSteps property of AmMap to change the number of intermediate colors.
    * @default "#990000"
    */
  /* CompleteClass */
  override var colorSolid: java.lang.String = js.native
  /**
    * Height of a description window.
    */
  /* CompleteClass */
  override var descriptionWindowHeight: scala.Double = js.native
  /**
    * Width of a description window.
    * @default 250
    */
  /* CompleteClass */
  override var descriptionWindowWidth: scala.Double = js.native
  /**
    * X position of a description window.
    */
  /* CompleteClass */
  override var descriptionWindowX: scala.Double = js.native
  /**
    * Y position of a description window.
    */
  /* CompleteClass */
  override var descriptionWindowY: scala.Double = js.native
  /**
    * Opacity of area's outline.
    * @default 1
    */
  /* CompleteClass */
  override var outlineAlpha: scala.Double = js.native
  /**
    * Color of area's outline. #FFFFFF
    */
  /* CompleteClass */
  override var outlineColor: java.lang.String = js.native
  /**
    * Thickness of area's outline. 0.5
    */
  /* CompleteClass */
  override var outlineThickness: scala.Double = js.native
  /**
    * Color of area when user rolls-over it. undefined
    */
  /* CompleteClass */
  override var rollOverColor: java.lang.String = js.native
  /**
    * Color of area's outline when user rolls-over it. #CC0000
    */
  /* CompleteClass */
  override var rollOverOutlineColor: java.lang.String = js.native
  /**
    * Color of area which is currently selected. #CC0000
    */
  /* CompleteClass */
  override var selectedColor: java.lang.String = js.native
  /**
    * Opacity of all areas which are in the map svg file, but not listed as areas in DataSet.
    * @default 1
    */
  /* CompleteClass */
  override var unlistedAreasAlpha: scala.Double = js.native
  /**
    * Color of all areas which are in the map svg file, but not listed as areas in DataSet. #DDDDDD
    */
  /* CompleteClass */
  override var unlistedAreasColor: java.lang.String = js.native
  /**
    * Opacity of all areas' outline which are in the map svg file, but not listed as areas in DataSet.
    * @default 1
    */
  /* CompleteClass */
  override var unlistedAreasOutlineAlpha: scala.Double = js.native
  /**
    * Color of all areas' outline which are in the map svg file, but not listed as areas in DataSet. #FFFFFF
    */
  /* CompleteClass */
  override var unlistedAreasOutlineColor: java.lang.String = js.native
}

