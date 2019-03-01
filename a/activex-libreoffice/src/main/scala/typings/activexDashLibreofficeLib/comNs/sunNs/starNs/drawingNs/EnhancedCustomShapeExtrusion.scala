package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
trait EnhancedCustomShapeExtrusion extends js.Object {
  /** This attribute specifies the brightness of a scene in percent. */
  var Brightness: scala.Double
  /**
    * The first value of {@link EnhancedCustomShapeParameterPair} specifies the depth of the extrusion in 1/100 mm. The second value (0.0 to 1.0) specifies
    * the fraction of the extrusion that lies before the shape, a value of 0 is default.
    */
  var Depth: EnhancedCustomShapeParameterPair
  /** This attribute specifies the amount of diffusion reflected by the shape in percent */
  var Diffusion: scala.Double
  /** This property specifies if extrusion is displayed. The default for this property is "false" */
  var Extrusion: scala.Boolean
  /** This attribute specifies if the "SecondFillColor" is used as extrusion color */
  var ExtrusionColor: scala.Boolean
  /** Specifies the direction of the first light. */
  var FirstLightDirection: Direction3D
  /** Specifies if the primary light is harsh. */
  var FirstLightHarsh: scala.Boolean
  /** Specifies the intensity for the first light in percent. */
  var FirstLightLevel: scala.Double
  /** Specifies if the front face of the extrusion responds to lightning changes. */
  var LightFace: scala.Boolean
  /** Specifies if the surface of the extrusion object looks like metal. */
  var Metal: scala.Boolean
  /** Specifies the number of line segments that should be used to display curved surfaces. The higher the number the more line segments are used. */
  var NumberOfLineSegments: scala.Double
  /** This attribute specifies the origin within the bounding box of the shape in terms of the shape size fractions. */
  var Origin: EnhancedCustomShapeParameterPair
  /** This property defines the projection mode. */
  var ProjectionMode: ProjectionMode
  /**
    * This attributes specifies the rotation angle about the x-axis in grad. The order of rotation is: z-axis, y-axis and then x-axis. The z-axis is
    * specified by the draw:rotate-angle.
    */
  var RotateAngle: EnhancedCustomShapeParameterPair
  /**
    * This attribute specifies the position of the rotate center in terms of shape size fractions, if the property is omitted, then the geometrical center
    * of the shape is used (this is the default).
    */
  var RotationCenter: Direction3D
  /** Specifies the direction of the second light. */
  var SecondLightDirection: Direction3D
  /** Specifies if the secondary light is harsh. */
  var SecondLightHarsh: scala.Boolean
  /** Specifies the intensity for the second light in percent. */
  var SecondLightLevel: scala.Double
  /** This property defines the shade mode. */
  var ShadeMode: ShadeMode
  /** The draw:extrusion-shininess specifies the shininess of a mirror in percent. */
  var Shininess: scala.Double
  /**
    * The first value of the draw:extrusion-skew attribute specifies the skew amount of an extrusion in percent. The second parameter specifies the
    * skew-angle. Skew settings are only applied if the attribute ProjectionMode is ProjectionMode_PARALLEL.
    */
  var Skew: EnhancedCustomShapeParameterPair
  /** This attribute specifies the specularity of an extrusion object in percent. */
  var Specularity: scala.Double
  /** This attribute specifies the viewpoint of the observer. */
  var ViewPoint: Position3D
}

object EnhancedCustomShapeExtrusion {
  @scala.inline
  def apply(
    Brightness: scala.Double,
    Depth: EnhancedCustomShapeParameterPair,
    Diffusion: scala.Double,
    Extrusion: scala.Boolean,
    ExtrusionColor: scala.Boolean,
    FirstLightDirection: Direction3D,
    FirstLightHarsh: scala.Boolean,
    FirstLightLevel: scala.Double,
    LightFace: scala.Boolean,
    Metal: scala.Boolean,
    NumberOfLineSegments: scala.Double,
    Origin: EnhancedCustomShapeParameterPair,
    ProjectionMode: ProjectionMode,
    RotateAngle: EnhancedCustomShapeParameterPair,
    RotationCenter: Direction3D,
    SecondLightDirection: Direction3D,
    SecondLightHarsh: scala.Boolean,
    SecondLightLevel: scala.Double,
    ShadeMode: ShadeMode,
    Shininess: scala.Double,
    Skew: EnhancedCustomShapeParameterPair,
    Specularity: scala.Double,
    ViewPoint: Position3D
  ): EnhancedCustomShapeExtrusion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Brightness")(Brightness)
    __obj.updateDynamic("Depth")(Depth)
    __obj.updateDynamic("Diffusion")(Diffusion)
    __obj.updateDynamic("Extrusion")(Extrusion)
    __obj.updateDynamic("ExtrusionColor")(ExtrusionColor)
    __obj.updateDynamic("FirstLightDirection")(FirstLightDirection)
    __obj.updateDynamic("FirstLightHarsh")(FirstLightHarsh)
    __obj.updateDynamic("FirstLightLevel")(FirstLightLevel)
    __obj.updateDynamic("LightFace")(LightFace)
    __obj.updateDynamic("Metal")(Metal)
    __obj.updateDynamic("NumberOfLineSegments")(NumberOfLineSegments)
    __obj.updateDynamic("Origin")(Origin)
    __obj.updateDynamic("ProjectionMode")(ProjectionMode)
    __obj.updateDynamic("RotateAngle")(RotateAngle)
    __obj.updateDynamic("RotationCenter")(RotationCenter)
    __obj.updateDynamic("SecondLightDirection")(SecondLightDirection)
    __obj.updateDynamic("SecondLightHarsh")(SecondLightHarsh)
    __obj.updateDynamic("SecondLightLevel")(SecondLightLevel)
    __obj.updateDynamic("ShadeMode")(ShadeMode)
    __obj.updateDynamic("Shininess")(Shininess)
    __obj.updateDynamic("Skew")(Skew)
    __obj.updateDynamic("Specularity")(Specularity)
    __obj.updateDynamic("ViewPoint")(ViewPoint)
    __obj.asInstanceOf[EnhancedCustomShapeExtrusion]
  }
}

