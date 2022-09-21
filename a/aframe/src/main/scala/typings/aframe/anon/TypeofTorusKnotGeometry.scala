package typings.aframe.anon

import org.scalablytyped.runtime.Instantiable6
import typings.three.mod.TorusKnotGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTorusKnotGeometry
  extends StObject
     with Instantiable6[
      /* radius */ js.UndefOr[Double], 
      /* tube */ js.UndefOr[Double], 
      /* tubularSegments */ js.UndefOr[Double], 
      /* radialSegments */ js.UndefOr[Double], 
      /* p */ js.UndefOr[Double], 
      /* q */ js.UndefOr[Double], 
      TorusKnotGeometry
    ] {
  
  def fromJSON(data: Any): typings.three.torusKnotGeometryMod.TorusKnotGeometry = js.native
}
