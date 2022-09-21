package typings.aframe.anon

import org.scalablytyped.runtime.Instantiable7
import typings.three.mod.ConeGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofConeGeometry
  extends StObject
     with Instantiable7[
      /* radius */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* radialSegments */ js.UndefOr[Double], 
      /* heightSegments */ js.UndefOr[Double], 
      /* openEnded */ js.UndefOr[Boolean], 
      /* thetaStart */ js.UndefOr[Double], 
      /* thetaLength */ js.UndefOr[Double], 
      ConeGeometry
    ] {
  
  def fromJSON(data: Any): typings.three.coneGeometryMod.ConeGeometry = js.native
}
