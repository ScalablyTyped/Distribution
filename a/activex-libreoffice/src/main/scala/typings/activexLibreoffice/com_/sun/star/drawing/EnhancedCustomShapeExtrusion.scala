package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
trait EnhancedCustomShapeExtrusion extends StObject {
  
  /** This attribute specifies the brightness of a scene in percent. */
  var Brightness: Double
  
  /**
    * The first value of {@link EnhancedCustomShapeParameterPair} specifies the depth of the extrusion in 1/100 mm. The second value (0.0 to 1.0) specifies
    * the fraction of the extrusion that lies before the shape, a value of 0 is default.
    */
  var Depth: EnhancedCustomShapeParameterPair
  
  /** This attribute specifies the amount of diffusion reflected by the shape in percent */
  var Diffusion: Double
  
  /** This property specifies if extrusion is displayed. The default for this property is "false" */
  var Extrusion: Boolean
  
  /** This attribute specifies if the "SecondFillColor" is used as extrusion color */
  var ExtrusionColor: Boolean
  
  /** Specifies the direction of the first light. */
  var FirstLightDirection: Direction3D
  
  /** Specifies if the primary light is harsh. */
  var FirstLightHarsh: Boolean
  
  /** Specifies the intensity for the first light in percent. */
  var FirstLightLevel: Double
  
  /** Specifies if the front face of the extrusion responds to lightning changes. */
  var LightFace: Boolean
  
  /** Specifies if the surface of the extrusion object looks like metal. */
  var Metal: Boolean
  
  /** Specifies the number of line segments that should be used to display curved surfaces. The higher the number the more line segments are used. */
  var NumberOfLineSegments: Double
  
  /** This attribute specifies the origin within the bounding box of the shape in terms of the shape size fractions. */
  var Origin: EnhancedCustomShapeParameterPair
  
  /** This property defines the projection mode. */
  var ProjectionMode: typings.activexLibreoffice.com_.sun.star.drawing.ProjectionMode
  
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
  var SecondLightHarsh: Boolean
  
  /** Specifies the intensity for the second light in percent. */
  var SecondLightLevel: Double
  
  /** This property defines the shade mode. */
  var ShadeMode: typings.activexLibreoffice.com_.sun.star.drawing.ShadeMode
  
  /** The draw:extrusion-shininess specifies the shininess of a mirror in percent. */
  var Shininess: Double
  
  /**
    * The first value of the draw:extrusion-skew attribute specifies the skew amount of an extrusion in percent. The second parameter specifies the
    * skew-angle. Skew settings are only applied if the attribute ProjectionMode is ProjectionMode_PARALLEL.
    */
  var Skew: EnhancedCustomShapeParameterPair
  
  /** This attribute specifies the specularity of an extrusion object in percent. */
  var Specularity: Double
  
  /** This attribute specifies the viewpoint of the observer. */
  var ViewPoint: Position3D
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
  implicit class EnhancedCustomShapeExtrusionMutableBuilder[Self <: EnhancedCustomShapeExtrusion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: EnhancedCustomShapeParameterPair): Self = StObject.set(x, "Depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffusion(value: Double): Self = StObject.set(x, "Diffusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrusion(value: Boolean): Self = StObject.set(x, "Extrusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrusionColor(value: Boolean): Self = StObject.set(x, "ExtrusionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLightDirection(value: Direction3D): Self = StObject.set(x, "FirstLightDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLightHarsh(value: Boolean): Self = StObject.set(x, "FirstLightHarsh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLightLevel(value: Double): Self = StObject.set(x, "FirstLightLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightFace(value: Boolean): Self = StObject.set(x, "LightFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetal(value: Boolean): Self = StObject.set(x, "Metal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLineSegments(value: Double): Self = StObject.set(x, "NumberOfLineSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: EnhancedCustomShapeParameterPair): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionMode(value: ProjectionMode): Self = StObject.set(x, "ProjectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateAngle(value: EnhancedCustomShapeParameterPair): Self = StObject.set(x, "RotateAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationCenter(value: Direction3D): Self = StObject.set(x, "RotationCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondLightDirection(value: Direction3D): Self = StObject.set(x, "SecondLightDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondLightHarsh(value: Boolean): Self = StObject.set(x, "SecondLightHarsh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondLightLevel(value: Double): Self = StObject.set(x, "SecondLightLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadeMode(value: ShadeMode): Self = StObject.set(x, "ShadeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShininess(value: Double): Self = StObject.set(x, "Shininess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkew(value: EnhancedCustomShapeParameterPair): Self = StObject.set(x, "Skew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularity(value: Double): Self = StObject.set(x, "Specularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewPoint(value: Position3D): Self = StObject.set(x, "ViewPoint", value.asInstanceOf[js.Any])
  }
}
