package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
@js.native
trait EnhancedCustomShapeExtrusion extends js.Object {
  /** This attribute specifies the brightness of a scene in percent. */
  var Brightness: Double = js.native
  /**
    * The first value of {@link EnhancedCustomShapeParameterPair} specifies the depth of the extrusion in 1/100 mm. The second value (0.0 to 1.0) specifies
    * the fraction of the extrusion that lies before the shape, a value of 0 is default.
    */
  var Depth: EnhancedCustomShapeParameterPair = js.native
  /** This attribute specifies the amount of diffusion reflected by the shape in percent */
  var Diffusion: Double = js.native
  /** This property specifies if extrusion is displayed. The default for this property is "false" */
  var Extrusion: Boolean = js.native
  /** This attribute specifies if the "SecondFillColor" is used as extrusion color */
  var ExtrusionColor: Boolean = js.native
  /** Specifies the direction of the first light. */
  var FirstLightDirection: Direction3D = js.native
  /** Specifies if the primary light is harsh. */
  var FirstLightHarsh: Boolean = js.native
  /** Specifies the intensity for the first light in percent. */
  var FirstLightLevel: Double = js.native
  /** Specifies if the front face of the extrusion responds to lightning changes. */
  var LightFace: Boolean = js.native
  /** Specifies if the surface of the extrusion object looks like metal. */
  var Metal: Boolean = js.native
  /** Specifies the number of line segments that should be used to display curved surfaces. The higher the number the more line segments are used. */
  var NumberOfLineSegments: Double = js.native
  /** This attribute specifies the origin within the bounding box of the shape in terms of the shape size fractions. */
  var Origin: EnhancedCustomShapeParameterPair = js.native
  /** This property defines the projection mode. */
  var ProjectionMode: typings.activexLibreoffice.com_.sun.star.drawing.ProjectionMode = js.native
  /**
    * This attributes specifies the rotation angle about the x-axis in grad. The order of rotation is: z-axis, y-axis and then x-axis. The z-axis is
    * specified by the draw:rotate-angle.
    */
  var RotateAngle: EnhancedCustomShapeParameterPair = js.native
  /**
    * This attribute specifies the position of the rotate center in terms of shape size fractions, if the property is omitted, then the geometrical center
    * of the shape is used (this is the default).
    */
  var RotationCenter: Direction3D = js.native
  /** Specifies the direction of the second light. */
  var SecondLightDirection: Direction3D = js.native
  /** Specifies if the secondary light is harsh. */
  var SecondLightHarsh: Boolean = js.native
  /** Specifies the intensity for the second light in percent. */
  var SecondLightLevel: Double = js.native
  /** This property defines the shade mode. */
  var ShadeMode: typings.activexLibreoffice.com_.sun.star.drawing.ShadeMode = js.native
  /** The draw:extrusion-shininess specifies the shininess of a mirror in percent. */
  var Shininess: Double = js.native
  /**
    * The first value of the draw:extrusion-skew attribute specifies the skew amount of an extrusion in percent. The second parameter specifies the
    * skew-angle. Skew settings are only applied if the attribute ProjectionMode is ProjectionMode_PARALLEL.
    */
  var Skew: EnhancedCustomShapeParameterPair = js.native
  /** This attribute specifies the specularity of an extrusion object in percent. */
  var Specularity: Double = js.native
  /** This attribute specifies the viewpoint of the observer. */
  var ViewPoint: Position3D = js.native
}

