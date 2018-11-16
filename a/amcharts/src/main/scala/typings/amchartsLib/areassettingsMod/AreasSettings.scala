package typings
package amchartsLib.areassettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AreasSettings extends js.Object {
  /**
       * Opacity of areas.
       * @default 1
       */
  var alpha: scala.Double
  /**
       * Specifies if the areas should be zoomed-in when user clicks on them, event if zoom properties are not set.
       */
  var autoZoom: scala.Boolean
  /**
       * Text which is displayed in a roll-over balloon. You can use the following tags:
       * [[title]], [[description]], [[value]] and [[percent]] [[title]]
       */
  var balloonText: java.lang.String
  /**
       * Color of the areas.
       * @default "#FFCC00"
       */
  var color: java.lang.String
  /**
       * Color of area with highest value.
       * Colors for areas with values less then highest will be colored with intermediate colors
       * between color and colorSolid.
       * Use colorSteps property of AmMap to change the number of intermediate colors.
       * @default "#990000"
       */
  var colorSolid: java.lang.String
  /**
       * Height of a description window.
       */
  var descriptionWindowHeight: scala.Double
  /**
       * Width of a description window.
       * @default 250
       */
  var descriptionWindowWidth: scala.Double
  /**
       * X position of a description window.
       */
  var descriptionWindowX: scala.Double
  /**
       * Y position of a description window.
       */
  var descriptionWindowY: scala.Double
  /**
       * Opacity of area's outline.
       * @default 1
       */
  var outlineAlpha: scala.Double
  /**
       * Color of area's outline. #FFFFFF
       */
  var outlineColor: java.lang.String
  /**
       * Thickness of area's outline. 0.5
       */
  var outlineThickness: scala.Double
  /**
       * Color of area when user rolls-over it. undefined
       */
  var rollOverColor: java.lang.String
  /**
       * Color of area's outline when user rolls-over it. #CC0000
       */
  var rollOverOutlineColor: java.lang.String
  /**
       * Color of area which is currently selected. #CC0000
       */
  var selectedColor: java.lang.String
  /**
       * Opacity of all areas which are in the map svg file, but not listed as areas in DataSet.
       * @default 1
       */
  var unlistedAreasAlpha: scala.Double
  /**
       * Color of all areas which are in the map svg file, but not listed as areas in DataSet. #DDDDDD
       */
  var unlistedAreasColor: java.lang.String
  /**
       * Opacity of all areas' outline which are in the map svg file, but not listed as areas in DataSet.
       * @default 1
       */
  var unlistedAreasOutlineAlpha: scala.Double
  /**
       * Color of all areas' outline which are in the map svg file, but not listed as areas in DataSet. #FFFFFF
       */
  var unlistedAreasOutlineColor: java.lang.String
}

