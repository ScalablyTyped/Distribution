package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service describes a {@link MeasureShape} . */
trait MeasureProperties extends js.Object {
  /** If this property is `TRUE` , the measure is drawn below the reference edge instead of above it. */
  var MeasureBelowReferenceEdge: Boolean
  /**
    * This value is the number of decimal places that is used to format the measure value.
    * @since OOo 1.1.2
    */
  var MeasureDecimalPlaces: Double
  /** This is the length of the first help line. */
  var MeasureHelpLine1Length: Double
  /** This is the length of the second help line. */
  var MeasureHelpLine2Length: Double
  /** This is the distance from the measure line to the start of the help lines. */
  var MeasureHelpLineDistance: Double
  /** This is the overhang of the two help lines. */
  var MeasureHelpLineOverhang: Double
  /** This enumeration specifies the MeasureKind. */
  var MeasureKind: typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.MeasureKind
  /** This is the distance from the reference edge to the measure line. */
  var MeasureLineDistance: Double
  /** This is the overhang of the reference line over the help lines. */
  var MeasureOverhang: Double
  /** If this is `TRUE` , the unit of measure is shown in the measure text. */
  var MeasureShowUnit: Boolean
  /** If this is `TRUE` , the angle of the measure is set automatically. */
  var MeasureTextAutoAngle: Boolean
  /** This is the automatic angle. */
  var MeasureTextAutoAngleView: Double
  /** This is the fixed angle. */
  var MeasureTextFixedAngle: Double
  /** This is the horizontal position of the measure text. */
  var MeasureTextHorizontalPosition: MeasureTextHorzPos
  /** If this value is `TRUE` , the measure has a fixed angle. */
  var MeasureTextIsFixedAngle: Boolean
  /** If this value is `TRUE` , the text is rotated 90 degrees. */
  var MeasureTextRotate90: Boolean
  /** If this value is `TRUE` , the text is printed upside down. */
  var MeasureTextUpsideDown: Boolean
  /** This is the vertical position of the text. */
  var MeasureTextVerticalPosition: MeasureTextVertPos
}

object MeasureProperties {
  @scala.inline
  def apply(
    MeasureBelowReferenceEdge: Boolean,
    MeasureDecimalPlaces: Double,
    MeasureHelpLine1Length: Double,
    MeasureHelpLine2Length: Double,
    MeasureHelpLineDistance: Double,
    MeasureHelpLineOverhang: Double,
    MeasureKind: MeasureKind,
    MeasureLineDistance: Double,
    MeasureOverhang: Double,
    MeasureShowUnit: Boolean,
    MeasureTextAutoAngle: Boolean,
    MeasureTextAutoAngleView: Double,
    MeasureTextFixedAngle: Double,
    MeasureTextHorizontalPosition: MeasureTextHorzPos,
    MeasureTextIsFixedAngle: Boolean,
    MeasureTextRotate90: Boolean,
    MeasureTextUpsideDown: Boolean,
    MeasureTextVerticalPosition: MeasureTextVertPos
  ): MeasureProperties = {
    val __obj = js.Dynamic.literal(MeasureBelowReferenceEdge = MeasureBelowReferenceEdge, MeasureDecimalPlaces = MeasureDecimalPlaces, MeasureHelpLine1Length = MeasureHelpLine1Length, MeasureHelpLine2Length = MeasureHelpLine2Length, MeasureHelpLineDistance = MeasureHelpLineDistance, MeasureHelpLineOverhang = MeasureHelpLineOverhang, MeasureKind = MeasureKind, MeasureLineDistance = MeasureLineDistance, MeasureOverhang = MeasureOverhang, MeasureShowUnit = MeasureShowUnit, MeasureTextAutoAngle = MeasureTextAutoAngle, MeasureTextAutoAngleView = MeasureTextAutoAngleView, MeasureTextFixedAngle = MeasureTextFixedAngle, MeasureTextHorizontalPosition = MeasureTextHorizontalPosition, MeasureTextIsFixedAngle = MeasureTextIsFixedAngle, MeasureTextRotate90 = MeasureTextRotate90, MeasureTextUpsideDown = MeasureTextUpsideDown, MeasureTextVerticalPosition = MeasureTextVerticalPosition)
  
    __obj.asInstanceOf[MeasureProperties]
  }
}