object EnhancedCustomShapeExtrusion {
  @scala.inline
  def apply(
    Brightness: Double,
    Depth: EnhancedCustomShapeParameterPair,
    Diffusion: Double,
    Extrusion: Boolean,
    ExtrusionColor: Boolean,
    FirstLightDirection: Direction3D,
    FirstLightHarsh: Boolean,
    FirstLightLevel: Double,
    LightFace: Boolean,
    Metal: Boolean,
    NumberOfLineSegments: Double,
    Origin: EnhancedCustomShapeParameterPair,
    ProjectionMode: ProjectionMode,
    RotateAngle: EnhancedCustomShapeParameterPair,
    RotationCenter: Direction3D,
    SecondLightDirection: Direction3D,
    SecondLightHarsh: Boolean,
    SecondLightLevel: Double,
    ShadeMode: ShadeMode,
    Shininess: Double,
    Skew: EnhancedCustomShapeParameterPair,
    Specularity: Double,
    ViewPoint: Position3D
  ): EnhancedCustomShapeExtrusion = {
    val __obj = js.Dynamic.literal(Brightness = Brightness.asInstanceOf[js.Any], Depth = Depth.asInstanceOf[js.Any], Diffusion = Diffusion.asInstanceOf[js.Any], Extrusion = Extrusion.asInstanceOf[js.Any], ExtrusionColor = ExtrusionColor.asInstanceOf[js.Any], FirstLightDirection = FirstLightDirection.asInstanceOf[js.Any], FirstLightHarsh = FirstLightHarsh.asInstanceOf[js.Any], FirstLightLevel = FirstLightLevel.asInstanceOf[js.Any], LightFace = LightFace.asInstanceOf[js.Any], Metal = Metal.asInstanceOf[js.Any], NumberOfLineSegments = NumberOfLineSegments.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any], ProjectionMode = ProjectionMode.asInstanceOf[js.Any], RotateAngle = RotateAngle.asInstanceOf[js.Any], RotationCenter = RotationCenter.asInstanceOf[js.Any], SecondLightDirection = SecondLightDirection.asInstanceOf[js.Any], SecondLightHarsh = SecondLightHarsh.asInstanceOf[js.Any], SecondLightLevel = SecondLightLevel.asInstanceOf[js.Any], ShadeMode = ShadeMode.asInstanceOf[js.Any], Shininess = Shininess.asInstanceOf[js.Any], Skew = Skew.asInstanceOf[js.Any], Specularity = Specularity.asInstanceOf[js.Any], ViewPoint = ViewPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeExtrusion]
  }
  @scala.inline
  implicit class EnhancedCustomShapeExtrusionOps[Self <: EnhancedCustomShapeExtrusion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrightness(value: Double): Self = this.set("Brightness", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: EnhancedCustomShapeParameterPair): Self = this.set("Depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiffusion(value: Double): Self = this.set("Diffusion", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtrusion(value: Boolean): Self = this.set("Extrusion", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtrusionColor(value: Boolean): Self = this.set("ExtrusionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstLightDirection(value: Direction3D): Self = this.set("FirstLightDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstLightHarsh(value: Boolean): Self = this.set("FirstLightHarsh", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstLightLevel(value: Double): Self = this.set("FirstLightLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightFace(value: Boolean): Self = this.set("LightFace", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetal(value: Boolean): Self = this.set("Metal", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfLineSegments(value: Double): Self = this.set("NumberOfLineSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: EnhancedCustomShapeParameterPair): Self = this.set("Origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectionMode(value: ProjectionMode): Self = this.set("ProjectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotateAngle(value: EnhancedCustomShapeParameterPair): Self = this.set("RotateAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationCenter(value: Direction3D): Self = this.set("RotationCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondLightDirection(value: Direction3D): Self = this.set("SecondLightDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondLightHarsh(value: Boolean): Self = this.set("SecondLightHarsh", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondLightLevel(value: Double): Self = this.set("SecondLightLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadeMode(value: ShadeMode): Self = this.set("ShadeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setShininess(value: Double): Self = this.set("Shininess", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkew(value: EnhancedCustomShapeParameterPair): Self = this.set("Skew", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecularity(value: Double): Self = this.set("Specularity", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewPoint(value: Position3D): Self = this.set("ViewPoint", value.asInstanceOf[js.Any])
  }
  
}

