package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service describes a {@link MeasureShape} . */
trait MeasureProperties extends js.Object {
  /** If this property is `TRUE` , the measure is drawn below the reference edge instead of above it. */
  var MeasureBelowReferenceEdge: scala.Boolean
  /**
    * This value is the number of decimal places that is used to format the measure value.
    * @since OOo 1.1.2
    */
  var MeasureDecimalPlaces: scala.Double
  /** This is the length of the first help line. */
  var MeasureHelpLine1Length: scala.Double
  /** This is the length of the second help line. */
  var MeasureHelpLine2Length: scala.Double
  /** This is the distance from the measure line to the start of the help lines. */
  var MeasureHelpLineDistance: scala.Double
  /** This is the overhang of the two help lines. */
  var MeasureHelpLineOverhang: scala.Double
  /** This enumeration specifies the MeasureKind. */
  var MeasureKind: MeasureKind
  /** This is the distance from the reference edge to the measure line. */
  var MeasureLineDistance: scala.Double
  /** This is the overhang of the reference line over the help lines. */
  var MeasureOverhang: scala.Double
  /** If this is `TRUE` , the unit of measure is shown in the measure text. */
  var MeasureShowUnit: scala.Boolean
  /** If this is `TRUE` , the angle of the measure is set automatically. */
  var MeasureTextAutoAngle: scala.Boolean
  /** This is the automatic angle. */
  var MeasureTextAutoAngleView: scala.Double
  /** This is the fixed angle. */
  var MeasureTextFixedAngle: scala.Double
  /** This is the horizontal position of the measure text. */
  var MeasureTextHorizontalPosition: MeasureTextHorzPos
  /** If this value is `TRUE` , the measure has a fixed angle. */
  var MeasureTextIsFixedAngle: scala.Boolean
  /** If this value is `TRUE` , the text is rotated 90 degrees. */
  var MeasureTextRotate90: scala.Boolean
  /** If this value is `TRUE` , the text is printed upside down. */
  var MeasureTextUpsideDown: scala.Boolean
  /** This is the vertical position of the text. */
  var MeasureTextVerticalPosition: MeasureTextVertPos
}

