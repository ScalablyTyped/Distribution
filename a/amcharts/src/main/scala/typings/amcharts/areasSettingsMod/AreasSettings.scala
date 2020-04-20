package typings.amcharts.areasSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreasSettings extends js.Object {
  /**
    * Opacity of areas.
    * @default 1
    */
  var alpha: Double
  /**
    * Specifies if the areas should be zoomed-in when user clicks on them, event if zoom properties are not set.
    */
  var autoZoom: Boolean
  /**
    * Text which is displayed in a roll-over balloon. You can use the following tags:
    * [[title]], [[description]], [[value]] and [[percent]] [[title]]
    */
  var balloonText: String
  /**
    * Color of the areas.
    * @default "#FFCC00"
    */
  var color: String
  /**
    * Color of area with highest value.
    * Colors for areas with values less then highest will be colored with intermediate colors
    * between color and colorSolid.
    * Use colorSteps property of AmMap to change the number of intermediate colors.
    * @default "#990000"
    */
  var colorSolid: String
  /**
    * Height of a description window.
    */
  var descriptionWindowHeight: Double
  /**
    * Width of a description window.
    * @default 250
    */
  var descriptionWindowWidth: Double
  /**
    * X position of a description window.
    */
  var descriptionWindowX: Double
  /**
    * Y position of a description window.
    */
  var descriptionWindowY: Double
  /**
    * Opacity of area's outline.
    * @default 1
    */
  var outlineAlpha: Double
  /**
    * Color of area's outline. #FFFFFF
    */
  var outlineColor: String
  /**
    * Thickness of area's outline. 0.5
    */
  var outlineThickness: Double
  /**
    * Color of area when user rolls-over it. undefined
    */
  var rollOverColor: String
  /**
    * Color of area's outline when user rolls-over it. #CC0000
    */
  var rollOverOutlineColor: String
  /**
    * Color of area which is currently selected. #CC0000
    */
  var selectedColor: String
  /**
    * Opacity of all areas which are in the map svg file, but not listed as areas in DataSet.
    * @default 1
    */
  var unlistedAreasAlpha: Double
  /**
    * Color of all areas which are in the map svg file, but not listed as areas in DataSet. #DDDDDD
    */
  var unlistedAreasColor: String
  /**
    * Opacity of all areas' outline which are in the map svg file, but not listed as areas in DataSet.
    * @default 1
    */
  var unlistedAreasOutlineAlpha: Double
  /**
    * Color of all areas' outline which are in the map svg file, but not listed as areas in DataSet. #FFFFFF
    */
  var unlistedAreasOutlineColor: String
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
}

