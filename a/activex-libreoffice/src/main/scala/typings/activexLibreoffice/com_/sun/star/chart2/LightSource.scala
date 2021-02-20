package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.drawing.Direction3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightSource extends StObject {
  
  /** the direction into which the light-source points */
  var aDirection: Direction3D = js.native
  
  var bIsEnabled: Boolean = js.native
  
  /** When `TRUE` , the specularity of material is taken into account when lighting an object. */
  var bSpecular: Boolean = js.native
  
  /** the light source's color */
  var nDiffuseColor: Double = js.native
}
object LightSource {
  
  @scala.inline
  def apply(aDirection: Direction3D, bIsEnabled: Boolean, bSpecular: Boolean, nDiffuseColor: Double): LightSource = {
    val __obj = js.Dynamic.literal(aDirection = aDirection.asInstanceOf[js.Any], bIsEnabled = bIsEnabled.asInstanceOf[js.Any], bSpecular = bSpecular.asInstanceOf[js.Any], nDiffuseColor = nDiffuseColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSource]
  }
  
  @scala.inline
  implicit class LightSourceMutableBuilder[Self <: LightSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADirection(value: Direction3D): Self = StObject.set(x, "aDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBIsEnabled(value: Boolean): Self = StObject.set(x, "bIsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSpecular(value: Boolean): Self = StObject.set(x, "bSpecular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNDiffuseColor(value: Double): Self = StObject.set(x, "nDiffuseColor", value.asInstanceOf[js.Any])
  }
}
